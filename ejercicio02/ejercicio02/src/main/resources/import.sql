insert into categoria (id, nombre)values (nextval('categoria_seq'), 'Categoria 1');
insert into categoria (id, nombre)values (nextval('categoria_seq'), 'Categoria 2');
insert into categoria (id, nombre)values (nextval('categoria_seq'), 'Categoria 3');
insert into producto(id,nombre,pvp,categoria_id)values(nextval('producto_seq'),'Boligrafo',3.5,currval('categoria_seq'));
insert into producto(id,nombre,pvp,categoria_id)values(nextval('producto_seq'),'Papel',0.5,currval('categoria_seq'));
insert into producto(id,nombre,pvp,categoria_id)values(nextval('producto_seq'),'Lapiz',1.5,currval('categoria_seq'));
