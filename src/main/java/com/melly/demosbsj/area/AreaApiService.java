package com.melly.demosbsj.area;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Service
public class AreaApiService {

    @Autowired
    private ObjectMapper objectMapper; // JSON 파싱을 위한 ObjectMapper

    @Autowired
    private AreaService areaService;

    public AreaApiResponse fetchDataFromApi() throws Exception {
        String url = "https://apis.data.go.kr/B551011/KorService1/areaCode1?numOfRows=20&pageNo=1&MobileOS=ETC&MobileApp=test&_type=json&serviceKey=ZK5%2FABP5iNBCAOoQYO1NPKX7ml5Iv4yQs5jo8bokCDw5RvV%2BwogquKHDfUj58azCWXGgn36NF9%2FqqYzoJI7ovA%3D%3D";
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI(url))
                .GET()
                .build();
        HttpResponse<String> response = HttpClient.newBuilder()
                .build()
                .send(request, HttpResponse.BodyHandlers.ofString());

        AreaApiResponse areaApiResponse = objectMapper.readValue(response.body(), AreaApiResponse.class);

        // DTO를 사용해 데이터베이스에 저장
        areaService.saveAreasFromApiResponse(areaApiResponse);
        return areaApiResponse;
    }
}
