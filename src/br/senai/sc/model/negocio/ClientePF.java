package br.senai.sc.model.negocio;

/**
 * Classe que representa os clientes fsicos do sfotware
 * @version 1.0 31/07/13
 * @author ariane_souza
 */
public class ClientePF extends PessoaFisica{
    
    private double nrConta;
    private double limiteCompra;
    private char categoria;
    private int qtVezesCompra;

    public double getNrConta() {
        return nrConta;
    }

    public void setNrConta(double nrConta) {
        this.nrConta = nrConta;
    }

    public double getLimiteCompra() {
        return limiteCompra;
    }

    public void setLimiteCompra(double limiteCompra) {
        this.limiteCompra = limiteCompra;
    }

    public char getCategoria() {
        return categoria;
    }

    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }

    public int getQtVezesCompra() {
        return qtVezesCompra;
    }

    public void setQtVezesCompra(int qtVezesCompra) {
        this.qtVezesCompra = qtVezesCompra;
    }

    public double getVlTotalGasto() {
        return vlTotalGasto;
    }

    public void setVlTotalGasto(double vlTotalGasto) {
        this.vlTotalGasto = vlTotalGasto;
    }
    private double vlTotalGasto;

    public ClientePF(double nrConta, double limiteCompra, char categoria, int qtVezesCompra, double vlTotalGasto, String cpf, String nome, String rg, int id, String endereco, String telefone, String dataCadastro) {
        super(cpf, nome, rg, id, endereco, telefone, dataCadastro);
        this.nrConta = nrConta;
        this.limiteCompra = limiteCompra;
        this.categoria = categoria;
        this.qtVezesCompra = qtVezesCompra;
        this.vlTotalGasto = vlTotalGasto;
    }
    
    
}
