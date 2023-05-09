/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.Serie;
import organizadorseriesfilmespoo.OrganizadorSeriesFilmesPOO;

/**
 *
 * @author sarin
 */
public class CSerie {
    ArrayList<Serie> series =  new ArrayList<>(); 
    int idSerie = 1;
    
    public int geraID() {
        return this.idSerie++;
    }
            
    
    public void addSerie(Serie s ) {
        this.series.add(s);
    }
    
    public ArrayList<Serie> getSeries() {
        return this.series;
    }
    
    public void removeSerie(Serie s) {//void uma ação não tem retorno.
        this.series.remove(s);
    }
    
    public void mockSeries() {
        Serie s1 = new Serie();
        s1.setIdSerie(this.geraID());
        s1.setTitulo("Ginny & Georgia");
        s1.setAnoLancamento(2021);
        s1.setNomeAtor("Georgia Miller, Ginny Miller, Marcus Baker, Abby Littman, Maxine Baker, Joe, Paul, Autsin");
        s1.setNacionalidade("Americano(a)");
        s1.setGenero("Comédia dramática");
        s1.setTemporada(2);
        s1.setEpisodio(8);
        s1.setIdUsuario(OrganizadorSeriesFilmesPOO.cadUsuario.getUsuarioEmail("emanuelly.rosa@outlook.com"));//espera um objeto catalogo - chamar construtor
        this.addSerie(s1);
    }
    
    public Serie getSerieTitulo(String titulo) {
        Serie s = null; //Inicializa como nulo.
        for (Serie serie : series) {
            if (serie.getTitulo().equals(titulo)) {
                s = serie;
                break;
            }
        }//Percorre a lista de séries e compara os valores se o título é igual ao que está na lista.

        return s;
    } 
    
}//fim classe controller

