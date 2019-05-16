package com.thtf.casclienta.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @Description:
 * @Author: panyangyang
 * @Date: 2019/5/15 13:20
 */
@Controller
public class UserController {

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        System.out.println("-----------");
        return "hello";
    }

    /**
     * 跳转到指定页面
     * @param session
     * @return
     */
    @RequestMapping("/logout")
    public String loginOut2(HttpSession session){
        session.invalidate();
        System.out.println("系统退出");
        //退出登录后，跳转到退成成功的页面，不走默认页面
        return "redirect:http://localhost:8443/cas/logout?service=http://www.baidu.com";
    }

}
