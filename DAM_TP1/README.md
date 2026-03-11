# Assignment Tutorial 1 - Hello World
[![IntelliJ IDEA](https://img.shields.io/badge/IDE-IntelliJ%20IDEA-blue)](#)
[![Kotlin](https://img.shields.io/badge/Language-Kotlin-orange)](#)

Course: Licenciatura em Engenharia Informática e Multimédia <br>
Student(s): 45123 <br>
Date: 08/03/2026 <br>
Repository URL: [DAM_TP1](https://github.com/A45123/DAM-Tutorial1-HelloWorld/tree/main/DAM_TP1) <br>

---

## 📖 1. Introduction

O objetivo deste trabalho é aprender os conceitos básicos da linguagem Kotlin e praticar a sua utilização através de pequenos exercícios. Durante o desenvolvimento do projeto foi utilizado o `IntelliJ IDEA` e o `Git` para organizar o código e controlar versões.

O trabalho consiste em três exercícios principais: criação de arrays com quadrados perfeitos, desenvolvimento de uma calculadora em consola e simulação do movimento de uma bola que salta várias vezes. Estes exercícios ajudam a compreender melhor estruturas de controlo, arrays, tratamento de erros e sequências em Kotlin.



## 🖥️ 2. System Overview

O projeto foi criado com o nome **DAM_TP1** e está organizado em vários packages, um para cada exercício.

Os principais componentes do projeto são:
- **exer_1** – cria um array com os primeiros 50 quadrados perfeitos usando diferentes métodos do Kotlin.
- **exer_2** – uma calculadora em consola que permite fazer operações matemáticas, booleanas e bitwise.
- **exer_3** – simulação de uma bola que salta e perde altura a cada salto.

Cada exercício mostra diferentes funcionalidades da linguagem Kotlin.



## 🏗️ 3. Architecture and Design

O projeto foi organizado em packages para separar cada exercício e manter o código mais organizado.

Estrutura principal:

```
dam
├── exer_1
│   └── exer_1.kt
├── exer_2
│   └── exer_2.kt
└── exer_3
    └── exer_3.kt
```

Esta organização facilita a leitura do código e permite trabalhar em cada exercício de forma independente.

Também foram utilizadas algumas funcionalidades do Kotlin como:
- `map()` para transformar valores
- `when` para escolher operações
- `generateSequence()` para gerar sequências de valores



## ⚙️ 4. Implementation

### 4.1. Exercício 1

Neste exercício foi criado um array com os primeiros 50 quadrados perfeitos. Foram usadas três formas diferentes:
- IntArray
- range com map()
- Array com construtor

O objetivo foi perceber as diferentes formas de criar e inicializar arrays em Kotlin.

<br>

### 4.2. Exercício 2

Foi criada uma calculadora em consola que permite ao utilizador escolher várias operações.

As operações disponíveis são:
- Soma, subtração, multiplicação e divisão
- Operações booleanas (AND, OR, NOT)
- Operadores de bitwise shift (shl e shr)

Foi utilizada a expressão when para escolher a operação e exceptions para tratar erros como divisão por zero ou input inválido.
Os resultados são apresentados em decimal, hexadecimal e booleano.

<br>

### 4.3. Exercício 3

Este exercício simula o movimento de uma bola que é largada de 100 metros e que, após cada salto, atinge 60% da altura anterior.
Foi usada a função `generateSequence()` para gerar as alturas dos saltos.

Depois foram aplicados:
- `filter` para manter apenas valores acima de 1 metro
- `take(15)` para obter os primeiros 15 saltos
- conversão para lista

As alturas são apresentadas com duas casas decimais.




## 🔍 5. Testing and Validation

Os testes foram feitos executando cada exercício e verificando os resultados apresentados na consola.

No exercício 1 foi confirmado que os arrays continham os 50 quadrados perfeitos corretos.

No exercício 2 foram testadas várias operações para garantir que a calculadora funcionava corretamente e que os erros eram tratados.

No exercício 3 foi verificado se as alturas dos saltos diminuíam corretamente e se apenas eram mostrados valores acima de 1 metro.



## 📝 6. Usage Instructions

Para executar o projeto é necessário:
- `IntelliJ IDEA`
- `Kotlin`

Passos para executar:
- Abrir o projeto no IntelliJ IDEA.
- Executar o ficheiro .kt do exercício pretendido.
- Ver os resultados na consola.



---

# Autonomous Software Engineering Sections- only for [AC OK, AI OK] sections

Esta secção não se aplica a este trabalho, uma vez que o enunciado indica explicitamente **AC NO** e **AI NO**, ou seja, não é permitido o uso de Auto Complete nem ferramentas de Inteligência Artificial.

---

# Development Process

## 📦 12. Version Control and Commit History

Durante o desenvolvimento foi utilizado **Git** com um repositório local criado no **IntelliJ**.

Neste caso, apenas foi feito um `commit`, que incluiu todo o projeto já com a estrutura de packages e os exercícios implementados.



## 🌱 13. Difficulties and Lessons Learned

### 13.1 Dificuldades
Uma das principais dificuldades foi perceber melhor algumas funcionalidades do Kotlin, especialmente sequences e a função `generateSequence()`.

Também foi necessário testar várias vezes a calculadora para garantir que os erros eram tratados corretamente.

### 13.2 Lições Aprendidas
Com este trabalho foi possível melhorar conhecimentos em:
- sintaxe de Kotlin
- utilização de arrays e sequências
- tratamento de exceções



## 🔧 14. Future Improvements

No futuro seria interessante melhorar o projeto adicionando:
- uma interface gráfica para a calculadora
- testes automáticos
- Guardar histórico de cálculos da calculadora
- Opção de continuar a calcular com o resultado anterior
- Para o exercício da bola, adicionar visualização gráfica dos saltos
- Permitir que o utilizador altere altura inicial e percentagem de perda de altura

---

## ⚠️ 15. AI Usage Disclosure (Mandatory)

De acordo com as instruções do trabalho, não foram utilizadas ferramentas de Inteligência Artificial nem auto-complete durante o desenvolvimento dos exercícios.

Todo o código foi desenvolvido manualmente com base na documentação oficial do Kotlin.



