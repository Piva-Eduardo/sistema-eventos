package br.com.meuprojeto.model;

public class Inscricao {
    public int codigo;
    public Participante participante;
    public Evento evento;
    public String status;

    public void confirmarInscricao() {
        if (evento.verificarVagas()) {
            status = "Confirmada";
            evento.totalInscritos++;
            System.out.println("Inscrição #" + codigo + " confirmada com sucesso para " + participante.nome + "!");
        } else {
            status = "Recusada - Vagas Esgotadas";
            System.out.println("Não há vagas disponíveis para o evento " + evento.titulo);
        }
    }
}
