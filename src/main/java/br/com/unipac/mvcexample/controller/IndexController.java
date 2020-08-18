package br.com.unipac.mvcexample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("home", "Esse é um projeto exemplo de MVC");
        return "index";
    }
}
