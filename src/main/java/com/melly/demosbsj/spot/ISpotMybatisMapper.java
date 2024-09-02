package com.melly.demosbsj.spot;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ISpotMybatisMapper {
    void insertSpot(SpotDto spotDto);
    List<SpotDto> findAll();
}
