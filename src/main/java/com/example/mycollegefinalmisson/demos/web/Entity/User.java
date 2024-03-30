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

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public int getUserAuth() {
        return UserAuth;
    }

    public void setUserAuth(int userAuth) {
        UserAuth = userAuth;
    }

    private String  UserName;

    private int UserAuth;

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public String getUserPasswd() {
        return UserPasswd;
    }

    public void setUserPasswd(String userPasswd) {
        UserPasswd = userPasswd;
    }


    @Override
    public String toString() {
        return "User{" +
                "UserId='" + UserId + '\'' +
                ", UserPasswd='" + UserPasswd + '\'' +
                '}';
    }
}
