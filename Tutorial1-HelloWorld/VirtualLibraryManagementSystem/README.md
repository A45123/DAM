# Assignment A Virtual Library
[![IntelliJ IDEA](https://img.shields.io/badge/IDE-IntelliJ%20IDEA-blue)](#)
[![Kotlin](https://img.shields.io/badge/Language-Kotlin-orange)](#) 

Course: Licenciatura em Engenharia Informática e Multimédia <br>
Student(s): 45123 <br>
Date: 08/03/2026 <br>
Repository URL: [VirtualLibraryManagementSystem](https://github.com/A45123/DAM/tree/main/Tutorial1-HelloWorld/VirtualLibraryManagementSystem) <br>

---

## 📖 1. Introduction

O objetivo deste exercício é desenvolver um **Sistema de Biblioteca Virtual** usando Kotlin. A proposta é aplicar conceitos de **programação orientada a objetos** como classes, herança, polimorfismo, encapsulamento, getters e setters personalizados, bem como gerenciar coleções de livros digitais e físicos. O sistema permitirá operações de **empréstimo, devolução e busca de livros**, servindo como base prática para um sistema real de gerenciamento de biblioteca.



## 🖥️ 2. System Overview

O sistema gerencia uma **coleção de livros**, suportando diferentes formatos: digitais e físicos. Cada livro possui atributos comuns como título, autor, ano de publicação e número de cópias disponíveis, enquanto os subtipos adicionam propriedades específicas (ex.: tamanho do arquivo para livros digitais, peso e capa dura para livros físicos).

O **usuário** pode interagir com o sistema via console, realizando operações como: adicionar livros, emprestar, devolver e buscar livros por autor.

<br>

Principais casos de uso:
- Adicionar novos livros à biblioteca.
- Emprestar e devolver livros com atualização automática de cópias.
- Listar todos os livros disponíveis.
- Buscar livros de um autor específico.



## 🏗️ 3. Architecture and Design

O sistema segue uma arquitetura **orientada a objetos**, com as seguintes classes principais:
- **Book (classe base abstrata)** – Define atributos comuns, getters/setters personalizados e método abstrato `getStorageInfo()`.
- **DigitalBook e PhysicalBook (subclasses)** – Implementam características específicas e sobrescrevem métodos da classe base.
- **Library (gerenciador de livros)** – Mantém a coleção de livros, métodos para operações de biblioteca e um companion object para rastrear o total de livros criados.
- **LibraryMember (data class)** – Representa membros da biblioteca com lista de livros emprestados.

<br>

**Decisões de design:**
- Uso de getters/setters personalizados para validação de dados e mensagens de alerta.
- Uso de métodos abstratos para forçar a implementação de detalhes específicos de armazenamento em subclasses.
- Companion object para rastrear estatísticas globais da biblioteca.

<br>

**Estrutura de pastas:**
```
VirtualLibraryManagementSystem
│
├── Book.kt
├── DigitalBook.kt
├── PhysicalBook.kt
├── Library.kt
├── LibraryMember.kt
└── Main.kt
```


## ⚙️ 4. Implementation

O sistema da biblioteca foi implementado seguindo os princípios da **programação orientada a objetos em Kotlin**.

- A classe **Book** funciona como base para todos os livros, contendo atributos comuns como título, autor, ano de publicação e cópias disponíveis. Foi implementado um **getter personalizado** para categorizar o ano de publicação em “Classic”, “Modern” ou “Contemporary”, e um setter personalizado para validar e controlar o número de cópias disponíveis, exibindo aviso quando o livro fica sem estoque. Um **init block** foi usado para imprimir mensagens de criação de objetos.

- As subclasses **DigitalBook** e **PhysicalBook** estendem Book, adicionando propriedades específicas: tamanho do arquivo e formato para livros digitais, peso e capa dura para livros físicos. Ambas implementam o método abstrato `getStorageInfo()`, fornecendo informações detalhadas sobre como o livro é armazenado.

- A classe **Library** gerencia a coleção de livros. Implementa métodos para adicionar livros, emprestar, devolver, listar todos os livros e buscar por autor. Um **companion object** foi usado para rastrear o total de livros criados em todas as instâncias da biblioteca.

- Foi criada também a **data class LibraryMember**, representando membros da biblioteca e os livros que eles emprestaram.



## 🔍 5. Testing and Validation

Testes manuais usando console foram realizados para verificar:
- Criação de livros (mensagens do init block).
- Validação de getters e setters (prevenção de cópias negativas, aviso quando esgotado).
- Operações de empréstimo e devolução, incluindo cenários de cópias insuficientes.
- Busca por autor retornando apenas livros corretos.

Todos os métodos do Library foram testados com múltiplos livros e diferentes situações.



## 📝 6. Usage Instructions

- Abrir o projeto no IntelliJ IDEA.
- Compilar e executar Main.kt.
- Observar a saída no console para operações de biblioteca, empréstimos, devoluções e buscas.



---

# Autonomous Software Engineering Sections- only for [AC OK, AI OK] sections

Esta seção não foi preenchida porque o desenvolvimento do sistema da biblioteca não envolveu o uso de ferramentas de Inteligência Artificial. Todo o projeto foi realizado manualmente, utilizando apenas recursos do IntelliJ IDEA e Kotlin, sem o auxílio de Auto Complete, agentes autônomos ou qualquer ferramenta de IA.



---

# Development Process

## 📦 12. Version Control and Commit History

O controle de versão foi realizado utilizando Git, porém, devido à conclusão do projeto em um único dia, apenas um commit contendo a versão final foi registrado.



## 🌱 13. Difficulties and Lessons Learned

### 13.1 Dificuldades

- Implementar getters e setters personalizados com validação lógica e mensagens de aviso.
- Garantir que a herança funcionasse corretamente, especialmente com propriedades específicas de subclasses (peso, formato, fileSize).


### 13.2 Lições Aprendidas

- A importância de organizar classes e manter responsabilidade única para cada classe.
- Uso eficiente de init blocks para mensagens de criação de objetos.
- Benefícios de data classes para representar entidades simples como membros da biblioteca.
- Como implementar polimorfismo de forma clara e previsível em Kotlin.



## 🔧 14. Future Improvements

- Adicionar interface gráfica (GUI) para interação mais amigável do usuário.
- Implementar persistência de dados usando arquivos ou banco de dados para armazenar livros e membros da biblioteca.
- Adicionar autenticação de membros e histórico de empréstimos.



---



## ⚠️ 15. AI Usage Disclosure (Mandatory)

Nenhuma ferramenta de Inteligência Artificial foi utilizada durante o desenvolvimento deste projeto. Todo o código, configuração e implementação foram realizados manualmente pelo estudante.


