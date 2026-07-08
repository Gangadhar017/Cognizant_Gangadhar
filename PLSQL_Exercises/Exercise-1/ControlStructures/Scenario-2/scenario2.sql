SET SERVEROUTPUT ON;

DECLARE
    CURSOR customer_cursor IS
        SELECT CustomerID, Balance
        FROM Customers
        ORDER BY CustomerID;
BEGIN
    FOR customer_rec IN customer_cursor LOOP
        IF customer_rec.Balance > 10000 THEN
            UPDATE Customers
            SET IsVIP = 'TRUE'
            WHERE CustomerID = customer_rec.CustomerID;

            DBMS_OUTPUT.PUT_LINE(
                'Customer ' || customer_rec.CustomerID || ' promoted to VIP.'
            );
        END IF;
    END LOOP;

    COMMIT;
END;
/
