use cafetito;
insert into perosnas (nombre, apellido, edad ) values ('Tito', 'Cabrera', 10);
insert into perosnas (nombre, apellido, edad ) values ('Negra', 'Cabrera', 11);
insert into perosnas (nombre, apellido, edad ) values ('hormiga', 'Cabrera', 5);
update perosnas set edad = 15 where idperosnas = 3;
delete from perosnas where idperosnas = 3;
select *from perosnas;
rename table perosnas to personas;
select *from personas;