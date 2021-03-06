package com.shopping.miaosha.comtroller;

import com.shopping.miaosha.dao.miaoshauser;
import com.shopping.miaosha.redis.RedisService;
import com.shopping.miaosha.result.Result;
import com.shopping.miaosha.service.goodsservice;
import com.shopping.miaosha.service.miaoshauserservice;
import com.shopping.miaosha.vo.goodsvo;
import com.shopping.miaosha.vo.loginvo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/goods")
public class userController {
    private static Logger log= LoggerFactory.getLogger(Controller.class);
    @Autowired
    miaoshauserservice userservice;

    @Autowired
    RedisService redisService;

    @Autowired
    goodsservice goodsservice;


    @RequestMapping("/info")
    @ResponseBody
    public Result<miaoshauser> info(Model Model, miaoshauser user){
         return Result.success(user);
    }
}
