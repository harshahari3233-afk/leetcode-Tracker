-- Last updated: 7/9/2026, 3:10:01 PM
select e.name as Employee, d.name as Department,e.salary as Salary 
from Employee e
join Department d
on e.departmentId=d.id
where e.salary=(select max(salary) from Employee  where departmentId=e.departmentId   );
