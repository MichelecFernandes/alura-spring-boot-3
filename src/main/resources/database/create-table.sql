DROP TABLE user_model IF EXISTS;
CREATE TABLE user_model
(
    id       SERIAL     not null,
    email    varchar(50) not null,
    fullname varchar(50) not null,
    password varchar(50) not null,
    PRIMARY KEY (id)
);


