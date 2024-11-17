DROP TABLE user_model IF EXISTS;
DROP TYPE IF EXISTS user_role;
CREATE TYPE user_role AS ENUM ('ADMINISTRATOR', 'USER');
CREATE TABLE user_model
(
    id       SERIAL     not null,
    email    varchar(50) not null,
    fullname varchar(50) not null,
    password varchar(60) not null,
    role user_role NOT NULL,
    PRIMARY KEY (id)
);