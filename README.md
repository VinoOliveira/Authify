# Authify - API de Autenticação com Spring Boot e JWT

## Descrição
**Authify** é uma API RESTful de autenticação de usuários, desenvolvida com **Spring Boot**, **Spring Security** e **JWT (JSON Web Token)**. O objetivo principal é criar uma plataforma segura e escalável para autenticação sem estado, com armazenamento seguro das credenciais dos usuários usando **BCrypt** e **MySQL** como banco de dados.

## Tecnologias Utilizadas
- **Spring Boot**: Framework para criar aplicações Java rápidas e simples.
- **Spring Security**: Framework de segurança para autenticação e controle de acesso.
- **JWT (JSON Web Token)**: Implementação para autenticação sem estado.
- **MySQL**: Banco de dados relacional para persistência de dados.
- **BCrypt**: Algoritmo de criptografia para senhas seguras.
- **Maven**: Gerenciador de dependências e automação de builds.

## Status do Projeto
Atualmente, o projeto está em fase inicial de configuração, com a estrutura básica já configurada:
- Integração com **MySQL**.
- **Spring Security** configurado para autenticação.
- Dependências para **JWT** já adicionadas.

## Estrutura do Projeto

- **src/**
  - **main/**
    - **java/**
      - **com/vino/authify/**
        - **controller/**: Contém os controladores que gerenciam as requisições HTTP, como login e registro.
        - **model/**: Contém as classes de modelo, como o `User`, que representam os dados persistidos no banco de dados.
        - **repository/**: Contém interfaces de repositório, como `UserRepository`, para interação com o banco de dados (JPA).
        - **service/**: Contém a lógica de negócios, incluindo o serviço de autenticação e gestão de tokens JWT.
        - **security/**: Contém a configuração de segurança, como as classes para configurar o Spring Security, filtros JWT, e autenticação personalizada.
    - **resources/**: Contém arquivos de configuração da aplicação, como `application.properties`.
  - **test/**
    - **java/com/seuusuario/authify/**: Contém os testes de integração e unitários para a API.
    - **AuthifyApplicationTests.java**: Arquivo de testes iniciais, configurados para verificar a integração básica da aplicação.

## Instalação e Execução

1. **Clone o repositório**:
    ```bash
    git clone https://github.com/seuusuario/authify.git
    ```

2. **Configure o banco de dados MySQL**:
    - Crie um banco de dados no MySQL chamado `authify_db` e configure as credenciais no arquivo `application.properties`.

3. **Execute o projeto**:
    - Abra o projeto no seu IDE (por exemplo, IntelliJ ou Eclipse) ou execute via terminal com Maven:
    ```bash
    mvn spring-boot:run
    ```

4. **Testando a API**:
    - A API estará disponível em `http://localhost:8080`. Em breve, endpoints de login, registro e autenticação via JWT serão implementados.

## Próximos Passos
- **Implementação de endpoints de autenticação**: Login e geração de JWT.
- **Configuração de segurança**: Garantir que os endpoints sejam protegidos por autenticação JWT.
- **Testes**: Escrever testes unitários e de integração para os endpoints.
- **Documentação**: Continuar a documentação conforme a implementação dos endpoints.
