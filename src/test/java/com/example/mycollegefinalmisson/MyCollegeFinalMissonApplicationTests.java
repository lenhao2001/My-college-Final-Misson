package com.example.mycollegefinalmisson;

import com.example.mycollegefinalmisson.demos.web.Entity.Good;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;

@RunWith(SpringRunner.class)
@SpringBootTest
class MyCollegeFinalMissonApplicationTests {

    @Autowired
    private DataSource dataSource;

    @Test
    public void dataSource(){
        try{
            // I was make silly mistake about name : missiondatabase (missondatabase)!
            // Ten min ago,I fix it .
            // fully man was me .
            System.out.println(dataSource.getConnection());
            System.out.println("sucessful");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void testGoodDATAANNO(){
        Good good = new Good();

    }
}
