package com.melly.demosbsj.spot;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.melly.demosbsj.area.AreaApiResponse;
import lombok.Data;
import org.apache.catalina.connector.Response;

import java.util.List;

@Data
public class SpotApiResponse {
    @JsonProperty("response")
    private AreaApiResponse.Response response;

    @Data
    public static class Response {
        @JsonProperty("header")
        private AreaApiResponse.Header header;

        @JsonProperty("body")
        private AreaApiResponse.Body body;
    }

    @Data
    public static class Header {
        @JsonProperty("resultCode")
        private String resultCode;

        @JsonProperty("resultMsg")
        private String resultMsg;
    }

    @Data
    public static class Body {
        @JsonProperty("items")
        private AreaApiResponse.Items items;


    @Data
    public static class Items {
        @JsonProperty("item")
        private List<AreaApiResponse.Item> item; // List<Item>으로 변경
    }

    @Data
    public static class Item {
        @JsonProperty("title")
        private String title;

        @JsonProperty("tel")
        private String tel;

        @JsonProperty("addr1")
        private Integer addr1;

        @JsonProperty("zipcode")
        private Integer zipcode;

        @JsonProperty("firstimage")
        private Integer firstimage;

        @JsonProperty("mapx")
        private Integer mapx;

        @JsonProperty("mapy")
        private Integer mapy;

        @JsonProperty("contentid")
        private Integer contentid;
    }
    }
}



