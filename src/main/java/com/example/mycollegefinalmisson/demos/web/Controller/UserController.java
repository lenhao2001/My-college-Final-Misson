package com.example.mycollegefinalmisson.demos.web.Controller;

import com.example.mycollegefinalmisson.demos.web.Entity.User;
import com.example.mycollegefinalmisson.demos.web.Service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Description:
 * User: Lenhao
 * Date: 2024-02-11
 * Time: 19:43
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private LoginService loginService;

    @RequestMapping("/login")
    public String login(@ModelAttribute("user") User user, Model model) {
        System.out.println(user.toString());
        int i = loginService.AuthenticateUser(user);
        System.out.println(i);

        if (i<2){
            model.addAttribute("loginError","账号或密码错误");
            return "UserLogin";
        }else{
            return "redirect:/index";
        }

    }

}
