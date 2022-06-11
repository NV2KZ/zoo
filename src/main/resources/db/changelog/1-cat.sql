--liquibase formatted sql

--changeset pkozlov:1 logicalFilePath:1-cat.sql

create table if not exists cat
(
    id bigint,
    name varchar(255),
    weight int,
    color varchar(100)
);
