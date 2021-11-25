select * from orders
select CUSTOMER_ID,max(PURCHASE_AMOUNT) from orders group by CUSTOMER_ID,PURCHASE_AMOUNT;
select CUSTOMER_ID,max(PURCHASE_AMOUNT) from orders where ORDER_DATE=to_date('2012-08-17','yyyy/mm/dd') group by CUSTOMER_ID,PURCHASE_AMOUNT;
select CUSTOMER_ID,max(PURCHASE_AMOUNT),ORDER_DATE from orders having max(PURCHASE_AMOUNT) in (2030, 3450, 5760, 6000) group by CUSTOMER_ID,ORDER_DATE;
