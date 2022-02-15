### Projeto MV 💻

## ▶️ Objetivo do Projeto 💡

Demonstrar a capacidade de desenvolvimento a partir de um desafio que consiste em realizar o controle de receitas e despesas de diversos clientes da empresa XPTO

## ▶️ Padrão de Projeto 📜

O padrão de projeto utilizado foi o MVC que realiza o controle de desenvolvimento e torna-se de fácil manutenção, modulação e troca de informações com o usuário .
 Toda estrutura da aplicação é desenvolvida a partir das camadas descritas a seguir:

MODEL - Camada responsável pela representação do negócio. Toda construção das classes e seus atributos que realiza a manipulação dos dados.
REPOSITORY - É a interface responsável pela apresentação das informações contidas na model para o usuário
CONTROLLER - É a responsabilidade de ligar as duas camadas (MODEL e REPOSITORY) para que haja interação. 

## ▶️Tecnologias utilizadas ⚙️

JAVA | MAVEN | JPA | SPRINGBOOT | MYSQL | POSTMAN

## ▶️ DONE ✔️

A partir do desafio proposto, o desenvolvimento foi iniciado através da construção dos cruds envolvendo, na camada MODEL, a criação
dos atributos, construtores e métodos para cada objeto necessário do projeto(cliente, endereço, conta e movimentações).
 A seguir, a construção da camada REPOSITORY, através da extensão JPA, apresenta as requisições necessárias para apresentação das 
 informações.
 Na camada Controller de cada objeto foi desenvolvido através dos métodos de requisição HTTP (GET, POST, PUT E DELETE) 

 ## ▶️TESTES REALIZADOS 🕹️

 Os testes realizados no POSTMAN retornaram o status de resposta HTTP 200 (OK) que indica que a requisição foi bem sucessidade para 
 os campos criados. 
 
 As inserções a patir do método POST no POSTMAN e INSERT INTO direto no gerenciador do Banco de Dados também possuiram sucesso. 
 
 Algumas consultas foram realizadas no gerenciador do Banco de dados, afim de avaliar as relações criadas pelas classes. As consultas,
 também foram bem sucessidas. 

 ## ▶️IMPEDIMENTOS ⚠️

 O conhecimento na ferramenta de SGBD ORACLE e a estrutura de PROCEDURE ainda estão em  processo de desenvolvimento particular e não foi 
 possível realizar a conexão com o BD solicitado, sendo assim, a utilização do MySQL fora implantada neste projeto afim de demonstrar
  a conexão funcional entre as camadas de aplicação e o banco de dados. 

 ## ▶️ AGRADECIMENTOS 🚀

 Acredito que o projeto entregue e a trajetória de desenvolvimento dessa aplicação foi de grande importância na construção do meu conhecimento e realizado com muita dedicação e persistência, 
 Agradeço, desde já, a todos os envolvidos da equipe MV pela oportunidade! 
