-- Last updated: 7/9/2026, 3:10:06 PM
select e1.name as Employee
from Employee e1
join Employee e2
on e1.managerID=e2.id
where e1.salary>e2.salary;
