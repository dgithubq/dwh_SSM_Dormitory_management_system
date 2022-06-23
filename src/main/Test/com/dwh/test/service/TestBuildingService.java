package com.dwh.test.service;

import com.dwh.entity.Building;
import com.dwh.mapper.BuildingMapper;
import com.dwh.service.BuildingService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestBuildingService {
    @Autowired
    private BuildingService buildingService;
    @Test
    public void testList(){
        List<Building> buildings = buildingService.list();
        System.out.println("buildings = " + buildings);
    }
    @Test
    public void testSearchByName(){
        List<Building> buildings = buildingService.search("name","5号楼");
        System.out.println("buildings = " + buildings);
    }

}
