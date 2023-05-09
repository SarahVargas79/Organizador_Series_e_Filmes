/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author sarin
 */
public class Serie {
    private int idSerie;
    private String titulo;
    private int anoLancamento;
    private String nomeAtor;
    private String nacionalidade;
    private String genero;
    private int temporada;
    private int episodio;
    private Usuario idUsuario;

    public Serie() {
    }

    public Serie(int idSerie, String titulo, int anoLancamento, String nomeAtor, String nacionalidade, String genero, int temporada, int episodio, Usuario idUsuario) {
        this.idSerie = idSerie;
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
        this.nomeAtor = nomeAtor;
        this.nacionalidade = nacionalidade;
        this.genero = genero;
        this.temporada = temporada;
        this.episodio = episodio;
        this.idUsuario = idUsuario;
    }

    public int getIdSerie() {
        return idSerie;
    }

    public void setIdSerie(int idSerie) {
        this.idSerie = idSerie;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getNomeAtor() {
        return nomeAtor;
    }

    public void setNomeAtor(String nomeAtor) {
        this.nomeAtor = nomeAtor;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public int getEpisodio() {
        return episodio;
    }

    public void setEpisodio(int episodio) {
        this.episodio = episodio;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public String toString() {
        return "Serie{" + "idSerie=" + idSerie + ", titulo=" + titulo + ", anoLancamento=" + anoLancamento + ", nomeAtor=" + nomeAtor + ", nacionalidade=" + nacionalidade + ", genero=" + genero + ", temporada=" + temporada + ", episodio=" + episodio + ", idUsuario=" + idUsuario + '}';
    }

    
    
}
