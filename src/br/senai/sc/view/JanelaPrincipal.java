
package br.senai.sc.view;

import br.senai.sc.model.negocio.Funcionario;
import br.senai.sc.model.persistencia.FuncionarioDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * Classe que controla toda a parte visual da aplicação
 * @version  1.0 31/07/13
 * @author ariane_souza
 */
public class JanelaPrincipal {
    public static void main(String[] args) {
        List<Funcionario> funcionario = new ArrayList<>();
        mostraMenu(funcionario);
    }
    
    public static void mostraMenu (List<Funcionario> funcionario){
        JanelaFuncionario jf = new JanelaFuncionario();
        int opcao;
        
        do{
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Informe a opcao:\n1 - Funcionário\n2 - Cliente\n3 - Fornecedor\n4 - Transportadora\n5 - Sair"));
        
        switch(opcao){
            case 1:
                jf.menuFuncionario(funcionario);                
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
               break;
            default:
                JOptionPane.showMessageDialog(null, "Operação inválida");
        }
    }while(opcao!=5);
    
}
    
}