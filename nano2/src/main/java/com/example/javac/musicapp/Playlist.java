package com.example.javac.musicapp;

public class Playlist extends DadosUsuarioNaoDAO{

    private String nome;
    private Musica[] musicas;

    public Playlist(String nome) {
        this.nome = nome;
        this.musicas = new Musica[0];
    }

    public boolean adicionar_musica(Musica msc)
    {
        return false;
    }
}