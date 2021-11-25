REM   Script: SQL_Activity7
REM   aggregate functions on orders table
    
select sum(purchase_amount) as Total_Purchase_Amount from orders;
select avg(purchase_amount) as Average_Purchase_Amount from orders ;   
select max(purchase_amount) as Maximum_Purchase_Amount from orders;
select min(purchase_amount) as Minimum_Purchase_Amount from orders;
select count(salesman_id) as count_salesmans from orders;