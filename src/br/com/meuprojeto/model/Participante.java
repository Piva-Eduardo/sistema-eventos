package br.com.meuprojeto.model;

public class Participante {
    public String nome;
    public String email;
    public String cpf;

    public void exibirInformacoes() {
        System.out.println("Participante: " + nome + " | Email: " + email + " | CPF: " + cpf);
    }
}
