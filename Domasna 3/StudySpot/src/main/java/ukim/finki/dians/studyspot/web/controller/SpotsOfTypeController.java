package ukim.finki.dians.studyspot.web.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ukim.finki.dians.studyspot.service.SpotService;

@Controller
@RequestMapping("/study-spots-of-type")
public class SpotsOfTypeController {

    private final SpotService spotService;

    public SpotsOfTypeController(SpotService spotService) {
        this.spotService = spotService;
    }

    @GetMapping
    public String getStudySpotsOfType(HttpSession httpSession) {
        httpSession.setAttribute("spots", this.spotService.listAllSpots());
        return "spots_of_type";
    }

    @PostMapping
    public String buttonSubmit(HttpServletRequest request, HttpSession httpSession) {
        httpSession.setAttribute("spot_id", request.getParameter("details_button"));
        return "redirect:/study-spot";
    }

}
