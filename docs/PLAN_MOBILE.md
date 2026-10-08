# Plano de scaffolding — Click S.O.S Mobile em Kotlin

## Objetivo

Criar somente a fundação técnica do aplicativo Android nativo. Ao clonar este repositório, uma pessoa desenvolvedora deve conseguir abrir o projeto no Android Studio, compilar, executar uma tela inicial, navegar por placeholders, testar e seguir as convenções do projeto.

Este plano **não implementa nenhuma funcionalidade do produto**. Mapa, botão S.O.S funcional, autenticação, contatos, localização, backend, WhatsApp e seus contratos pertencem aos épicos funcionais posteriores.

## Decisões técnicas do scaffold

| Item | Decisão |
| --- | --- |
| Linguagem e UI | Kotlin + Jetpack Compose + Material 3 |
| Módulo inicial | Um módulo `app` |
| `namespace` e `applicationId` | `br.edu.fmu.clicksos` |
| `minSdk` | 26 (Android 8.0) |
| `compileSdk` e `targetSdk` | 36 (Android 16) |
| Build | Gradle Kotlin DSL e Gradle Wrapper versionado |
| Arquitetura base | ViewModel, estado de UI imutável e `StateFlow` |
| IDE recomendada | Android Studio |

> `click-sos-fmu` não é um `applicationId` válido porque contém hífens. O identificador definido é tecnicamente válido. Antes de publicar, a equipe deve confirmar a autorização para usar a identidade `fmu`.

## Fora de escopo

Não realizar nenhuma das ações abaixo neste plano:

- Adicionar Google Maps, Retrofit, OkHttp, Fused Location Provider, WhatsApp ou bibliotecas específicas de funcionalidades.
- Solicitar permissões do Android, inclusive localização.
- Criar chamadas HTTP, modelos de API, armazenamento de token ou contratos backend.
- Criar telas funcionais de login, contatos, mapa, feedback ou S.O.S.
- Abrir links externos, enviar mensagens, persistir dados de pessoas usuárias ou usar segredos.

## Etapa 1 — Preparar o ambiente de desenvolvimento

1. Instalar Android Studio com Android SDK Platform 36, Build Tools 36.x e JDK compatível com o Android Gradle Plugin.
2. Criar um Android Virtual Device (AVD) ou preparar um aparelho físico com depuração USB.
3. Garantir Git instalado e acesso ao repositório.
4. Abrir o Android Studio e verificar que o SDK e um destino Android estão disponíveis.

**Pronto quando:** Android Studio consegue criar ou abrir projetos Android e há um emulador ou aparelho para execução.

## Etapa 2 — Criar o projeto Android mínimo

1. Criar o projeto Kotlin com `namespace` e `applicationId` `br.edu.fmu.clicksos`.
2. Definir `minSdk = 26`, `compileSdk = 36` e `targetSdk = 36`.
3. Habilitar Jetpack Compose e Material 3.
4. Manter uma `MainActivity` e uma tela inicial estática com o nome do projeto.
5. Gerar e versionar o Gradle Wrapper (`gradlew`, `gradlew.bat` e `gradle/wrapper/`), arquivos Gradle Kotlin DSL, catálogo de versões e `.gitignore` Android.
6. Executar o projeto em emulador ou aparelho.

**Pronto quando:** um clone limpo compila e abre uma tela inicial, sem permissões, rede, persistência ou integração externa.

## Etapa 3 — Criar a estrutura de código vazia

1. Criar `app/` para configuração da aplicação, tema e navegação.
2. Criar `core/` para utilitários, erros e componentes compartilhados futuros.
3. Criar `features/` com diretórios vazios para `sos`, `mapa`, `contatos`, `autenticacao` e `perfil`.
4. Criar `data/`, `domain/` e `location/` somente como pontos de extensão vazios; não adicionar modelos, clientes ou lógica.
5. Criar `ui/` e `ui/theme/` para componentes básicos, cores, tipografia e tema.
6. Criar as pastas de teste unitário (`src/test/`) e instrumentado (`src/androidTest/`).

