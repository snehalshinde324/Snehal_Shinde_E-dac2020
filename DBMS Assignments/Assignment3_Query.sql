use cdac;
select * from employee;
alter table employee add column (salary int(6), manager int(2));
insert into employee values (1, 'Arun', 1, 8000, 4);
insert into employee values (2, 'Kiran', 1, 7000, 1);
insert into employee values (3, 'Scott', 1, 3000, 1);
insert into employee(emp_id, emp_name, dept_id, salary) values (4, 'Max', 2, 9000);
insert into employee values (5, 'Jack', 2, 8000, 4);
insert into employee(emp_id, emp_name, salary, manager) values (6, 'King', 6000, 1);

create table Department (dept_id int(5), dept_name varchar(50));
insert into Department values (1, 'Finance');
insert into Department values (2, 'Training');
insert into Department values (3, 'Marketing');
select * from Department;
alter table department modify dept_id int(5) NOT NULL;
alter table department add primary key (dept_id);
alter table employee add constraint fk_dept_id foreign key (dept_id) references department(dept_id);
desc department;
desc employee;

-- Order By
select aname from authors order by aname asc;
select pname from publishers order by pname desc;

-- Group By
select sum(salary),emp_id,emp_name,dept_id,manager from employee group by dept_id;
select dept_id, sum(salary) from employee where salary > 17000 group by dept_id;

-- Having
select dept_id, sum(salary) from employee group by dept_id having sum(salary) > 18000;
select dept_id, sum(salary) from employee group by dept_id having sum(salary) < 20000;