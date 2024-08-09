package com.melly.demosbsj.recommend;

public interface ISpot {

    Long getId();
    void setId(Long id);

    Region getRegion();
    void setRegion(Region region);

    String getSpotName();
    void setSpotName(String spotName);

    String getCategory();
    void setCategory(String category);

    String getAddress();
    void setAddress(String address);


    Integer getZipcode();
    void setZipcode(Integer zipcode);


    Float getLatitude();
    void setLatitude(Float latitude);


    Float getLongitude();
    void setLongitude(Float longitude);

    String getImageUrl();
    void setImageUrl(String imageUrl);

    String getTel();
    void setTel(String tel);


    String getWebsiteUrl();
    void setWebsiteUrl(String websiteUrl);


    String getOperatingHours();
    void setOperatingHours(String operatingHours);


    String getEntranceFee();
    void setEntranceFee(String entranceFee);


    Float getRating();
    void setRating(Float rating);


    Integer getReviewCount();
    void setReviewCount(Integer reviewCount);

    Long getContentId();
    void setContentId(Long contentId);

    Integer getContentTypeId();
    void setContentTypeId(Integer contentTypeId);

    default void copyFields(ISpot from) {
        if (from == null) {
            return;
        }
        this.setId(from.getId());
        this.setRegion(from.getRegion());
        this.setSpotName(from.getSpotName());
        this.setCategory(from.getCategory());
        this.setAddress(from.getAddress());
        this.setZipcode(from.getZipcode());
        this.setLatitude(from.getLatitude());
        this.setLongitude(from.getLongitude());
        this.setImageUrl(from.getImageUrl());
        this.setTel(from.getTel());
        this.setWebsiteUrl(from.getWebsiteUrl());
        this.setOperatingHours(from.getOperatingHours());
        this.setEntranceFee(from.getEntranceFee());
        this.setRating(from.getRating());
        this.setReviewCount(from.getReviewCount());
        this.setContentId(from.getContentId());
        this.setContentTypeId(from.getContentTypeId());
    }
}
