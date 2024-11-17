DROP TABLE user_model IF EXISTS;
CREATE TABLE user_model
(
    id       SERIAL     not null,
    email    varchar(150) not null,
    fullname varchar(100) not null,
    password varchar(5000) not null,
    PRIMARY KEY (id)
);

