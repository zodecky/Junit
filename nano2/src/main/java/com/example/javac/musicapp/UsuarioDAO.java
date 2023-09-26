package com.example.javac.musicapp;

public class UsuarioDAO {
    
    public UsuarioDAO() {
    }

    public Usuario getUsuario(String login, String hashsenha) {
        return new Usuario(login, hashsenha);
    }

    public boolean apagar_usuario(Usuario usuario) {
        return false;
    }

    public boolean atualizar_usuario(Usuario usuario) {
        return false;
    }

    public boolean criar_usuario(Usuario usuario) {
        return false;
    }
}