create database Assignment_7;
use assignment_7;

create table ord_master (ord_no int(5), cust_cd varchar(10), status varchar(10));
insert into ord_master values(1,'C1','P');
select * from ord_master;

create table ord_dtl(ord_no int(5), prod_cd varchar(10), qty int(5));
insert into ord_dtl values(1,'P1',100);
insert into ord_dtl values(1,'P2',200);
select * from ord_dtl;

create table prod_master (prod_cd varchar(10), prod_name varchar(25), qty_in_stock int(5), booked_qty int(5));
insert into prod_master values ('P1', 'Floppies', 10000, 1000);
insert into prod_master values ('P2', 'Printers', 5000, 600);
insert into prod_master values ('P3', 'Modems', 3000, 200);
select * from prod_master;

-- Que1
delimiter $$
create trigger Que1 BEFORE INSERT on ord_dtl 
FOR EACH ROW 
BEGIN
update prod_master set booked_qty = booked_qty+ new.qty where prod_cd = new.prod_cd;
END $$
insert into ord_dtl values(2,'P3',300);

-- Que2
delimiter $$
create trigger Que2 BEFORE DELETE on ord_dtl
FOR EACH ROW
BEGIN
update prod_master set booked_qty = booked_qty - old.qty where prod_cd = old.prod_cd;
END $$
delete from ord_dtl where ord_no = 2;

-- Que3
create table dept_sal(dept_no int(4), tota_salary float(7,2));
insert into dept_sal values (10, 1000);
insert into dept_sal values (30, 500);

create table EMP(EMPNO int(4) NOT NULL, ENAME varchar(30) NOT NULL, JOB varchar(10), MGR int(4), HIREDATE date, SAL decimal(7,2), DEPTNO int(2));
insert into EMP values (1000, 'Manish', 'SALESMAN', 1003, '2020-02-18', 600, 30);
insert into EMP values (1001, 'Manoj', 'SALESMAN', 1003, '2018-02-18', 600, 30);
insert into EMP values (1002, 'Ashish', 'SALESMAN', 1003, '2013-02-18', 750, 30);
insert into EMP values (1004, 'Rekha', 'ANALYST', 1006, '2001-02-18', 3000, 10);
insert into EMP values (1005, 'Sachin', 'ANALYST', 1006, '2019-02-18', 3000, 10);
insert into EMP values (1006, 'Pooja', 'MANAGER', null , '2000-02-18', 6000, 10);
select * from emp;

delimiter $$
create trigger Que3 AFTER INSERT on emp
FOR EACH ROW
BEGIN
-- update dept_sal set tota_salary = new.SAL, dept_no = new.DEPTNO;
update dept_sal set tota_salary = tota_salary + new.SAL where dept_no=new.DEPTNO;
END $$

insert into emp values (1007, 'nisha', 'SALESMAN', 1003, '2020-02-18', 500, 10);
select * from emp;
select * from dept_sal;

delimiter $$
create trigger Que4 AFTER DELETE on emp
FOR EACH ROW
BEGIN
update dept_sal set tota_salary = tota_salary - old.SAL where dept_no=old.DEPTNO;
END $$

delete from emp where EMPNO = 1000;

