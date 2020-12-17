use cdac;
-- Joins
select dept_name, emp_name from department inner join employee on department.dept_id = employee.dept_id;
select * from department inner join employee on department.dept_id = employee.dept_id;
select dept_id, sum(salary) from employee group by dept_id;
select dept_name, emp_name from department right join employee on department. dept_id = employee.dept_id;
select dept_name, emp_name from department left join employee on department. dept_id = employee.dept_id;
select e.emp_name, m.manager from employee e, employee m where e.emp_id = m.emp_id; 
select emp_name, dept_name from employee inner join department on employee.dept_id = department.dept_id; 
select * from employee;
select * from department;

-- Union
create table emp1 (emp_no int(5), emp_name varchar(10));
create table emp2 as select * from emp1;
insert into emp1 values (1, 'A');
insert into emp1 values (2, 'B');
insert into emp1 values (3, 'C');
insert into emp2 values (1, 'A');
insert into emp2 values (2, 'B');
insert into emp2 values (4, 'D');
insert into emp2 values (5, 'E');
select * from emp1 union select * from emp2;
select * from emp1 union all select * from emp2;

-- Subquery
select emp_name from employee where salary in (select salary from employee where salary = 8000);
-- select emp_name from employee where salary=(select salary from employee where emp_name='Arun');
select emp_name from employee where dept_id in (select dept_id from employee where dept_id = 2);
-- select emp_name from employee where dept_id=(select dept_id from employee where emp_name='Jack');
select emp_name from employee where salary in (select min(salary) from employee);
update employee set salary = 15000 where dept_id = (select dept_id where dept_id = 2);
select * from employee;