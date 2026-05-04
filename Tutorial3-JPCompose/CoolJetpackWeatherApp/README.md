# Tutorial 3 - Cool Jetpack Weather App

[![Android Studio](https://img.shields.io/badge/IDE-Android%20Studio-green)](#)
[![Kotlin](https://img.shields.io/badge/Language-Kotlin-orange)](#)
[![Jetpack Compose](https://img.shields.io/badge/UI-Jetpack%20Compose-blue)](#)
[![Version](https://img.shields.io/badge/API-24%2B-blue)](#)

Course: Licenciatura em Engenharia Informatica e Multimedia <br>
Student(s): 45123 <br>
Date: 12/04/2026 <br>
Repository URL: [CoolJetpackWeatherApp](https://github.com/A45123/DAM/tree/main/Tutorial3-CoolJetpackWeatherApp) <br>

---

## 1. Introduction

O objetivo desta fase do trabalho foi a reconstrucao da **Cool Weather App** desenvolvida no tutorial anterior, adaptando-a para seguir a arquitetura **MVVM (Model-View-ViewModel)** e utilizando **Jetpack Compose** em substituicao dos layouts XML.

Durante o desenvolvimento, praticou-se a separacao de responsabilidades em camadas (`data`, `viewmodel`, `ui`), a gestao de estado com `StateFlow` e `collectAsState`, o consumo da API **Open-Meteo** com o cliente HTTP **Ktor**, e a serializacao de dados JSON com a biblioteca **Kotlin Serialization**.

## 2. System Overview

O projeto foi criado sob o nome **Cool Jetpack Weather App** e permite visualizar dados meteorologicos de qualquer localizacao mundial, atraves da introducao de coordenadas geograficas.

Os principais componentes e funcionalidades sao:

- **Arquitetura MVVM**: Separacao clara entre dados (`data`), logica de negocio (`viewmodel`) e interface (`ui`).
- **Interface em Jetpack Compose**: UI totalmente declarativa, sem ficheiros XML de layout.
- **Layouts Adaptativos**: Composables distintos para modo Portrait (`PortraitWeatherUI`) e Landscape (`LandscapeWeatherUI`).
- **Dados Meteorologicos**: Exibicao de temperatura, pressao ao nivel do mar, velocidade e direcao do vento, codigo meteorologico e hora.
- **Internacionalizacao**: Suporte a Ingles e Portugues via `strings.xml`.
- **Networking Assincrono**: Chamadas a API Open-Meteo executadas em coroutines, sem bloquear a thread principal.

## 3. Architecture and Design

O projeto segue a arquitetura **MVVM** recomendada pelo Android Jetpack, com tres pacotes principais:

```text
dam_a45123.cooljetpackweatherapp
├── MainActivity.kt
├── data/
│   ├── WeatherData.kt          (Classes de dados @Serializable)
│   ├── WeatherAPIClient.kt     (Cliente Ktor HTTP)
│   └── WMO_WeatherCode.kt      (Mapeamento de codigos meteorologicos para icones)
├── viewmodel/
│   └── WeatherViewModel.kt     (ViewModel com StateFlow)
└── ui/
    ├── WeatherUIState.kt       (Estado da UI)
    ├── WeatherScreen.kt        (WeatherUI, PortraitWeatherUI, LandscapeWeatherUI)
    ├── CoordinatesCard.kt      (Cartao de coordenadas)
    ├── WeatherCard.kt          (Cartao de dados meteorologicos)
    ├── WeatherRow.kt           (Linha individual de dado)
    └── theme/
        ├── Theme.kt
        ├── Color.kt
        └── Typography.kt
```

Foram aplicados os seguintes conceitos:

- **StateFlow + collectAsState** para observacao reativa do estado da UI.
- **State Hoisting** para manter composables sem estado proprio (stateless).
- **Coroutines + viewModelScope** para operacoes assincronas de rede.
- **Material Design 3** com tema personalizado.

## 4. Implementation

### 4.1. Camada de Dados (`data`)

Foram criadas as classes `WeatherData`, `CurrentWeather` e `Hourly`, anotadas com `@Serializable` para integracao com a biblioteca **Kotlin Serialization**. O `WeatherApiClient` utiliza o cliente **Ktor** com o plugin `ContentNegotiation` configurado para JSON, realizando um pedido `GET` a API Open-Meteo e desserializando automaticamente a resposta.

O ficheiro `WMO_WeatherCode.kt` inclui o enum `WMO_WeatherCode`, que mapeia os codigos meteorologicos WMO para icones e descricoes.

### 4.2. ViewModel (`viewmodel`)

O `WeatherUIState` e uma `data class` que encapsula o estado observavel da UI: latitude, longitude, temperatura, velocidade e direcao do vento, pressao ao nivel do mar, codigo meteorologico, hora e indicador de dia/noite.

O `WeatherViewModel` expoe esse estado atraves de um `MutableStateFlow` privado e um `StateFlow` publico (`uiState`). Disponibiliza os metodos `updateLatitude`, `updateLongitude` e `fetchWeather`, este ultimo executado numa coroutine em `viewModelScope`, garantindo que a thread principal nunca e bloqueada.

### 4.3. Interface (`ui`)

A funcao composable `WeatherUI` e o ponto de entrada da interface. Obtem o `WeatherViewModel` via `viewModel()`, recolhe o estado com `collectAsState()` e delega a renderizacao para `PortraitWeatherUI` ou `LandscapeWeatherUI` consoante a orientacao detetada pelo `LocalConfiguration`.

Os composables `CoordinatesCard`, `WeatherCard` e `WeatherRow` seguem o principio de responsabilidade unica e sao reutilizados em ambas as orientacoes.

### 4.4. Internacionalizacao

Todas as strings visiveis ao utilizador estao definidas em:

- `res/values/strings.xml` (Ingles)
- `res/values-pt/strings.xml` (Portugues)

## 5. Testing and Validation

Os testes foram realizados no emulador Android:

- Verificou-se a alternancia correta entre `PortraitWeatherUI` e `LandscapeWeatherUI` ao rodar o dispositivo.
- Testou-se a introducao de diferentes coordenadas e confirmou-se a atualizacao dos dados exibidos.
- Validou-se a alteracao do idioma da app ao mudar as definicoes do sistema Android para Portugues.
- Confirmou-se compilacao com sucesso em `:app:compileDebugKotlin`.

## 6. Usage Instructions

Para executar a aplicacao:

- Abrir o projeto no **Android Studio**.
- Garantir que o **JDK 17** esta configurado em `File > Project Structure > SDK Location`.
- Garantir que o emulador (AVD) ou dispositivo real tem ligacao a internet.
- Executar `Sync Project with Gradle Files`.
- Executar a aplicacao (`Shift + F10`).
- Introduzir as coordenadas desejadas nos campos de Latitude e Longitude.
- Premir o botao **Update Weather** / **Atualizar meteorologia**.

---

## Autonomous Software Engineering Sections

Esta secao nao se aplica a este trabalho, uma vez que o enunciado indica explicitamente **AC YES**, **AI NO**.

---

## 12. Version Control and Commit History

Foi utilizado o sistema de controlo de versoes **Git** integrado no Android Studio. Os commits foram organizados por fase de desenvolvimento: estrutura MVVM e classes de dados, integracao do cliente Ktor, construcao da UI em Compose para portrait, adaptacao para landscape, e por fim a internacionalizacao e polimento visual.

## 13. Difficulties and Lessons Learned

### 13.1 Dificuldades

Uma das principais dificuldades foi a configuracao correta do plugin **Kotlin Serialization** no Gradle, nomeadamente garantir que o plugin `kotlin-serialization` estava declarado no `libs.versions.toml` e aplicado no `build.gradle.kts`. Outro desafio foi compreender o fluxo de dados unidirecional do MVVM.

A gestao das orientacoes em Compose tambem exigiu atencao: ao contrario dos layouts XML com pasta `layout-land`, em Compose a orientacao e detetada em tempo de execucao via `LocalConfiguration.current`.

### 13.2 Licoes Aprendidas

- Arquitetura MVVM e separacao de responsabilidades em Android.
- Programacao reativa com `StateFlow` e `collectAsState`.
- Utilizacao de coroutines para operacoes de rede assincronas.
- Construcao de interfaces declarativas e adaptativas com Jetpack Compose.
- Serializacao de JSON com Kotlin Serialization e Ktor.

## 14. Future Improvements

No futuro, o projeto poderia ser expandido com:

- Melhor tratamento de erros de rede e mensagens de estado para o utilizador.
- Integracao com o GPS do dispositivo para localizacao automatica.
- Previsao para as proximas horas com visualizacao grafica.
- Persistencia das ultimas coordenadas pesquisadas com DataStore.
- Testes unitarios do `WeatherViewModel` com `kotlinx-coroutines-test`.

## 15. AI Usage Disclosure (Mandatory)

Conforme o enunciado da **Tutorial 3** (**AC YES**, **AI NO**): nao foi utilizada assistencia de **Inteligencia Artificial** na elaboracao do codigo nem deste relatorio. O autocomplete do Android Studio foi utilizado apenas na medida permitida por **AC YES**.
