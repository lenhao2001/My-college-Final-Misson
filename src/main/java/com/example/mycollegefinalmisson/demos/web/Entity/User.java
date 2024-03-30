package com.example.mycollegefinalmisson.demos.web.Entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;

/**
 * Description:
 * User: Lenhao
 * Date: 2024-02-11
 * Time: 19:11
 */
@Data
@TableName("user")
public class User {
    private String UserId;
    private String UserPasswd;

}
