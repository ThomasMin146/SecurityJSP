package sk.thomas.SecurityJSP.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dms")
public class IndexController {

    @Autowired
    private SearchController searchController;

    @GetMapping("/index")
//    @PreAuthorize("hasAuthority('DMS_LOGIN')")
    public String get(Model model, HttpServletRequest request) throws Exception {
        return searchController.reloadSearch(model, request);
    }
}