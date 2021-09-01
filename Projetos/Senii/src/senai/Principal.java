
package senai;

import javax.swing.JOptionPane;



public class Principal {

    
    public static void main(String[] args) {
       //Criando o Objeto Materia
       Materia a = new Materia();
       
       int qtd = Integer.parseInt(JOptionPane.showInputDialog("Quantas materias você deseja adicionar?"));
       
       //Adicionando na LinkedList
       for(int i = 0; i < qtd; i++){
       String nome_mat =  JOptionPane.showInputDialog("Qual é a " + (i+1) + " matéria que você deseja adicionar?");
      
       
       
       a.addMateria(nome_mat);
       }
       
       //Visualizando o LinkedList
       a.listaMaterias();
       
       //Busca de Materias
       String  busca = (JOptionPane.showInputDialog("Qual matéria você deseje encontrar na lista?"));
       a.buscaMateria(busca);
       
       //Deletando da Lista
       String deleta = JOptionPane.showInputDialog("Qual materia você deseja deletar da lista?");
       a.delMateria(deleta);
       
       a.listaMaterias();
      
    }
    
}
