package ukim.finki.dians.studyspot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/study-spot")
public class StudySpotController {

    @GetMapping
    public String getStudySpot() {
        return "study_spot";
    }

}
