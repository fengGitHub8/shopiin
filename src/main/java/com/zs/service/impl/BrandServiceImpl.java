package com.zs.service.impl;

import com.zs.entity.Brand;
import com.zs.mapper.BrandMapper;
import com.zs.mapper.StoreBrandMapper;
import com.zs.service.BrandService;
import com.zs.utils.ReadExcel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

/**
 * @program: shopin
 * @description: 品牌接口实现
 * @author: FengYang
 * @create: 2019-06-24 15:28
 **/
@Service
public class BrandServiceImpl implements BrandService{
    @Autowired
    private BrandMapper brandMapper;

    @Autowired
    private StoreBrandMapper storeBrandMapper;

    @Override
    public List<Brand> findByShopId(Integer shopId) {
        return brandMapper.findByShopId(shopId);
    }

    @Override
    public void addBrand(Brand brand) {
        brandMapper.addBrand(brand);
    }

    @Override
    public void updateBrand(Brand brand) {

        brandMapper.updateBrand(brand);
    }

    @Override
    public Boolean deleteBrand(String id) {
        return brandMapper.deleteBrand(Integer.parseInt(id));
    }

    @Override
    public Brand findById(Integer id) {
        return brandMapper.findById(id);
    }

    @Override
    public String readExcelFile(MultipartFile file,String shopId) {
        String result = "";
        //创建处理EXCEL的类
        ReadExcel readExcel = new ReadExcel();
        //解析excel，获取上传的事件单
        List<Map<String, Object>> userList = readExcel.getExcelInfo(file);
        //至此已经将excel中的数据转换到list里面了,接下来就可以操作list,可以进行保存到数据库,或者其他操作,
        for(Map<String, Object> user:userList){
            Brand brand = new Brand();
            brand.setShopId(Integer.parseInt(shopId));
            brand.setBrandType(user.get("brandType").toString());
            brand.setLogo(null);
            brand.setStatus(1);
            brandMapper.addBrand(brand);
        }
        if(userList != null && !userList.isEmpty()){
            result = "上传成功";
        }else{
            result = "上传失败";
        }
        return result;
    }
}
