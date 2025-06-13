📦 Projeto CRUD de Produtos - Java Spring
Este é um projeto simples de CRUD (Create, Read, Update, Delete) desenvolvido com Java e Spring Boot, com o objetivo de demonstrar meus conhecimentos em construção de APIs RESTful utilizando as principais ferramentas do ecossistema Spring.

🛠️ Tecnologias e Bibliotecas Utilizadas:
Spring Boot – estrutura principal da aplicação.

Spring Web – para criação dos endpoints REST.

Spring Data JPA – para persistência de dados.

H2 Database – banco de dados em memória, ideal para testes e desenvolvimento rápido.

Lombok – para reduzir o boilerplate de código com anotações como @Getter, @Setter, @Builder, etc.

📋 Funcionalidades Implementadas:
Cadastro de produtos com os atributos:

nome (String)

preço (Double)

quantidade (Integer)

Endpoints disponíveis:

POST /produtos – Cadastrar um novo produto.

GET /produtos – Listar todos os produtos cadastrados.

GET /produtos/{id} – Buscar produto por ID.

PUT /produtos/{id} – Atualizar um produto existente por ID.

DELETE /produtos/{id} – Remover um produto por ID.

🎯 Objetivo do Projeto:
Este projeto foi desenvolvido com o propósito de consolidar meus conhecimentos em Java com Spring Boot, além de servir como demonstração prática da implementação de um CRUD completo com boas práticas, organização e uso de ferramentas modernas do ecossistema Java.
