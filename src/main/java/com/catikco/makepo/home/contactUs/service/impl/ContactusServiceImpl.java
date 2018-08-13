package com.catikco.makepo.home.contactUs.service.impl;

import com.catikco.makepo.entity.Message;
import com.catikco.makepo.home.contactUs.model.ContactusPageModel;
import com.catikco.makepo.home.contactUs.service.ContactusService;
import com.catikco.makepo.mapper.MessageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Author: Cai Rong fei
 * Date: 2018-08-13 16:13
 * Description：
 */
@Service
public class ContactusServiceImpl implements ContactusService {

    @Autowired
    private MessageMapper messageMapper;

    @Override
    public int save(ContactusPageModel contactusPageModel) {
        if(1 == messageMapper.insert(changeToMessage(contactusPageModel)))
            return 1;
        return 0;
    }

    /************************** 私有方法 **********************/

    public Message changeToMessage(ContactusPageModel contactusPageModel){
        Message message = new Message();
        message.setEmail(contactusPageModel.getEmail());
        message.setName(contactusPageModel.getName());
        message.setMoreInfo(contactusPageModel.getMoreInfo());
        message.setPhone(contactusPageModel.getPhone());
        message.setSubject(contactusPageModel.getSubject());
        message.setDeleted(false);
        message.setCreateTime(new Date());
        return message;

    }
}
