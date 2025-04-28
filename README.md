# Sistema de Gerenciamento de Atendimento ao Cliente

**Curso:** Engenharia de Software  
**Disciplina:** Resolução de Problemas Estruturados em Computação  
**Professor:** Andrey Cabral  
**By:** Diego Marquetti e Lucas Cunha

---

## Sobre o Projeto

Este sistema simula o atendimento a clientes utilizando duas estruturas de dados dinâmicas: **fila** e **pilha**, ambas implementadas com lista encadeada. A proposta é representar de forma prática a lógica de atendimento e histórico de solicitações, com controle total sobre inserções e remoções.

A implementação foi feita em Java, respeitando os critérios de simplicidade e clareza, sem o uso de estruturas automatizadas ou bibliotecas externas.

---

## O que o sistema faz

### Fila — Ordem de Atendimento
Organiza os clientes por ordem de chegada, utilizando o modelo FIFO (First In, First Out).

Cada cliente contém:
- ID
- Nome
- Motivo do atendimento

A estrutura permite:
- Adicionar cliente ao fim da fila
- Atender o cliente no início da fila
- Verificar se a fila está vazia
- Listar todos os clientes em ordem

### Pilha — Histórico de Solicitações
Armazena as últimas solicitações feitas, seguindo o modelo LIFO (Last In, First Out).

Cada solicitação contém:
- ID
- Descrição
- Data e hora

A estrutura permite:
- Adicionar uma nova solicitação no topo
- Remover a solicitação mais recente
- Verificar se a pilha está vazia
- Exibir o histórico completo

---

## Estrutura do Projeto

| Arquivo         | Descrição                                              |
|-----------------|---------------------------------------------------------|
| `Elemento.java` | Contém os dados de cada cliente ou solicitação         |
| `No.java`       | Nó da lista encadeada com ponteiro para o próximo      |
| `Fila.java`     | Implementa a fila dinâmica (ordem de atendimento)      |
| `Pilha.java`    | Implementa a pilha dinâmica (histórico de solicitações)|
| `MenuFila.java` | Código de teste para fila                              |
| `MenuPilha.java`| Código de teste para pilha                             |

---

## Como executar

1. Copie todos os arquivos `.java` para uma IDE como IntelliJ ou Eclipse.
2. Compile todos os arquivos.
3. Execute `MenuFila.java` para testar a fila.
4. Execute `MenuPilha.java` para testar a pilha.
5. A saída será exibida no console.

---

## Exemplo de Saída - Fila

```
Fila de Atendimento:
ID: CLI001 | Nome: Maria Silva | Motivo: Dúvida sobre produto
ID: CLI002 | Nome: João Souza | Motivo: Reclamação de serviço
...

Atendendo cliente: Maria Silva

Fila atualizada:
ID: CLI002 | Nome: João Souza | Motivo: Reclamação de serviço
...
```

---

## Exemplo de Saída - Pilha

```
Histórico de Solicitações:
ID: REQ010 | Descrição: Consulta técnica | Data/Hora: 2024-08-20 15:00
ID: REQ009 | Descrição: Restauração de dados | Data/Hora: 2024-08-20 14:30
...

Removendo a última solicitação...

Histórico atualizado:
ID: REQ009 | Descrição: Restauração de dados | Data/Hora: 2024-08-20 14:30
...
```

---

## Vídeo de Apresentação

O vídeo com a explicação do projeto está disponível em:

**[Link do Vídeo para explicação no YouTube](https://www.youtube.com/watch?v=APkExZv-GuQ)**

---

## Observações finais

O projeto foi desenvolvido com base na lógica de estruturas encadeadas, sem o uso de recursos automatizados. Todas as operações foram testadas separadamente, garantindo o funcionamento completo da fila e da pilha.
