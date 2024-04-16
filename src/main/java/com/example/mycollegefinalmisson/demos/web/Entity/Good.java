package com.example.mycollegefinalmisson.demos.web.Entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import javax.persistence.Table;

/**
 * Description:
 * User: Lenhao
 * Date: 2024-03-27
 * Time: 10:15
 */
@Data
@TableName("good")
public class Good {
    @TableId("GoodId")
    private int GoodId;
    private String GoodName;
    private String GoodDetails;
    private String GoodCost;
    private String GoodCount;


}
