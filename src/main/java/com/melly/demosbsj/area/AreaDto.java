package com.melly.demosbsj.area;

import jakarta.validation.constraints.NotNull;
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

public class AreaDto implements IArea {

    private Integer rnum;

    private Integer code;

    @NotNull(message = "이름은 Null 일 수 없습니다!")
    private String name;

}
