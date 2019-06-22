package com.igeek.ebuy.service.impl;

import com.igeek.common.pojo.EasyUITreeNode;
import com.igeek.ebuy.pojo.TbItemCat;
import com.igeek.ebuy.pojo.TbItemCatExample;
import com.igeek.ebuy.service.ItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yangbo on 2019/6/22.
 */

@Service
public class ItemCatServiceImpl implements ItemCatService {
  //  @Autowired
  //  public TbItemCatMapper itemCatMapper;

    /**
     * @Title: getItemCatList
     * @Description: TODO(这里用一句话描述这个方法的作用)
     * @param parentId
     * @return
     * @see com.igeek.ebuy.service.ItemCatService#queryCat(long)
     */

    @Override
    public List<EasyUITreeNode> queryCat(long parentId) {
        List<EasyUITreeNode> list = new ArrayList<>() ;
        //根据parentId查询子节点
        TbItemCatExample example = new TbItemCatExample();
        TbItemCatExample.Criteria criteria = example.createCriteria();
        criteria.andParentIdEqualTo(parentId);
     //   List<TbItemCat> list_ = itemCatMapper.selectByExample(example);
        //将TbItemCat转换为EasyUITreeNode
   //     for (TbItemCat tbItemCat : list_) {
   //         EasyUITreeNode node = new EasyUITreeNode();
   //         node.setId(tbItemCat.getId());
   //         node.setText(tbItemCat.getName());
   //         node.setState(tbItemCat.getIsParent()?"closed":"open");
   //         list.add(node);
   //     }
        return list;
    }

}
