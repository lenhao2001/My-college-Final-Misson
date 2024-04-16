package com.example.mycollegefinalmisson.demos.web.Service.ServiceImpl;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.example.mycollegefinalmisson.demos.web.Entity.Good;
import com.example.mycollegefinalmisson.demos.web.Entity.Own;
import com.example.mycollegefinalmisson.demos.web.Mapper.GoodMapper;
import com.example.mycollegefinalmisson.demos.web.Service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

        List<Good> goodList = goodMapper.selectListTEST();

        return goodList;
    }

    @Override
    public List<Own> getMyGoodsPage(String UserId) {
        List<Own> OwnGoods = goodMapper.selectMyGoodList(UserId);
        return OwnGoods;
    }

    @Override
    public Good getGoodByGoodid(int GoodsId) {
        Good good = goodMapper.selectGoodByGoodId(GoodsId);
        return good;
    }



    @Override
    @Transactional
    public boolean DelGoodByGoodId(int GoodId) {

        int delGoodCount = goodMapper.DelGoodByGoodId(GoodId);
        if (delGoodCount == 0){
            System.out.println("database not find goodid :"+ GoodId);
            return false;
        }

        int delOwnCount = goodMapper.DelOwnByGoodId(GoodId);
        if (delOwnCount == 0){
            System.out.println("database not find goodid :"+ GoodId);
            return false;
        }

        return true;
    }

    @Override
    public Own getGoodsOwner(int GoodId) {
        return goodMapper.selectGoodsOwner(GoodId);
    }

    @Override
    public boolean updateGoodsByGoodsId(Good good) {
//        UpdateWrapper<Good> wrapper = new UpdateWrapper<>();
//        wrapper.eq("GoodId",good.getGoodId());

        int UpdateCount = goodMapper.updateById(good);
        if (UpdateCount>0){
            return true;
        }
        return false;
    }


}
