package com.dwh.test.mapper;

import com.dwh.entity.Building;
import com.dwh.mapper.BuildingMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestBuildingMapper {
    @Autowired
    private BuildingMapper buildingMapper;
    @Test
    public void testList(){
        List<Building> buildings = buildingMapper.list();
        System.out.println("buildings = " + buildings);
    }

    @Test
    public void testSearchByName(){
        List<Building> buildings = buildingMapper.searchByName("5号楼");
        System.out.println("buildings = " + buildings);
    }
    @Test
    public void testSearchByIntroduction(){
        List<Building> buildings = buildingMapper.searchByIntroduction("计算机学院宿舍楼");
        System.out.println("buildings = " + buildings);
    }
}
