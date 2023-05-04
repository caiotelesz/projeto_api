create database base_for_user;

use base_for_user;

create table users(
	id      		integer auto_increment primary key,
	username   			varchar(100) not null unique, 
	email       	varchar (50) not null unique, 
    passwords			text not null, 
	telephone    	varchar(15) not null
);

insert into usuario values (null, 'caiotelesz', 'caio@email.com', 'senha@12345', '11940028922');

select * from users;
