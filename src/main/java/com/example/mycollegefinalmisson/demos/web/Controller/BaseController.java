package com.example.mycollegefinalmisson.demos.web.Controller;

import com.example.mycollegefinalmisson.demos.web.Entity.Good;
import com.example.mycollegefinalmisson.demos.web.Entity.Own;
import com.example.mycollegefinalmisson.demos.web.Service.GoodService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Description:
 * User: Lenhao
 * Date: 2024-03-27
 * Time: 10:14
 */
@Controller
@RequestMapping("/My")
public class BaseController {

    @Autowired
    GoodService goodService;
    @RequestMapping("/{id}")
    public String getUserById(@PathVariable String id, Model model){
        List<Own> goodsPage = goodService.getMyGoodsPage(id);
        model.addAttribute("MyOwnGoods",goodsPage);
        model.addAttribute("MyId",id);

        return "MyData";
    }
    //前端嵌套获取订单的UserID和GoodsId，然后利用GoodsID获取存储进Model里面的数据，model.attributeName就是GoodsId。
//        for (Own own :
//                goodsPage) {
//            Good goodByGoodid = goodService.getGoodByGoodid(own.getGoodId());
//            model.addAttribute(String.valueOf(goodByGoodid.getGoodId()),goodByGoodid);
//        }
//
    @RequestMapping("/EditGoodPage/{goodId}")//找到商品id，然后转发商品给商品编辑页面
    public String EditGoodByGoodId(@PathVariable int goodId,Model model){
        Good goodByGoodid = goodService.getGoodByGoodid(goodId);
        model.addAttribute("Good",goodByGoodid);
        return "EditGoodAndUpdata";
    }

    @RequestMapping("/UpdateGoodForm")//这里是商品页面，获取到编辑后的商品
    public String UpdateGoodFormBY(@Param("Good") Good good, Model model){
        Good goodByGoodid = goodService.getGoodByGoodid(good.getGoodId());
        if (goodByGoodid.getGoodId() == good.getGoodId()){ //商品确实存在
            if (goodService.updateGoodsByGoodsId(good)){
                return "redirect:/My/"+goodService.getGoodsOwner(good.getGoodId()).getUserId();//这里传位置，靠北，传错了。
            }//综合评价来讲，这些不是特别关键的数据应该是保存在前端Session，然后获取session.userId的，但写着写着全写后端去了，嘿，是这样的。
        }
        return "EditGoodAndUpdata";
    }

    @RequestMapping("/DelGood/{goodId}/{userId}")
    public String DelGoodByGoodId(@PathVariable int goodId,@PathVariable String userId,Model model){
        boolean success = goodService.DelGoodByGoodId(goodId); //success->ture 修改成功
//        String message = success ?  "删除成功" : "删除失败";
//        model.addAttribute("message",message);
        return "redirect:/My/"+userId;
    }




}
