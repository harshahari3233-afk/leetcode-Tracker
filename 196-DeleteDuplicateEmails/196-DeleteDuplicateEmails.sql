-- Last updated: 7/9/2026, 3:09:56 PM
delete p1
from  Person p1,Person p2
where p1.email=p2.email and p1.id>p2.id;
