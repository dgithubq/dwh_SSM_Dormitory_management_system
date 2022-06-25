package com.dwh.service.impl;

import com.dwh.entity.MoveOut;
import com.dwh.mapper.MoveOutMapper;
import com.dwh.service.MoveOutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("moveOutService")
public class MoveOutServiceImpl implements MoveOutService {
    @Autowired
    private MoveOutMapper moveOutMapper;
    @Override
    public List<MoveOut> list() {
        List<MoveOut> list = moveOutMapper.list();
        return list;
    }

    @Override
    public List<MoveOut> search(String key, String value) {
        if (value == null){
            List<MoveOut> list = moveOutMapper.list();
            return list;
        }
        List<MoveOut> list = null;
        switch (key){
            case "studentName":
                list = moveOutMapper.searchByStudentName(value);
                break;
            case "dormitoryName":
                list = moveOutMapper.searchByDormitoryName(value);
                break;
        }
        return list;
    }
}
