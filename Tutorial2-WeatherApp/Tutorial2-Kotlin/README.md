# Assignment Tutorial 2 - Kotlin Exercises  
[![IntelliJ IDEA](https://img.shields.io/badge/IDE-IntelliJ%20IDEA-blue)](#)  
[![Kotlin](https://img.shields.io/badge/Language-Kotlin-orange)](#)
 
Course: Licenciatura em Engenharia Informática e Multimédia <br>
Student(s): 45123 <br>
Date: 12/04/2026 <br>
Repository URL: [TP2 - Kotlin Exercises](https://github.com/A45123/DAM/tree/main/Tutorial2-WeatherApp/Tutorial2-Kotlin) <br>

---

## 📖 1. Introduction

O objetivo deste trabalho é aprofundar o conhecimento em Kotlin através da implementação de exercícios focados em programação funcional, genéricos, pipelines de dados e operator overloading.

Durante o desenvolvimento foram explorados conceitos fundamentais como sealed classes, funções de ordem superior, generics, extensão de funções e composição de funções. O trabalho foi desenvolvido no IntelliJ IDEA utilizando Kotlin.

Este tutorial está dividido em quatro exercícios principais:
- processamento de eventos com programação funcional
- implementação de uma cache genérica
- criação de um pipeline de transformação de dados
- desenvolvimento de uma biblioteca de vetores 2D com operator overloading

---

## 🖥️ 2. System Overview

O projeto foi organizado em vários packages, um para cada exercício, de forma a manter o código modular e fácil de compreender.

Principais componentes:
- **exer_1** – sistema de eventos com sealed classes e funções de extensão
- **exer_2** – cache genérica em memória com operações avançadas
- **exer_3** – pipeline de transformação de strings com funções de ordem superior
- **exer_4** – biblioteca de vetores 2D com operator overloading

---

## 🏗️ 3. Architecture and Design

```
kotlin
├── exer_1.kt
├── exer_2.kt
├── Pipeline.kt
└── Vec2.kt
```


Foram aplicados conceitos importantes de design funcional em Kotlin:
- sealed classes para modelação de estados
- extension functions para aumentar a funcionalidade de listas
- higher-order functions para processamento genérico
- function composition para pipelines
- operator overloading para abstrações matemáticas

---

## ⚙️ 4. Implementation

### 4.1. Exercício 1 – Event Log Processing

Neste exercício foi implementado um sistema de eventos usando uma sealed class `Event`, com três tipos:
- Login
- Purchase
- Logout

Foram criadas extension functions:
- `filterByUser(username)` para filtrar eventos por utilizador
- `totalSpent(username)` para calcular o total gasto em compras

Foi também implementada a função de ordem superior `processEvents`, que percorre a lista de eventos e aplica um handler.

Dentro do handler foi usado um `when` expression para garantir tratamento exaustivo de todos os tipos de eventos.

---

### 4.2. Exercício 2 – Generic In-Memory Cache

Foi criada uma cache genérica `Cache<K, V>` baseada em `MutableMap`.

Funcionalidades:
- put(key, value)
- get(key)
- evict(key)
- size()
- getOrPut(key, default)
- transform(key, action)
- snapshot()

Foi também implementado:
- filterValues(predicate)

Testes com:
- Cache<String, Int>
- Cache<Int, String>

---

### 4.3. Exercício 3 – Data Pipeline

Classe `Pipeline` com lista de transformações `(List<String>) -> List<String>`.

Funcionalidades:
- addStage(name, transform)
- execute(input)
- describe()

Pipeline:
- Trim
- Filter errors
- Uppercase
- Add index

Extras:
- compose
- fork

---

### 4.4. Exercício 4 – Vec2 Operator Overloading

Classe `Vec2(x: Double, y: Double)`.

Operadores:
- +
- -
- *
- unary -

Outros:
- compareTo (magnitude)
- get(index)
- magnitude()
- dot()
- normalized()

Extras:
- Double * Vec2
- component1 / component2 (destructuring)

---

## 🔍 5. Testing and Validation

Todos os exercícios foram testados no IntelliJ IDEA.

Verificações:
- eventos corretamente processados
- cache genérica funcional
- pipeline produz output esperado
- operações vetoriais corretas

---

## 📝 6. Usage Instructions

- Abrir projeto no IntelliJ IDEA
- Executar cada exercício separadamente
- Ver resultados na consola

---

# Autonomous Software Engineering Sections- only for [AC OK, AI OK] sections

Esta secção não se aplica a este trabalho, uma vez que o enunciado indica explicitamente **AC NO** e **AI NO**, ou seja, não é permitido o uso de Auto Complete nem ferramentas de Inteligência Artificial.

---

# Development Process

## 📦 12. Version Control and Commit History

Durante o desenvolvimento foi utilizado **Git** com um repositório criado no **IntelliJ IDEA**.

O projeto foi versionado localmente e posteriormente organizado em um repositório remoto no GitHub.


---

## 🌱 13. Difficulties and Lessons Learned

### 13.1 Dificuldades

Durante a realização deste trabalho, as principais dificuldades encontradas foram:

- compreensão inicial de **sealed classes** e sua utilização com `when` expressions
- implementação correta de **higher-order functions** e extension functions
- manipulação de **generics avançados** na implementação da Cache
- compreensão de **function composition** no Pipeline
- implementação correta de **operator overloading**, especialmente no caso de comparação por magnitude na classe Vec2

---

### 13.2 Lições Aprendidas

Com este trabalho foi possível consolidar e melhorar conhecimentos em:

- programação funcional em Kotlin
- utilização de sealed classes para modelação de estados
- uso de extension functions para extensão de comportamento de listas
- generics e estruturas de dados genéricas
- pipelines de transformação de dados
- operator overloading aplicado a estruturas matemáticas
- boas práticas de organização de projetos em packages

---

## 🔧 14. Future Improvements

- testes unitários (JUnit)
- persistência de cache
- pipeline configurável dinamicamente
- extensão para Vec3 (3D)
- visualização gráfica de vetores

---

## ⚠️ 15. AI Usage Disclosure (Mandatory)

De acordo com as instruções do trabalho, não foram utilizadas ferramentas de Inteligência Artificial nem auto-complete durante o desenvolvimento dos exercícios.

Todo o código foi desenvolvido manualmente com base na documentação oficial do Kotlin.

