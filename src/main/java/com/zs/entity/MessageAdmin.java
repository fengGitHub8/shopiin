package com.zs.entity;


import lombok.Data;

import java.sql.Timestamp;

/**
 * @Classname MessageAdmin
 * @Description 消息管理
 * @Date 2019/6/24 15:20
 * @Created by GuiPeng
 */

@Data
public class MessageAdmin {

//    消息id
    private Integer id;

//    门店id
    private Integer shopId;

//    消息标题
    private String title;

//    消息内容
    private String content;

//    发送时间
    private Timestamp sendDate;

//    发送人
    private String creator;

//    状态(1为已发送，0为未发送，2为删除)
    private Integer status;


}
