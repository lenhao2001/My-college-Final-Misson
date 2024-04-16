package com.example.mycollegefinalmisson;

import com.example.mycollegefinalmisson.demos.web.Mapper.GoodMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Description:
 * User: Lenhao
 * Date: 2024-04-16
 * Time: 7:55
 */
@SpringBootTest
public class DelDataTest {
    @Autowired
    GoodMapper goodMapper;

    private static final int i = 101;

    @Test
    void DelGoodInGood(){
        System.out.println("test start");
        int b = goodMapper.DelGoodByGoodId(i);
        System.out.println("DelGoodInGood . return : "+b);
    }
/*
INSERT INTO own (UserId, GoodId) VALUES
('root', 100),
('root', 101);

INSERT INTO good (GoodId, GoodName, GoodDetails, GoodCost, GoodCount) VALUES
(100, 'GoodName1', 'Details1', 10.00, 5),
(101, 'GoodName2', 'Details2', 15.50, 10);
 */
    @Test
    int DelOwnTableByGoodId(){
        int b = goodMapper.DelOwnByGoodId(i);
        System.out.println("DelGoodInGood . return : "+b);
        return b;
    }
}
