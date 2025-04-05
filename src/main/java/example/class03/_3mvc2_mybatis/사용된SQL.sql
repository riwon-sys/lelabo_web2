drop database if exists springweb2;
create database springweb2;
use springweb2;

-- 1. 테이블 생성
DROP TABLE IF EXISTS class03user;

-- 2. 샘플 테이블 입력
create table class03user(
    id   int auto_increment,
    name varchar(100),
    age  int,
    constraint primary key (id)
);
-- 3. 샘플 데이터 입력
INSERT INTO class03user (name, age)
VALUES (
        ('유재석', '40'),
        ('강호동', '50'),
        ('지석진', '90')
);