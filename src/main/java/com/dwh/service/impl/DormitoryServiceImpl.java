package com.dwh.service.impl;

import com.dwh.entity.Dormitory;
import com.dwh.mapper.DormitoryMapper;
import com.dwh.mapper.StudentMapper;
import com.dwh.service.DormitoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("dormitoryService")
public class DormitoryServiceImpl implements DormitoryService {
    @Autowired
    private DormitoryMapper dormitoryMapper;
    @Autowired
    private StudentMapper studentMapper;
    @Override
    public List<Dormitory> availableList() {
        List<Dormitory> dormitories = dormitoryMapper.availableList();
        return dormitories;
    }

    @Override
    public List<Dormitory> list() {
        List<Dormitory> list = dormitoryMapper.list();
        return list;
    }

    @Override
    public void save(Dormitory dormitory) {
        try {
            dormitoryMapper.save(dormitory);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Dormitory> search(String key, String value) {
        if (value == null){
            List<Dormitory> list = dormitoryMapper.list();
            return list;
        }
        List<Dormitory> list = null;
        switch (key){
            case "name":
                list = dormitoryMapper.searchByName(value);
                break;
            case "telephone":
                list = dormitoryMapper.searchByTelephone(value);
                break;
        }
        return list;
    }

    @Override
    public void update(Dormitory dormitory) {
        try {
            dormitoryMapper.update(dormitory);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Transactional
    @Override
    public void delete(Integer id) {
        //查询该宿舍的学生id
        try {
            List<Integer> studentIdByDormitoryId = studentMapper.findStudentIdByDormitoryId(id);
            for (Integer studentId : studentIdByDormitoryId){
                //查询可用宿舍id
                Integer availableDormitoryId = dormitoryMapper.findAvailableDormitoryId();
                //更新学生宿舍
                studentMapper.resetDormitoryId(studentId,availableDormitoryId);
                //该宿舍床位-1
                dormitoryMapper.subAvailable(availableDormitoryId);
            }
            dormitoryMapper.delete(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
