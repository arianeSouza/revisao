
package br.senai.sc.view;

import br.senai.sc.model.negocio.Funcionario;
import br.senai.sc.model.persistencia.FuncionarioDAO;
import java.util.List;
import javax.swing.JOptionPane;

public class JanelaFuncionario {
    
    public void menuFuncionario(List<Funcionario> funcionario) {
        int opcao = 0;
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("FUNCIONÁRIO\nInforme a opçaõ desejada\n1-Inserir\n2-Excluir\n3-Alterar\n4-Buscar\n5-Listar"));
            switch (opcao) {
                case 1:
                    adicionaFuncionario(funcionario);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    listaFuncionario(funcionario);
                default:
                    JOptionPane.showMessageDialog(null, "Você digitou uma opção incorreta");
                    
            }
        } while (opcao != 6);
    }
    public void adicionaFuncionario(List<Funcionario> funcionario){
        Funcionario f = new Funcionario();
        f.setNome(JOptionPane.showInputDialog("Informe o nome do Funcionário"));
        f.setDataNscimento(JOptionPane.showInputDialog("Informe a data de Nascimento do Funcionário"));
        f.setRg(JOptionPane.showInputDialog("Informe o rg do Funcionário"));
        f.setCpf(JOptionPane.showInputDialog("Informe o cpf do Funcionário"));
        f.setEndereco(JOptionPane.showInputDialog("Informe o endereço do Funcionário"));
        f.setTelefone(JOptionPane.showInputDialog("Informe o telefone do Funcionário"));
        f.setDataCadastro(JOptionPane.showInputDialog("Informe a data do cadastro do Funcionário"));
        f.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Informe o salário do Funcionário")));
        f.setDataAdmissao(JOptionPane.showInputDialog("Informe a data da admissão do Funcionário"));
        f.setCtps(JOptionPane.showInputDialog("Informe o número da carteira de trabalho do Funcionário"));
        f.setCargo(JOptionPane.showInputDialog("Informe o cargo do Funcionário"));
        FuncionarioDAO dao = new FuncionarioDAO();
        
        dao.adicionar(f, funcionario);
    }

    public void listaFuncionario(List<Funcionario> funcionario) {
       FuncionarioDAO dao = new FuncionarioDAO();
       dao.listar(funcionario);
    }
       private void removeFuncionario(List<Funcionario> funcionario) {
       FuncionarioDAO dao = new FuncionarioDAO();
       String nome = JOptionPane.showInputDialog("Informe o nome do funcionario a ser excluído");
       dao.excluir(nome, funcionario);
    }
        private void alteraFuncionario(List<Funcionario> funcionario){
        FuncionarioDAO dao = new FuncionarioDAO();
        String nome = JOptionPane.showInputDialog("Informe o nome do funcionario a ser alterado");
        Funcionario fAltera= new Funcionario();
        
        fAltera=dao.buscaFuncionarioByNome(nome, funcionario);
              
        if(fAltera!=null){
                  
        fAltera.setNome(JOptionPane.showInputDialog("Informe o nome: ", fAltera.getNome()));          
        fAltera.setDataNscimento(JOptionPane.showInputDialog("Informe a data de Nascimento do Funcionário", fAltera.getDataNscimento()));
        fAltera.setRg(JOptionPane.showInputDialog("Informe o rg do Funcionário", fAltera.getRg()));
        fAltera.setCpf(JOptionPane.showInputDialog("Informe o cpf do Funcionário", fAltera.getCpf()));
        fAltera.setEndereco(JOptionPane.showInputDialog("Informe o endereço do Funcionário", fAltera.getEndereco()));
        fAltera.setTelefone(JOptionPane.showInputDialog("Informe o telefone do Funcionário", fAltera.getTelefone()));
        fAltera.setDataCadastro(JOptionPane.showInputDialog("Informe a data do cadastro do Funcionário", fAltera.getDataCadastro()));
        fAltera.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Informe o salário do Funcionário", fAltera.getSalario())));
        fAltera.setDataAdmissao(JOptionPane.showInputDialog("Informe a data da admissão do Funcionário", fAltera.getDataAdmissao()));
        fAltera.setCtps(JOptionPane.showInputDialog("Informe o número da carteira de trabalho do Funcionário", fAltera.getCtps()));
        fAltera.setCargo(JOptionPane.showInputDialog("Informe o cargo do Funcionário", fAltera.getCargo()));
                
        dao.altera(nome, funcionario, fAltera);
        
        }else{
            JOptionPane.showMessageDialog(null,"Funcioanrio "+nome+" não existe ");
        }
            
       }

}
