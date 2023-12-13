What did you learn yesterday?

1. Maven Archetypes - Templates, predefined scaffolding
   1. quickstart archetype
      1. Helps save time
      2. Starts without mistakes
2. JDBC - Java database connectivity
   1. API/Specification to connect to any DBMS
   2. Connection, Statement, Processing
3. UTF-8 - encoding standard
4. Drivers
5. Ports
6. PreparedStatements help prevent sql injection
7. SQL injection
   1. Cyber Attack on the Database
   2. Malicious SQL
      1. SELECT * FROM Articles 
      2. WHERE ArticleName LIKE '%?%' 
      3. OR ArticleType LIKE '%?%' 
      4. OR ArticleBody LIKE '%?';
   3. Anything'; DROP TABLE Users;--
8. Black Hat Hackers
   1. Hacks Maliciously
9.  White Hat Hackers
   1. Good hacker, doing it for the common good. Legal Hacking
10. Dependencies go in pom.xml 
    1.  POM - Project Object Model
    2.  <dependencies>
        1.  <dependency>


Today's Objectives

1. Handling Exceptions w/ JDBC
2. finally
3. try-with-resources
4. DataSources


Agenda Today

1. Intro and Recap
2. Finish Exercise from yesterday / Codewars
3. Handling Exceptions / Finally demo
4. Break
5. Exercise
6. try-with-resources demo
7. Lunch
8. DataSources and args/configuration demo
9. Exercises
10. Break
11. Codewars
12. Recap and Q&A


What did you learn today?

1. Datasource
2. commons.apache.org's project docs
3. Datamanager class is middleman
4. need more on jar building
5. env variables
6. hackers != bad, black hat = bad
7. try catch finally
8. try-with-resources for autoclose methods
9. close methods on the jdbc api can throw exceptions
10. JOINS in java
