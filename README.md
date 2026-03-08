# Assignment Building a System Info App
[![Android Studio](https://img.shields.io/badge/IDE-Android%20Studio-green)](#) 
[![Kotlin](https://img.shields.io/badge/Language-Kotlin-orange)](#) 
[![Version](https://img.shields.io/badge/API-24%2B-blue)](#)

Course: Licenciatura em Engenharia Informática e Multimédia <br>
Student(s): 45123 <br>
Date: 08/03/2026 <br>
Repository URL: [Hello_World_Optional](https://github.com/A45123/Hello_World_Optional) <br>

---

## 📖 1. Introduction

O objetivo deste exercício é criar um aplicativo Android que exiba informações sobre o dispositivo atual usando um **MultiLine Text Widget**. O propósito é familiarizar-se com o objeto `android.os.Build` e aprender a extrair propriedades do sistema para exibição em uma interface gráfica simples.



## 🖥️ 2. System Overview

O aplicativo coleta informações do dispositivo, como modelo, fabricante, versão do Android e outras propriedades relevantes, e as apresenta em um único widget de texto multilinha. O principal caso de uso é permitir que usuários ou desenvolvedores visualizem rapidamente dados do sistema sem necessidade de ferramentas externas.



## 🏗️ 3. Architecture and Design

O aplicativo segue a arquitetura básica de **Activity** única:
- **Manifest**: declara a `MainActivity`, permissões e configurações do aplicativo.
- **MainActivity.kt**: contém a lógica principal para coletar e exibir informações do sistema.
- **activity_main.xml**: define a interface gráfica, incluindo o `TextView` multilinha.
- **Res/Values**: contém strings, cores, dimensões e temas do aplicativo.
- **Res/Drawable e Mipmap**: armazenam imagens e ícones usados na interface.

Decisões de design:
- Uso de **ConstraintLayout** para posicionamento flexível dos elementos.
- Strings externas em `strings.xml` para suporte à internacionalização.
- Diferenciação de layouts para retrato e paisagem.



## ⚙️ 4. Implementation

O aplicativo foi feito para mostrar informações do dispositivo em um **TextView** multilinha. A `MainActivity` pega dados do sistema, como fabricante, modelo e versão do Android, e os mostra na tela.

O layout usa **ConstraintLayout** para que o texto fique bem posicionado em retrato ou paisagem. Todos os textos ficam no `strings.xml` para facilitar mudanças e suporte a outros idiomas.

O foco foi criar um aplicativo simples, que mostre todas as informações do sistema de forma clara e fácil de ler.



## 🔍 5. Testing and Validation

- Testes realizados no **Pixel 9 Pro AVD**
- Verificação da informação do sistema.



## 📝 6. Usage Instructions

Requisitos: Android Studio, dispositivo ou emulador Android.

Passos:
- Abrir projeto no Android Studio.
- Compile e execute no dispositivo/emulador.
- O aplicativo exibirá informações do sistema no TextView multilinha.



---

# Autonomous Software Engineering Sections- only for [AC OK, AI OK] sections

Esta seção não foi preenchida porque o desenvolvimento do aplicativo não envolveu o uso de ferramentas de Inteligência Artificial. O projeto foi realizado integralmente de forma manual, utilizando apenas recursos do Android Studio e Auto Complete, sem suporte de agentes autônomos ou IA.

---

# Development Process

## 📦 12. Version Control and Commit History

O controle de versão foi realizado utilizando Git, porém, devido à conclusão do projeto em um único dia, apenas um commit contendo a versão final foi registrado.


## 🌱 13. Difficulties and Lessons Learned

### 13.1 Dificuldades

- O desenvolvimento do projeto ocorreu de forma tranquila e sem dificuldades significativas. Todas as etapas foram concluídas conforme planejado, permitindo aprender e aplicar os conceitos de criação de aplicativos Android com Kotlin de maneira clara e prática.


### 13.2 Lições Aprendidas

- Aprender a extrair informações corretas do android.os.Build.
- Configurar corretamente o TextView para multilinhas.



## 🔧 14. Future Improvements

- Adicionar botão para copiar informações para clipboard.
- Suporte a mais propriedades detalhadas do sistema, como CPU e RAM.



---



## ⚠️ 15. AI Usage Disclosure (Mandatory)

Nenhuma ferramenta de Inteligência Artificial foi utilizada durante o desenvolvimento deste projeto. Todo o código, configuração e implementação foram realizados manualmente pelo estudante com o auxilio da ferramenta de auto complete, garantindo que todo o conteúdo seja de autoria própria.


