package com.example.javac;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import com.example.javac.musicapp.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    // Testes USUARIO

    @Test
    public void testUsuario() {
        Usuario usuario = new Usuario("Joao", "banana");
        assertTrue(usuario.getNome().equals("Joao"));
        assertTrue(usuario.getSenha().equals("banana"));
    }

    @Test
    public void testUsuarioVerificarLogin() {
        Usuario usuario = new Usuario("Joao", "banana");
        assertTrue(usuario.verificar_login("Joao", "banana"));
    }

    @Test
    public void testUsuarioLoginFail() {
        Usuario usuario = new Usuario("Joao", "banana");
        assertTrue(!usuario.verificar_login("Joao", "maca"));
    }
}
