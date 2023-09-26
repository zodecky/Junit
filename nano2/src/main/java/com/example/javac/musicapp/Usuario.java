package com.example.javac.musicapp;


public class Usuario {

    private String login;
    private String hashsenha;

    public Usuario(String login, String hashsenha) {
        this.login = login;
        this.hashsenha = hashsenha;
    }

    public String getNome() {
        return this.login;
    }

    public String gethashsenha() {
        return this.hashsenha;
    }

    public boolean verificar_login(String login, String hashsenha) {
        if (this.login.equals(login) && this.hashsenha.equals(hashsenha)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean favoritar(Musica msc)
    {
        return msc.favoritar();
    }

    public boolean escutar(Musica msc)
    {
        return msc.escutar();
    }

    public boolean criar_playlist(String nome)
    {
        return false;
    }
}