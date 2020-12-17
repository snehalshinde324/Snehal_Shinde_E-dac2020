create database cdac1;
show databases; 
use cdac1;
create table EMP(EMPNO int(4) NOT NULL, ENAME varchar(30) NOT NULL, JOB varchar(10), MGR int(4), HIREDATE date, SAL decimal(7,2), DEPTNO int(2));
insert into EMP values (1000, 'Manish', 'SALESMAN', 1003, '2020-02-18', 600, 30);
insert into EMP values (1001, 'Manoj', 'SALESMAN', 1003, '2018-02-18', 600, 30);
update EMP set HIREDATE = '2018-02-18' where EMPNO=1001;
insert into EMP values (1002, 'Ashish', 'SALESMAN', 1003, '2013-02-18', 750, 30);
insert into EMP values (1004, 'Rekha', 'ANALYST', 1006, '2001-02-18', 3000, 10);
insert into EMP values (1005, 'Sachin', 'ANALYST', 1006, '2019-02-18', 3000, 10);
insert into EMP values (1006, 'Pooja', 'MANAGER', null , '2000-02-18', 6000, 10);
select * from EMP;
create table dept(dno int(4) NOT NULL, dname varchar(10) NOT NULL, area varchar(30));
insert into dept values (10,'Store','Mumbai');
insert into dept values (20,'Purchase','Mumbai');
insert into dept values (30,'Store','Delhi');
insert into dept values (40,'Marketing','Pune');
insert into dept values (50,'Finance','Delhi');
insert into dept values (60,'Accounts','Mumbai');
select * from dept;

-- Stored Procedure
-- Que1
DELIMITER $$
create procedure que1 (IN a int(5), b int(5))
BEGIN
declare result int(10);
set result = 0;
select (a+b) as result;
select (a-b) as result;
select (a*b) as result;
select (a/b) as result;
END $$
call que1(5,5);

-- Que2
DELIMITER $$
create procedure que2 (IN rev varchar(20))
BEGIN
select reverse(rev) as Result;
END$$
call que2('Database');

-- Que3
DELIMITER $$
create procedure que3 ()
BEGIN
select empno, ename, sal from emp order by sal desc limit 5;
END$$
call que3();

-- Que4
DELIMITER $$
create procedure que4 ()
BEGIN
create table emp_test(e_id int(5), e_name varchar(20), e_joining_date date);
END$$
call que4();
select * from emp_test;

-- Que5
DELIMITER $$
create procedure que5 (IN dno int(5), dname varchar(20), area varchar(15))
BEGIN
insert into dept values (dno, dname, area);
END$$
call que5(60, 'Education', 'Pune');
select * from dept;

-- Que6
DELIMITER $$
create procedure que6 (IN num int(10))
BEGIN
select num as num, pow(num, 2) as square, pow(num, 3) as cubee;
END$$
call que6(2);

-- Que7
DELIMITER $$
create procedure que7 (OUT a int(5))
BEGIN 
set a =20;
select a ;
END$$
call que7(@a);
select @a;

-- Que8
DELIMITER $$
create procedure que8 (IN sal1 int (5), OUT total int(10))
BEGIN
select sum(sal) into total from emp where sal > sal1;
END$$
call que8 (1000, @total);
select @total;
