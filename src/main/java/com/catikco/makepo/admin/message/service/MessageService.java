package com.catikco.makepo.admin.message.service;

import com.catikco.makepo.admin.common.DatatablesResponsePageModel;
import com.catikco.makepo.admin.message.model.MessageListPageModel;
import com.catikco.makepo.admin.message.model.MessageRequestPageModel;

/**
 * Author: Cai Rong fei
 * Date: 2018-08-11 21:11
 * Description：
 */
public interface MessageService {

    public DatatablesResponsePageModel<MessageListPageModel> getMessageList(MessageRequestPageModel messageRequestPageModel);

}
