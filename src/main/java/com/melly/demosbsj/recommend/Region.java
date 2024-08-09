package com.melly.demosbsj.recommend;

public enum Region {
    SEOUL("서울"),
    GYEONGIN("경인"),
    GANGWON("강원"),
    JEOLLA("전라"),
    GYEONGSANG("경상"),
    JEJU("제주");

    private final String region;

    Region(String region) {
        this.region = region;
    }

    public String getRegion() {
        return region;
    }
}
