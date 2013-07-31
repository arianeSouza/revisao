
package br.senai.sc.model.negocio;

/*
 * Classe que representa todas as pessoa fisicas
 * @version 1.0 31/07/13
 * @author ariane_souza
 */
public class PessoaFisica extends Pessoa{
    
    private String cpf;
    private String nome;
    private String dataNscimento;
    private String rg;

    public PessoaFisica(String cpf, String nome, String rg, int id, String endereco, String telefone, String dataCadastro) {
        super(id, endereco, telefone, dataCadastro);
        this.cpf = cpf;
        this.nome = nome;
        this.rg = rg;
    }


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNscimento() {
        return dataNscimento;
    }

    public void setDataNscimento(String dataNscimento) {
        this.dataNscimento = dataNscimento;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    
    
}
