package com.example.javac.musicapp;

import java.util.Date;

/**
 * Artista
 */
public class Artista extends DadosUsuarioNaoDAO{

    String nome_artistico;
    String nome_nascimento;
    Date data_nascimento;

    public Artista(String nome_artistico, String nome_nascimento, Date data_nascimento) {
        this.nome_artistico = nome_artistico;
        this.nome_nascimento = nome_nascimento;
        this.data_nascimento = data_nascimento;
    } 

    public int quantidade_musicas() {
        return 0;
    }

    public int quantidade_albuns() {
        return 0;
    }

    public String getNome() {
        return this.nome_artistico;
    }


}