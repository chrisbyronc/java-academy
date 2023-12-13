What did you learn yesterday?

1. DataSources
   1. Interface for database connectivity
      1. Generalized connector to databases
2. try/catch/finally
   1. finally block runs once the try/catch finishes
      1. Used to close connections, or clean up memory etc.
3. try-with-resources
   1. try (resources) {}
      1. closes the resources, that implements Autoclosable
4. Using JOINS in Java
   1. Regular queries in SQL, preparedStatement.executeQuery()
5. preparedStatement doesn't need query in this method -> preparedStatement.executeQuery()
6. Environment Variables - way to hide sensitive information
   1. Not only sensitive information
7. Use args[0] - to accept passwords/arguments from the cli
8. .env - another way to store sensitive information


Today's Objectives

1. DataManagers
2. All CRUD operations in JDBC

Agenda Today

1. Intro and Recap
2. We do codewars
3. Demo Datamanager
4. Break or
5. Exercise
6. Codewars
7. Lunch
8. CRUD demo
9. Exercise
10. Break
11. Codewars you do
12. Recap and Q&A

What did you learn today?

1. CRUD queries are basically executed and written the same 
2. 'text' - Clob data type
3. DataManager - class to communicate with db
4. INSERT, UPDATE, DELETE in jdbc
5. Primary Keys are faster than other fields