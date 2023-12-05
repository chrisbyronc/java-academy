Today's Objectives

1. Intro to SQL
2. RDBMS
3. MySQL workbench
4. Querying Data
   1. SELECT
   2. FROM
   3. WHERE


Today's Agenda

1. Intro and Icebreaker
2. Check MySQL Workbench
3. Intro to SQL
4. Intro to the Workbench
5. Break
6. Exercise - w/o querying
7. SELECT
8. ORDER BY
9. WHERE
10. LIKE BETWEEN
11. Lunch
12. Exercise 1 and 2
13. Break
14. We do exercises
15. Codewars
16. Recap and Q&A




What did you learn today?

1. CRUD - Create, Read, Update, Delete
2. RDBMS - Relational Database Management System
3. SQL - Structured Query Language
   1. Typically relational data
   2. Stored in columns and rows
   3. Columns - Data specifier - Header - Data label - Designating type
   4. Rows - Data itself, values
   5. One of SQL servers
      1. MySQL
      2. MSSQL
      3. Redshift
      4. Oracle
      5. PostgreSQL
   6. Commands
      1. USE - Specifies the DB we will use for the rest of our script/usage
         1. Ran once at beginning of script execution
      2. SELECT - columns
         1. additional column separated by ,
         2. * selects all columns
         3. DISTINCT column_name - removes duplicates, looks at unique values only
      3. FROM - specify table to read data from
      4. WHERE - condition expressions
         1. LIKE - looks for values like value
            1. wildcard % looks for "anything" 
            2. '%a%' - looks for a contained in string
            3. '%a' - ends with a
            4. 'a%' - starts with a
         2. BETWEEN - range
      5. ORDER BY - sorts
         1. sorts by column
         2. by default sorts by ascending order
         3. ASC or DESC for order
      6. DROP - data/table/db