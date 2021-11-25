select customers.customer_name,customers.city,salesman.salesman_name,salesman.commission from customers  inner join salesman  on customers.salesman_id=salesman.salesman_id

select a.customer_name,a.city,b.salesman_name,b.grade from customers a inner join salesman b on a.salesman_id=b.salesman_id where b.grade<300 order by grade asc 

select a.customer_name,a.city,b.salesman_name,b.commission from customers a inner join salesman b on a.salesman_id=b.salesman_id where b.commission>12 order by commission asc 

select a.ORDER_NO,a.ORDER_DATE,a.PURCHASE_AMOUNT,b.customer_name,c.salesman_name,c.commission from orders a
    inner join customers b on a.salesman_id=b.salesman_id
    inner join salesman c on b.salesman_id = c.salesman_id
    