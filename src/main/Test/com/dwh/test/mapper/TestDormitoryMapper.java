package com.dwh.test.mapper;


import com.dwh.entity.Dormitory;
import com.dwh.mapper.DormitoryMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestDormitoryMapper {
    @Autowired
    private DormitoryMapper dormitoryMapper;
    @Test
    public void testAvailableList(){
        List<Dormitory> dormitories = dormitoryMapper.availableList();
        System.out.println("dormitories = " + dormitories);
    }
    @Test
    public void testList(){
        List<Dormitory> list = dormitoryMapper.list();
        System.out.println("list = " + list);
    }
    @Test
    public void testSearch(){
        List<Dormitory> dormitories = dormitoryMapper.searchByName("666");
        System.out.println("dormitories = " + dormitories);
    }
}
