SET SERVEROUTPUT ON;

CREATE OR REPLACE PROCEDURE TransferFunds
(
    p_from_account_id IN Accounts.AccountID%TYPE,
    p_to_account_id IN Accounts.AccountID%TYPE,
    p_amount IN Accounts.Balance%TYPE
)
IS
    v_from_balance Accounts.Balance%TYPE;
    v_destination_count NUMBER;
BEGIN
    IF p_amount IS NULL OR p_amount <= 0 THEN
        DBMS_OUTPUT.PUT_LINE('Transfer amount must be greater than zero.');
        RETURN;
    END IF;

    IF p_from_account_id = p_to_account_id THEN
        DBMS_OUTPUT.PUT_LINE('Source and destination accounts must be different.');
        RETURN;
    END IF;

    SELECT Balance
    INTO v_from_balance
    FROM Accounts
    WHERE AccountID = p_from_account_id
    FOR UPDATE;

    SELECT COUNT(*)
    INTO v_destination_count
    FROM Accounts
    WHERE AccountID = p_to_account_id;

    IF v_destination_count = 0 THEN
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE('Destination account does not exist.');
        RETURN;
    END IF;

    IF v_from_balance >= p_amount THEN
        UPDATE Accounts
        SET Balance = Balance - p_amount
        WHERE AccountID = p_from_account_id;

        UPDATE Accounts
        SET Balance = Balance + p_amount
        WHERE AccountID = p_to_account_id;

        COMMIT;

        DBMS_OUTPUT.PUT_LINE('Transfer Successful.');
    ELSE
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE('Insufficient Balance.');
    END IF;

EXCEPTION
    WHEN NO_DATA_FOUND THEN
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE('Source account does not exist.');
    WHEN OTHERS THEN
        ROLLBACK;
        RAISE;
END;
/

BEGIN
    TransferFunds(1001, 1002, 5000);
END;
/
