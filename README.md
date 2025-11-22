# Jokenpô: Pedra, Papel e Tesoura (Java)
Este projeto é uma implementação simples do clássico jogo Jokenpô (Pedra, Papel e Tesoura) desenvolvida em Java. O objetivo principal foi aplicar conceitos de Programação Orientada a Objetos (POO) e lógica de programação para criar um jogo de console interativo onde o jogador compete contra o computador.

O projeto utiliza uma estrutura modular, separando a lógica de aplicação (Application.java) das regras do jogo (Regras.java) e dos modelos de dados (Player.java, JogadaTipo.java, Resultado.java).

## Funcionalidades

•
Jogo Interativo: O jogador insere sua jogada via console.

•
Oponente Computador: O computador escolhe sua jogada de forma aleatória.

•
Lógica de Regras: Implementação clara das regras do Jokenpô para determinar o vencedor.

•
Estrutura Orientada a Objetos: Utilização de classes e enums para representar os elementos do jogo.

## Estrutura de pasta
```
Jokenpo/
│
├─ src/
│   ├─ com.maria.jokenpo/
│                     ├─ Application.java   # Classe principal do jogo
│                     ├─ Regras.java        # Classe com as regras do jogos
│                    
│    ├─ com.maria.jokenpo.model/
│                     ├─ Player.java      # Classe representando o jogador
│                     ├─ JogadaTipo.java  # enum representando as jogadas
│                     ├─ Resultado.java   # enum representando os tipos de resultado 
│   └─ test.java/
│               ├─ RegrasTest.java      # Classe test das regras
│               ├─ ValidacaoTest.java   # Classe test da validacao de entrada
└─ README.md                           # Documentação do projeto
```

## Como jogar
Compile e execute a classe Application.java.
Insira sua jogada no console:
• PEDRA
• PAPEL
• TESOURA

O computador fará sua jogada e o resultado será exibido no console.

