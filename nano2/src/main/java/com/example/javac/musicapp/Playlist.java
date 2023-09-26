package com.example.javac.musicapp;

public class Playlist extends DadosUsuarioNaoDAO{

    private String nome;
    private Musica[] musicas;

    public Playlist(String nome, String nomemsc) {
        this.nome = nome;
        this.musicas[0] = new Musica(nomemsc);
    }

    public boolean adicionar_musica(Musica msc)
    {
        return false;
    }

    public String getNome() {
        return null;
    }
}