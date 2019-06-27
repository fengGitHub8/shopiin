package com.zs.service.impl;

import com.zs.entity.PageStore;
import com.zs.mapper.PageStoreMapper;
import com.zs.service.PageStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: PageStoreServiceImpl
 * @description:
 * @author: ZWX
 * @create: 2019/6/27 11:52
 **/
@Service
public class PageStoreServiceImpl implements PageStoreService {
    @Autowired
    private PageStoreMapper pageStoreMapper;

    @Override
    public List<PageStore> getPageStore(int pageFloorId) {
        return pageStoreMapper.getPageStore(pageFloorId);
    }

    @Override
    public Boolean addPageStore(PageStore pageStore) {
        pageStoreMapper.addPageStore(pageStore);
        return true;
    }

    @Override
    public Boolean modifyPageStore(PageStore pageStore) {
        pageStoreMapper.modifyPageStore(pageStore);
        return true;
    }
}
