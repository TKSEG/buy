package com.igeek.ebuy.service;


import com.igeek.common.pojo.EasyUITreeNode;

import java.util.List;

/**
 * Created by yangbo on 2019/6/22.
 */
public interface ItemCatService {
   public List<EasyUITreeNode> queryCat(long parentId);
}
