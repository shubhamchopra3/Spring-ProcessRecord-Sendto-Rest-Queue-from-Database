# Spring-ProcessRecord-Sendto-Rest-Queue-from-Database
Spring Boot and Apache camel to get data from database, process the data and send the processed data to queue and Rest services. Only processed records in the last 1 minute are shown in rest. Every 1 minute, the variable which stores processed records to be shown in rest, is flushed and cleared.
