package com.melly.demosbsj.spot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpotService implements ISpotServicce{

    @Autowired
    ISpotMybatisMapper spotMybatisMapper;



    @Override
    public void saveSpot(ISpot spot) {
        spotMybatisMapper.insertSpot((SpotDto) spot);
    }

    public void saveSpotDtoFromApiResponse(SpotApiResponse spotApiResponse){
        for(SpotApiResponse.Item item: spotApiResponse.getResponse().getBody().getItems().getItem()){
            // Item을 SpotDto로 변환
            SpotDto spotDto = SpotDto.builder()
                    .title(item.getTitle())
                    .tel(item.getTel())
                    .addr1(item.getAddr1())
                    .zipCode(item.getZipcode())
                    .mapX(item.getMapx())
                    .mapY(item.getMapy())
                    .firstImage(item.getFirstimage())
                    .areaCode(item.getAreacode())
                    .contentTypeId(Long.parseLong(item.getContenttypeid()))
                    .build();

            saveSpot(spotDto);
        }
    }
}
