package com.book.controller;

import com.book.pojo.User;
import com.book.service.UserService;

import javax.servlet.http.HttpSession;

public class UserController {
    private UserService userService;
    public String login(String uname,String pwd,HttpSession session){
        User user = userService.login(uname, pwd);
        if (user!=null){//存在用户，登录成功
            session.setAttribute("currUser",user);
            return "redirect:book.do?operate=index";//这里operate可以省略，因为默认访问控制器的index方法
        }
        return "user/login";//登陆失败
    }
}
