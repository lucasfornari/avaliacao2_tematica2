# Avaliação 2 - Estrutura de Dados EAD (Temática 2) Sistema de Gerenciamento de Pedidos (Fila)

Este repositório contém o código-fonte desenvolvido como parte da **Avaliação 2**, pertencente à **Temática 2** da disciplina de Estrutura de Dados.

O objetivo deste projeto é implementar uma estrutura de dados fundamental, a **Fila (Queue)**, para simular o sistema de gerenciamento de pedidos de uma lanchonete, seguindo a lógica **FIFO (First-In, First-Out)**.

---

## Estrutura e Classes do Projeto

O sistema é construído em **Java**, utilizando um **array** como base para a implementação da Fila. O projeto é dividido nas seguintes classes:

| Classe        | Função                                     | Tipo / Conceito      |
|---------------|--------------------------------------------|----------------------|
| `Pedido.java` | Representa um pedido (ID e nome do Pedido) | Objeto               |
| `Fila.java`   | Gerencia a fila de pedidos e operações     | Fila (Queue) / FIFO  |
| `App.java`    | Executa o programa e exibe o menu          | Aplicação / UI       |


---

## Funcionalidades Implementadas

O programa oferece um menu de console que permite ao usuário interagir com o fluxo de pedidos da lanchonete:

- **Adicionar novo pedido (ENQUEUE):** Insere um novo pedido no final da fila.  
- **Processar pedido mais antigo (DEQUE):** Remove e retorna o pedido que está no início da fila, garantindo que o pedido mais antigo seja sempre processado primeiro.  
- **Visualizar todos os pedidos na fila:** Exibe o estado atual da fila de pedidos e a posição de cada item.  
- **Finalizar programa:** Encerra a execução do sistema.

---
