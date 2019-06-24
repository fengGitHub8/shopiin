package com.zs.service;

import com.zs.entity.MessageAdmin;

import java.util.List;

/**
 * @Classname MessageAdminService
 * @Description
 * @Date 2019/6/24 15:28
 * @Created by GuiPeng
 */
public interface MessageAdminService {

    /**
     * 通过门店id查询消息
     * @param messageAdmin
     * @return
     */
    List<MessageAdmin> findMessagesByShopId(MessageAdmin messageAdmin);

    /**
     * 添加消息，并返回1或者0判断是否添加成功
     * @param messageAdmin
     * @return
     */
    int addMessage(MessageAdmin messageAdmin);

    /**
     * 通过id修改消息，并返回1或者0判断是否修改成功
     * @param messageAdmin
     * @return
     */
    int updateMessageById(MessageAdmin messageAdmin);

    /**
     * 通过id删除消息，并返回1或者0判断是否删除成功
     * @param messageAdmin
     * @return
     */
    int deleteMessageById(MessageAdmin messageAdmin);

    /**
     * 通过id将消息发送，并返回1或者0判断是否发送成功
     * @param messageAdmin
     * @return
     */
    int sendMessageById(MessageAdmin messageAdmin);
}
