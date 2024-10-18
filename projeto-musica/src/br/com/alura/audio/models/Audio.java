package br.com.alura.audio.models;

public class Audio {
    private String titulo;
    private int totalReproducao;
    private int totalCurtidas;
    private int classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalReproducao() {
        return totalReproducao;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void curtir(){
        this.totalCurtidas++;
    }

    public void reproduzir(){
        this.totalReproducao++;
    }

    public void exibirDetalhes(){
        System.out.println("O titulo é: " + getTitulo());
        System.out.println("Foi reproduzido: " + totalReproducao + " vezes");
        System.out.println("Foi curtido: " + totalCurtidas + " vezes");
    }

}
