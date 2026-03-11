# Assignment Tutorial1-HelloWorld
[![IntelliJ IDEA](https://img.shields.io/badge/IDE-IntelliJ%20IDEA-blue)](#)
[![Android Studio](https://img.shields.io/badge/IDE-Android%20Studio-green)](#) 
[![Kotlin](https://img.shields.io/badge/Language-Kotlin-orange)](#)
[![Version](https://img.shields.io/badge/API-24%2B-blue)](#)

Course: Licenciatura em Engenharia Informática e Multimédia <br>
Student(s): 45123 <br>
Date: 08/03/2026 <br>
Repository URL: [Tutorial1-HelloWorld](https://github.com/A45123/DAM/tree/main/Tutorial1-HelloWorld) <br>

---

## 📖 1. Introduction

Este repositório reúne vários projetos desenvolvidos no âmbito da unidade curricular **Desenvolvimento de Aplicações Móveis**.

Os projetos foram desenvolvidos utilizando **Kotlin**, explorando tanto aplicações **Android com Android Studio** como programas **em consola utilizando IntelliJ IDEA**.

O objetivo geral destes trabalhos foi aprender e aplicar conceitos fundamentais como:

* Sintaxe e estruturas da linguagem **Kotlin**
* **Programação orientada a objetos**
* Estruturas de dados e controlo de fluxo
* Desenvolvimento de **aplicações Android**
* Organização de projetos e controlo de versões com **Git**

Cada diretório deste repositório corresponde a um projeto independente que aborda diferentes conceitos e exercícios práticos.

---

# Projetos

## [DAM_TP1](https://github.com/A45123/DAM/tree/main/Tutorial1-HelloWorld/DAM_TP1) — Kotlin Basics and Console Exercises

Projeto introdutório desenvolvido usando **Kotlin** e o **InterlliJ IDEA**, focado nos **conceitos básicos da linguagem Kotlin** através de exercícios executados em consola. 

O projeto inclui três exercícios principais:

* Geração de **arrays com os primeiros 50 quadrados perfeitos** utilizando diferentes abordagens da linguagem.
* Desenvolvimento de uma **calculadora em consola** que suporta operações aritméticas, booleanas e bitwise, com tratamento de erros.
* **Simulação do movimento de uma bola** que perde altura a cada salto utilizando sequences e programação funcional.

Este projeto serviu como primeiro contacto com estruturas de controlo, arrays, tratamento de exceções e funcionalidades funcionais do Kotlin.

---

## Hello_World — First Android Application

Primeira aplicação Android desenvolvida usando o **Kotlin** e o **Android Studio**, criada para compreender a estrutura de um projeto Android e a construção de interfaces gráficas simples.

A aplicação apresenta uma **Activity única** com diferentes componentes de interface:

* **TextView** com mensagens de boas-vindas
* **ImageView** com uma imagem ilustrativa
* **CalendarView** para visualização de calendário

O projeto também explora conceitos importantes do desenvolvimento Android, incluindo:

* Uso de **ConstraintLayout**
* Gestão de recursos (`res/layout`, `res/values`, `res/drawable`)
* **Layouts adaptáveis** para orientação retrato e paisagem
* Internacionalização através de **strings.xml**

---

## Hello_World_Optional — Android System Information App

Aplicação Android simples desenvolvida usando o **Kotlin** e o **Android Studio** que exibe **informações do dispositivo atual** diretamente na interface da aplicação.

A aplicação utiliza a classe **`android.os.Build`** para recolher propriedades do sistema, como:

* Fabricante do dispositivo
* Modelo
* Versão do Android
* Outras propriedades básicas do sistema

Essas informações são apresentadas num **TextView multilinha**, permitindo visualizar rapidamente dados do dispositivo sem recorrer a ferramentas externas. O projeto também utiliza **ConstraintLayout** e layouts adaptáveis para diferentes orientações de ecrã.

---

## VirtualLibraryManagementSystem — Virtual Library System in Kotlin

Sistema de **gestão de biblioteca virtual** desenvolvido usando o **Kotlin** e o **InterlliJ IDEA** com foco na aplicação de **programação orientada a objetos**.

O sistema permite:

* Adicionar novos livros à biblioteca
* Emprestar e devolver livros
* Listar livros disponíveis
* Pesquisar livros por autor

A arquitetura do projeto inclui:

* **Classe abstrata `Book`** com atributos e comportamentos comuns
* Subclasses **`DigitalBook`** e **`PhysicalBook`**
* Classe **`Library`** responsável por gerir a coleção de livros
* **`LibraryMember`** representando utilizadores da biblioteca

Durante o desenvolvimento foram aplicados conceitos como **herança, polimorfismo, encapsulamento, getters/setters personalizados, data classes e companion objects**.

---

# Repository Structure

```
.
├── DAM_TP1
├── Hello_World
├── Hello_World_Optional
└── VirtualLibraryManagementSystem
```

Cada pasta contém o projeto original com o seu próprio código e documentação.

