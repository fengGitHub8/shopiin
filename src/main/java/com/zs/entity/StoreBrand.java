package com.zs.entity;

import lombok.Data;

/**
 * @Classname StoreBrand
 * @Description 商铺的品牌  多对多
 * @Date 2019/6/25 15:10
 * @Created by GuiPeng
 */

@Data
public class StoreBrand {
    private Integer storeId;

    private Integer brandId;
}
