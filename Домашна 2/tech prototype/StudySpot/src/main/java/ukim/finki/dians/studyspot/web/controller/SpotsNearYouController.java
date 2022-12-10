package ukim.finki.dians.studyspot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/study-spots-near-you")
public class SpotsNearYouController {

    @GetMapping
    public String getStudySpotsNearYou() {
        return "spots_near_you";
    }

}
