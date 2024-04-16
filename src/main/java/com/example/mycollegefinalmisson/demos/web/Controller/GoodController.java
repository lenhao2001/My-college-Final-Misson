package com.example.mycollegefinalmisson.demos.web.Controller;

import com.example.mycollegefinalmisson.demos.web.Entity.Good;
import com.example.mycollegefinalmisson.demos.web.Entity.User;
import com.example.mycollegefinalmisson.demos.web.Service.GoodService;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 * User: Lenhao
 * Date: 2024-03-27
 * Time: 10:13
 */
@Controller
@RequestMapping("/")
public class GoodController {
    @Autowired
    GoodService goodService;

    @RequestMapping("/")
    public String reDireactWay(){
        return "redirect:/user/securePage";
    }



    @RequestMapping("/index")
    public String getGoodsList(Model model,HttpSession session){
        String userid = (String) session.getAttribute("loggedInUser");
        List<Good> goods = goodService.getIndexGoodsPage();
        model.addAttribute("goodsList",goods);
        model.addAttribute("message","hi! "+userid);
        model.addAttribute("welMessage",userid);


        return "index";
    }
}
