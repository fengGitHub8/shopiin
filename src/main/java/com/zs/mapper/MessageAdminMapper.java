package com.zs.mapper;

import com.zs.entity.MessageAdmin;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Classname MessageAdminMapper
 * @Description 消息管理接口
 * @Date 2019/6/24 15:25
 * @Created by GuiPeng
 */

@Repository
public interface MessageAdminMapper {

    /**
     * 通过门店id查询消息
     * @param messageAdmin
     * @return
     */
    List<MessageAdmin> findMessagesByShopId(MessageAdmin messageAdmin);

    /**
     * 添加消息，并返回1或者0判断是否添加成功
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
     * @param id
     * @return
     */
    int deleteMessageById(Integer id);

    /**
     * 通过id发送消息，并返回1或者0判断是否发送成功
     * @param messageAdmin
     * @return
     */
    int sendMessageById(MessageAdmin messageAdmin);

    /**
     * 修改时通过id查询信息
     * @param id
     * @return
     */
    MessageAdmin findById(Integer id);
}
