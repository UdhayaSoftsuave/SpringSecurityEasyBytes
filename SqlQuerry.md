CREATE DATABASE easyBytes;

use easyBytes;

create table `users` (
`id` INT NOT NULL AUTO_INCREMENT,
`username` Varchar(45) not null,
`password` Varchar(45) not null,
`enabled` int not null,
primary key (`id`));

create table `authorities` (
`id` INT NOT NULL AUTO_INCREMENT,
`username` Varchar(45) not null,
`authority` Varchar(45) not null,
primary key (`id`));

insert ignore into `users` values (null,'udhaya' , '123456' , '1');
insert ignore into `authorities` values (null,'udhaya' , 'admin');


select * from users;
select * from authorities;
