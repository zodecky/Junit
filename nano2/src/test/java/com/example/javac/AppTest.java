package com.example.javac;

import static org.junit.Assert.assertTrue;

import java.util.Date;

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
        assertTrue(usuario.gethashsenha().equals("banana"));
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

    @Test
    public void testUsuarioFavoritar() {
        Usuario usuario = new Usuario("Joao", "banana");
        Musica msc = new Musica("Musica1");
        assertTrue(usuario.favoritar(msc));
    }

    @Test
    public void testUsuarioEscutar() {
        Usuario usuario = new Usuario("Joao", "banana");
        Musica msc = new Musica("Musica1");
        assertTrue(usuario.escutar(msc));
    }

    @Test
    public void testUsuarioCriarPlaylist() {
        Usuario usuario = new Usuario("Joao", "banana");
        assertTrue(usuario.criar_playlist("Playlist1"));
    }

    // Testes PLAYLIST

    @Test
    public void testPlaylist() {
        Playlist playlist = new Playlist("Playlist1", "Musica1");
        assertTrue(playlist.getNome().equals("Playlist1"));
    }

    @Test
    public void testPlaylistAdicionarMusica() {
        Playlist playlist = new Playlist("Playlist1", "Musica1");
        Musica msc = new Musica("Musica2");
        assertTrue(playlist.adicionar_musica(msc));
    }


    // Testes MUSICA

    @Test
    public void testMusica() {
        Musica msc = new Musica("Musica1");
        assertTrue(msc.getNome().equals("Musica1"));
    }

    @Test
    public void testMusicaAvaliar() {
        Musica msc = new Musica("Musica1");
        assertTrue(msc.avaliar(5));
    }

    @Test
    public void testMusicaFavoritar() {
        Musica msc = new Musica("Musica1");
        assertTrue(msc.favoritar());
    }

    @Test
    public void testMusicaEscutar() {
        Musica msc = new Musica("Musica1");
        assertTrue(msc.escutar());
    }


    // Testes ARTISTA

    @Test
    public void testArtista() {
        Artista art = new Artista("Artista1", "Jao", (new Date(2000, 1, 1)));
        assertTrue(art.getNome().equals("Artista1"));
    }

    @Test
    public void testArtistaQuantidadeMusicas() {
        Artista art = new Artista("Artista1", "Jao", (new Date(2000, 1, 1)));
        assertTrue(art.quantidade_musicas() == 0);
    }

    @Test
    public void testArtistaQuantidadeAlbuns() {
        Artista art = new Artista("Artista1", "Jao", (new Date(2000, 1, 1)));
        assertTrue(art.quantidade_albuns() == 0);
    }


    // testes album

    @Test
    public void testAlbum() {
        Album alb = new Album("Album1", "Artista1", "Musica1");
        assertTrue(alb.getNome().equals("Album1"));
    }

    @Test
    public void testAlbumQuantidadeMusicas() {
        Album alb = new Album("Album1", "Artista1", "Musica1");
        assertTrue(alb.quantidade_musicas() == 0);
    }

    @Test
    public void testAlbumAdicionarMusica() {
        Album alb = new Album("Album1", "Artista1", "Musica1");
        Musica msc = new Musica("Musica2");
        assertTrue(alb.adicionar_musica(msc));
    }

    @Test
    public void testAlbumAdicionarMusicaFail() {
        Album alb = new Album("Album1", "Artista1", "Musica1");
        Musica msc = new Musica("Musica1");
        assertTrue(!alb.adicionar_musica(msc));
    }

    // Testes usuarioDAO

    @Test
    public void testUsuarioDAO() {
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        assertTrue(usuarioDAO.getUsuario("Joao", "banana").getNome().equals("Joao"));
    }

    @Test
    public void testUsuarioDAOApagarUsuario() {
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario usuario = new Usuario("Joao", "banana");
        assertTrue(usuarioDAO.apagar_usuario(usuario));
    }

    @Test
    public void testUsuarioDAOAtualizarUsuario() {
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario usuario = new Usuario("Joao", "banana");
        assertTrue(usuarioDAO.atualizar_usuario(usuario));
    }

    @Test
    public void testUsuarioDAOCriarUsuario() {
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario usuario = new Usuario("Joao", "banana");
        assertTrue(usuarioDAO.criar_usuario(usuario));
    }

    // Testes DadosUsuarioNaoDAO

    @Test
    public void testDadosUsuarioNaoDAO() {
        DadosUsuarioNaoDAO dadosUsuarioNaoDAO = new DadosUsuarioNaoDAO();
        assertTrue(dadosUsuarioNaoDAO.musicasdomomento().length == 3);
    }

    @Test
    public void testDadosUsuarioNaoDAOMusicasFavoritas() {
        DadosUsuarioNaoDAO dadosUsuarioNaoDAO = new DadosUsuarioNaoDAO();
        assertTrue(dadosUsuarioNaoDAO.musicasfavoritas().length == 3);
    }
    
    

}
