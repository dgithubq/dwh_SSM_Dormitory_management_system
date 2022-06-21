package com.dwh.controller;

import com.dwh.Dto.AccountDto;
import com.dwh.from.AccountForm;
import com.dwh.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

/**
 * 登陆退出功能
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService service;

    @RequestMapping("/login")
    //系统管理员登陆
    public ModelAndView login(AccountForm accountForm, HttpSession session){
        AccountDto accountDto = service.login(accountForm);
        ModelAndView modelAndView = new ModelAndView();
        switch (accountDto.getCode()){
            case -1:
                modelAndView.setViewName("/login");
                modelAndView.addObject("usernameError","用户名不存在");
                break;
            case -2:
                modelAndView.setViewName("/login");
                modelAndView.addObject("passwordError","密码错误");
                break;
            case 0:
                modelAndView.setViewName("/systemadmin");
                session.setAttribute("systemAdmin",accountDto.getAdmin());
                break;
        }
        return modelAndView;
    }
    //退出登录
    @RequestMapping("/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "/login";
    }
}
