import br.com.meuprojeto.model.Evento;
import br.com.meuprojeto.model.Inscricao;
import br.com.meuprojeto.model.Local;
import br.com.meuprojeto.model.Participante;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE GESTÃO DE EVENTOS E INSCRIÇÕES ===\n");

        // 1. Instanciando o Local
        Local auditorio = new Local();
        auditorio.nomeEspaco = "Auditório Prédio 11";
        auditorio.endereco = "Av. Farroupilha, 8001 - ULBRA Canoas";
        auditorio.capacidadeGeral = 100;
        auditorio.exibirEspaco();

        System.out.println("\n------------------------------------------------");

        // 2. Instanciando o Evento
        Evento workshop = new Evento();
        workshop.titulo = "Workshop de Programação Orientada a Objetos";
        workshop.data = "15/10/2026";
        workshop.local = auditorio.nomeEspaco;
        workshop.capacidadeMaxima = 2; // Limite para testar a validação de vagas
        workshop.totalInscritos = 0;
        workshop.exibirDetalhes();

        System.out.println("\n------------------------------------------------");

        // 3. Instanciando Participantes
        Participante p1 = new Participante();
        p1.nome = "Eduardo Piva";
        p1.email = "eduardo@email.com";
        p1.cpf = "123.456.789-00";

        Participante p2 = new Participante();
        p2.nome = "Maria Silva";
        p2.email = "maria@email.com";
        p2.cpf = "987.654.321-11";

        // 4. Criando e Confirmando Inscrições
        Inscricao inscricao1 = new Inscricao();
        inscricao1.codigo = 1001;
        inscricao1.participante = p1;
        inscricao1.evento = workshop;
        inscricao1.confirmarInscricao();

        Inscricao inscricao2 = new Inscricao();
        inscricao2.codigo = 1002;
        inscricao2.participante = p2;
        inscricao2.evento = workshop;
        inscricao2.confirmarInscricao();

        System.out.println("\n------------------------------------------------");
        // 5. Estado final do evento
        workshop.exibirDetalhes();
    }
}
