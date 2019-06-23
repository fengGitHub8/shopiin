package com.zs.service.impl;

import com.zs.entity.OperState;
import com.zs.mapper.OperStateMapper;
import com.zs.service.OperStateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: shopin
 * @description:
 * @author: FengYang
 * @create: 2019-06-23 23:01
 **/
@Service
public class OperStateServiceImpl implements OperStateService {
    @Autowired
    private OperStateMapper operStateMapper;

    @Override
    public OperState findByShopIdAndDate(String shopId, String date) {
        return operStateMapper.findByShopIdAndDate(Integer.parseInt(shopId),date);
    }
}
