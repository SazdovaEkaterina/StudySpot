package ukim.finki.dians.studyspot.web.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ukim.finki.dians.studyspot.service.SpotService;

@Controller
@RequestMapping("/home")
public class HomeController {

    private final SpotService spotService;

    public HomeController(SpotService spotService) {
        this.spotService = spotService;
    }

    @GetMapping
    public String getHomePage() {
        return "home";
    }

    @PostMapping
    public String buttonSubmit(HttpServletRequest request, HttpSession httpSession) {
        if (request.getParameter("button1") != null) {
            return "redirect:/study-spots-near-you";
        } else if (request.getParameter("button2") != null) {
            httpSession.setAttribute("spot_type", request.getParameter("spot_type"));
            return "redirect:/study-spots-of-type";
        } else if (request.getParameter("button3") != null) {
            httpSession.setAttribute("spot_id", spotService.generateRandom().getId());
            return "redirect:/study-spot";
        }
        return "home";
    }

}
