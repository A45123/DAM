# Assignment Tutorial 3 - Annotation Processor
[![IDE](https://img.shields.io/badge/IDE-IntelliJ%20IDEA-purple)](#)
[![Kotlin](https://img.shields.io/badge/Language-Kotlin-orange)](#)
[![Build](https://img.shields.io/badge/Build-Gradle-blue)](#)

Course: Licenciatura em Engenharia Informática e Multimédia <br>
Student(s): 45123 <br>
Date: 02/05/2026 <br>
Repository URL: [GreetingProcessorProject](#) <br>

---

## 📖 1. Introduction

O objetivo deste trabalho foi explorar o mecanismo de **annotation processing** em Kotlin, com foco na geração de código em tempo de compilação.  
Foi desenvolvido um processador personalizado que interpreta a anotacao `@Greeting` e gera automaticamente classes wrapper para invocar metodos anotados com uma mensagem previa.

Este exercicio demonstra como automatizar tarefas repetitivas, reduzir boilerplate e introduzir uma abordagem mais declarativa no desenvolvimento Kotlin.

## 🖥️ 2. System Overview

O projeto foi implementado como uma solucao **multi-modulo** com tres componentes principais:

- **annotations**: define a anotacao `@Greeting`.
- **processor**: implementa o `GreetingProcessor` usando `AutoService` e `KotlinPoet`.
- **app**: consome a anotacao e executa o codigo gerado.

Fluxo geral:
1. O modulo `app` marca metodos com `@Greeting("mensagem")`.
2. O modulo `processor` deteta essas anotacoes durante compilacao.
3. E gerada uma classe `<ClasseOriginal>Wrapper` com metodos equivalentes.
4. Cada metodo gerado imprime a mensagem e delega a chamada para o metodo original.

## 🏗️ 3. Architecture and Design

Estrutura principal:

```text
GreetingProcessorProject
├── annotations/
│   └── src/main/kotlin/annotations/Greeting.kt
├── processor/
│   └── src/main/kotlin/processor/GreetingProcessor.kt
└── app/
    └── src/main/kotlin/com/example/app/
        ├── MyClass.kt
        └── Main.kt
```

Conceitos aplicados:
- `@Target(AnnotationTarget.FUNCTION)` para restringir uso a funcoes.
- `@Retention(AnnotationRetention.SOURCE)` para uso exclusivo em compilacao.
- `AbstractProcessor` para processar anotacoes.
- `KotlinPoet` para gerar codigo Kotlin de forma segura e estruturada.
- Composicao no wrapper (`original: MyClass`) para delegacao de comportamento.

## ⚙️ 4. Implementation

### 4.1. Exercicio 1 - Configuracao Multi-Modulo

Foram criados os modulos `annotations`, `processor` e `app`, com configuracao Gradle especifica:
- `kotlin("jvm")` em todos os modulos.
- `kotlin("kapt")` em `processor` e `app`.
- dependencia entre modulos via `implementation(project(":annotations"))`.
- processador ligado no `app` via `kapt(project(":processor"))`.

Tambem foi adicionada a propriedade:

```properties
kapt.include.compile.classpath=false
```

### 4.2. Exercicio 2 - Criacao da Anotacao

No modulo `annotations`, foi criada a anotacao:

- `@Greeting(val message: String)`

Esta anotacao recebe a mensagem que sera impressa antes da execucao do metodo original.

### 4.3. Exercicio 3 - Annotation Processor

No modulo `processor`, foi implementada a classe `GreetingProcessor`:

- identifica todos os metodos anotados com `@Greeting`;
- agrupa os metodos por classe envolvente;
- gera uma classe wrapper por classe original;
- cria metodos wrapper com a mesma assinatura;
- imprime a mensagem da anotacao e chama `original.metodo(...)`.

Exemplo de comportamento gerado:
- `println("Hello from MyClass!")`
- `original.sayHello()`

## 🔍 5. Testing and Validation

Validacao funcional esperada no modulo `app`:

- classe `MyClass` com metodos anotados (`sayHello`, `compute`);
- classe gerada automaticamente `MyClassWrapper`;
- execucao de `Main.kt` para chamar os metodos do wrapper.

Saida esperada em consola:

```text
Hello from MyClass!
Executing sayHello method
Welcome to the compute function!
Computing something important...
```

## 📝 6. Usage Instructions

Para executar o projeto:

1. Abrir o projeto no IntelliJ IDEA.
2. Garantir JDK 17+ (recomendado JDK 23, conforme configuracao `jvmToolchain(23)`).
3. Sincronizar Gradle.
4. Confirmar que Annotation Processing esta ativo no IntelliJ:
   - `File -> Settings -> Build, Execution, Deployment -> Compiler -> Annotation Processors`
   - ativar `Enable annotation processing`
5. Executar:
   - `./gradlew clean :app:run` (Linux/macOS)  
   - `.\gradlew clean :app:run` (Windows PowerShell)

---

# Autonomous Software Engineering Sections

Esta secao nao se aplica a este trabalho, uma vez que o enunciado indica explicitamente **AC NO** e **AI NO**.

---

# Development Process

## 📦 12. Version Control and Commit History

O desenvolvimento foi organizado por fases:
- configuracao inicial da estrutura multi-modulo;
- implementacao da anotacao e do processador;
- criacao da app de demonstracao e validacao do codigo gerado.

## 🌱 13. Difficulties and Lessons Learned

### 13.1 Dificuldades

- Configuracao correta de `kapt` entre modulos para que o processador fosse executado no `app`.
- Garantir a escrita do codigo gerado no diretorio correto (`kapt.kotlin.generated`).
- Manter assinaturas de metodos ao gerar wrappers com parametros.

### 13.2 Licoes Aprendidas

- Funcionamento do pipeline de compilacao com annotation processing.
- Separacao de responsabilidades entre modulo de anotacoes e modulo de processamento.
- Uso de `KotlinPoet` para gerar codigo Kotlin limpo e consistente.

## 🔧 14. Future Improvements

Melhorias possiveis:
- suportar metodos com tipo de retorno (incluindo `return` no wrapper);
- validar e reportar erros mais detalhados para uso incorreto da anotacao;
- gerar wrappers em packages dedicados para organizacao de codigo gerado;
- adicionar testes automatizados para o processador.

---

## ⚠️ 15. AI Usage Disclosure (Mandatory)

De acordo com as instrucoes do enunciado, o trabalho deve ser desenvolvido com **AC NO** e **AI NO**.  
Esta restricao deve ser respeitada na entrega oficial.