**Pronto quando:** a organização futura do código estiver clara, sem qualquer regra de negócio ou implementação de funcionalidade.

## Etapa 4 — Criar shell de navegação e placeholders

1. Configurar Navigation Compose apenas para rotas internas vazias.
2. Criar os destinos `Início`, `Mapa`, `Contatos`, `Perfil` e `Sobre` como telas placeholder estáticas.
3. Exibir em cada tela um texto explícito informando que a funcionalidade será implementada em um épico posterior.
4. Usar uma barra de navegação básica e textos em português.
5. Não criar botão S.O.S, formulário, mapa, permissões, estado remoto ou comportamento de produto.

**Pronto quando:** uma pessoa consegue navegar entre placeholders sem dados, efeitos externos ou código de funcionalidade.

## Etapa 5 — Preparar configuração local segura

1. Ignorar `local.properties`, arquivos de ambiente, chaves e arquivos de configuração individuais no Git.
2. Criar um arquivo de exemplo sem segredo, como `secrets.properties.example`, apenas com comentários que reservem futuras chaves e URLs.
3. Documentar no README que valores reais só serão necessários nos épicos funcionais.
4. Confirmar que não há token, telefone, URL privada, credencial ou chave de API no repositório.

**Pronto quando:** a estrutura de configuração existe sem exigir nem expor segredos.

## Etapa 6 — Qualidade mínima

1. Manter o teste unitário inicial e criar um teste Compose para a tela inicial.
2. Configurar `ktlint` e/ou `detekt`; registrar a escolha no README.
3. Criar um hook pre-commit com as verificações locais viáveis.
4. Rodar `./gradlew assembleDebug`, `./gradlew testDebugUnitTest` e `./gradlew lintDebug`.
5. Rodar testes instrumentados quando houver emulador ou aparelho disponível.

**Pronto quando:** o build, a análise e os testes básicos puderem ser repetidos por qualquer pessoa que clonou o repositório.

## Etapa 7 — Documentar o onboarding

1. Criar `README.md` na raiz do repositório.
2. Explicar pré-requisitos, instalação do Android Studio/SDK, criação de emulador e abertura do projeto.
3. Documentar os comandos abaixo e o equivalente Windows (`gradlew.bat`):

```bash
./gradlew assembleDebug
./gradlew testDebugUnitTest
./gradlew connectedDebugAndroidTest
./gradlew lintDebug
```

4. Ligar para este plano, as [regras de negócio](https://github.com/click-sos-lab-de-software-e-projetos/backend/blob/main/docs/business-rules.html), os [épicos mobile](https://github.com/click-sos-lab-de-software-e-projetos/backend/blob/main/docs/mobile-epic.html) e o [wire do Figma](https://www.figma.com/design/h734YniK76hrEmDHggdqls/Sem-t%C3%ADtulo?node-id=0-1&t=mcGYlC1oaziyuPCX-1).
5. Declarar expressamente todo o escopo ainda não implementado.

**Pronto quando:** uma pessoa nova consegue preparar e executar o projeto apenas com o clone e o README.

## Etapa 8 — Revisar o clone limpo

1. Conferir que `README.md`, `docs/PLAN_MOBILE.md`, Gradle Wrapper, catálogo de versões, `.gitignore`, configuração de lint e testes estão versionados.
2. Clonar ou testar em uma cópia limpa, sincronizar o Gradle, compilar e executar o app.
3. Abrir todos os placeholders e confirmar a ausência de funcionalidades do produto.
4. Conferir `git status` para verificar que arquivos locais e segredos não serão enviados.
5. Trabalhar em uma branch por ticket e abrir Pull Request antes de integrar na `main`.

**Pronto quando:** o repositório fornece uma base Android reprodutível e segura, pronta para receber implementações futuras.

## Próxima etapa

Somente após este scaffold, executar os épicos funcionais de botão S.O.S e mapa de risco descritos na documentação mobile. As perguntas abertas permanecem necessárias para essas implementações, mas não para este plano.
