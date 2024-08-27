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

    @Override
    public void saveAreas(List<IArea> areas) {
        for (IArea area : areas) {
            saveArea(area);
        }
    }

    public void saveAreasFromApiResponse(ApiResponse apiResponse) {
        for (ApiResponse.Item item : apiResponse.getResponse().getBody().getItems().getItem()) {
            // Item을 AreaDto로 변환
            AreaDto areaDto = AreaDto.builder()
                    .rnum(item.getRnum())
                    .code(item.getCode())
                    .name(item.getName())
                    .build();
            saveArea(areaDto);
        }
    }
}
