package com.example.mycollegefinalmisson.demos.web.Mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mycollegefinalmisson.demos.web.Entity.Good;
import com.example.mycollegefinalmisson.demos.web.Entity.Own;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * Description:
 * User: Lenhao
 * Date: 2024-03-30
 * Time: 17:15
 */
@Mapper
public interface GoodMapper extends BaseMapper<Good> {
    @Select("SELECT * FROM good")
    List<Good> selectListTEST();

    @Select("Select * FROM own where UserId = #{UserId}")
    List<Own> selectMyGoodList(String UserId);

    @Select("select * from own where GoodId = #{GoodId}")
    Own selectGoodsOwner(int GoodId);

    @Select("select * FROM good where good.GoodId = #{GoodId}")
    Good selectGoodByGoodId(int GoodId);

    @Override
    @Update("update good set GoodName=#{GoodName},GoodDetails=#{GoodDetails},GoodCost=#{GoodCost},GoodCount=#{GoodCount} where GoodId=#{GoodId}")
    int updateById(Good good);

    @Delete("delete from good where GoodId = #{goodId}")
    int DelGoodByGoodId(int goodId);

    @Delete("delete from own where GoodId = #{goodID}")
    int DelOwnByGoodId(int goodID);
}
