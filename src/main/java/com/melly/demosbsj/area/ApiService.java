package com.melly.demosbsj.area;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;

@Service
public class ApiService {
    public ApiResponse fetchDataFromApi() throws JAXBException {
        String apiUrl = "https://apis.data.go.kr/B551011/KorService1/areaCode1?numOfRows=5&pageNo=3&MobileOS=ETC&MobileApp=test&serviceKey=ZK5%2FABP5iNBCAOoQYO1NPKX7ml5Iv4yQs5jo8bokCDw5RvV%2BwogquKHDfUj58azCWXGgn36NF9%2FqqYzoJI7ovA%3D%3D";
        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject(apiUrl, String.class);

        JAXBContext jaxbContext = JAXBContext.newInstance(ApiResponse.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        StringReader reader = new StringReader(response);

        return (ApiResponse) unmarshaller.unmarshal(reader);
    }
}
