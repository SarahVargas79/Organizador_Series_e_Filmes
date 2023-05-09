/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.Usuario;

/**
 *
 * @author sarin
 */
public class CUsuario {//Vai se controlar toda a classe usuario.
    ArrayList<Usuario> usuarios =  new ArrayList<>(); //Criando uma lista usuario da classe usuario.
    int idUsuario = 1;//Ao inicializar o projeto já com 1.
    
    /**
     * geraID gerencia a gereção de id's autoincrement para Usuario.
     * @return 
     */
    public int geraID() {//Autoincremetou o id que já está em 1.
        return this.idUsuario++;
    }
            
    /**
     * addUsuario adiciona um usuario na lista usuarios.
     * @param u 
     */
    public void addUsuario(Usuario u) {//Método para adicionar usuario. 
        this.usuarios.add(u);
    }
    
    /**
     * getUsuarios retorna a lista de usuarios.
     * @return 
     */
    public ArrayList<Usuario> getUsuarios() {//ArrayList tipa (int, string.)
        return this.usuarios;//This faz referência a propria classe...
    }
    
    /**
     * removeUsuario remove Usuario da lista de usuarios.
     * @param u 
     */
    public void removeUsuario(Usuario u) {//void uma ação não tem retorno.
        this.usuarios.remove(u);
    }
    
    /**
     * mockUsuarios inicializa aplicação com usuarios.
     */
    public void mockUsuario() {
        Usuario u1 = new Usuario();
        u1.setIdUsuario(this.geraID());
        u1.setNomeUsuario("Emanuelly Rosa");
        u1.setEmail("emanuelly.rosa@outlook.com");
        u1.setSenha("Emanu.r07");
        this.addUsuario(u1);
        
        Usuario u2 = new Usuario();//sem problema de chamar geraID de novo vai somar mais 1 é a função dele.
        u2.setIdUsuario(this.geraID());
        u2.setNomeUsuario("Murilo Dutra");
        u2.setEmail("murilo.dutra@gmail.com");
        u2.setSenha("Dutra_089");
        this.addUsuario(u2);
    }
     /**
      * getUsuarioEmail pesquisa usuario pelo email e retorna o usuario e caso não encontre retorna nulo
      * podendo cadastrar.
      * @param email
      * @return 
      */
   public Usuario getUsuarioEmail(String email) { //Método para chamar um Usuario específico.
       Usuario usu = null; //Inicializa como nulo.
       for (Usuario usuario : usuarios) {
           if(usuario.getEmail().equals(email)) {
               usu = usuario;
               break;
           }
       }//Percorre a lista de usuarios e compara os valores se o email é igual ao que está na lista.
       
       return usu;
   }
    
}//fim classe controller
