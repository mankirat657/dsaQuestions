# Write your MySQL query statement below
select p.product_id, IFNULL(ROUND(SUM(p.price * s.units) /SUM(s.units),2),0.00) as average_price
from Prices as p left join
UnitsSold as s on p.product_id = s.product_id and s.purchase_date between p.start_date and p.end_date
group by p.product_id