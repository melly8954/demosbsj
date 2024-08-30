package com.melly.demosbsj.spot;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.melly.demosbsj.area.AreaDto;
import com.melly.demosbsj.area.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Service
public class SpotApiService {
    @Autowired
    ObjectMapper objectMapper;      // JSON 파싱을 위한 ObjectMapper

    @Autowired
    private SpotService spotService;

    @Value("${api.key}")
    String serviceKey;

    public SpotApiResponse fetchDataFromApi() throws Exception {
        // 변수 선언
        String baseUrl = "https://apis.data.go.kr/B551011/KorService1/areaBasedList1";
        int numOfRows = 50;
        String mobileOS = "ETC";
        String mobileApp = "test";
        String responseType = "json";

        // URL 구성
        String url = String.format(
                "%s?numOfRows=%d&MobileOS=%s&MobileApp=%s&_type=%s&serviceKey=%s",
                baseUrl, numOfRows, mobileOS, mobileApp, responseType, serviceKey
        );

        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI(url))
                .GET()
                .build();
        HttpResponse<String> response = HttpClient.newBuilder()
                .build()
                .send(request, HttpResponse.BodyHandlers.ofString());

        SpotApiResponse spotApiResponse = objectMapper.readValue(response.body(), SpotApiResponse.class);

        spotService.saveSpotDtoFromApiResponse(spotApiResponse);
        return spotApiResponse;
    }
}

