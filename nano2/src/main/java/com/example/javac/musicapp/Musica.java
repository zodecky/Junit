package com.example.javac.musicapp;

public class Musica extends DadosUsuarioNaoDAO {
    public String nome;
    int avaliacao_media;
    int avaliacao_usuario;

    public Musica(String nome) {
        this.nome = nome;
        this.avaliacao_media = 0;
        this.avaliacao_usuario = 0;
    }

    public Musica(String nome, int avaliacao_media) {
        this.nome = nome;
        this.avaliacao_media = avaliacao_media;
        this.avaliacao_usuario = 0;
    }

    public boolean favoritar() {
        return false;
    }

    public boolean escutar() {
        return false;
    }

    public boolean avaliar(int nota) {
        return false;
    }

    public String getNome() {
        return this.nome;
    }
}