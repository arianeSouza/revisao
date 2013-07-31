
package br.senai.sc.model.negocio;

/**
 * Classe que representa os funcionários do software
 * @version 1.0 31/07/13
 * @author ariane_souza
 */

public class Funcionario extends PessoaFisica {

    private double salario;
    private String dataAdmissao;;
    private String ctps;
    private String cargo;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Funcionario(double salario, String dataAdmissao, String ctps, String cargo, String cpf, String nome, String rg, int id, String endereco, String telefone, String dataCadastro) {
        super(cpf, nome, rg, id, endereco, telefone, dataCadastro);
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
        this.ctps = ctps;
        this.cargo = cargo;
    }
    
}
