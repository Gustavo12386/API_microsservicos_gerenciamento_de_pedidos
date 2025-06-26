# Sistema_Microsservicos_gerenciamento_de_pedidos

## 💻 Sobre o Sistema
- Esse projeto se trata de uma aplicação de microsserivos de gerenciamento de pedidos realizada no curso Criando Microsservicos com Spring Boot 3 e RabbitMQ do instrutor Wendel Alves Segadilha, no qual a arquitetura foi desenvolvida com foco em comunicação assíncrona entre os serviços, utilizando RabbitMQ como broker de mensagens. O sistema é responsável por registrar os pedidos, enviar notificações por email através do MailHog e processá-los pelo banco de dados PostgreSQL simultaneamente, garantindo alta performance e escalabilidade por meio do desacoplamento entre os módulos, e também foi utilizado o Swagger para a documentação das apis.

 ## ✨ Tecnologias Utilizadas
- Java 21
- SpringBoot
- Maven
- PostgreSQL
- RabbitMQ
- MailHog
- Swagger
- Hibernate
- JPA

## 🗒️ Roteiro
- [ ] Criação do diagrama UML
- [ ] Criação do sistema com Spring Boot, Maven, JPA e o Hibernate
- [ ] Configuração do Swagger nas apis
- [ ] Configuração do RabbitMQ nas apis

## 🚀 Como Executar
- Clone o repositório
- Abra em qualquer IDE Java
- Execute o projeto Spring Boot

## Imagens do JSON gerada pelo endpoint
- endpoint:  `localhost:8082/api/v1/pedidos`
![Captura de tela de 2025-06-17 18-17-47](https://github.com/user-attachments/assets/63b015dd-43da-4050-bef8-86e6b060f128)

## Imagem da tabela da base de dados do microsservico de processamento
- tabela item-pedido
![Captura de tela de 2025-06-17 18-19-58](https://github.com/user-attachments/assets/b0350768-9968-4877-b71e-5a8214df6243)
- tabela pedido
![Captura de tela de 2025-06-17 18-20-32](https://github.com/user-attachments/assets/49cd7f7c-067c-446c-95ca-643e37364c13)
- tabela produto
- ![Captura de tela de 2025-06-17 18-20-53](https://github.com/user-attachments/assets/263289ed-6a03-4b1f-80e5-f05fbef02f44)

## Autor 
- Gustavo Calderaro 
