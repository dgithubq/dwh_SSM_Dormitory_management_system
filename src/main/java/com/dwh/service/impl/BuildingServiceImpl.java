package com.dwh.service.impl;

import com.dwh.entity.Building;
import com.dwh.entity.Dormitory;
import com.dwh.mapper.BuildingMapper;
import com.dwh.mapper.DormitoryMapper;
import com.dwh.mapper.StudentMapper;
import com.dwh.service.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("buildingService")
public class BuildingServiceImpl implements BuildingService {
    @Autowired
    private BuildingMapper buildingMapper;
    @Autowired
    private DormitoryMapper dormitoryMapper;
    @Autowired
    private StudentMapper studentMapper;
    @Override
    public List<Building> list() {
        List<Building> buildings = buildingMapper.list();
        return buildings;
    }

    @Override
    public List<Building> search(String key, String value) {
        if (value == null){
            List<Building> buildings = buildingMapper.list();
            return buildings;
        }
        List<Building> list = null;
        switch (key){
            case "name":
                list = buildingMapper.searchByName(value);
                break;
            case "introduction":
                list = buildingMapper.searchByIntroduction(value);
                break;
        }
        return list;
    }

    @Override
    public void save(Building building) {
        try {
            buildingMapper.save(building);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Building building) {
        try {
            buildingMapper.update(building);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Transactional
    @Override
    public void delete(Integer id) {
        //找到楼中所有宿舍
        //找到宿舍中所有学生
        //给所有学生换寝室
        //删除楼宇
        try {
            //查询出所有宿舍的id
            List<Integer> dormitoryIdList = dormitoryMapper.findDormitoryIdByBuildingId(id);
            //遍历出所有学生id(可以封装)
            for (Integer dormitoryId:dormitoryIdList) {
                List<Integer> studentIdList = studentMapper.findStudentIdByDormitoryId(dormitoryId);
                for (Integer studentId:studentIdList) {
                    //查询所有空余床位
                    Integer availableDormitoryId = dormitoryMapper.findAvailableDormitoryId();
                    //更新学生床位
                    studentMapper.resetDormitoryId(studentId,availableDormitoryId);
                    //床位-1
                    dormitoryMapper.subAvailable(availableDormitoryId);
                }
                //删除所有宿舍
                dormitoryMapper.delete(dormitoryId);
            }
            buildingMapper.delete(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
