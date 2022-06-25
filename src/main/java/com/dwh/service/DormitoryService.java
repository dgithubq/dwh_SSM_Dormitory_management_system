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

    /**
     * 根据条件查询
     * @param key    条件
     * @param value  关键字
     * @return
     */
    public List<Dormitory> search(String key,String value);

    /**
     * 更新
     * @param dormitory
     */
    public void update(Dormitory dormitory);

    /**
     * 删除
     * @param id
     */
    public void delete(Integer id);

    /**
     * 根据楼栋id查宿舍
     * @param buildingId
     * @return
     */
    public List<Dormitory> findByBuildingId(Integer buildingId);
}
