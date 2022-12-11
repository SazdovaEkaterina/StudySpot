package ukim.finki.dians.studyspot.web.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ukim.finki.dians.studyspot.service.SpotService;

@Controller
@RequestMapping("/study-spot")
public class StudySpotController {

    private final SpotService spotService;

    public StudySpotController(SpotService spotService) {
        this.spotService = spotService;
    }

    @GetMapping
    public String getStudySpot(HttpSession httpSession) {
        httpSession.setAttribute("spot", spotService.findById(String.valueOf(httpSession.getAttribute("spot_id"))));
        return "study_spot";
    }

}
