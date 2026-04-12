# Assignment Tutorial 2 - Kotlin Advanced & Weather App
[![IntelliJ IDEA](https://img.shields.io/badge/IDE-IntelliJ%20IDEA-blue)](#)
[![Android Studio](https://img.shields.io/badge/IDE-Android%20Studio-green)](#) 
[![Kotlin](https://img.shields.io/badge/Language-Kotlin-orange)](#)
[![Version](https://img.shields.io/badge/API-24%2B-blue)](#)

Course: Licenciatura em Engenharia Informática e Multimédia <br>
Student(s): 45123 <br>
Date: 12/04/2026 <br>
Repository URL: [Tutorial2-WeatherApp](https://github.com/A45123/DAM/tree/main/Tutorial2-WeatherApp) <br>

---

## 📖 1. Introduction

Este repositório reúne os projetos desenvolvidos durante o **Tutorial 2** da unidade curricular de **Desenvolvimento de Aplicações Móveis**.

O foco deste conjunto de trabalhos foi a transição de conceitos básicos para funcionalidades avançadas da linguagem **Kotlin** e o desenvolvimento de uma aplicação **Android** conectada a serviços externos (APIs).

Os objetivos principais foram:

* Aplicar conceitos avançados de Kotlin: **Generics, Sealed Classes e Operator Overloading**
* Implementar **programação funcional** com Higher-Order Functions e Lambdas
* Consumir dados em tempo real através de **APIs REST (JSON)**
* Criar interfaces Android dinâmicas com **temas adaptativos (Day/Night)**
* Gestão de threads assíncronas para operações de rede

---

# Projetos

## [Tutorial2-Kotlin](https://github.com/A45123/DAM/tree/main/Tutorial2-WeatherApp/Tutorial2-Kotlin) — Advanced Kotlin Exercises

Projeto desenvolvido no **IntelliJ IDEA** focado na exploração profunda das capacidades da linguagem Kotlin. Este trabalho demonstra como criar código mais robusto e expressivo através de quatro desafios:

* **Event Log Processing:** Sistema de logs utilizando `Sealed Classes` para garantir o tratamento exaustivo de eventos de login, compra e logout.
* **Type-Safe In-Memory Cache:** Implementação de uma cache genérica `<K, V>` com suporte para transformações de dados e snapshots imutáveis.
* **Configurable Data Pipeline:** Criação de uma "pipeline" de processamento de strings usando lambdas com receivers e funções de alta ordem.
* **Vec2 Library:** Biblioteca matemática de vetores 2D utilizando `Operator Overloading` para permitir operações nativas como `a + b` ou `v[0]`.

Este projeto serviu para consolidar o uso de funcionalidades modernas que tornam o Kotlin uma linguagem poderosa para o desenvolvimento de sistemas complexos.

---

## [WeatherApp](https://github.com/A45123/DAM/tree/main/Tutorial2-WeatherApp/WeatherApp) — Real-Time Weather Application

Aplicação Android avançada desenvolvida no **Android Studio** que fornece informações meteorológicas em tempo real para qualquer coordenada geográfica, utilizando a API **Open-Meteo**.

A aplicação destaca-se pelas seguintes implementações técnicas:

* **Networking & JSON:** Uso da biblioteca **GSON** para processar respostas da API e gestão de permissões de Internet.
* **UI Dinâmica:** O ecrã adapta-se automaticamente (ícones e cores) com base no código meteorológico WMO retornado pela API.
* **Temas Adaptativos:** Sistema de temas personalizados que alternam entre **Modo Dia e Noite** dependendo da hora local e do estado do sol.
* **Layouts Responsivos:** Design otimizado para as orientações Retrato (Portrait) e Paisagem (Landscape).
* **Internacionalização:** Suporte completo para os idiomas **Português e Inglês** via recursos de strings.

---

# Repository Structure

```
.
├── Tutorial2-Kotlin (Kotlin Exercises)
└── WeatherApp (Android Weather Application)
```

---

## ⚠️ AI Usage Disclosure (Mandatory)

De acordo com as diretrizes da unidade curricular, este trabalho foi desenvolvido seguindo as normas **AC NO** (No Auto-Complete) e **AI NO** (No AI Tools). Todo o código, lógica de negócio e design de interface foram implementados manualmente com base na documentação oficial do Kotlin e Android.
