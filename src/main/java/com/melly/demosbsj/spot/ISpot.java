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

    String getZipcode();
    void setZipcode(String zipcode);

    String getMapX();
    void setMapX(String mapX);

    String getMapY();
    void setMapY(String mapY);

    String getFirstimage();
    void setFirstimage(String firstImage);

    String getContentId();
    void setContentId(String contentId);

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
        if (from.getZipcode() != null && !from.getZipcode().isEmpty()) {
            this.setZipcode(from.getZipcode());
        }
        if (from.getMapX() != null && !from.getMapX().isEmpty()) {
            this.setMapX(from.getMapX());
        }
        if (from.getMapY() != null && !from.getMapY().isEmpty()) {
            this.setMapY(from.getMapY());
        }
        if (from.getFirstimage() != null && !from.getFirstimage().isEmpty()) {
            this.setFirstimage(from.getFirstimage());
        }
        if (from.getAreaCodeId() != null) {
            this.setAreaCodeId(from.getAreaCodeId());
        }
        if (from.getContentTypeId() != null) {
            this.setContentTypeId(from.getContentTypeId());
        }
    }



}
