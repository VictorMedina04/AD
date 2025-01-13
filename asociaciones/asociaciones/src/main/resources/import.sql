insert into categoria(id,nombre) values(nextval('categoria_seq'),'Cat1');
insert into categoria(id,nombre) values(nextval('categoria_seq'),'Cat2');
insert into categoria(id,nombre) values(nextval('categoria_seq'),'Cat3');

insert into producto(nombre,precio, descripcion,id,categoria_id) values('Uno',1,'uno1',nextval('producto_seq'),currval('categoria_seq'));
insert into producto(nombre,precio, descripcion,id,categoria_id) values('dos',2,'dos2',nextval('producto_seq'),currval('categoria_seq'));