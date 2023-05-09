/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.Filme;
import organizadorseriesfilmespoo.OrganizadorSeriesFilmesPOO;

/**
 *
 * @author sarin
 */
public class CFilme {
ArrayList<Filme> filmes = new ArrayList<>();
    int idFilme = 1;

    public int geraID() {
        return this.idFilme++;
    }

    public void addFilme(Filme f) {
        this.filmes.add(f);
    }

    public ArrayList<Filme> getFilmes() {
        return this.filmes;
    }

    public void removeFilme(Filme f) {//void uma ação não tem retorno
        this.filmes.remove(f);
    }

    public void mockFilmes() {
       
        Filme f1 = new Filme();
        f1.setIdFilme(this.geraID());
        f1.setTitulo("Jogos Vorazes");
        f1.setAnoLancamento(2012);
        f1.setNomeAtor("Katniss Everdeen, Peeta Mellark, Gale Hawthorne, Effie Trinket, Haymitch Abernathy, Caesar Flickerman, Presidente Snow, Primrose Everdeen");
        f1.setNacionalidade("Americano(a)");
        f1.setGenero("Ação, aventura e ficção científica");
        f1.setDuracaoEspera((float) 45.5);
        f1.setIdUsuario(OrganizadorSeriesFilmesPOO.cadUsuario.getUsuarioEmail("emanuelly.rosa@outlook.com"));//espera um objeto catalogo - chamar construtor
        this.addFilme(f1);
    }
    
    public Filme getFilmeTitulo(String titulo) {
        Filme film = null; //Inicializa como nulo.
        for (Filme filme : filmes) {
            if (filme.getTitulo().equals(titulo)) {
                film = filme;
                break;
            }
        }//Percorre a lista de filmes e compara os valores se o título é igual ao que está na lista.

        return film;
    }

}//fim classe controller
