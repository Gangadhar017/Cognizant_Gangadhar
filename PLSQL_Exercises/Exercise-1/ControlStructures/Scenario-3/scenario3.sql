SET SERVEROUTPUT ON;

DECLARE
    CURSOR loan_cursor IS
        SELECT c.CustomerID,
               c.Name,
               l.LoanID,
               l.DueDate
        FROM Customers c
        JOIN Loans l
          ON c.CustomerID = l.CustomerID
        WHERE TRUNC(l.DueDate) BETWEEN TRUNC(SYSDATE) AND TRUNC(SYSDATE) + 30
        ORDER BY l.LoanID;
BEGIN
    FOR loan_rec IN loan_cursor LOOP
        DBMS_OUTPUT.PUT_LINE(
            'Reminder'
            || CHR(10) ||
            'Customer : ' || loan_rec.Name
            || CHR(10) ||
            'Loan ID : ' || loan_rec.LoanID
            || CHR(10) ||
            'Due Date : ' || TO_CHAR(loan_rec.DueDate, 'DD-MON-YYYY')
        );
    END LOOP;
END;
/
