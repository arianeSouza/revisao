package br.senai.sc.model.persistencia;

import br.senai.sc.model.negocio.Funcionario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * Classe que guarda as informações referentes a funcionarios
 * @version  1.0 31/07/13
 * @author ariane_souza
 */
public class FuncionarioDAO {
    //Vetor dinâmico para armazenar funcionários cadastrados.
    private List<Funcionario> funcionario = new ArrayList<>();
    
    public void adicionar(Funcionario f){
        funcionario.add(f);
        JOptionPane.showMessageDialog(null, "Funcionário adicionado com sucesso.");
    }
    
}
