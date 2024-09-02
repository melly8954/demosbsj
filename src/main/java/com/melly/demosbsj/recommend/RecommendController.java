package com.melly.demosbsj.recommend;

import com.melly.demosbsj.spot.SpotDto;
import com.melly.demosbsj.spot.SpotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class RecommendController {

    @Autowired
    private SpotService spotService;

    private static final int MAX_PAGE_COUNT = 5; // 최대 페이지 수

    @GetMapping("/recommend/spotMain")
    public String spotMain(Model model) {
        model.addAttribute("maxPageCount", MAX_PAGE_COUNT);
        return "recommend/spotMain";
    }

    @GetMapping("/recommend/photos")
    @ResponseBody
    public List<Photo> getPhotos(@RequestParam("page") int page) {
        int pageSize = 5; // 페이지당 사진 수
        List<SpotDto> spots = spotService.getAllSpot();

        // 페이지 수를 제한합니다.
        if (page > MAX_PAGE_COUNT) {
            page = MAX_PAGE_COUNT;
        }

        return spots.stream()
                .filter(spot -> spot.getFirstImage() != null && !spot.getFirstImage().isEmpty()) // null 또는 빈 문자열 필터링
                .skip((page - 1) * pageSize)
                .limit(pageSize)
                .map(spot -> new Photo(spot.getId(), spot.getFirstImage()))
                .collect(Collectors.toList());
    }
}