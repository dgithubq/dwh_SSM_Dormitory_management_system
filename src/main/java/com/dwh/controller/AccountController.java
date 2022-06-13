package com.dwh.controller;

import com.dwh.entity.Account;
import com.dwh.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;
    @RequestMapping("/findAll")
    public ModelAndView findAll(){
        ModelAndView mv = new ModelAndView();
        System.out.println("表现层执行");
        List<Account> accountList = accountService.findAll();
        mv.addObject("accounts",accountList);
        mv.setViewName("list");
        return mv;
    }
}
