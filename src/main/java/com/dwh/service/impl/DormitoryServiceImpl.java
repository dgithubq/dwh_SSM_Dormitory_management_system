package com.dwh.service.impl;

import com.dwh.entity.Dormitory;
import com.dwh.mapper.DormitoryMapper;
import com.dwh.service.DormitoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("dormitoryService")
public class DormitoryServiceImpl implements DormitoryService {
    @Autowired
    private DormitoryMapper dormitoryMapper;
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
}
