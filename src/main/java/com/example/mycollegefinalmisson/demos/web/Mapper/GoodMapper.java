package com.example.mycollegefinalmisson.demos.web.Mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mycollegefinalmisson.demos.web.Entity.Good;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Description:
 * User: Lenhao
 * Date: 2024-03-30
 * Time: 17:15
 */
@Mapper
public interface GoodMapper extends BaseMapper<Good> {

    @Override
    List<Good> selectList(Wrapper<Good> queryWrapper);
}
