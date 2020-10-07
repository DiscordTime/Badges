# Badges
- Study project - AAD

Criar um app que contém um sistema de reward (badges) para pessoas da empresa.

*obs: Não precisa implementar todas as funcionalidades, porém se implementadas 100%, todos os assuntos serão englobados*

O sistema deve conter: 

1. Uma lista de pessoas 
2. Uma tela de perfil (a pessoa e seus badges)
3. Uma lista de badges
4. Tela de detalhes do badge
5. Tela de Settings

O app vai ser simplificado para se adequar aos requisitos do AAD, mas no futuro pode ser feito um *refactoring* para utilizarmos em qualquer projeto e no CESAR.

#### Feature 1

Criar uma lista de usuários do app. Essa lista vai ser a a tela **secundária** contendo uma foto do usuário + nome + nome do projeto. 

#### Feature 2

A tela de perfil deve conter a foto do usuário em tamanho maior, seu nome e os badges.

*obs: Cada usuário deve possuir: Id (opcional), Nome e Lista de ícones dos **Badges**.*

#### Feature 3

Criar uma lista de badges que vai ter o ícone do badge, a raridade e o nome. Essa vai ser a tela **principal**.

####  Feature 4

Quando clicar no badge ele vai ser levado para a Tela de detalhes do badge. Essa tela deve conter a foto do badge, o nome, a raridade, a descrição e os requisitos. 

*obs: Cada badge deve possuir: Id, Nome, Categoria, raridade, descrição, foto e Requisitos*

### Utilizando os requisitos do AAD para desenvolvimento do app.

Não precisa utilizar todos, mas tentar sempre adicionar o máximo de tópicos que der.

#### Requisitos - Core

- Toasts / Snackbar
- Permissions
- AndroidX
- Notifications
- JobScheduler
- WorkManager
- KTX

#### Recomendações:

Estudar pelos codelabs: https://developers.google.com/certification/associate-android-developer/study-guide/android-core

- Dicas para usar alguns componentes: 

Criar na tela de settings uma opção que vai baixar (Permissions) novos badges apenas quando o usuário estiver no wifi (JobScheduler) e notificá-lo (Notifications). Salvar preferências de usuário no SharedPreferences (pode usar o KTX aqui). Baixar periodicamente a lista de badges (WorkManager) e salvar elas local 

#### Requisitos - UI

- Constraint Layout
- Nav drawer
- Styles/ Themes/ Strings/ Colors
- RecyclerView

#### Recomendações:

Estudar pelos codelabs: https://developers.google.com/certification/associate-android-developer/study-guide/user-interface

#### Requisitos  - Data Management

- Room
- LiveData
- ViewModel
- Repository
- SharedPreferences

#### Recomendações:

Estudar pelos codelabs: https://developers.google.com/certification/associate-android-developer/study-guide/data-management

Dicas para usar alguns componentes:

Criar o app utilizando o padrão MVVM - Model - View - ViewModel onde o ViewModel vai utilizar a classe **ViewModel** do Android e os settings / dados serão salvos no SQLite (**Room**). As credenciais ou preferências podem ser salvas no **SharedPreferences** e a lista de dados retornar um **LiveData** de dados para ser observado pela UI

#### Requisitos - QA

- Testes Unitários 
- Testes Instrumentais
- Log em tudo! 

#### Recomendações:

Codelabs:

https://developers.google.com/certification/associate-android-developer/study-guide/debugging

https://developers.google.com/certification/associate-android-developer/study-guide/testing



### Telas

Foto para se basear em telas de listas e telas de detalhe:

// TODO
