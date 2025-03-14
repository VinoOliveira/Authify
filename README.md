# Authify - API de Autenticação com Spring Boot e JWT

## Descrição
Authify é uma API RESTful de autenticação de usuários, construída com Spring Boot, Spring Security e JWT (JSON Web Token). O principal objetivo é fornecer uma plataforma segura e escalável para autenticação sem estado. A aplicação utiliza BCrypt para criptografar as credenciais dos usuários e MySQL como banco de dados relacional para armazenar dados de autenticação.

## Tecnologias Utilizadas
- **Spring Boot**: Framework para desenvolvimento rápido de aplicações Java.
- **Spring Security**: Framework especializado em autenticação e controle de acesso.
- **JWT (JSON Web Token)**: Tecnologia para autenticação sem estado.
- **MySQL**: Banco de dados relacional utilizado para persistência de dados.
- **BCrypt**: Algoritmo de criptografia para garantir a segurança das senhas dos usuários.
- **Maven**: Gerenciador de dependências e ferramenta para automação de builds.

## Status do Projeto
O projeto está 100% funcional, com a implementação de registro, login e autenticação via JWT. Algumas melhorias e ajustes específicos estão planejados, como:

- Melhorar a gestão de tokens expirados.
- Adicionar controle de falhas na autenticação.

## Endpoints da API

### Autenticação (`/auth`)
#### Registrar Usuário  
**Método**: `POST /auth/register`  
Esse endpoint permite registrar um novo usuário no sistema. O cadastro exige um email, senha e o papel do usuário (ADMIN ou USER).  
**Requisição**:
```json
{    
  "email": "usuario@email.com",  
  "password": "senhaSegura123"
  "role": "ADMIN"
}
```
#### Login 
**Método**: `POST /auth/login`  
Esse endpoint autentica o usuário e retorna um token JWT, que será usado nas requisições subsequentes.  
**Requisição**:
```json
{    
  "email": "usuario@email.com",  
  "password": "senhaSegura123"  
}
```
##### Resposta de Sucesso:
```json
{    
  "token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJhdXRoaWZ5Iiwic3ViIjoidXN1YXJpb0BlbWFpbC5jb20iLCJleHAiOjE3NDE5MzExNzV9.AWWgewOs0-2kO_I01g4nyEk84sUbduDVNICEcdCaoC8"
}
```

#### Lista de Usuários Cadastrados
**Método**: `GET/user`  
Este endpoint retorna uma lista de todos os usuários cadastrados no sistema. Para acessá-lo, o usuário precisa ser um ADMIN e deve fornecer o token JWT de autenticação no cabeçalho da solicitação.  
```
Authorization: Bearer <token_jwt>
```
Resposta de Sucesso:  
```json
[
  {
    "id": 1,
    "nome": "João Silva",
    "email": "joao.silva@email.com",
    "role": "ADMIN",
    "data_criacao": "2023-01-15T10:00:00Z"
  },
  {
    "id": 2,
    "nome": "Maria Oliveira",
    "email": "maria.oliveira@email.com",
    "role": "USER",
    "data_criacao": "2023-02-05T14:30:00Z"
  }
]
```

---

### Status de Resposta :
- 200 OK: A requisição foi bem-sucedida.
- 401 Unauthorized: O token de autenticação não foi fornecido ou é inválido.
- 403 Forbidden: O usuário não tem permissões suficientes (não é ADMIN).
- 500 Internal Server Error: Erro interno no servidor ao processar a requisição.

## Como Configurar o Projeto

1. **Clonar o Repositório**: 
   Clone o repositório do projeto para sua máquina local.

2. **Criar o Banco de Dados**:
   Crie um banco de dados no MySQL com o nome `authify_db`.

3. **Configurar o Banco de Dados no `application.properties`**:
   No arquivo `src/main/resources/application.properties`, configure a URL, o usuário e a senha do seu banco de dados MySQL:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/authify_db
   spring.datasource.username=SEU_USUARIO
   spring.datasource.password=SUA_SENHA
   spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect

