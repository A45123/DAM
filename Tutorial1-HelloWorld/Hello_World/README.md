# Assignment Building Your First Android App
[![Android Studio](https://img.shields.io/badge/IDE-Android%20Studio-green)](#) 
[![Kotlin](https://img.shields.io/badge/Language-Kotlin-orange)](#) 
[![Version](https://img.shields.io/badge/API-24%2B-blue)](#)

Course: Licenciatura em Engenharia Informática e Multimédia <br>
Student(s): 45123 <br>
Date: 08/03/2026 <br>
Repository URL: [Hello_World](https://github.com/A45123/DAM/tree/main/Tutorial1-HelloWorld/Hello_World) <br>

---

## 📖 1. Introduction

Este trabalho descreve o desenvolvimento do primeiro aplicativo Android `“Hello Mobile World”` utilizando Kotlin e Android Studio. O objetivo é aprender a criar um projeto Android básico, compreender a estrutura de arquivos gerada automaticamente pelo IDE e implementar elementos de interface gráfica como `TextView`, `ImageView` e `CalendarView`. O exercício inclui melhorias na interface e testes em emulador.



## 🖥️ 2. System Overview

O sistema é um aplicativo Android simples com uma tela principal (`MainActivity`) exibindo textos, imagens e um calendário. Ele serve como introdução à programação Android, fornecendo prática com:
- Criação de novos projetos no Android Studio
- Configuração de nomes, pacotes e nível mínimo de API
- Manipulação de recursos (`res/layout`, `res/drawable`, `res/values`)
- Layouts responsivos e suporte a orientação paisagem



## 🏗️ 3. Architecture and Design

O aplicativo segue a arquitetura básica de Activity única:
- **Manifest**: declara `MainActivity`, permissões e configurações do aplicativo
- **MainActivity.kt**: contém a lógica principal
- **activity_main.xml**: define a interface gráfica
- **Res/Values**: strings, cores, dimensões e temas
- **Res/Drawable e Mipmap**: imagens e ícones

Decisões de design:
- Uso de `ConstraintLayout` para posicionamento flexível dos elementos
- Strings externas em `strings.xml` para suporte à internacionalização
- Diferenciação de layouts para retrato e paisagem



## ⚙️ 4. Implementation

### 4.1. Create a “Hello Mobile World” Application

O primeiro passo foi criar o projeto **Empty Views Activity** no Android Studio, utilizando **Kotlin** como linguagem de programação. O pacote definido foi `dam_a45123.helloworld` e a API mínima escolhida foi a 24 (Android 7.0).

A estrutura do projeto inclui: `MainActivity.kt` para a lógica da aplicação, `activity_main.xml` para o layout da interface, além das pastas de recursos `res/values` e `res/drawable`.

O `TextView` principal foi configurado para exibir a mensagem "Hello Android World", utilizando o arquivo `strings.xml` para facilitar futuras alterações e internacionalização:

```xml
<string name="hello_string">Hello Android World</string>
```

O aplicativo foi testado no emulador Pixel 9 Pro AVD, garantindo que a mensagem fosse exibida corretamente.
<br>

### 4.2. Improve your application – Hello World V2

Para aprimorar a aplicação, foram realizadas as seguintes alterações:
- O nome do aplicativo foi alterado para **Hello World V2**.
- O `TextView` principal foi reposicionado no topo da tela e ajustado em termos de cor, tamanho e estilo da fonte.
- Um segundo `TextView` foi adicionado com a mensagem "My First App", garantindo alinhamento e dimensões corretas:

  - ```xml
    <string name="my_first_app">My First App</string>
    ```
    
- Inseriu-se uma **ImageView** com a imagem `smileygood`, acompanhada de uma descrição alternativa para acessibilidade:

  - ```xml
    <string name="image_desc">Just smile</string>
    ```
    
- Um **CalendarView** foi adicionado, e um layout alternativo para orientação paisagem foi criado.
- O ícone do aplicativo também foi configurado.

Após essas melhorias, a aplicação foi novamente testada no emulador, confirmando que todos os elementos e o layout funcionam corretamente e de forma consistente.


## 🔍 5. Testing and Validation

- Testes realizados no **Pixel 9 Pro AVD**
- Verificação de elementos gráficos, textos e imagens
- Mudanças em strings refletidas corretamente após execução
- Layouts testados em retrato e paisagem



## 📝 6. Usage Instructions

- Abrir projeto no **Android Studio**
- Selecionar AVD ou conectar dispositivo físico
- Executar com **Run** > **Run 'app'** ou botão verde



---

# Autonomous Software Engineering Sections- only for [AC OK, AI OK] sections

Esta seção não foi preenchida porque o desenvolvimento do aplicativo não envolveu o uso de ferramentas de Inteligência Artificial. O projeto foi realizado integralmente de forma manual, utilizando apenas recursos do Android Studio e Auto Complete, sem suporte de agentes autônomos ou IA.

---

# Development Process

## 📦 12. Version Control and Commit History

O controle de versão foi realizado utilizando Git, porém, devido à conclusão do projeto em um único dia, apenas um commit contendo a versão final foi registrado.



## 🌱 13. Difficulties and Lessons Learned

### 13.1 Dificuldades

O desenvolvimento do projeto ocorreu de forma tranquila e sem dificuldades significativas. Todas as etapas foram concluídas conforme planejado, permitindo aprender e aplicar os conceitos de criação de aplicativos Android com Kotlin de maneira clara e prática.



### 13.2 Lições Aprendidas

- Experiência prática com `TextView`, `ImageView` e `CalendarView`.
- Aprendizado sobre o uso de `ConstraintLayout` para layouts responsivos.
- Aplicação de boas práticas como strings externas para internacionalização e layouts diferenciados para retrato e paisagem.



## 🔧 14. Future Improvements

- Adicionar interação com botões e eventos do usuário
- Layouts mais avançados

---

## ⚠️ 15. AI Usage Disclosure (Mandatory)

Nenhuma ferramenta de Inteligência Artificial foi utilizada durante o desenvolvimento deste projeto. Todo o código, configuração e implementação foram realizados manualmente pelo estudante com o auxilio da ferramenta de auto complete, garantindo que todo o conteúdo seja de autoria própria.


