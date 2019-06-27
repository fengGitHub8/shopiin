package com.zs.controller;

import com.zs.VO.ResultVO;
import com.zs.entity.Shop;
import com.zs.service.ShopService;
import com.zs.utils.ResultVOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @program: shopin
 * @description:
 * @author: FengYang
 * @create: 2019-06-22 15:16
 **/
@Controller
@ResponseBody
@RequestMapping("/shopAdmin")
public class ShopController {
    @Autowired
    private ShopService shopService;

    /**
     * 查询所有门店信息
     * @return
     */
    @RequestMapping("/find")
    public ResultVO find(){
        List<Shop> allShop = shopService.findAllShop();
        if (allShop != null) {
            return ResultVOUtil.success(null,allShop);
        }else {
            return ResultVOUtil.error(null,null);
        }
    }

    @RequestMapping("/findById")
    public ResultVO findById(@RequestParam("id") String id){
        Shop shop = shopService.findById(id);
        return ResultVOUtil.success("查询成功",shop);
    }

    /**
     * 添加门店
     * @return
     */
    @RequestMapping("/add")
    public ResultVO add(Shop shop){
        if (shop.getId()==null){
            Integer shopId = shopService.addShop(shop);
            if (shopId != null){
                return  ResultVOUtil.success(shopId,null);
            }else {
                return ResultVOUtil.error(null,null);
            }

        }else {
            Boolean result = shopService.updateShop(shop);
            if (result){
                return  ResultVOUtil.success(result,null);
            }else {
                return ResultVOUtil.error(null,null);
            }
        }
    }

    /**
     * 删除门店，修改status=2
     * @param id
     * @return
     */
    @RequestMapping("/deleteShop")
    public ResultVO deleteShop(@RequestParam("id") Integer id){
        shopService.deleteShop(id);
        return ResultVOUtil.success("删除成功",null);
    }

}
