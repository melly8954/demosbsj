package com.melly.demosbsj.spot;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ISpotMybatisMapper {
    void insertSpot(SpotDto spotDto);
}
