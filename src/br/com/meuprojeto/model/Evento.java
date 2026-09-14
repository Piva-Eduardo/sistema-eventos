package br.com.meuprojeto.model;

public class Evento {
    public String titulo;
    public String data;
    public String local;
    public int capacidadeMaxima;
    public int totalInscritos;

    public boolean verificarVagas() {
        return totalInscritos < capacidadeMaxima;
    }

    public void exibirDetalhes() {
        System.out.println("Evento: " + titulo);
        System.out.println("Data: " + data + " | Local: " + local);
        System.out.println("Inscritos: " + totalInscritos + "/" + capacidadeMaxima);
    }
}
