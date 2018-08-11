package com.catikco.makepo.admin.message.controller;

import com.catikco.makepo.admin.common.DatatablesResponsePageModel;
import com.catikco.makepo.admin.message.model.MessageListPageModel;
import com.catikco.makepo.admin.message.model.MessageRequestPageModel;
import com.catikco.makepo.admin.message.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Author: Cai Rong fei
 * Date: 2018-08-11 21:27
 * Description：
 */

@Controller(value = "admin.MessageController")
@RequestMapping
public class MessageController {

    @Autowired
    private MessageService messageService;

    @RequestMapping("message-list")
    public String messageInit(){
        return "admin/message/message-list";
    }

    @RequestMapping("load-message-list")
    @ResponseBody
    public DatatablesResponsePageModel<MessageListPageModel> loadList(MessageRequestPageModel messageRequestPageModel){
        return messageService.getMessageList(messageRequestPageModel);
    }

}
