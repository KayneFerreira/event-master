# (README TEMPORARIO)

## API backend de aplicação para gerenciamento de eventos.  

### Conceitos, métodos e padrões:

* Spring Boot framework;

* Padrão estrutural DDD (Domain Driven Design) para melhor escalabilidade e manutenção;

* Padrão de arquitetura DTO para maior eficiência e segurança na comunicação entre sistemas;
`/dtos`

* Sistema de Autenticação e Autorização com Spring Security e JWT;
`/security`

* Entidades monitoradas por Hibernate;
`/domain/entities`

* Camada de gerenciamento de repositórios REST (REST Repositories);
`/domain/repositories`

* Camada de serviço intermediária para chamada de métodos da interface de repositório;
`/application/services`

* Camada de casos de uso;
`/application/usecases`

* Camada de controle de endpoints;
`/controller`
 
 * Exceções personalizadas para melhor tratamento de exceções e respostas HTTP;
 `/exceptions`

* MapStruct para mapeamento mais consistente e eficiente de entidades e DTOs;
`/mappers`

* Validação de CPF com algorítmo personalizado;
`/validation`
