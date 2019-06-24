package com.zs.controller;

import com.zs.VO.ResultVO;
import com.zs.entity.MessageAdmin;
import com.zs.entity.StoreType;
import com.zs.service.MessageAdminService;
import com.zs.utils.ResultVOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @Classname MessageAdminController
 * @Description
 * @Date 2019/6/24 15:25
 * @Created by GuiPeng
 */

@Controller
@RequestMapping("/messageAdmin")
@ResponseBody
public class MessageAdminController {

    @Autowired
    private MessageAdminService messageAdminService;

    @RequestMapping("/finds")
    public ResultVO findMessages(MessageAdmin messageAdmin){
        System.err.println(messageAdmin);
        List<MessageAdmin> byShopId = messageAdminService.findMessagesByShopId(messageAdmin);
        System.err.println(byShopId);
        if (byShopId != null) {
            return ResultVOUtil.success(null,byShopId);
        }else {
            return ResultVOUtil.error(null,null);
        }
    }

    @RequestMapping("/add")
    public ResultVO addMessage(MessageAdmin messageAdmin){
        System.err.println("前端接收的数据:"+messageAdmin);
        int i = messageAdminService.addMessage(messageAdmin);
        System.err.println("判断是否添加成功:"+i);
        if (i!= 0) {
            return ResultVOUtil.success("添加成功！",null);
        }else {
            return ResultVOUtil.error("添加失败!该类型已存在!",null);
        }
    }

    @RequestMapping("/modify")
    public ResultVO updateMessageById(MessageAdmin messageAdmin){
        System.err.println("前端接收的数据:"+messageAdmin);
        int i = messageAdminService.updateMessageById(messageAdmin);
        System.err.println("判断修改是否成功:"+i);
        if (i != 0) {
            return ResultVOUtil.success("修改成功！",null);
        }else {
            return ResultVOUtil.error("修改失败!该类型已存在!",null);
        }
    }

    @RequestMapping("send")
    public ResultVO sendMessageById(MessageAdmin messageAdmin){
        System.out.println("前端接收的数据:"+messageAdmin);
        String nowTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        //上传时间
        messageAdmin.setSendDate(Timestamp.valueOf(nowTime));
        int i = messageAdminService.sendMessageById(messageAdmin);
        System.err.println("判断发送是否成功:"+i);
        if (i != 0) {
            return ResultVOUtil.success("发送成功！",null);
        }else {
            return ResultVOUtil.error("发送失败！",null);
        }
    }

    @RequestMapping("delete")
    public ResultVO deleteMessageById(MessageAdmin messageAdmin){
        System.out.println("前端接收的数据:"+messageAdmin);
        int i = messageAdminService.deleteMessageById(messageAdmin);
        System.err.println("判断删除是否成功:"+i);
        if (i != 0) {
            return ResultVOUtil.success("删除成功！",null);
        }else {
            return ResultVOUtil.error("删除失败！",null);
        }
    }

}
