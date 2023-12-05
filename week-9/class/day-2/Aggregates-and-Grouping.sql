-- 1. How many suppliers are there?


SELECT COUNT(*) AS total_suppliers
FROM Suppliers;



-- 2. What is the sum of all the employees salaries?


SELECT ROUND(SUM(Salary), 2) AS Total_Salary
FROM Employees;



-- 3. What is the price of the cheapest item that Northwind sells?


SELECT CONCAT("$", ROUND(MIN(UnitPrice), 2)) AS Cheapest_Price
FROM Products;



-- 4. What is the average price of items that Northwind sells?


SELECT CONCAT("$", ROUND(AVG(UnitPrice), 2)) AS Average_Price
FROM Products;




-- 5. What is the price of the most expensive item that Northwind sells?


SELECT CONCAT("$", ROUND(MAX(UnitPrice), 2)) AS Most_Expensive_Price
FROM Products;




-- 9. List the product id, product name, and inventory value
-- (calculated by multiplying unit price by the number of units on hand). 
-- Sort the results in descending order by value. If two or more have the same value,
-- order by product name.


SELECT 
	ProductID,
    ProductName,
    ROUND((UnitPrice * UnitsInStock), 2) AS Inventory_Value,
    CONCAT("$", ROUND((UnitPrice * UnitsInStock), 2)) AS Inventory_Value_With_Currency
FROM Products
ORDER BY Inventory_Value DESC, ProductName;
