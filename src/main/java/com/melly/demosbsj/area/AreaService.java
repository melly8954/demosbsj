package com.melly.demosbsj.area;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AreaService implements IAreaService {
    @Autowired
    private IAreaMybatisMapper areaMapper;

    @Override
    public void saveArea(IArea area) {
        areaMapper.insertArea((AreaDto) area);

    }




    public void saveAreasFromApiResponse(AreaApiResponse areaApiResponse) {
        for (AreaApiResponse.Item item : areaApiResponse.getResponse().getBody().getItems().getItem()) {
            // Item을 AreaDto로 변환
            AreaDto areaDto = AreaDto.builder()
                    .code(item.getCode())
                    .name(item.getName())
                    .build();
            areaDto.copyfield(areaDto);
            saveArea(areaDto);
        }
    }
}
