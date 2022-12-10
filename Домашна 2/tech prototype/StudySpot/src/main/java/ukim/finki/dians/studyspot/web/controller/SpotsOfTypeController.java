package ukim.finki.dians.studyspot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/study-spots-of-type")
public class SpotsOfTypeController {

    @GetMapping
    public String getStudySpotsOfType() {
        return "spots_of_type";
    }

}
