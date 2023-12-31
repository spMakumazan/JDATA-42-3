create table CUSTOMERS (
	id serial primary key,
	name varchar(10),
	surname varchar(20),
	age integer,
	phone_number char(10)
);

create table ORDERS (
	id serial primary key,
	date timestamp,
	customer_id integer, 
	product_name varchar(20),
	amount money,
	foreign key(customer_id) references  CUSTOMERS(id)
);