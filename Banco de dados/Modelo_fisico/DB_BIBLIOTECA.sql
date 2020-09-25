create database db_biblioteca;

show databases;

use db_biblioteca;

create table tb_livro(
	id_livro int not null,
    nm_nome varchar(120),
    nm_autor varchar(120),
    nm_genero varchar(45),
    dt_ano_lancamento date not null,
    cd_edicao int not null,
    cd_sbn int not null,
    primary key (id_livro)
);

SHOW TABLE STATUS;

SHOW columns from TB_livro;

create table tb_emprestimo(
	id_emprestimo int not null,
    dt_retirada date not null,
    dt_devolucao_prevista date not null,
    dt_devolucao date,
    id_livro int not null,
    id_cliente int not null,
    primary key (id_emprestimo),
    constraint fk_tb_emprestimo_id_livro foreign key (id_livro) references tb_livro (id_livro)
);

SHOW TABLE STATUS;

create table tb_cliente(
	id_cliente int not null,
    nm_nome varchar(80) not null,
    cd_cpf bigint not null,
    cd_rg bigint not null,
    dt_nascimento date not null,
    nm_email varchar(120) not null,
    cd_celular varchar(16) not null,
    primary key (id_cliente)
);

Alter table tb_emprestimo add constraint fk_tb_emprestimo_id_cliente foreign key (id_cliente) references tb_cliente(id_cliente);

create table livro_emprestado(
	id_emprestimo int not null,
    id_cliente int not null,
    constraint fk_tb_livro_emprestado_id_emprestimo foreign key (id_emprestimo) references tb_emprestimo (id_emprestimo),
    constraint fk_tb_livro_emprestado_id_cliente foreign key (id_cliente) references tb_cliente (id_cliente)
);












