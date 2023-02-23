

Create Database quiz;
\c quiz
Create Table user(
id serial primary key,
name varchar(16) not null,
email varchar(32) not null,
password varchar(16) not null,
points int not null,
);

Create Table question(
id serial primary key,
question varchar(100) not null,
answer1 varchar(100),
answer2 varchar(100),
answer3 varchar(100),
answer4 varchar(100),
);

Create Table lobbys(
id serial primary key,
useroneid int not null,
usertwoid int not null,
);
