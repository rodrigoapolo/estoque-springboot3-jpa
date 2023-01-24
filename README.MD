# Estoque

Objetivo do projeto é criar uma  API com arquitetura de software REST, que permitirá que empresas gerenciam seu estoque e também clientes, produtos e pedido fazendo fazendo requisições HTML como GET , PUT,  POST e DELETE na plataforma, além de poderem acompanhar o processo do estado do pedido.
Esse projeto foi desenvolvido a fins didático com o objetivo de usar funcionalidade desenvolvida no curso.

![Imagem-Calculadora](img/img.png)

## Como funciona o projeto

O projeto é uma API de um estoque utilizando a arquitetura de software REST para desenvolve o mesmo.

Métodos

* GET
```
    http://localhost:8080/users
```
```
    http://localhost:8080/products
```
```
    http://localhost:8080/categories
```
```
    http://localhost:8080/orders
```

* POST

```Json
http://localhost:8080/users/
{
    "name": "Bob Brown",
    "email": "bob@gmail.com",
    "phone": "977557755",
    "password": "123456"
}
```

* PUT
* 
```Json
http://localhost:8080/users/3

{
    "name": "Bob Brown",
    "email": "bob@gmail.com",
    "phone": "977557755"
}
```

* DELETE
```
   http://localhost:8080/users/8
```

## Funcionamento do projeto Main
As instruções abaixo ir ajudar a roda o main do projeto. Para isso, siga o passo-a-passo abaixo:

1. Baixe o projeto.

2. Execute o arquivo 'EstoqueApplication.java', como main na sua IDE no package com.rodrigoapolo.estoque.

## Tecnologia usada
* Java 17
* API Collection
* Lambda
* Programação Orientada a Objetos (POO)
* Banco de dados H2
* JSON  
* Spring boot (3.0.1)
