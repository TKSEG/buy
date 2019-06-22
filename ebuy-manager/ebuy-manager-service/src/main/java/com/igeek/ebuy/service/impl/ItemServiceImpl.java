package com.igeek.ebuy.service.impl;

/**
 * Created by yangbo on 2019/6/7.
 */

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.igeek.common.pojo.EasyUIDataGridResult;
import com.igeek.ebuy.mapper.TbItemMapper;
import com.igeek.ebuy.pojo.TbItem;
import com.igeek.ebuy.pojo.TbItemExample;
import com.igeek.ebuy.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 商品管理Service
 */
@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    public TbItemMapper itemMapper;

    /**
     * 根据id查询商品
     *
     * @param id
     * @return
     */
    @Override
    public TbItem getItemByid(long id) {
        TbItem item = itemMapper.selectByPrimaryKey(id);
        return item;
    }


    @Override
    public EasyUIDataGridResult getItemList(int page, int rows) {
        EasyUIDataGridResult result = null;
        //设置分页的页面和每页条数
        PageHelper.startPage(page, rows);
        //执行查询
        TbItemExample example = new TbItemExample();
        List<TbItem> list = itemMapper.selectByExample(example);
        //封装分页结果
        PageInfo<TbItem> info = new PageInfo<>(list);
        //生成返回
        result = new EasyUIDataGridResult(info.getTotal(), list);
        return result;

    }

}
