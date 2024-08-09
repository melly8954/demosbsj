package com.melly.demosbsj.recommend;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SpotDto implements ISpot {
    private Long id;                    // 유일한 식별자 (기본 키)
    private Region region;              // 추천 지역 이름
    private String spotName;            // 추천 장소 이름
    private String category;            // 장소의 카테고리 (예: 관광지, 음식점, 숙박 등)명
    private String address;             // 장소의 주소
    private Integer zipcode;            // 우편번호
    private Float latitude;             // 위도
    private Float longitude;            // 경도
    private String imageUrl;            // 대표 이미지 URL
    private String tel;                 // 연락처 전화번호
    private String websiteUrl;          // 웹사이트 URL
    private String operatingHours;      // 운영 시간
    private String entranceFee;         // 입장료 정보
    private Float rating;               // 평점
    private Integer reviewCount;        // 리뷰 개수
    private Long contentId;             // Tour API 등에서 제공하는 콘텐츠 ID
    private Integer contentTypeId;      // 콘텐츠 타입 ID (예: 관광지, 숙박, 음식점 등)

}
