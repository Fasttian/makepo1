package com.catikco.makepo.admin.message.service.impl;

import com.catikco.makepo.admin.common.DatatablesResponsePageModel;
import com.catikco.makepo.admin.message.model.MessageListPageModel;
import com.catikco.makepo.admin.message.model.MessageRequestPageModel;
import com.catikco.makepo.admin.message.service.MessageService;
import com.catikco.makepo.entity.Message;
import com.catikco.makepo.entity.MessageExample;
import com.catikco.makepo.mapper.MessageMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Cai Rong fei
 * Date: 2018-08-11 21:19
 * Description：
 */
@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    private MessageMapper messageMapper;

    @Override
    public DatatablesResponsePageModel<MessageListPageModel> getMessageList(MessageRequestPageModel messageRequestPageModel) {
        DatatablesResponsePageModel datatablesResponsePageModel = new DatatablesResponsePageModel();     //要返回给页面的新闻列表model

        MessageExample messageExample = new MessageExample();                    //example用于添加条件，相当where后面的部分
        MessageExample.Criteria criteria =messageExample.createCriteria();          //创建封装条件的对象

        Integer length = messageRequestPageModel.getLength();      //请求条数
        Integer start=messageRequestPageModel.getStart();          //起始记录
        Integer currentPage = start/length+1;                   //当前页
        String sortName = messageRequestPageModel.getOrderColumn();   //排序字段名
        String sort = messageRequestPageModel.getOrderDir();           //排序方式 asc/desc

        String name = messageRequestPageModel.getName();         //按手册名查询

        // 设置排序方式
        if (sortName != null && !sortName.isEmpty()) {
            messageExample.setOrderByClause(sortName + " " + sort);
        }

        // 按新闻标题查询
        if (!"".equals(name)) {
            name = "%" + name + "%";
            criteria.andNameLike(name);
        }

        //查询标记为未删除的
        criteria.andDeletedEqualTo(false);


        //设置分页信息
        PageHelper.startPage(currentPage,length);

        //根据条件从数据库查询出新闻
        List<Message> messageList = messageMapper.selectByExample(messageExample);

        //让pageInfo对象进行分页的处理
        PageInfo<Message> pageInfo = new PageInfo<>(messageList);

        datatablesResponsePageModel.setRecordsFiltered((int)pageInfo.getTotal());
        datatablesResponsePageModel.setRecordsTotal((int)pageInfo.getTotal());
        datatablesResponsePageModel.setDraw(messageRequestPageModel.getDraw());

        datatablesResponsePageModel.setData(this.changeToMessageListPageModel(messageList));

        return datatablesResponsePageModel;
    }

    private List<MessageListPageModel> changeToMessageListPageModel(List<Message> messagesList){

        List<MessageListPageModel> messageListPageModelList = new ArrayList<>();

        for(Message message:messagesList){
            MessageListPageModel messageListPageModel = new MessageListPageModel();
            messageListPageModel.setId(message.getId());
            messageListPageModel.setEmail(message.getEmail());
            messageListPageModel.setMoreInfo(message.getMoreInfo());
            messageListPageModel.setName(message.getName());
            messageListPageModel.setSubject(message.getSubject());
            messageListPageModel.setPhone(message.getPhone());

            messageListPageModelList.add(messageListPageModel);

        }

        return messageListPageModelList;
    }

}
