package com.melly.demosbsj.spot;

public interface ISpot {
    Long getId();
    void setId(Long id);

    String getTitle();
    void setTitle(String title);

    String getAddr1();
    void setAddr1(String addr1);

    String getTel();
    void setTel(String tel);

    String getZipCode();
    void setZipCode(String zipCode);

    String getMapX();
    void setMapX(String mapX);

    String getMapY();
    void setMapY(String mapY);

    String getFirstImage();
    void setFirstImage(String firstImage);

    String getAreaCode();
    void setAreaCode(String areaCode);

    Long getContentTypeId();
    void setContentTypeId(Long contentTypeId);

}
