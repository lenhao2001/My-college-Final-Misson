package com.example.mycollegefinalmisson.demos.web.Service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.mycollegefinalmisson.demos.web.Entity.Good;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 * User: Lenhao
 * Date: 2024-03-30
 * Time: 17:13
 */
public interface GoodService {
    public List<Good> getIndexGoodsPage();
}
