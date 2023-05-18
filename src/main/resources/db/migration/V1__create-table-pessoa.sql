CREATE TABLE pessoa (
  id bigint not null auto_increment,
  nome varchar(60) not null,
  cpf varchar(12) not null,
  telefone varchar(15) not null, 
  email varchar(20) not null, 
  logradouro varchar(100) not null,
  bairro varchar(30) not null,
  cidade varchar(30) not null,
  cep varchar(9) not null, 
  numero varchar(20),
  complemento varchar(100),
  uf char(2),
  primary key (id)
);