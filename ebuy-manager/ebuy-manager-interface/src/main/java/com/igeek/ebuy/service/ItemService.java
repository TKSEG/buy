package com.igeek.ebuy.service;

import com.igeek.common.pojo.EasyUIDataGridResult;
import com.igeek.ebuy.pojo.TbItem;

/**
 * Created by yangbo on 2019/6/7.
 */
public interface ItemService {
    /**
     * 根据商品id查询商品信息
     *
     * @param id
     * @return
     */
    public TbItem getItemByid(long id);
  public EasyUIDataGridResult getItemList(int page, int rows );
}
