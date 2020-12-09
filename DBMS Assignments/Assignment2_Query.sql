use cdac;
create table Publishers
     ( pubid int(3) PRIMARY KEY,
       pname varchar(30),
       email varchar(50) UNIQUE,
       phone varchar(30)
     );
     
create table Subjects
     ( subid varchar(5) PRIMARY KEY,
       sname varchar(30)
     );
     
create table Authors
     ( auid int(5) PRIMARY KEY,
       aname varchar(30),
       email varchar(50) UNIQUE,
       phone varchar(30)
     );
     
create table Titles
     ( titleid int(5) PRIMARY KEY,
       title varchar(30),
       pubid int (3),
       subid varchar(5),
       pubdate date,
       cover char(1) check (cover in ('P', 'H', 'p', 'h')),
       price int(4),
       CONSTRAINT TITLES_PUBID_FK FOREIGN KEY (PUBID) REFERENCES PUBLISHERS(PUBID),
       CONSTRAINT TITLES_SUBID_FK FOREIGN KEY (SUBID) REFERENCES SUBJECTS(SUBID)
       );
       
create table TitleAuthors
     ( titleid int(5),
       auid int(5),
       importance int(2),
       PRIMARY KEY(titleid, auid),
       CONSTRAINT TITLESAUTHORS_TITLEID_FK FOREIGN KEY (TITLEID) REFERENCES TITLES(TITLEID),
       CONSTRAINT TITLESAUTHORS_AUTHID_FK FOREIGN KEY (AUID) REFERENCES AUTHORS(AUID)
     );
	
create table Subjects_Backup 
	(  subid varchar(5) PRIMARY KEY,
       sname varchar(30)
	);
     
show tables;

insert into subjects values ('ORA', 'ORACLE DATABASE 10g');
insert into subjects values ('JAVA', 'JAVA LANGUAGE');
insert into subjects values ('JEE', 'JAVA ENTERPRISE EDITION');
insert into subjects values ('VB', 'VISUAL BASIC.NET');
insert into subjects values ('ASP', 'ASP.NET');

select * from subjects;

insert into publishers values (1,'WILLEY','WDT@VSNL.NET','91-11-23260877');
insert into publishers values (2,'WROX','INFO@WROX.COM',NULL);
insert into publishers values (3,'TATA MCGRAW-HILL','FEEDBACK@TATAMCGRAWHILL.COM','91-11-33333322');
insert into publishers values (4,'TECHMEDIA','BOOKS@TECHMEDIA.COM','91-11-33257660');

select * from publishers;

insert into authors values (101, 'HERBERT SCHILD','HERBERT@YAHOO.COM',NULL);
insert into authors values (102, 'JAMES GOODWILL','GOODWILL@HOTMAIL.COM',NULL);
insert into authors values (103, 'DAVAID HUNTER','HUNTER@HOTMAIL.COM',NULL);
insert into authors values (104, 'STEPHEN WALTHER','WALTHER@GMAIL.COM',NULL);
insert into authors values (105, 'KEVIN LONEY','LONEY@ORACLE.COM',NULL);
insert into authors values (106, 'ED. ROMANS','ROMANS@THESERVERSIDE.COM',NULL);

select * from authors;

insert into titles values (1001,'ASP.NET UNLEASHED',4,'ASP','2002-04-12','P',540);
insert into titles values (1002,'ORACLE10G COMP. REF.',3,'ORA','2005-05-01','P',575);
insert into titles values (1003,'MASTERING EJB',1,'JEE','2005-02-03','P',475);
insert into titles values (1004,'JAVA COMP. REF',3,'JAVA','2005-04-03','P',499);
insert into titles values (1005,'PRO. VB.NET',2,'VB','2005-06-15','P',450);

select * from titles;

insert into titleauthors values (1001,104,1);
insert into titleauthors values (1002,105,1);
insert into titleauthors values (1003,106,1);
insert into titleauthors values (1004,101,1);
insert into titleauthors values (1005,103,1);
insert into titleauthors values (1005,102,2);

select * from titleauthors;
select pname, phone, email from publishers;
select aname, phone from authors;
select titleid, title, pubdate from titles;
select auid, titleid, importance from titleauthors; 
-- LIKE operator
select sname from subjects where sname like 'j%';
select sname from subjects where sname like '%.net';
select aname from authors where aname like '%er';
select pname from publishers where pname like '%hill';
-- Relational operator
select title from titles where price < 500;
select title from titles where pubdate < '2005-04-03';
select sname from subjects where subid = 'java' or subid = 'jee';
select aname from authors where auid > 103;
select * from titles where titleid = 101 or price > 400;
-- IN operator
select * from publishers where pname in ('TECHMEDIA','WROX');
select max(price) from titles;
select avg(importance) from titleauthors;
select count(auid) from authors;
select sum(price) from titles;
-- Date
select title from titles where month(pubdate) = 4;
select year(sysdate()) as year;
select month(sysdate()) as month;
select last_day(pubdate) from titles where subid = 'java'; 
-- DML
create table Employee (emp_id int(5), emp_name char(50));
insert into Employee values (1, 'Snehal');
insert into Employee values (2, 'Nitesh');
insert into Employee values (3, 'Priyanka');
insert into Employee values (4, 'Nikita');
insert into Employee values (5, 'Saurabh');
select * from Employee;
Alter table Employee add column dept_id int(5);
alter table Employee modify column emp_name varchar(50);
desc employee;
update Employee set emp_name = 'Scott';
truncate table employee;

create table Emp (SAL float(7,3));
insert into emp values (1234.567);
insert into emp values (1530.019);
insert into emp values (1652.786);
insert into emp values (1775.156);
select * from emp;
select round(sal, 1) as roundvalue from emp;
select truncate(sal, 2) from emp;
select ceil(sal) as ceilvalue from emp;
select floor(sal) as Floorvalue from emp;
select sign(sal) from emp; 
select mod(sal, 2) from emp;
select sqrt(sal) from emp;
select power(sal, 2) from emp;
-- String functions
select ascii("CDAC juhu");
select char_length("CDAC juhu");
select concat("CDAC ", "juhu");
select concat_ws("  ", "CDAC", "juhu");
select field("c", "d", "a", "c", "j", "u", "h", "u");
select find_in_set("a", "c,d,a,c,j,u,h,u");
select insert ("CDAC juhu", 6 , 4, "kharghar");
select instr("CADC juhu", 'a');
select lcase("CDAC juhu");
select left("CDAC juhu", 4);
select length("CDAC juhu");
select locate("juhu", "CDAC juhu");
select lower("CADC juhu");
select lpad("CDAC juhu", 15, "hi");
select ltrim("  CDAC juhu");
select mid("CDAC juhu", 2, 3);
select position("juhu" in "CDAC juhu");
select repeat("CDAC juhu ", 2);
select replace("CDAC juhu", "juhu", "kharghar");
select reverse("CDAC juhu");
select right("CDAC juhu", 4);
select rpad("CDAC juhu", 15, "hi");
select rtrim("CDAC  juhu ");
select strcmp("CDAC juhu", "CDAC kharghar");
select substr("CDAC juhu", 6, 4);
select substring("CDAC juhu", 2, 3);
select substring_index("CDAC juhu", "u", 1);
select trim("  CDAC juhu  ");
select ucase("CDAC juhu");
select upper("CDAC juhu");
-- Date and Time functions
select adddate(sysdate(), interval 5 minute); 
select addtime(sysdate(), '5');
select curdate();
select curtime();
select current_date();
select current_time();
select current_timestamp();



