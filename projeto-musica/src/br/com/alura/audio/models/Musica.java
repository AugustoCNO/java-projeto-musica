package br.com.alura.audio.models;

public class Musica extends Audio{
    private String cantor;
    private  String album;
    private String genero;

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("O nome do cantor é: " + cantor);
        System.out.println("O nome do album é: " + album);
        System.out.println("O genero da musica é: " + genero);
        super.exibirDetalhes();
    }

    @Override
    public int getClassificacao() {
        if (this.getTotalReproducao() > 2000){
            return 10;
        } else{
            return 7;
        }
    }
}
