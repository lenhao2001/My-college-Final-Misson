package com.example.mycollegefinalmisson.demos.web.Entity;

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
    private int GoodId;
    private String GoodName;
    private String GoodDetails;
    private String GoodCost;
    private String GoodCount;

    public int getGoodId() {
        return GoodId;
    }

    public void setGoodId(int goodId) {
        GoodId = goodId;
    }

    public String getGoodName() {
        return GoodName;
    }

    public void setGoodName(String goodName) {
        GoodName = goodName;
    }

    public String getGoodDetails() {
        return GoodDetails;
    }

    public void setGoodDetails(String goodDetails) {
        GoodDetails = goodDetails;
    }

    public String getGoodCost() {
        return GoodCost;
    }

    public void setGoodCost(String goodCost) {
        GoodCost = goodCost;
    }

    public String getGoodCount() {
        return GoodCount;
    }

    public void setGoodCount(String goodCount) {
        GoodCount = goodCount;
    }
}
