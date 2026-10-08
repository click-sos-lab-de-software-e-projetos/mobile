# Click S.O.S Mobile

Aplicativo Android nativo do Click S.O.S, desenvolvido em Kotlin e Jetpack Compose.

Este repositório começa com um scaffold: ele compila, possui navegação placeholder e estabelece convenções de qualidade. Mapa, autenticação, contatos, localização, integração backend e S.O.S real serão implementados em épicos posteriores.

O projeto usa `applicationId` `br.edu.fmu.clicksos`, `minSdk` 26 e `compileSdk`/`targetSdk` 36.

## Requisitos

- Android Studio com JDK 17 ou superior compatível.
- Android SDK Platform 36 e Build Tools 36.x.
- Um emulador Android ou aparelho com depuração USB.
- Git.

## Abrir e executar

1. Clone o repositório.
2. Abra a pasta no Android Studio e aceite a sincronização Gradle.
3. Escolha um emulador ou aparelho.
4. Clique em **Run** ou execute:

```bash
./gradlew assembleDebug
./gradlew installDebug
```

No Windows, substitua `./gradlew` por `gradlew.bat`.

## Verificações locais

```bash
./gradlew testDebugUnitTest
./gradlew connectedDebugAndroidTest
./gradlew lintDebug
./gradlew ktlintCheck
```

`connectedDebugAndroidTest` exige emulador ou aparelho conectado. O hook de pre-commit usa as verificações que não dependem de dispositivo.

Ative o hook uma vez após o clone:

```bash
git config core.hooksPath .githooks
```

## Configuração local

`local.properties` contém somente a localização do Android SDK e nunca deve ser versionado. Valores futuros, como chave do Maps e URLs de ambiente, terão exemplos em `secrets.properties.example`; nenhum segredo deve entrar no Git.

## Documentação

- [Plano de scaffolding](docs/PLAN_MOBILE.md)
- [Regras de negócio](https://github.com/click-sos-lab-de-software-e-projetos/backend/blob/main/docs/business-rules.html)
- [Épicos mobile](https://github.com/click-sos-lab-de-software-e-projetos/backend/blob/main/docs/mobile-epic.html)
- [wire do figma](https://www.figma.com/design/h734YniK76hrEmDHggdqls/Sem-t%C3%ADtulo?node-id=0-1&t=mcGYlC1oaziyuPCX-1)

## Convenções

Trabalhe em uma branch por ticket e abra Pull Request antes de integrar na `main`. Não versione chaves, tokens, números de telefone ou localizações reais.
