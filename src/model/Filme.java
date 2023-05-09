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
public class Filme {
    private int idFilme;
    private String titulo;
    private int anoLancamento;
    private String nomeAtor;
    private String nacionalidade;
    private String genero;
    private float duracaoEspera;
    private Usuario idUsuario;

    public Filme() {
    }

    public Filme(int idFilme, String titulo, int anoLancamento, String nomeAtor, String nacionalidade, String genero, float duracaoEspera, Usuario idUsuario) {
        this.idFilme = idFilme;
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
        this.nomeAtor = nomeAtor;
        this.nacionalidade = nacionalidade;
        this.genero = genero;
        this.duracaoEspera = duracaoEspera;
        this.idUsuario = idUsuario;
    }

    public int getIdFilme() {
        return idFilme;
    }

    public void setIdFilme(int idFilme) {
        this.idFilme = idFilme;
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

    public float getDuracaoEspera() {
        return duracaoEspera;
    }

    public void setDuracaoEspera(float duracaoEspera) {
        this.duracaoEspera = duracaoEspera;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public String toString() {
        return "Filme{" + "idFilme=" + idFilme + ", titulo=" + titulo + ", anoLancamento=" + anoLancamento + ", nomeAtor=" + nomeAtor + ", nacionalidade=" + nacionalidade + ", genero=" + genero + ", duracaoEspera=" + duracaoEspera + ", idUsuario=" + idUsuario + '}';
    }

    
    
}
