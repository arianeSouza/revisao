package br.senai.sc.model.negocio;

/**
 * Classe que representa a trasportadora
 * @version  1.0 31/07/13
 * @author ariane_souza
 */
public class Transportadora extends PessoaJuridica{

    public String getTipoTransporte() {
        return tipoTransporte;
    }

    public void setTipoTransporte(String tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
    }

    public double getPrecoFrete() {
        return precoFrete;
    }

    public void setPrecoFrete(double precoFrete) {
        this.precoFrete = precoFrete;
    }
    
    private String tipoTransporte;

    public Transportadora(){
    }
    private double precoFrete;
    

}
