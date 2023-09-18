package com.example.javac.musicapp;


public class Usuario {

    private String login;
    private String senha;

    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public String getNome() {
        return this.login;
    }

    public String getSenha() {
        return this.senha;
    }

    public boolean verificar_login(String login, String senha) {
        if (this.login.equals(login) && this.senha.equals(senha)) {
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