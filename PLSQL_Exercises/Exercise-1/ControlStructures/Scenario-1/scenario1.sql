SET SERVEROUTPUT ON;

DECLARE
    CURSOR customer_cursor IS
        SELECT c.CustomerID,
               FLOOR(MONTHS_BETWEEN(SYSDATE, c.DOB) / 12) AS CustomerAge,
               l.LoanID
        FROM Customers c
        JOIN Loans l
          ON c.CustomerID = l.CustomerID
        ORDER BY c.CustomerID, l.LoanID;
BEGIN
    FOR customer_rec IN customer_cursor LOOP
        IF customer_rec.CustomerAge > 60 THEN
            UPDATE Loans
            SET InterestRate = ROUND(InterestRate * 0.99, 2)
            WHERE LoanID = customer_rec.LoanID;

            DBMS_OUTPUT.PUT_LINE(
                '1% Discount Applied to Customer ' || customer_rec.CustomerID
            );
        END IF;
    END LOOP;

    COMMIT;
END;
/
