package br.com.meuprojeto.model;

public class Local {
    public String nomeEspaco;
    public String endereco;
    public int capacidadeGeral;

    public void exibirEspaco() {
        System.out.println("Espaço: " + nomeEspaco + " | Endereço: " + endereco + " (Capacidade Máx: " + capacidadeGeral + ")");
    }
}
