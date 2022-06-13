package br.com.mercadoteixeira.controledeestoque.controller;

import br.com.mercadoteixeira.controledeestoque.model.Produtos;
import br.com.mercadoteixeira.controledeestoque.repository.CadastroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private CadastroRepository repository;

    @GetMapping("/home")
    public String home(Model model) {
        List<Produtos> produtos = repository.findAll();
        model.addAttribute("produtos", produtos);
        return "home";
    }
}
