# Tutorial 3 - Cool Jetpack Weather App

[![IDE](https://img.shields.io/badge/IDE-IntelliJ%20IDEA-purple)](#)
[![Kotlin](https://img.shields.io/badge/Language-Kotlin-orange)](#)
[![Build](https://img.shields.io/badge/Build-Gradle-blue)](#)

Course: Licenciatura em Engenharia Informática e Multimédia <br>
Student(s): 45123 <br>
Date: 12/04/2026 <br>
Repository URL: [CoolJetpackWeatherApp](https://github.com/A45123/DAM/tree/main/Tutorial3-CoolJetpackWeatherApp) <br>

---

## 📖 1. Introduction

O objetivo desta fase do trabalho foi a reconstrução da **Cool Weather App** desenvolvida no tutorial anterior, adaptando-a para seguir a arquitetura **MVVM (Model–View–ViewModel)** e utilizando **Jetpack Compose** em substituição dos layouts XML.

Durante o desenvolvimento, praticou-se a separação de responsabilidades em camadas (`data`, `viewmodel`, `ui`), a gestão de estado com `StateFlow` e `collectAsState`, o consumo da API **Open-Meteo** com o cliente HTTP **Ktor**, e a serialização de dados JSON com a biblioteca **Kotlin Serialization**.

## 🖥️ 2. System Overview

O projeto foi criado sob o nome **Cool Jetpack Weather App** e permite visualizar dados meteorológicos de qualquer localização mundial, através da introdução de coordenadas geográficas.

Os principais componentes e funcionalidades são:

- **Arquitetura MVVM**: Separação clara entre dados (`data`), lógica de negócio (`viewmodel`) e interface (`ui`).
- **Interface em Jetpack Compose**: UI totalmente declarativa, sem ficheiros XML de layout.
- **Layouts Adaptativos**: Composables distintos para modo Portrait (`PortraitWeatherUI`) e Landscape (`LandscapeWeatherUI`).
- **Dados Meteorológicos**: Exibição de temperatura, pressão ao nível do mar, velocidade e direção do vento, código meteorológico e hora.
- **Internacionalização**: Suporte completo a Inglês e Português via `strings.xml`.
- **Networking Assíncrono**: Chamadas à API Open-Meteo executadas em coroutines, sem bloquear a thread principal.

## 🏗️ 3. Architecture and Design

O projeto segue a arquitetura **MVVM** recomendada pelo Android Jetpack, com três pacotes principais:

```text
dam_a45123.cooljetpackweatherapp
├── MainActivity.kt
├── data/
│   ├── WeatherData.kt          (Classes de dados @Serializable)
│   ├── WeatherAPIClient.kt     (Cliente Ktor HTTP)
│   └── WMO_WeatherCode.kt      (Mapeamento WMO para ícones/descrições)
├── viewmodel/
│   └── WeatherViewModel.kt     (ViewModel com StateFlow)
└── ui/
    ├── WeatherUIState.kt       (Estado da UI)
    ├── WeatherScreen.kt        (WeatherUI, PortraitWeatherUI, LandscapeWeatherUI)
    ├── CoordinatesCard.kt      (Cartão de coordenadas)
    ├── WeatherCard.kt          (Cartão de dados meteorológicos)
    ├── WeatherRow.kt           (Linha individual de dado)
    └── theme/
        ├── Theme.kt
        ├── Color.kt
        └── Typography.kt
```

Foram aplicados os seguintes conceitos:

- **StateFlow + collectAsState** para observação reativa do estado da UI.
- **State Hoisting** para manter composables sem estado próprio (stateless).
- **Coroutines + viewModelScope** para operações assíncronas de rede.
- **Material Design 3** com tema personalizado (roxo primário `#6750A4`).

## ⚙️ 4. Implementation

### 4.1. Camada de Dados (`data`)

Foram criadas as classes `WeatherData`, `CurrentWeather` e `Hourly`, anotadas com `@Serializable` para integração com a biblioteca **Kotlin Serialization**. O `WeatherApiClient` utiliza o cliente **Ktor** com o plugin `ContentNegotiation` configurado para JSON, realizando um pedido `GET` à API Open-Meteo e desserializando automaticamente a resposta.

O ficheiro `WMO_WeatherCode.kt` inclui o enum `WMO_WeatherCode`, que mapeia os códigos meteorológicos WMO para ícones e descrições.

### 4.2. ViewModel (`viewmodel`)

O `WeatherUIState` é uma `data class` que encapsula todo o estado observável da UI: latitude, longitude, temperatura, velocidade e direção do vento, pressão ao nível do mar, código meteorológico, hora e indicador de dia/noite.

O `WeatherViewModel` expõe esse estado através de um `MutableStateFlow` privado e um `StateFlow` público (`uiState`). Disponibiliza os métodos `updateLatitude`, `updateLongitude` e `fetchWeather`, este último executado numa coroutine em `viewModelScope`, garantindo que a thread principal nunca é bloqueada.

### 4.3. Interface (`ui`)

A função composable `WeatherUI` é o ponto de entrada da interface. Obtém o `WeatherViewModel` via `viewModel()`, recolhe o estado com `collectAsState()` e delega a renderização para `PortraitWeatherUI` ou `LandscapeWeatherUI` consoante a orientação detetada pelo `LocalConfiguration`.

Os composables `CoordinatesCard`, `WeatherCard` e `WeatherRow` seguem o princípio de responsabilidade única e são reutilizados em ambas as orientações. O tema segue o **Material Design 3** com paleta roxa/lavanda.

### 4.4. Internacionalização

Todas as strings visíveis ao utilizador estão definidas em `res/values/strings.xml` (Inglês) e `res/values-pt/strings.xml` (Português). Não existem strings hardcoded nos ficheiros Kotlin da UI.

## 🔍 5. Testing and Validation

Os testes foram realizados utilizando o emulador Android:

- Verificou-se a alternância correta entre `PortraitWeatherUI` e `LandscapeWeatherUI` ao rodar o dispositivo.
- Testou-se a introdução de diferentes coordenadas e confirmou-se a atualização correta dos dados exibidos.
- Validou-se a alteração do idioma da app ao mudar as definições do sistema Android para Português.
- Confirmou-se compilação com sucesso através de `:app:compileDebugKotlin`.

## 📝 6. Usage Instructions

Para executar a aplicação:

- Abrir o projeto no **Android Studio** (recomendado: Hedgehog ou superior).
- Garantir que o **JDK 17** está configurado em `File > Project Structure > SDK Location`.
- Garantir que o emulador (AVD) ou dispositivo real tem ligação à internet.
- Executar `Sync Project with Gradle Files`.
- Executar a aplicação (`Shift + F10`).
- Introduzir as coordenadas desejadas nos campos de Latitude e Longitude.
- Premir o botão **Update Weather** / **Atualizar meteorologia**.

---

# Autonomous Software Engineering Sections

Esta secção não se aplica a este trabalho, uma vez que o enunciado indica explicitamente **AC YES**, **AI NO**.

---

# Development Process

## 📦 12. Version Control and Commit History

Foi utilizado o sistema de controlo de versões **Git** integrado no Android Studio. Os commits foram organizados por fase de desenvolvimento: estrutura MVVM e classes de dados, integração do cliente Ktor, construção da UI em Compose para portrait, adaptação para landscape, e por fim a internacionalização e polimento visual.

## 🌱 13. Difficulties and Lessons Learned

### 13.1 Dificuldades

Uma das principais dificuldades foi a configuração correta do plugin **Kotlin Serialization** no Gradle, nomeadamente garantir que o plugin `kotlin-serialization` estava declarado no `libs.versions.toml` e aplicado no `build.gradle.kts`. Outro desafio foi compreender o fluxo de dados unidirecional do MVVM.

A gestão das orientações em Compose também exigiu atenção: ao contrário dos layouts XML com pasta `layout-land`, em Compose a orientação é detetada em tempo de execução via `LocalConfiguration.current`.

### 13.2 Lições Aprendidas

- Arquitetura MVVM e separação de responsabilidades em Android.
- Programação reativa com `StateFlow` e `collectAsState`.
- Utilização de coroutines para operações de rede assíncronas.
- Construção de interfaces declarativas e adaptativas com Jetpack Compose.
- Serialização de JSON com Kotlin Serialization e Ktor.

## 🔧 14. Future Improvements

No futuro, o projeto poderia ser expandido com:

- Derivação automática do modo dia/noite a partir do campo `time` da API.
- Integração com o GPS do dispositivo para localização automática.
- Previsão para as próximas horas com visualização gráfica.
- Persistência das últimas coordenadas pesquisadas com DataStore.
- Testes unitários do `WeatherViewModel` com `kotlinx-coroutines-test`.

## ⚠️ 15. AI Usage Disclosure (Mandatory)

Conforme o enunciado da **Tutorial 3** (**AC YES**, **AI NO**): não foi utilizada assistência de **Inteligência Artificial** na elaboração do código nem deste relatório. O autocomplete do Android Studio foi utilizado apenas na medida permitida por **AC YES**.
