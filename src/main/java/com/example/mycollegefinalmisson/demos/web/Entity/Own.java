package com.example.mycollegefinalmisson.demos.web.Entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * Description:
 * User: Lenhao
 * Date: 2024-04-10
 * Time: 18:12
 */
@Data
@TableName("own")
    public class Own {
        private String UserId;
        private int GoodId;
    }
