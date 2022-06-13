package br.com.mercadoteixeira.controledeestoque.dto;


import br.com.mercadoteixeira.controledeestoque.model.Produtos;

import javax.validation.constraints.*;

public class RequisicaoNovoCadastro {
    @Min(value = 4, message = "Código do produto deve ter no mínimo 4 dígitos")
    @Max(value = 13, message = "O código de barras deve ter no máximo 13 dígitos")
    private Long codigoProduto;
    @NotBlank
    private String descricaoProduto;
    @PositiveOrZero
    private double precoProduto;
    @Positive
    private int quantidadeProduto;

    public Long getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(Long codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    public Produtos toProdutos() {
        Produtos produtos = new Produtos();
        produtos.setCodigoProduto(codigoProduto);
        produtos.setDescricaoProduto(descricaoProduto);
        produtos.setPrecoProduto(precoProduto);
        produtos.setPrecoProduto(precoProduto);
        return produtos;
    }
}
