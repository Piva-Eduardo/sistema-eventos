# Sistema de Gestão de Eventos e Inscrições

## 1. Apresentação do Projeto
Este projeto consiste em um sistema de software para gerenciamento de eventos acadêmicos e corporativos, controle de participantes e gestão de inscrições. O sistema permite cadastrar eventos, registrar participantes, controlar o limite de vagas disponíveis e gerenciar o status de cada inscrição.

* Autor: [Seu Nome Completo]
* Curso: Análise e Desenvolvimento de Sistemas — ULBRA Canoas
* Disciplina: Fundamentos de Programação Orientada a Objetos (2026/2)
* Professora: Caroline Pacheco da Rosa

---

## 2. Domínio e Descrição do Problema
Organizar eventos manualmente gera problemas de sobreposição de horários, excesso de inscritos além do limite das salas e dificuldade no controle de presenciais. O **Sistema de Gestão de Eventos** resolve isso centralizando o cadastro de eventos e automatizando a validação de vagas e inscrições dos participantes.

---

## 3. Público-Alvo e Usuários
1. **Administrador/Organizador:** Responsável por cadastrar eventos, definir capacidade e acompanhar os relatórios de inscritos.
2. **Participante:** Usuário que navega pelos eventos disponíveis, realiza inscrições e consulta suas confirmações.

---

## 4. Histórias de Usuário (8 a 10)
1. **Como participante**, quero visualizar a lista de eventos disponíveis, para escolher em qual desejo me inscrever.
2. **Como participante**, quero me inscrever em um evento específico, para garantir minha vaga.
3. **Como participante**, quero cancelar minha inscrição em um evento, para liberar a vaga caso eu não possa comparecer.
4. **Como participante**, quero consultar minhas inscrições ativas, para acompanhar as datas dos meus eventos.
5. **Como administrador**, quero cadastrar um novo evento informando nome, data, local e capacidade máxima, para disponibilizá-lo para inscrições.
6. **Como administrador**, quero alterar o limite de vagas de um evento, para adequar a capacidade do local.
7. **Como administrador**, quero cancelar um evento, para notificar os participantes e liberar o espaço.
8. **Como administrador**, quero emitir a lista de participantes inscritos em um evento, para controle de presença.

---

## 5. Backlog Inicial (Priorizado)
* **[Sprint 1 - AP1]**
  * Modelagem das classes fundamentais (`Evento`, `Participante`, `Inscricao`).
  * Implementação do encapsulamento (atributos privados, getters/setters e construtores).
  * Validações básicas (impedir eventos com capacidade <= 0).
* **[Sprint 2 - AP2]**
  * Implementação de coleções (`List<Participante>` na classe `Evento`).
  * Criação de Enums (`StatusEvento`, `TipoEvento`).
  * Hierarquia de herança (`Workshop` e `Palestra` herdando de `Evento`).
* **[Sprint 3 - AS]**
  * Tratamento de exceções personalizadas (`VagasEsgotadasException`).
  * Persistência em memória com Repositórios.
  * Menu interativo no console (`Main`).

---

## 6. Declaração de Uso de IA
* **Uso de IA nesta entrega:** Sim.
* **Ferramenta:** ChatGPT / Gemini.
* **Utilização:** Auxílio no brainstorm de funcionalidades do domínio de eventos e formatação do arquivo Markdown.
* **Produção própria:** Definição do escopo, detalhamento dos problemas de negócio e priorização das tarefas do backlog.
---

## 7. Diagrama de Classes (Versão 1 - Encontro 2)

```mermaid
classDiagram
    class Evento {
        +String titulo
        +String data
        +String local
        +int capacidadeMaxima
        +int totalInscritos
        +verificarVagas() boolean
        +exibirDetalhes() void
    }

    class Participante {
        +String nome
        +String email
        +String cpf
        +exibirInformacoes() void
    }

    class Inscricao {
        +int codigo
        +String status
        +confirmarInscricao() void
    }

    class Local {
        +String nomeEspaco
        +String endereco
        +int capacidadeGeral
        +exibirEspaco() void
    }

    Inscricao --> Participante : refere-se a
    Inscricao --> Evento : inscreve em
    Evento --> Local : ocorre em
