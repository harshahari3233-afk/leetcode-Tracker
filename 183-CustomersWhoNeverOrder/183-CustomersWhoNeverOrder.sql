-- Last updated: 7/9/2026, 3:10:03 PM
select name as Customers 
from Customers c
where  c.id not in ( select customerID from Orders)