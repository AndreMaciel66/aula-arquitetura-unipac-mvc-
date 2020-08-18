package br.com.unipac.mvcexample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AlunoController {

    @GetMapping("/ola")
    public String ola(@RequestParam(name="nome", required = true,
                                    defaultValue = "Rogerio") String nome,
                                    Model model) {
        model.addAttribute("nome", nome);
        return "ola";
    }


}
