# Spring-ProcessRecord-Sendto-Rest-Queue-from-Database
Spring Boot and Apache camel to get data from database, process the data and send the processed data to queue and Rest services. Only processed records in the last 1 minute are shown in rest. Every 1 minute, the variable which stores processed records to be shown in rest, is flushed and cleared.

CREATE TABLE ORDER_BOOK (ORDER_ID varchar(20),Customer_id varchar(20),ITEM_ID varchar(20),ITEM_QUANTITY INT,ITEM_PRICE INT,TOTAL_AMOUNT INT,ORDER_DATE DATE,EXPECTED_DELIVERY_DATE DATE,STATUS VARCHAR(20));

INSERT INTO ORDER_BOOK VALUES ('10','30','40',51,21,101,Current_timestamp,null,'OPEN');

then use  http://localhost:8080/books/getRecord in postman to get the required result

Output -
[
    {
        "ORDER_ID": "10",
        "CUST_ID": "30",
        "ITEM_ID": "40",
        "ITEM_QUANTITY": 51,
        "ITEM_PRICE": 21,
        "TOTAL_AMOUNT": 101,
        "ORDER_DATE": "2018-05-08",
        "EXP_DELIVERY_DATE": "2018-05-11",
        "STATUS": "PROCESSED"
    }
]
