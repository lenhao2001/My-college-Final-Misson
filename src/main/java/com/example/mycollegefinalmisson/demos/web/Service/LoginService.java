package com.example.mycollegefinalmisson.demos.web.Service;

import com.example.mycollegefinalmisson.demos.web.Entity.User;
import org.springframework.stereotype.Service;

/**
 * Description:
 * User: Lenhao
 * Date: 2024-03-27
 * Time: 10:14
 */
public interface LoginService{
    public int AuthenticateUser(User user);
}
