package com.zs.service;

import com.zs.entity.PageStore;

import java.util.List;

/**
 * @program: PageStoreService
 * @description:
 * @author: ZWX
 * @create: 2019/6/27 11:54
 **/
public interface PageStoreService {
    List<PageStore> getPageStore(int pageFloorId);

    Boolean addPageStore(PageStore pageStore);

    Boolean modifyPageStore(PageStore pageStore);
}
