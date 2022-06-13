package br.com.mercadoteixeira.controledeestoque.repository;

import br.com.mercadoteixeira.controledeestoque.model.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CadastroRepository extends JpaRepository<Produtos, Long> {

}
