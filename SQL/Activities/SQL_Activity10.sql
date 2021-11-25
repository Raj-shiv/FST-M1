select * from salesman;
select * from orders;
select * from customers;

select * from orders where salesman_id=(select salesman_id from orders where customer_id='3007' );

select * from orders where salesman_id in (select salesman_id from salesman where SALESMAN_CITY='New York');
--Write a query to count the customers with grades above New York's average.
select grade, count(*) from customers group by grade having grade>(select AVG(GRADE) from customers where CITY='New York');

select * from orders where salesman_id in (select salesman_id from salesman where commission=(select max(commission) from salesman));
