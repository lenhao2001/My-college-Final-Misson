package com.example.mycollegefinalmisson.demos.web.Service;

import com.example.mycollegefinalmisson.demos.web.Entity.Good;
import com.example.mycollegefinalmisson.demos.web.Entity.Own;

import java.util.List;

/**
 * Description:
 * User: Lenhao
 * Date: 2024-03-30
 * Time: 17:13
 */
    public interface GoodService {
        public List<Good> getIndexGoodsPage();

        List<Own> getMyGoodsPage(String UserId);

        Good getGoodByGoodid(int GoodsId);

        boolean DelGoodByGoodId(int GoodId);

        Own getGoodsOwner(int GoodId);

        boolean updateGoodsByGoodsId(Good good);
    }
