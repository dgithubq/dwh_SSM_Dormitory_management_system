package com.dwh.controller;

import com.dwh.entity.Dormitory;
import com.dwh.service.DormitoryService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/dormitory")
public class DormitoryController {
    @Autowired
    private DormitoryService dormitoryService;

    @RequestMapping("/availableList")
    public ModelAndView availableList(){
        ModelAndView modelAndView = new ModelAndView();
        List<Dormitory> dormitories = dormitoryService.availableList();
        modelAndView.addObject("dormitories",dormitories);
        modelAndView.setViewName("dormitorymanager");
        return modelAndView;
    }
    @RequestMapping("/list")
    public ModelAndView list(){
        ModelAndView modelAndView = new ModelAndView();
        List<Dormitory> list = dormitoryService.list();
        modelAndView.addObject("list",list);
        modelAndView.setViewName("dormitorymanager");
        return modelAndView;
    }
}
