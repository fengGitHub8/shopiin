package com.zs.entity;

import lombok.Data;

/**
 * @program: shopin
 * @description: 营业场所实体类
 * @author: FengYang
 * @create: 2019-06-24 10:25
 **/
@Data
public class BusinessSite {
    private Integer id;
    private Integer shopId;
    private String name;
    private String introduce;
    private String status;
    private String qrcodeImage;
    private String qrcodeText;
}
