package com.zs.VO;

import lombok.Data;

/**
 * @program: shopin
 * @description:
 * @author: FengYang
 * @create: 2019-06-22 10:05
 **/
@Data
public class ResultVO<T> {
    /**
     * 提示信息
     */
    private String status;
    /**
     * 返回结果
     */
    private T responseResult;
    /**
     * 返回结果集
     */
    private T responseList;
}
