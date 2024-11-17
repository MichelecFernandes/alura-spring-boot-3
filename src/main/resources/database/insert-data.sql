insert into user_model (email, fullname, password) values ('carlos@gmail.com', 'carlos', crypt('carlos123', gen_salt('bf')), 'ADMINISTRATOR');
insert into user_model (email, fullname, password) values ('maria@gmail.com', 'maria', crypt('maria123', gen_salt('bf')), 'ADMINISTRATOR');
insert into user_model (email, fullname, password) values ('roberta@gmail.com', 'roberta', crypt('roberta123', gen_salt('bf')), 'ADMINISTRATOR');
