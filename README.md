# Estacionamento-Santander-Java
-Santander Dev Week 2023 Java API-
RESTful API da Santander Dev Week 2023 construída em Java 17 com Spring Boot 3.

Principais Tecnologias:
Java 17

Spring Boot 3

Spring Data JPA

OpenAPI (Swagger)

Railway


```mermaid
classDiagram
  class User {
    - id: int
    - name: String
    - cpf: String
    - car: Car
    - numberAccess: NumberAccess
  }

  class Car {
    - id: int
    - model: String
    - manufacturer: String
    - year: int
    - plate: String
  }

  class NumberAccess {
    - numberAccess: int
  }

  User -- Car : has
  User -- NumberAccess : has
```
