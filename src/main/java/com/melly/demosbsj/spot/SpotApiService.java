//package com.melly.demosbsj.spot;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.melly.demosbsj.area.AreaDto;
//import com.melly.demosbsj.area.AreaService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.net.URI;
//import java.net.http.HttpClient;
//import java.net.http.HttpRequest;
//import java.net.http.HttpResponse;
//
//@Service
//public class SpotApiService {
//    @Autowired
//    ObjectMapper objectMapper;      // JSON 파싱을 위한 ObjectMapper
//
//    @Autowired
//    private SpotService spotService;
//
//    @Autowired
//    private AreaService areaService; // AreaService 주입
//
//    public SpotApiResponse fetchDataFromApi() throws Exception {
//        String url = "https://apis.data.go.kr/B551011/KorService1/areaBasedList1?numOfRows=20&pageNo=1&MobileOS=ETC&MobileApp=test&_type=json&serviceKey=ZK5%2FABP5iNBCAOoQYO1NPKX7ml5Iv4yQs5jo8bokCDw5RvV%2BwogquKHDfUj58azCWXGgn36NF9%2FqqYzoJI7ovA%3D%3D";
//        HttpRequest request = HttpRequest.newBuilder()
//                .uri(new URI(url))
//                .GET()
//                .build();
//        HttpResponse<String> response = HttpClient.newBuilder()
//                .build()
//                .send(request, HttpResponse.BodyHandlers.ofString());
//
//        SpotApiResponse spotApiResponse = objectMapper.readValue(response.body(), SpotApiResponse.class);
//
//        spotService.saveSpotDtoFromApiResponse(spotApiResponse);
//        return spotApiResponse;
//    }
//}
//
