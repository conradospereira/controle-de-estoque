package br.com.mercadoteixeira.controledeestoque.controller;

import br.com.mercadoteixeira.controledeestoque.dto.RequisicaoNovoCadastro;
import br.com.mercadoteixeira.controledeestoque.model.Produtos;
import br.com.mercadoteixeira.controledeestoque.repository.CadastroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("cadastro")
public class CadastroController {

    @Autowired
    private CadastroRepository cadastroRepository;

    @GetMapping("formulario")
    public String formulario(RequisicaoNovoCadastro requisicaoNovoCadastro) {

        return "cadastro/formulario";

    }

    @PostMapping("novo")
    public String novo(@Valid RequisicaoNovoCadastro requisicao, BindingResult result) {
        if (result.hasErrors()) {
            return "cadastro/formulario";
        }

        Produtos produtos = requisicao.toProdutos();
        cadastroRepository.save(produtos);

        return "redirect:/home";
    }

}
