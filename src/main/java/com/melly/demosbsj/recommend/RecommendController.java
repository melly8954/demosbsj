package com.melly.demosbsj.recommend;

import com.melly.demosbsj.spot.SpotDto;
import com.melly.demosbsj.spot.SpotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class RecommendController {

    @Autowired
    private SpotService spotService;

    @GetMapping("/recommend/spotMain")
    public String spotMain(Model model) {
        // 데이터베이스에서 사진 URL 가져오기
        List<SpotDto> spots = spotService.getAllSpot();

        // SpotDto를 Photo 객체로 변환
        List<Photo> photos = spots.stream()
                .map(spot -> new Photo(spot.getId(), spot.getFirstImage()))
                .collect(Collectors.toList());

        model.addAttribute("title", "추천 장소 메인 페이지");
        model.addAttribute("photos", photos);

        return "recommend/spotMain"; // 이 이름에 맞는 템플릿 파일이 있어야 합니다.
    }
}
