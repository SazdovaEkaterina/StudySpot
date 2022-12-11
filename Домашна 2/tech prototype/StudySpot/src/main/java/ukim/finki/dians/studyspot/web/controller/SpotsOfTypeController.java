package ukim.finki.dians.studyspot.web.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/study-spots-of-type")
public class SpotsOfTypeController {

    @GetMapping
    public String getStudySpotsOfType()  {

        return "spots_of_type";
    }

    @PostMapping
    public String buttonSubmit(HttpServletRequest request, HttpSession httpSession) {
        httpSession.setAttribute("spot_id", request.getParameter("details_button"));
        return "redirect:/study-spot";
    }

}
