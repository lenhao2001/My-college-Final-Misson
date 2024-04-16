package com.example.mycollegefinalmisson.demos.web.Controller;

import com.example.mycollegefinalmisson.demos.web.Entity.User;
import com.example.mycollegefinalmisson.demos.web.Service.LoginService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
    public String login(@ModelAttribute("user") User user, Model model,HttpSession session) {
        int i = loginService.AuthenticateUser(user);

        if (i<2){
            model.addAttribute("loginError","账号或密码错误");
            return "UserLogin";
        }else{
            session.setAttribute("loggedInUser",user.getUserId());
            return "redirect:/index";
        }

    }

    @RequestMapping("/securePage")
    public String securePage(HttpServletRequest request){
        HttpSession session = request.getSession();
        String userId = (String) session.getAttribute("loggedInUser");

        if (userId == null){
            return "UserLogin";
        }

        return "redirect:/index";
    }


}
