package com.example.mycollegefinalmisson.demos.web.Service.ServiceImpl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.mycollegefinalmisson.demos.web.Entity.Good;
import com.example.mycollegefinalmisson.demos.web.Mapper.GoodMapper;
import com.example.mycollegefinalmisson.demos.web.Service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description:
 * User: Lenhao
 * Date: 2024-03-30
 * Time: 17:14
 */
@Service
public class GoodServiceImpl implements GoodService {

    @Autowired
    GoodMapper goodMapper;

    @Override
    public List<Good> getIndexGoodsPage() {

        QueryWrapper<Good> queryWrapper = new QueryWrapper<>();
        queryWrapper.select("GoodName","GoodCost","GoodCount"); //bug ERROR 28348[dispatcherServlet]    : Servlet.service() for servlet [dispatcherServlet] in context with path [] threw exception [Request processing failed; nested exception is org.apache.ibatis.binding.BindingException: Invalid bound statement (not found): com.example.mycollegefinalmisson.demos.web.Mapper.GoodMapper.selectList] with root cause

        List<Good> goodList = goodMapper.selectList(queryWrapper);

        System.out.println(goodList.toString());
        return goodList;
    }
}
