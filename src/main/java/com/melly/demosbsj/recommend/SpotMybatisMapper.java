package com.melly.demosbsj.recommend;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SpotMybatisMapper {
    // Create
    void insertSpot(SpotDto spotDto);

    // Read
    SpotDto findSpotById(Long id);

    List<SpotDto> findAllSpots();


    // Update
    void updateSpot(SpotDto spotDto);

    // Delete
    void deleteSpotById(Long id);


    // Count
    int countAllByNameContains(@Param("name") String name);

    // Find all by name contains
    List<SpotDto> findAllByNameContains(@Param("name") String name);
}
