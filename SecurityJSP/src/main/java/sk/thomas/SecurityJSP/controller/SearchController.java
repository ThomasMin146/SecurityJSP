package sk.thomas.SecurityJSP.controller;

import jakarta.servlet.http.HttpServletRequest;
//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SearchController {

    @GetMapping("/reload")
//    @PreAuthorize("hasAuthority('DMS_LOGIN') and hasAuthority('DOCUMENT_READ')")
    public String reloadSearch(Model model, HttpServletRequest request) throws Exception {
        return "index";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }
}


