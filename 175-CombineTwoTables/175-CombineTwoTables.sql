-- Last updated: 7/9/2026, 3:10:13 PM
select s.firstName,s.lastName,d.city,d.state
from Address d
right  join Person s
on d.personId=s.personId;
