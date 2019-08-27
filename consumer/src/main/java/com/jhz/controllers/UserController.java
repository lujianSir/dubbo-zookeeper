package com.jhz.controllers;



import com.jhz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
/**
 * @author jhz
 * @date 18-8-5 下午10:57
 */
@Controller
public class UserController {
    @Autowired
    public UserService userService;
    @RequestMapping("/login")
    @ResponseBody
    public String doLogin(HttpServletRequest request, HttpServletResponse response) {
    	String str=userService.loginVerify(request.getParameter("username"),request.getParameter("password"));
        return str;
    }

}