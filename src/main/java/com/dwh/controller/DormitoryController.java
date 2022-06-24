package com.dwh.controller;

import com.dwh.entity.Building;
import com.dwh.entity.Dormitory;
import com.dwh.service.BuildingService;
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
    @Autowired
    private BuildingService buildingService;

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
        List<Building> buildingList = buildingService.list();
        modelAndView.addObject("list",list);
        modelAndView.addObject("buildingList",buildingList);
        modelAndView.setViewName("dormitorymanager");
        return modelAndView;
    }

    @RequestMapping("/save")
    public String save(Dormitory dormitory){
        dormitoryService.save(dormitory);
        return "redirect:/dormitory/list";
    }

    @RequestMapping("/search")
    public ModelAndView search(String key,String value){
        ModelAndView modelAndView = new ModelAndView();
        List<Dormitory> list = dormitoryService.search(key, value);
        List<Building> buildingList = buildingService.list();
        modelAndView.addObject("list",list);
        modelAndView.addObject("buildingList",buildingList);
        modelAndView.setViewName("dormitorymanager");
        return modelAndView;
    }

    @RequestMapping("/update")
    public String update(Dormitory dormitory){
       dormitoryService.update(dormitory);
        return "redirect:/dormitory/list";
    }
}
