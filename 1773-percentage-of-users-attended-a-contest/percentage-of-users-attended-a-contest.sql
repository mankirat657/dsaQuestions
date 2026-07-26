# Write your MySQL query statement below
select r.contest_id,ifnull(ROUND(COUNT(r.user_id) * 100.0/ (select COUNT(*) from Users),2),0.00) as percentage 
from Users u
left join Register r
on u.user_id = r.user_id
where r.contest_id is not null
group by r.contest_id ORDER BY percentage DESC, contest_id ASC;