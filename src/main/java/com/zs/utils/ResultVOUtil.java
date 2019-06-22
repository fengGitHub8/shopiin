package com.zs.utils;

import com.zs.VO.ResultVO;

/**
 * @program: shopin
 * @description: 返回结果工具类
 * @author: FengYang
 * @create: 2019-06-22 10:10
 **/
public class ResultVOUtil {

    public static ResultVO success(Object responseResult, Object responseList){
        ResultVO resultVO = new ResultVO();
        resultVO.setStatus("success");
        resultVO.setResponseResult(responseResult);
        resultVO.setResponseList(responseList);
        return resultVO;
    }

    public static ResultVO error(Object responseResult, Object responseList){
        ResultVO resultVO = new ResultVO();
        resultVO.setStatus("error");
        resultVO.setResponseResult(responseResult);
        resultVO.setResponseList(responseList);
        return resultVO;
    }

}
