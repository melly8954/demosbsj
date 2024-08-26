package com.melly.demosbsj.area;

import org.springframework.beans.factory.annotation.Autowired;
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
    public ApiResponse fetchAreas() {
        try {
            return apiService.fetchDataFromApi();
        } catch (JAXBException e) {
            // 예외 처리 로직
            e.printStackTrace();
            return null; // 또는 적절한 에러 응답
        }
    }
}
