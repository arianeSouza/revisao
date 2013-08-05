package br.senai.sc.model.negocio;

/**
 *Classe que representa pessoa juridica
 * @version 1.0 31/07/13
 * @author ariane_souza
 */
public class PessoaJuridica extends Pessoa {

    public PessoaJuridica(){
    }
    
    private String cnpj;
    private String razaoSocial;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }
    private String nomeFantasia;


   
    
}
