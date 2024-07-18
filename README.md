# Projeto de Envio de E-mails usando SES da Amazon

Este projeto é uma aplicação Java que utiliza o Amazon SES para enviar e-mails aos usuários.

## Arquitetura

O projeto segue uma arquitetura limpa, dividida em camadas principais:

### 1. Core

- **EmailSenderUseCase:** Representa as regras de negócio

### 2. Application

- **EmailSenderService:** Aplica nosso core.
- 
### 3. Adapters

- **Interfaces:** Define contratos para interações externas, como integrações com o Amazon SES.
- **Implementações:** Concretiza as interfaces para realizar a integração com o SES da Amazon.

### 4. Infraestrutura

- **Configuração:** Classes de configuração para inicialização do aplicativo.
- **Gerenciamento de Erros:** Tratamento de exceções e erros.

## Como Usar

1. Clone o repositório.
2. Configure as credenciais do Amazon SES no arquivo de configuração.
3. Execute a aplicação.



