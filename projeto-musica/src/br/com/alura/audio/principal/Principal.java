package br.com.alura.audio.principal;

import br.com.alura.audio.models.MinhasPreferidas;
import br.com.alura.audio.models.Musica;
import br.com.alura.audio.models.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica musica = new Musica();
        musica.setCantor("Belo");
        musica.setAlbum("qualquer");
        musica.setTitulo("Abacate é bom");
        musica.setGenero("Não sei");

        for (int i = 0; i < 1000; i++) {
            musica.reproduzir();
        }

        for (int i = 0; i < 600; i++) {
            musica.curtir();
        }
        musica.exibirDetalhes();

        System.out.println();

        Podcast podcast = new Podcast();
        podcast.setTitulo("OVNES");
        podcast.setApresentador("Oliveira");
        podcast.setDescricao("Episodio falando sobre OVNES e como vivem");

        for (int i = 0; i < 5000; i++) {
            podcast.reproduzir();
        }

        for (int i = 0; i < 1000; i++) {
            podcast.curtir();
        }
        podcast.exibirDetalhes();

        System.out.println();

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(musica);
        preferidas.inclui(podcast);
    }
}
