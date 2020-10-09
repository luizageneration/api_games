
use db_loja_games;
show tables;

select * from categoria;


select * from categoria 
inner join produto
where categoria.id = produto.categoria_id;