-- Last updated: 7/9/2026, 3:10:04 PM
select email as Email
from Person
group by email
having count(*)>1;