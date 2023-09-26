package com.example.javac.musicapp;


public class DadosUsuarioNaoDAO {
    
        public Musica[] musicasdomomento() {
            Musica[] musicas = new Musica[3];
            musicas[0] = new Musica("Musica1");
            musicas[1] = new Musica("Musica2");
            musicas[2] = new Musica("Musica3");
            return musicas;
        }

        public Musica[] musicasfavoritas() {
            Musica[] musicas = new Musica[3];
            musicas[0] = new Musica("Musica1");
            musicas[1] = new Musica("Musica2");
            musicas[2] = new Musica("Musica3");
            return musicas;
        }
}