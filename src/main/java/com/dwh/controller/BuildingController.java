package com.dwh.controller;

import com.dwh.entity.Building;
import com.dwh.entity.DormitoryAdmin;
import com.dwh.service.BuildingService;
import com.dwh.service.DormitoryAdminService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/building")
public class BuildingController {
    @Autowired
    private BuildingService buildingService;
    @Autowired
    private DormitoryAdminService dormitoryAdminService;

    @RequestMapping("/list")
    public ModelAndView list(){
        ModelAndView modelAndView = new ModelAndView();
        List<Building> buildings = buildingService.list();
        List<DormitoryAdmin> dormitoryAdminList = dormitoryAdminService.list();
        modelAndView.addObject("list",buildings);
        modelAndView.addObject("dormitoryAdminList",dormitoryAdminList);
        modelAndView.setViewName("buildingmanager");
        return modelAndView;
    }

    @RequestMapping("/search")
    public ModelAndView search(String key,String value){
        ModelAndView modelAndView = new ModelAndView();
        List<Building> buildingList = buildingService.search(key, value);
        List<DormitoryAdmin> dormitoryAdminList = dormitoryAdminService.list();
        modelAndView.addObject("list",buildingList);
        modelAndView.addObject("dormitoryAdminList",dormitoryAdminList);
        modelAndView.setViewName("buildingmanager");
        return modelAndView;
    }

    @RequestMapping("/save")
    public String save(Building building){
        buildingService.save(building);
        return "redirect:/building/list";
    }

    @RequestMapping("/update")
    public String update(Building building){
        buildingService.update(building);
        return "redirect:/building/list";
    }

    @RequestMapping("/delete")
    public String delete(Integer id){
        buildingService.delete(id);
        return "redirect:/building/list";
    }
}
