
INSERT INTO userinfo
VALUES(1,'test','pwd123','user');

INSERT INTO userinfo
values(2,'dhwaj','mypass','user');


insert into task
values(1,'test','test description',false,TO_DATE('06/12/2018','DD/MM/YYYY'),(Select user_id from userinfo where user_name='test'));

insert into task
values(2,'test','test description',false,TO_DATE('06/12/2018','DD/MM/YYYY'),(Select user_id from userinfo where user_name='test'));

insert into task
values(3,'test','test description',false,TO_DATE('06/12/2018','DD/MM/YYYY'),(Select user_id from userinfo where user_name='dhwaj'));

insert into task
values(4,'test','test description',false,TO_DATE('06/12/2018','DD/MM/YYYY'),(Select user_id from userinfo where user_name='dhwaj'));