# Write your MySQL query statement below
select
a.machine_id,ROUND(AVG(a2.timestamp - a.timestamp),3) as processing_time
from Activity as a inner join Activity as a2 on a.machine_id = a2.machine_id and a.process_id = a2.process_id and a.activity_type = 'start' and a2.activity_type = 'end' group by a.machine_id;