USE northwind;



-- 1. List the product id, product name, unit price, and category name of all products.
-- Order by the category name and within that, product name



SELECT 
	p.ProductID,
    p.ProductName,
    p.UnitPrice,
    c.CategoryName
FROM 
	Products AS p 
    INNER JOIN Categories AS c ON p.CategoryID = c.CategoryID
ORDER BY c.CategoryName, p.ProductName;




-- 2. List the product id, product name, unit price, and supplier name of all products
-- that cost more than $75. Order by product name.

SELECT
	p.ProductID,
    p.ProductName,
    p.UnitPrice,
    s.CompanyName AS 'SupplierName'
FROM
	Products AS p
    INNER JOIN Suppliers AS s ON p.SupplierID = s.SupplierID
WHERE p.UnitPrice > 75
ORDER BY p.ProductName;



-- 3. List the product id, product name, unit price, category name, 
-- and supplier name of every product. Order by product name.


SELECT
	p.ProductID,
    p.ProductName,
    p.UnitPrice,
    c.CategoryName,
    s.CompanyName
FROM
    Products p
    INNER JOIN Categories c ON p.CategoryID = c.CategoryID 
    INNER JOIN Suppliers s ON p.SupplierID = s.SupplierID
ORDER BY p.ProductName;
    
    



-- 6. List the order id, order date, ship name, and ship address of all "Sasquatch Ale" orders.

-- With Subquery
SELECT
	o.OrderID,
    o.OrderDate,
    o.ShipName,
    o.ShipAddress
FROM
	Orders AS o
    INNER JOIN `Order Details` AS od ON o.OrderID = od.OrderID
WHERE ProductID =
	(SELECT ProductID
	FROM products
	WHERE ProductName = "Sasquatch Ale")
ORDER BY o.OrderDate;


-- With JOIN
SELECT
	o.OrderID,
    o.OrderDate,
    o.ShipName,
    o.ShipAddress
FROM
	Orders AS o
    INNER JOIN `Order Details` AS od ON o.OrderID = od.OrderID
    INNER JOIN Products AS p ON od.ProductID = p.ProductID
WHERE p.ProductName = "Sasquatch Ale"
ORDER BY o.OrderDate;


-- With condition in JOIN
SELECT
	o.OrderID,
    o.OrderDate,
    o.ShipName,
    o.ShipAddress
FROM
	Orders AS o
    INNER JOIN `Order Details` AS od ON o.OrderID = od.OrderID
    INNER JOIN Products AS p ON od.ProductID = p.ProductID AND p.ProductName = "Sasquatch Ale"
ORDER BY o.OrderDate;


