package com.igeek.ebuy.service.impl;

/**
 * Created by yangbo on 2019/6/7.
 */

import com.igeek.ebuy.mapper.TbItemMapper;
import com.igeek.ebuy.pojo.TbItem;
import com.igeek.ebuy.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * 商品管理Service
 */
@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    public TbItemMapper itemMapper;

    /**
     * 根据id查询商品
     * @param id
     * @return
     */
    @Override
    public TbItem getItemByid(long id) {
        TbItem item = itemMapper.selectByPrimaryKey(id);
        return item;
    }
}
