package com.dwh.controller;

import com.dwh.entity.DormitoryAdmin;
import com.dwh.service.DormitoryAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/dormitoryAdmin")
public class DormitoryAdminController {
    @Autowired
    private DormitoryAdminService dormitoryAdminService;
    @RequestMapping("/list")
    public ModelAndView list(){
        ModelAndView modelAndView = new ModelAndView();
        List<DormitoryAdmin> dormitoryAdmins = dormitoryAdminService.list();
        modelAndView.addObject("dormitoryAdmins",dormitoryAdmins);
        modelAndView.setViewName("adminmanager");
        return modelAndView;
    }

    @RequestMapping("/search")
    public ModelAndView search(String key,String value){
        ModelAndView modelAndView = new ModelAndView();
        List<DormitoryAdmin> dormitoryAdmins = dormitoryAdminService.search(key, value);
        modelAndView.addObject("dormitoryAdmins",dormitoryAdmins);
        modelAndView.setViewName("adminmanager");
        return modelAndView;
    }

    @RequestMapping("/save")
    public String save(DormitoryAdmin dormitoryAdmin){
        dormitoryAdminService.save(dormitoryAdmin);
        return "redirect:/dormitoryAdmin/list";
    }
}
