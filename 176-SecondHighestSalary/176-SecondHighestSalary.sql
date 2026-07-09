-- Last updated: 7/9/2026, 3:10:12 PM
select max(salary) as SecondHighestSalary 
from Employee
where salary<(select max(salary)
from Employee );
