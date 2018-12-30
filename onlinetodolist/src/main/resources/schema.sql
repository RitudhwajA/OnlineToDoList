create table task
(
id integer not null auto_increment,
title varchar(45) not null,
description varchar(255) not null,
status boolean not null,
lastupdated Date not null,
primary key(id)
);