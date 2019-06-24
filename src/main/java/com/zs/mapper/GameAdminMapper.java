package com.zs.mapper;

import com.zs.entity.GameAdmin;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Classname GameAdminMapper
 * @Description 小游戏管理接口
 * @Date 2019/6/24 11:06
 * @Created by GuiPeng
 */
@Repository
public interface GameAdminMapper {

    /**
     * 通过shopId查询该门店的小游戏
     * @param gameAdmin
     * @return
     */
    List<GameAdmin> findGamesByShopId(GameAdmin gameAdmin);

    /**
     * 添加和修改时通过shopId和name判断该游戏在该门店是否存在
     * @param gameAdmin
     * @return
     */
    int findGamesByShopIdAndName(GameAdmin gameAdmin);

    /**
     * 添加小游戏，并返回1或者0判断是否添加成功
     * @param gameAdmin
     * @return
     */
    int addGame(GameAdmin gameAdmin);

    /**
     * 修改小游戏，并返回1或者0判断是否修改成功
     * @param gameAdmin
     * @return
     */
    int updateGameById(GameAdmin gameAdmin);

    /**
     * 删除小游戏，并返回1或者0判断是否删除成功
     * @param gameAdmin
     * @return
     */
    int deleteGameById(GameAdmin gameAdmin);
}
