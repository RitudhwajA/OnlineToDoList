CREATE TABLE userinfo
(
user_id INTEGER NOT NULL AUTO_INCREMENT,
user_name VARCHAR(45) NOT NULL,
password VARCHAR(45) NOT NULL,
role VARCHAR(20) NOT NULL
);

CREATE TABLE task
(
task_id INTEGER NOT NULL AUTO_INCREMENT,
title VARCHAR(45) NOT NULL,
description VARCHAR(255) NOT NULL,
status BOOLEAN NOT NULL,
lastupdated DATE NOT NULL,
user_id INTEGER NOT NULL,
PRIMARY KEY(task_id),
FOREIGN KEY(user_id) REFERENCES userinfo(user_id)
);