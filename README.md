# Sistema de Brinquedos

## Sumário

- Introdução
- Descrição Funcional
- Imagens
- Tecnologias
- Detalhe de Implementação
- Conclusão

## Introdução
### Visão Geral do Projeto
O sistema de brinquedos foi desenvolvido para gerenciar um catálogo de brinquedos, permitindo operações como consulta, armazenamento e recuperação por ID.

### Objetivos
Implementar um sistema de gerenciamento de brinquedos para lojas ou colecionadores.
Garantir que as operações sobre o banco de dados sejam realizadas de maneira eficiente.

### Escopo
O projeto abrange a criação de uma API RESTful para operações CRUD (Create, Read, Update, Delete) em um banco de dados Oracle.

## Descrição Funcional
### Casos de Uso

- Consultar brinquedos: Lista todos os brinquedos disponíveis.
- Adicionar novo brinquedo: Insere um novo registro no banco de dados.
- Consultar brinquedo por ID: Recupera detalhes de um brinquedo específico pelo ID.

## Imagens
### Configuração final do Spring Initializr 
![spring](https://github.com/user-attachments/assets/a72fdbf8-0078-46f3-bf68-9fc5d8e750a9)

### Exemplos JSON
#### GetAll
- Spring Boot 3.4.5![get](https://github.com/user-attachments/assets/22ff9697-573f-4d7d-8731-b3fe1f94ea92)

#### GetById
![getById](https://github.com/user-attachments/assets/83ab59a4-4bf6-4a2f-84f5-b0125598f20c)

#### Post
![Post](https://github.com/user-attachments/assets/2a95d3ce-c44a-45e1-9527-3cfd2150654d)

### JSON Modelo
```
{
	"nome": "Jogo de Blocos",
	"tipo": "Educativo",
	"classificacao": "4+",
	"tamanho": "Grande",
	"preco": 79.99
}
```

## Tecnologias

- Banco de Dados: Oracle
- Hibernate, JPA para persistência de dados

## Detalhe de Implementação
### Estrutura de Diretórios

- model: Modelo de objeto.
- controller: Controladores do API REST.
- service: Lógica de negócios proposta.
- repository: Interfaces de persistência.

## Conclusão
### Resultado
O projeto atingiu seus objetivos, fornecendo um sistema funcional de gerenciamento de brinquedos, incluindo a capacidade de recuperar itens específicos por ID.
