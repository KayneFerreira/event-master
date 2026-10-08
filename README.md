# Event Master API

API REST para gerenciamento e agendamento de eventos públicos e privados, desenvolvida em Java com Spring Boot e arquitetura orientada a domínio (DDD).

## Tecnologias e Ferramentas

- **Linguagem:** Java
- **Framework Principal:** Spring Boot
- **Persistência de Dados:** Spring Data JPA / Hibernate
- **Bancos de Dados:** H2 (Desenvolvimento/Testes) & SQL
- **Mapeamento de Objetos:** MapStruct (DTOs ↔ Domain Entities)
- **Gerenciador de Dependências:** Apache Maven

## Arquitetura e Padrões

O projeto adota os princípios do **Domain-Driven Design (DDD)** para separação clara de responsabilidades:

- **Domain Layer:** Regras de negócio centrais, entidades e validações customizadas (ex: validação de CPF).
- **Application / Use Cases:** Encapsulamento das regras de aplicação e fluxos de execução.
- **Infrastructure / Data:** Persistência via JPA/Hibernate e comunicação com banco de dados.
- **REST API:** Controllers com comunicação via DTOs e padronização de respostas HTTP.

## Regras de Negócio e Recursos

- Gerenciamento do ciclo de vida de eventos (públicos e privados).
- Uso de enums para controle de estados, papéis e categorias.
- Mapeamento eficiente entre entidades e DTOs usando MapStruct.
- Validação customizada de documentos (CPF) e payloads de entrada.

## Como Executar o Projeto

1. Clone o repositório:
   git clone https://github.com/KayneFerreira/event-master.git

2. Navegue até o diretório do projeto:
   cd event-master

3. Execute a aplicação via Maven:
   ./mvnw spring-boot:run

*O banco de dados H2 será inicializado em memória no perfil de desenvolvimento.*

---
Desenvolvido por [Kayne Ferreira](https://github.com/KayneFerreira)
