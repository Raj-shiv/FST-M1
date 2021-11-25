REM   Script: SQL_Activity4
REM   Alter and update the salesman table

create table salesman(  
        salesman_id int,  
        salesman_name varchar2(20),  
        salesman_city varchar2(20),  
        commission int  
        );

INSERT ALL 
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
SELECT 1 FROM DUAL;

INSERT ALL 
    INTO salesman VALUES(5001, 'James Hoog', 'New York', 15) 
    INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13) 
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
     
SELECT 1 FROM DUAL;

select salesman_id,salesman_city from salesman;

select * from salesman;

select salesman_id,commision from salesman where salesman_name='Paul Adam' ;

select * from salesman;

select salesman_id,COMMISSION from salesman where salesman_name='Paul Adam' ;

alter table salesman 
add( grade int);

select * from salesman;

update salesman 
    set grade=100;

select * from salesman;

