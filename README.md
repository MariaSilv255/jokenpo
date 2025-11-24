# Jokenpô (Pedra, Papel e Tesoura)
Este projeto é uma implementação simples do clássico jogo **Jokenpô** utilizando Java. O objetivo principal foi aplicar conceitos POO logica.

## Funcionalidades
- Escolha entre **Pedra**, **Papel** ou **Tesoura**
- Resultado automático: vitória, derrota ou empate
- Validação de entrada do usuário
- Testes unitários com **JUnit 5**

## Testes (JUnit 5)
Os testes incluem:
- Verificação de vitória, derrota e empate  
- Validação de entradas inválidas

## Estrutura do Projeto
```
Jokenpo/
│
├─ src/
│   ├─ com.maria.jokenpo/
│                     ├─ Application.java   # Classe principal do jogo
│                     ├─ Regras.java        # Classe com as regras do jogos
│                    
│    ├─ com.maria.jokenpo.model/
│                     ├─ Player.java        # Classe representando o jogador
│                     ├─ JogadaTipo.java    # enum representando as jogadas
│                     ├─ Resultado.java     # enum representando os tipos de resultado 
│   └─ test.java/
│               ├─ RegrasTest.java          # Classe test das regras
│               ├─ ValidacaoTest.java       # Classe test da validacao de entrada
└─ README.md                                # Documentação do projeto
```

## Tecnologias Utilizadas
- Java 17+
- JUnit 5

## Conceitos Aplicados
- Programação Orientada a Objetos (POO)
- Uso de enum para representar tipos de jogadas
- Uso de Map para definir regras de vitória
- Testes unitários com JUnit 5
- Validação de entrada do usuário

## Importar o projeto
Baixe o eclipse IDE

Após baixá-lo selecione as opções:
 
Selecione o caminho onde o projeto foi clonado
```
File > Import > General > Existing Projects into Workspace
```

Projeto desenvolvido como parte dos estudos em Java e testes unitários.
