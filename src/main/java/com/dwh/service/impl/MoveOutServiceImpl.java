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
}
