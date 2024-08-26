package com.melly.demosbsj.spot;

public interface ISpot {
    Long getId();
    void setId(Long id);

    String getTitle();
    void setTitle(String title);

    String getAddr();
    void setAddr(String addr);

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

    Integer getAreaCodeId();
    void setAreaCodeId(Integer areaCodeId);

    Integer getContentTypeId();
    void setContentTypeId(Integer contentTypeId);

    default void copyFields(ISpot from){
        if( from == null ){
            return;
        }

        if( from.getId() != null ){
            this.setId(from.getId());
        }

        if (from.getTitle() != null && !from.getTitle().isEmpty()) {
            this.setTitle(from.getTitle());
        }

        if (from.getAddr() != null && !from.getAddr().isEmpty()) {
            this.setAddr(from.getAddr());
        }

        if (from.getTel() != null && !from.getTel().isEmpty()) {
            this.setTel(from.getTel());
        }
        if (from.getZipCode() != null && !from.getZipCode().isEmpty()) {
            this.setZipCode(from.getZipCode());
        }
        if (from.getMapX() != null && !from.getMapX().isEmpty()) {
            this.setMapX(from.getMapX());
        }
        if (from.getMapY() != null && !from.getMapY().isEmpty()) {
            this.setMapY(from.getMapY());
        }
        if (from.getFirstImage() != null && !from.getFirstImage().isEmpty()) {
            this.setFirstImage(from.getFirstImage());
        }
        if (from.getAreaCodeId() != null) {
            this.setAreaCodeId(from.getAreaCodeId());
        }
        if (from.getContentTypeId() != null) {
            this.setContentTypeId(from.getContentTypeId());
        }
    }



}
