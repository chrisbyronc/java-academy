USE northwind;


-- 1. What is the product name(s) of the most expensive products?
-- HINT: Find the max price in a subquery and 
-- then use that value to find products whose price equals that value


SELECT 
    ProductName
FROM
    Products
WHERE
    UnitPrice = (
		SELECT 
            MAX(UnitPrice)
        FROM
            Products);



-- 2. What is the order id, shipping name and shipping address of all orders shipped 
-- via "Federal Shipping"? 
-- HINT: Find the shipper id of "Federal Shipping" in a subquery and 
-- then use that value to find the orders that used that shipper

SELECT 
    OrderID, ShipName, ShipAddress
FROM
    Orders
WHERE
    ShipVia = (
		SELECT 
            ShipperID
        FROM
            Shippers
        WHERE
            CompanyName = 'Federal Shipping');








