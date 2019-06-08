package com.igeek.ebuy.controller;


import com.igeek.ebuy.pojo.TbItem;
import com.igeek.ebuy.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;





import java.util.ArrayList;
import java.util.List;

/**
 * 商品管理Controller
 */
@Controller
public class ItemController {

    @Autowired
    private ItemService itemService;

    /* @RequestMapping("/item/{itemId}")
     @ResponseBody
     public TbItem getItemById(@PathVariable long itemId){
         System.out.println(itemId);
         TbItem item=itemService.getItemByid(itemId);
     //    TbItem item=new TbItem();
        // item.setId(1L);
      //   item.setCid(2L);
         System.out.println(item.toString());
         return item;
     }
     */
    @RequestMapping("/item/{itemId}")
    @ResponseBody
    public TbItem getItemById(@PathVariable long itemId){
        System.out.println(itemId);
        TbItem item=itemService.getItemByid(itemId);
        // List<String> list=new ArrayList<>();
        //   list.set(1,"123");


        //    Object item=new Object();

        System.out.println(item.toString());
        return item;
        //   return list;
    }

}