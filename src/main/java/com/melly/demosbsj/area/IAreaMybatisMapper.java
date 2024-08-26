package com.melly.demosbsj.area;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IAreaMybatisMapper {
    void insertArea(AreaDto area);
}
