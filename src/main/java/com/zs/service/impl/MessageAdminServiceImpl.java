package com.zs.service.impl;

import com.zs.entity.MessageAdmin;
import com.zs.mapper.MessageAdminMapper;
import com.zs.service.MessageAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname MessageAdminServiceImpl
 * @Description
 * @Date 2019/6/24 15:29
 * @Created by GuiPeng
 */

@Service
public class MessageAdminServiceImpl implements MessageAdminService {

    @Autowired
    private MessageAdminMapper messageAdminMapper;


    @Override
    public List<MessageAdmin> findMessagesByShopId(MessageAdmin messageAdmin) {
        return messageAdminMapper.findMessagesByShopId(messageAdmin);
    }

    @Override
    public int addMessage(MessageAdmin messageAdmin) {
        return messageAdminMapper.addMessage(messageAdmin);
    }

    @Override
    public int updateMessageById(MessageAdmin messageAdmin) {
        return messageAdminMapper.updateMessageById(messageAdmin);
    }

    @Override
    public int deleteMessageById(MessageAdmin messageAdmin) {
        return messageAdminMapper.deleteMessageById(messageAdmin);
    }

    @Override
    public int sendMessageById(MessageAdmin messageAdmin) {
        return messageAdminMapper.sendMessageById(messageAdmin);
    }
}
