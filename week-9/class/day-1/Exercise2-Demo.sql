-- 1. What is the name of the table that holds the items Northwind sells

-- Products


-- 2. Write a query to list the product id, product name, and unit price of every product

SELECT 
	ProductID,
    ProductName,
    UnitPrice
FROM
	Products;
    
    
-- 3. Write a query to list the product id, product name, and unit price of every product. 
-- Except this time, sort price by ascending order

SELECT 
	ProductID,
    ProductName,
    UnitPrice
FROM
	Products
ORDER BY UnitPrice ASC;


-- 4. What are the products that we carry where the unit price is $7.50 or less?

SELECT 
    ProductName
FROM
	Products
WHERE UnitPrice <= 7.50;


-- 5. What are the products that we carry where we have at least 100 units on hand? 
-- Order them in descending order by price

SELECT 
	ProductName
FROM
	Products
WHERE UnitsInStock >= 100
ORDER BY UnitPrice DESC;









