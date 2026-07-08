SET SERVEROUTPUT ON;

CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus
(
    p_department IN Employees.Department%TYPE,
    p_bonus IN NUMBER
)
IS
BEGIN
    UPDATE Employees
    SET Salary = ROUND(Salary * (1 + p_bonus / 100), 2)
    WHERE Department = p_department;

    COMMIT;

    DBMS_OUTPUT.PUT_LINE('Bonus Updated.');
END;
/

BEGIN
    UpdateEmployeeBonus('IT', 10);
END;
/
