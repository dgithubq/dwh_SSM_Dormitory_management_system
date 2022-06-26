package com.dwh.service.impl;

import com.dwh.entity.Absent;
import com.dwh.mapper.AbsentMapper;
import com.dwh.service.AbsentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("absentService")
public class AbsentServiceImpl implements AbsentService {
    @Autowired
    private AbsentMapper absentMapper;

    @Override
    public List<Absent> list() {
        List<Absent> list = absentMapper.list();
        return list;
    }

    @Override
    public List<Absent> search(String key, String value) {
        if (value == null){
            List<Absent> list = absentMapper.list();
            return list;
        }
        List<Absent> list = null;
        switch (key){
            case "buildingName":
                list = absentMapper.searchByBuildingName(value);
                break;
            case "dormitoryName":
                list = absentMapper.searchByDormitoryName(value);
                break;
        }
        return list;
    }

    @Override
    public void save(Absent absent) {
        try {
            absentMapper.save(absent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
