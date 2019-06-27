package com.zs.mapper;

import com.zs.entity.PageStore;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @program: PageStoreMapper
 * @description:
 * @author: ZWX
 * @create: 2019/6/27 11:54
 **/
@Repository
public interface PageStoreMapper {
    List<PageStore> getPageStore(int pageFloorId);

    Boolean addPageStore(PageStore pageStore);

    Boolean modifyPageStore(PageStore pageStore);
}
