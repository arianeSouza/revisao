package br.senai.sc.model.negocio;

/**
 * Classe que representa o fornecedor
 * @version  1.0 31/07/13
 * @author ariane_souza
 */
public class Fornecedor extends PessoaJuridica{
    
    private String tipoProduto;

    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public Fornecedor(){
    }
        
}
