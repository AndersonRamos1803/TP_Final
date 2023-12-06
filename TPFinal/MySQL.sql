create database TPFinal;

use TPFinal;

create table alunos(
  id_Aluno smallint primary key auto_increment,
  nome varchar(30) not null,
  idade smallint not null,
  peso float not null,
  altura float not null,
  objetivo varchar(50) not null
);