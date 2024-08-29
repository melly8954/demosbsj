//package com.melly.demosbsj.spot;
//
//import com.melly.demosbsj.area.AreaDto;
//import com.melly.demosbsj.contentType.ContentTypeDto;
//import com.melly.demosbsj.contentType.ContentTypeService;
//import com.melly.demosbsj.contentType.IContentType;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class SpotService implements ISpotServicce{
//
//    @Autowired
//    ISpotMybatisMapper spotMybatisMapper;
//
//    @Autowired
//    ContentTypeService contentTypeService;
//
//    @Override
//    public void saveSpot(ISpot spot) {
//        spotMybatisMapper.insertSpot((SpotDto) spot);
//    }
//
//    public void saveSpotDtoFromApiResponse(SpotApiResponse spotApiResponse){
//        for(SpotApiResponse.Item item: spotApiResponse.getResponse().getBody().getItems().getItem()){
//            // Item을 SpotDto로 변환
//            SpotDto spotDto = SpotDto.builder()
//                    .title(item.getTitle())
//                    .tel(item.getTel())
//                    .addr1(item.getAddr1())
//                    .zipcode(item.getZipcode())
//                    .mapx(item.getMapx())
//                    .mapy(item.getMapy())
//                    .firstimage(item.getFirstimage())
//                    .contentId(item.getContentid())
//                    .areaCodeId(item.getAreacode())
//                    .contentTypeId(contentTypeService.findContentType())
//                    .build();
//
//            saveSpot(spotDto);
//        }
//    }
//}
