package ukim.finki.dians.studyspot.web.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {

    @GetMapping
    public String getHomePage() {
        return "home";
    }

    @PostMapping
    public String buttonSubmit(HttpServletRequest request) {
        if (request.getParameter("button1") != null) {
            return "redirect:/study-spots-near-you";
        } else if (request.getParameter("button2") != null) {
            return "redirect:/study-spots-of-type";
        } else if (request.getParameter("button3") != null) {
            return "redirect:/study-spot";
        }
        return "home";
    }

}
