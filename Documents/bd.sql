/* Cliente */
create table cliente(
dni char(8) not null,
nombres varchar(40) not null,
apellidos varchar(40) not null,
celular varchar(9) not null,
email varchar(40) not null,
primary key(dni)
);

insert into cliente values(
'11111111',
'Cliente 1',
'Cliente 1',
'987654321',
'cliente1@proyectohotel.com'
);

select * from cliente;

/* Empleado */

create table empleado(
codigo char(4) not null,
nombre varchar(40) not null,
usuario varchar(10) not null,
password varchar(10) not null,
primary key(codigo)
);

insert into empleado values(
'E001',
'Empleado 1',
'emp1',
'emp1'
);

select * from empleado;

/* TipoHabitacion */

create table tipoHabitacion(
codigo char(4) not null,
nombre varchar(40) not null,
descripcion varchar(100) not null,
precio double not null,
primary key(codigo)
);

insert into tipoHabitacion values(
'T001',
'Habitacion Simple',
'Ambiente moderno y muy confortable',
100
);

select * from tipoHabitacion;

/* Habitacion */

create table habitacion (
codigo char(4) not null,
codTipoHabitacion char(4) not null,
primary key(codigo),
foreign key(codTipoHabitacion) references tipoHabitacion
);

insert into habitacion values(
'H001',
'T001'
);

select * from habitacion;

/* Reserva */

create table reserva(
numReserva char(6) not null,
fecha varchar(15) not null,
estado varchar(10) not null,
total double not null,
dni char(8) not null,
codEmpleado char(4) not null,
primary key(numReserva),
foreign key(dni) references cliente,
foreign key(codEmpleado) references empleado
);

insert into reserva values(
'R00000',
'01/01/2020',
'Atentido',
0.0,
'11111111',
'E001'
);

select * from reserva;

/* Detalle */

create table detalle(
numReserva char(6) not null,
codHabitacion char(4) not null,
fechaInicial varchar(15) not null,
fechaFinal varchar(15) not null,
cantDias int not null,
primary key(numReserva, codHabitacion),
foreign key(numReserva) references reserva,
foreign key(codHabitacion) references habitacion
);

insert into detalle values(
'R00000',
'H001',
'01/01/2020',
'01/01/2020',
1
);

select * from detalle;

/* DROP TABLES */

/*
drop table detalle;
drop table reserva;
drop table habitacion;
drop table tipohabitacion;
drop table cliente;
drop table empleado;
*/


