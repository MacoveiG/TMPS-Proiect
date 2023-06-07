drop table libraries;
drop table books;
drop table users;

create table libraries (
	lib_id SERIAL primary key,
	name varchar(200),
	location varchar(200)
);

create table books (
	book_id SERIAL primary key,
	name varchar(200), 
	author varchar(200),
	category varchar(200),
	year integer,
	accessGrade integer,
	available BOOLEAN,
	publisher varchar(200),
	publishDate integer,
	user_id integer,
	library_id integer,
	FOREIGN KEY(library_id) REFERENCES libraries(lib_id),
	FOREIGN KEY(user_id) REFERENCES users(user_id)
);

create table users (
	user_id SERIAL primary key,
	name varchar(200), 
	surname varchar(200),
	birthYear integer,
	university varchar(200),
	accessGrade integer,
	library_id integer,
	faculty varchar(200),
	FOREIGN KEY(library_id) REFERENCES libraries(lib_id)
);

select * from libraries;
select * from books;
select * from users;