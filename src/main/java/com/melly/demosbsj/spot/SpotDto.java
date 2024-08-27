package com.melly.demosbsj.spot;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor

public class SpotDto implements ISpot {
    private Long id;
    private String title;
    private String addr;
    private String tel;
    private String zipCode;
    private String MapX;
    private String MapY;
    private String firstImage;
    private Integer AreaCodeId;
    private Integer ContentTypeId;

}
