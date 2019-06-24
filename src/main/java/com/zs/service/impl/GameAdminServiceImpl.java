package com.zs.service.impl;

import com.zs.entity.GameAdmin;
import com.zs.mapper.GameAdminMapper;
import com.zs.service.GameAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname GameAdminServiceImpl
 * @Description
 * @Date 2019/6/24 11:07
 * @Created by GuiPeng
 */
@Service
public class GameAdminServiceImpl implements GameAdminService {

    @Autowired
    private GameAdminMapper gameAdminMapper;

    @Override
    public List<GameAdmin> findGamesByShopId(GameAdmin gameAdmin) {
        return gameAdminMapper.findGamesByShopId(gameAdmin);
    }

    @Override
    public int addGame(GameAdmin gameAdmin) {
        int count = gameAdminMapper.findGamesByShopIdAndName(gameAdmin);
        if (count == 0) {
            return gameAdminMapper.addGame(gameAdmin);
        } else {
            return 0;
        }
    }

    @Override
    public int updateGameById(GameAdmin gameAdmin) {
        int count = gameAdminMapper.findGamesByShopIdAndName(gameAdmin);
        if (count == 0) {
            return gameAdminMapper.updateGameById(gameAdmin);
        } else {
            return 0;
        }
    }

    @Override
    public int deleteGameById(GameAdmin gameAdmin) {
        return gameAdminMapper.deleteGameById(gameAdmin);
    }
}
