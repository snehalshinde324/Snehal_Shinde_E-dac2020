create database assignment_6;
use assignment_6;

-- 1.	Write function that accepts a positive number from a user and displays its factorial on the screen.
delimiter $$
create function factorial (num decimal(10,0))
returns decimal(5,0)
DETERMINISTIC
begin
declare factorial decimal(10,2) default 1;
declare counter decimal(10,0);
set counter = num;
factorial_loop: repeat
set factorial = factorial * counter;
set counter = counter - 1;
until counter  = 1
end repeat;
return factorial;
end$$
select factorial(6);

-- 2.	Write a function that accepts a positive number ‘n’ and displays whether that number is a Prime number or not.
delimiter $$
create function prime_number (n int(10))
returns varchar(10)
DETERMINISTIC
begin
DECLARE M ,I INT;
	SET I=2;
	SET M=n/2;
	IF n=0 || n=1 THEN 
		RETURN 'NOT PRIME';
    ELSE
		L1: LOOP
		WHILE I<=M DO
			IF n%2=0 THEN 
				RETURN 'NOT PRIME';
				LEAVE L1;
				ELSE
				SET I=I+1;
				ITERATE L1;
			END IF;
	   END WHILE;
       RETURN 'PRIME';
	END LOOP L1;
	END IF;
END$$
select prime_number(10);

-- 3.	Write a function to Convert an inputed number of inches into yards, feet, and inches. For example, 124 inches equals 3 yards, 1 foot, and 4 inches.
delimiter $$
create function Que3( val int(20)) 
returns varchar(200)
begin
return concat(val ,' inches ', round(val/36),' yards ',round(val/12),' foot ');
end;$$
select Que3(15);

-- 4.	Write a function to update salary of the employees of specified dept by 10%. Take dept no as parameter.
delimiter $$
create function Que4(dept int) 
returns varchar(20)
begin
update emp set sal=sal+(sal*0.10) where deptno=dept;
return 'UPDATED';
end;$$
SELECT Que4(30);

-- 5.	Create a function named USER_ANNUAL_COMP that has a parameter p_eno for passing on the values of  an employee number of the employee and p_comp for passing the compansation. In the function calculates and returns the annual compensation of the employee by using the following formula.
-- annual_compensation =  (p_sal+p_comm)*12
-- If the salary or commission value is NULL then zero should be substituted for it.  Give a call to USER_ANNUAL_COMP.

delimiter $$
create function Que5(empn int ,comp int ) 
returns int
begin
declare val int;
set val=(select sal from emp1 where empno=empn);
return (val+comp)*12;
end;$$
select Que5(1004,20) as 'updated salary';

create table emp1 as select * from assignment_7.emp;
 
-- 6.	Create a procedure called USER_QUERY_EMP that accepts three parameters. Parameter p_myeno is of IN parameter mode which provides the empno value. The other two parameters p_myjob and p_mysal are of OUT mode. The procedure retrieves the salary and job of an employee with the provided employee number and assigns those to the two OUT parameters respectively. The procedure should raise the error if the empno does not exist in the EMP table by displaying an appropriate message

delimiter $$
CREATE PROCEDURE USER_QUERY_EMP1 (IN P_ENO INT, OUT P_JOB VARCHAR(10), OUT P_SAL INT3 ) 
BEGIN
DECLARE NO INT;
SET NO = (SELECT COUNT(*) FROM EMP1 WHERE EMPNO=P_ENO);
IF NO=0 THEN 
SELECT 'employee not exists';
SET P_JOB='';
SET P_SAL=0;
ELSE 
SELECT SAL,JOB INTO P_SAL,P_JOB FROM EMP1 WHERE EMPNO=P_ENO;
END IF;
END$$
CALL USER_QUERY_EMP1(1005,@JOB,@SAL);
SELECT @JOB,@SAL

-- 7.	Create a procedure to print the inputted string in reverse order. If  inputted string is null display an appropriate message.
delimiter $$
 create procedure Que007(inout str varchar(200))
 begin
	if (str='' || isnull(str))  then
	set str= 'no string fount';
    else
    set str= (select reverse(str));
    end if;
 end $$
set @str1=null;
call Que007(@str1);
select @str1;

-- 8.	Create a procedure named ‘tabledetails’ which gives all the details of a particular table stored in database.
delimiter $$
create procedure tabledetails()
begin
show databases;
end$$

call tabledetails();
 




