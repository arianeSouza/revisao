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

    public Fornecedor(String tipoProduto, String cnpj, String razaoSocial, String nomeFantasia, int id, String endereco, String telefone, String dataCadastro) {
        super(cnpj, razaoSocial, nomeFantasia, id, endereco, telefone, dataCadastro);
        this.tipoProduto = tipoProduto;
    }
        
}
