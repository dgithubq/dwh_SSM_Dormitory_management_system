package com.dwh.service;

import com.dwh.entity.MoveOut;

import java.util.List;

public interface MoveOutService {
    public List<MoveOut> list();
    public List<MoveOut> search(String key,String value);
}
