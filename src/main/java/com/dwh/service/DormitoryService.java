package com.dwh.service;

import com.dwh.entity.Dormitory;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface DormitoryService {
    /**
     * 查询可用的宿舍信息
     * @return
     */
    public List<Dormitory> availableList();
    /**
     * 查询所有宿舍
     */
    public List<Dormitory> list();

    /**
     * 添加新的宿舍
     * @param dormitory
     */
    public void save(Dormitory dormitory);
}
