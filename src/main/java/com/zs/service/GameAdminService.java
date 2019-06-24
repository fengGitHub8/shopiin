package com.zs.service;

import com.zs.entity.GameAdmin;

import java.util.List;

/**
 * @Classname GameAdminService
 * @Description 小游戏管理
 * @Date 2019/6/24 11:06
 * @Created by GuiPeng
 */

public interface GameAdminService {

    /**
     * 通过shopId查询该门店有的小游戏
     * @param gameAdmin
     * @return
     */
    List<GameAdmin> findGamesByShopId(GameAdmin gameAdmin);

    /**
     * 添加小游戏，并返回1或者0判断是否添加成功
     * @param gameAdmin
     * @return
     */
    int addGame(GameAdmin gameAdmin);

    /**
     * 通过id修改小游戏，并返回1或者0判断是否修改成功
     * @param gameAdmin
     * @return
     */
    int updateGameById(GameAdmin gameAdmin);

    /**
     * 通过id删除小游戏，并返回1或者0判断是否删除成功
     * @param gameAdmin
     * @return
     */
    int deleteGameById(GameAdmin gameAdmin);
}
