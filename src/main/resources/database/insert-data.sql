CREATE EXTENSION IF NOT EXISTS pgcrypto;

insert into user_model (email, fullname, password, role) values ('pedro@gmail.com', 'pedro', crypt('pedro123', gen_salt('bf')), 'MASTER');
insert into user_model (email, fullname, password, role) values ('carlos@gmail.com', 'carlos', crypt('carlos123', gen_salt('bf')), 'CLIENT');
insert into user_model (email, fullname, password, role) values ('maria@gmail.com', 'maria', crypt('maria123', gen_salt('bf')), 'MASTER');
insert into user_model (email, fullname, password, role) values ('roberta@gmail.com', 'roberta', crypt('roberta123', gen_salt('bf')), 'CLIENT');
