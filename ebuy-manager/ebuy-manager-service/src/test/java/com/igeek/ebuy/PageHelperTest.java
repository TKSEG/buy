package com.igeek.ebuy;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.igeek.ebuy.mapper.TbItemMapper;
import com.igeek.ebuy.pojo.TbItem;
import com.igeek.ebuy.pojo.TbItemExample;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by yangbo on 2019/6/19.
 */
public class PageHelperTest {
    @Test
    public void testPageHelper() {
        ApplicationContext context = new
                ClassPathXmlApplicationContext("classpath:spring/applicationContext-dao.xml");
        TbItemMapper itemMapper = context.getBean(TbItemMapper.class);
        //设置页面和条数
        PageHelper.startPage(1, 10);
        TbItemExample example = new TbItemExample();
        List<TbItem> list = itemMapper.selectByExample(example);
        PageInfo<TbItem> info = new PageInfo<>(list);
        System.out.println(info.getTotal());
        System.out.println(info.getPages());
        System.out.println(info.getSize());
    }
}
