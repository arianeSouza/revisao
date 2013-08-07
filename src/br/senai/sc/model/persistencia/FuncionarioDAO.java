package br.senai.sc.model.persistencia;

import br.senai.sc.model.negocio.Funcionario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * Classe que guarda as informações referentes a funcionarios
 *
 * @version 1.0 31/07/13
 * @author ariane_souza
 */
public class FuncionarioDAO {
    //Vetor dinâmico para armazenar funcionários cadastrados.

     public void adicionar(Funcionario f, List<Funcionario> funcionario) {
        funcionario.add(f);
        JOptionPane.showMessageDialog(null, "Funcionário adicionado com sucesso.");
    }
    /*
     *Método que lista todos os funcionários
     */

    public void listar(List<Funcionario> funcionario) {
        String msg = "";
        for (Funcionario f : funcionario) {
            msg = msg + "Nome: " + f.getNome() + "\nData de Nascimento: " + f.getDataNscimento()
                    + "\nRg: " + f.getRg() + "\nCpf: " + f.getCpf() + "\nEndereço: " + f.getEndereco() + "\nTelefone: "
                    + f.getTelefone() + "\nData do Cadastro: " + f.getDataCadastro() + "\nSalário: " + f.getSalario()
                    + "\nData da Admissão: " + f.getDataAdmissao() + "\nCtps " + f.getCtps() + "\nCargo: " + f.getCargo();
        }
        JOptionPane.showMessageDialog (null, msg);
            }
    public void excluir (String nome,
        List<Funcionario>funcionario) {
        Funcionario fRemove = null;
        for (Funcionario f : funcionario) {
            if (f.getNome().equals(nome)){
            }
   
        }
        funcionario.remove(fRemove);
    }
    public Funcionario buscaFuncionarioByNome(String nome, List<Funcionario> funcionario){
         for(Funcionario fBusca : funcionario){
            if(fBusca.getNome().equals(nome)){
                return fBusca;
            }
        }
         return null;

     }
    
    public void altera(String nome, List<Funcionario> funcionario, Funcionario fAltera){
        
        excluir(nome, funcionario);
        adicionar(fAltera, funcionario);
    }
}
