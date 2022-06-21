package com.dwh.test.service;

import com.dwh.entity.Dormitory;
import com.dwh.service.DormitoryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestDormitoryService {
    @Autowired
    private DormitoryService dormitoryService;
    @Test
    public void testAvailableList(){
        List<Dormitory> dormitories = dormitoryService.availableList();
        System.out.println("dormitories = " + dormitories);
    }
    @Test
    public void testList(){
        List<Dormitory> list = dormitoryService.list();
        System.out.println("list = " + list);
    }
}
