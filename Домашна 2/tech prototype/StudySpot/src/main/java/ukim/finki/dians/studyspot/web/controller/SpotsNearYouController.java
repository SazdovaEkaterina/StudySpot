package ukim.finki.dians.studyspot.web.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.spring6.SpringTemplateEngine;
import ukim.finki.dians.studyspot.service.SpotService;

@Controller
@RequestMapping("/study-spots-near-you")
public class SpotsNearYouController {

    private final SpotService spotService;

    public SpotsNearYouController(SpotService spotService) {
        this.spotService = spotService;
    }

    @GetMapping
    public String getStudySpotsNearYou(HttpSession httpSession) {
        httpSession.setAttribute("spots", this.spotService.listAllSpots());
        return "spots_near_you";
    }

    @PostMapping
    public String buttonSubmit(HttpServletRequest request, HttpSession httpSession) {
        httpSession.setAttribute("spot_id", request.getParameter("details_button"));
        return "redirect:/study-spot";
    }

}
