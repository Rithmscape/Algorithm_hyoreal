-- 코드를 입력하세요
# WITH SALES_DATA AS (
#     SELECT SALES_DATE,
#            PRODUCT_ID,
#            USER_ID,
#            SALES_AMOUNT
#     FROM ONLINE_SALE
#     UNION ALL
#     SELECT SALES_DATE,
#            PRODUCT_ID,
#            NULL AS USER_ID,
#            SALES_AMOUNT
#     FROM OFFLINE_SALE
# )

# SELECT DATE_FORMAT(SALES_DATE, "%Y-%m-%d") AS SALES_DATE,
#        PRODUCT_ID,
#        USER_ID,
#        SALES_AMOUNT
# FROM SALES_DATA
# WHERE SALES_DATE 
# BETWEEN "2022-03-01" AND "2022-03-31"
# ORDER BY SALES_DATE, PRODUCT_ID, USER_ID;

select date_format(sales_date, '%Y-%m-%d') as sales_date, product_id, user_id, sales_amount
from online_sale
where sales_date >= '2022-03-01' and sales_date < '2022-04-01'

union all

select date_format(sales_date, '%Y-%m-%d') as sales_date, product_id, NULL as user_id, sales_amount
from offline_sale
where sales_date >= '2022-03-01' and sales_date < '2022-04-01'

order by sales_date, product_id, user_id