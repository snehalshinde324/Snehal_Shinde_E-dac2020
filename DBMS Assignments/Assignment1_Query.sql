use cdac;
create table member (
	Member_Id int(5),
    Member_Name varchar(30),
    Member_address varchar(50),
    Acc_Open_Date date,
    Membership_type varchar(20),
    Penalty_Amount int(7)
    );
    
create table Books (
	Book_No int(6),
    Book_Name varchar(30),
    Author_name varchar(30),
    Cost int(7),
    Catagory char(10)
    );
    
create table Issue (
	Lib_Issue_Id int(10),
    Book_No int(6),
    Member_Id int(5),
    Issue_Date date,
    Return_date date
    );
show tables;
select * from member;
select * from books;
select * from Issue;

alter table member drop Penalty_Amount;
insert into member values (1, "Richa Sharma", "Pune", '2005-10-05', "Lifetime");
insert into member values (2, "Garima Sen", "Pune", '2020-04-10', "Annual");
insert into member values (3, "Snehal Shinde", "Nashik", '2020-05-20', "Half Yearly");
insert into member values (4, "Nitesh Kasar", "Mumbai", '2020-08-20', "Quarterly");
insert into member values (5, "Sneha Kasar", "Mumbai", '2020-02-09', "Quarterly");

insert into Books values (101, "Let us C", "Denis Ritchie", 450, "System");
insert into Books values (102, "Oracle- Complete Ref", "Loni", 550, "Database");
insert into Books values (103, "Mastering SQL", "Loni", 250, "Database");
insert into Books values (104, "PL SQL-Ref", "ScottUrman", 750, "Database");

update Books set Cost = 300, Catagory = "RDBMS" where Book_No = 103;

drop table Issue;

create table Issue (
	Lib_Issue_Id int(10),
    Book_No int(6),
    Member_Id int(5),
    Issue_Date date,
    Return_Date date
    );
    
select * from Issue;
insert into Issue(Lib_Issue_Id, Book_No, Member_Id, Issue_Date) values (7001, 101, 1, '2006-12-10');
insert into Issue(Lib_Issue_Id, Book_No, Member_Id, Issue_Date) values (7002, 102, 2, '2006-12-25');
insert into Issue(Lib_Issue_Id, Book_No, Member_Id, Issue_Date) values (7003, 104, 1, '2006-01-1');
insert into Issue(Lib_Issue_Id, Book_No, Member_Id, Issue_Date) values (7004, 101, 1, '2006-07-04');
insert into Issue(Lib_Issue_Id, Book_No, Member_Id, Issue_Date) values (7005, 104, 2, '2006-11-15');
insert into Issue(Lib_Issue_Id, Book_No, Member_Id, Issue_Date) values (7006, 101, 3, '2006-02-18');
