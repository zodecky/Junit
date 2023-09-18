package com.example.javac.musicapp;

import java.util.Date;

public class Album {

    String titulo;
    Date data_lancamento;

    public Album(String titl, Date data_lancamento) {
        this.titulo = titl;
        this.data_lancamento = data_lancamento;
    }

    public int getquantidade_musicas() {
        return 0;
    }

}