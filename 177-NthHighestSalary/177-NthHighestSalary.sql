-- Last updated: 7/9/2026, 3:10:10 PM
CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
set N=N-1;
  RETURN (
    select(
      select distinct salary
      from Employee 
      order by salary desc
      limit N,1
    )
  );
END