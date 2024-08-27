package com.melly.demosbsj.area;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.bind.JAXBException;

@RestController
@RequestMapping("/api/areas")
public class AreaController {
    @Autowired
    private ApiService apiService;


    @GetMapping("/fetch")
    public ResponseEntity<?> fetchAreas() {
        try {
            ApiResponse apiResponse = apiService.fetchDataFromApi();
            return ResponseEntity.ok(apiResponse);
        } catch (Exception e) {
            // 예외 처리 로직 - 스택 트레이스를 로그에 기록
            e.printStackTrace(); // 로그에 출력
            // 에러 메시지와 함께 HTTP 500 응답 반환
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error occurred while fetching data: " + e.toString());
        }
    }
}
