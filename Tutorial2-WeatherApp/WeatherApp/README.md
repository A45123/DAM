# Assignment Tutorial 2 - Cool Weather App
[![Android Studio](https://img.shields.io/badge/IDE-Android%20Studio-green)](#)
[![Kotlin](https://img.shields.io/badge/Language-Kotlin-orange)](#)
[![Version](https://img.shields.io/badge/API-24%2B-blue)](#)

Course: Licenciatura em Engenharia Informática e Multimédia <br>
Student(s): 45123 <br>
Date: 12/04/2026 <br>
Repository URL: [DAM_TP2_Weather](https://github.com/A45123/DAM/tree/main/Tutorial2-WeatherApp/WeatherApp) <br>

---

## 📖 1. Introduction

O objetivo desta fase do trabalho foi o desenvolvimento de uma aplicação Android nativa, denominada **Cool Weather App**. O projeto foca-se na criação de uma interface adaptativa que consome dados meteorológicos em tempo real através da API **Open-Meteo**.

Durante o desenvolvimento, praticou-se a estruturação de layouts para diferentes orientações (Portrait e Landscape), a gestão de recursos multi-idioma, o consumo de serviços externos via HTTP e o processamento de dados JSON utilizando a biblioteca **GSON**.

## 🖥️ 2. System Overview

O projeto foi criado sob o nome **Cool Weather APP** e permite visualizar dados meteorológicos de qualquer localização mundial.

Os principais componentes e funcionalidades são:
- **Interface Adaptativa**: Adaptação automática do layout e imagens de fundo para modo vertical e horizontal.
- **Gestão de Localização**: Introdução de coordenadas de latitude e longitude para atualizar os dados.
- **Dados Meteorológicos**: Exibição de temperatura, pressão ao nível do mar, velocidade e direção do vento.
- **Visualização Dinâmica**: Alteração de ícones e temas (Dia/Noite) baseada no estado do tempo e na hora local.

## 🏗️ 3. Architecture and Design

O projeto segue a estrutura padrão de uma aplicação Android, separando a lógica de negócio da interface visual.

Estrutura principal:
```
dam.A45123.coolweatherapp
├── MainActivity.kt (Controlo da UI e Ciclo de Vida)
├── WeatherData.kt (Classes de dados e Mapeamento WMO)
└── res/
    ├── layout/ (activity_main.xml para Port e Land)
    ├── drawable/ (Ícones climáticos e backgrounds)
    └── values/ (Strings, Cores e Temas)
```

Foram aplicados conceitos de:
- `ConstraintLayout` para flexibilidade de ecrã.
- `Sealed Themes` (Day vs Night) aplicados programaticamente.
- `Enums` para mapeamento de códigos climáticos WMO.

## ⚙️ 4. Implementation

### 4.1. Exercício 1 - Layout e Temas
Foi desenhada uma interface que suporta o modo **Light** e **Dark**. Utilizou-se a lógica de `setTheme` no `onCreate` para alternar entre `Theme.Day` e `Theme.Night` dependendo da hora da localização escolhida. Foram criados ficheiros `strings.xml` para suporte total a Português e Inglês.

### 4.2. Exercício 2 - Modelação de Dados (GSON)
Criaram-se as classes `WeatherData`, `CurrentWeather` e `Hourly` em Kotlin para representar a resposta da API. Estas classes permitem que a biblioteca **GSON** transforme automaticamente o fluxo de dados da rede em objetos manipuláveis pelo código.

### 4.3. Exercício 3 - Networking e Threading
As chamadas à API Open-Meteo são executadas numa `Thread` secundária para evitar o congelamento da interface (UI Freeze). Utilizou-se o método `runOnUiThread` para atualizar os elementos visuais (TextViews e ImageViews) assim que os dados são recebidos.

## 🔍 5. Testing and Validation

Os testes foram realizados utilizando o emulador **Google Pixel 3 AVD**:
- Verificou-se a alteração do background ao rodar o dispositivo para modo Landscape.
- Testou-se a introdução de diferentes coordenadas para confirmar se os valores de temperatura e vento eram atualizados.
- Validou-se a alteração do idioma da app ao mudar as definições do sistema Android.
- Confirmou-se que o ícone meteorológico mudava corretamente de acordo com o código retornado pela API (ex: ícone de sol para céu limpo).

## 📝 6. Usage Instructions

Para executar a aplicação:
- Abrir o projeto no **Android Studio**.
- Garantir que o emulador (AVD) ou um dispositivo real tem ligação à internet.
- Executar a aplicação (`Shift + F10`).
- Introduzir as coordenadas desejadas e premir o botão de atualização.

---

# Autonomous Software Engineering Sections

Esta secção não se aplica a este trabalho, uma vez que o enunciado indica explicitamente **AC NO** e **AI NO**.

---

# Development Process

## 📦 12. Version Control and Commit History

Foi utilizado o sistema de controlo de versões **Git** integrado no Android Studio. Os commits foram realizados de forma faseada: primeiro a estrutura de layouts, seguida da integração com a API e, por fim, o polimento da interface e internacionalização.

## 🌱 13. Difficulties and Lessons Learned

### 13.1 Dificuldades
Uma das dificuldades foi a gestão dinâmica dos recursos de imagem. Foi necessário utilizar `getIdentifier` para carregar as imagens baseadas em strings geradas dinamicamente pelos códigos WMO. Outro desafio foi garantir que o tema era aplicado corretamente antes da criação da view.

### 13.2 Lições Aprendidas
- Gestão do ciclo de vida da Activity.
- Importância do threading assíncrono em Android.
- Utilização de recursos alternativos (layouts e strings) para acessibilidade e adaptabilidade.

## 🔧 14. Future Improvements

No futuro, o projeto poderia ser expandido com:
- Utilização de **Retrofit** para simplificar as chamadas à API.
- Integração com o GPS do telemóvel para localização automática.
- Adição de notificações para alertas meteorológicos severos.
- Implementação de um gráfico de previsão para as próximas 24 horas.

---

## ⚠️ 15. AI Usage Disclosure (Mandatory)

De acordo com as instruções, não foram utilizadas ferramentas de Inteligência Artificial nem auto-complete durante o desenvolvimento. Todo o código e layout foram criados manualmente com base na documentação oficial do Android Developers.
