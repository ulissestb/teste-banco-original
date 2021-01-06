# teste-banco-original
Este projeto é um desafio proposto pelo Banco Original em seu processo seletivo.
Para instalar o projeto é necessário usar uma IDE de sua preferencia, ex. Eclipse, IntelliJ, etc.


## Inicialização
  
- para baixar o projeto, use o comando:
`git clone https://github.com/ulissestb/teste-banco-original.git`  
- Abrir o projeto com a IDE de sua preferencia, instalar as dependencias via maven
- clicar em 'run BuscacepApplication'

##Rotas

|        url     |     params                    |response                         |
|----------------|-------------------------------|-----------------------------|
| /api/cep/:cep  | Cep - Long                    | Endereco - model contendo endereco|
