BEGIN
    EXECUTE IMMEDIATE 'DROP TABLE Accounts CASCADE CONSTRAINTS';
EXCEPTION
    WHEN OTHERS THEN
        IF SQLCODE != -942 THEN
            RAISE;
        END IF;
END;
/

CREATE TABLE Accounts
(
    AccountID NUMBER PRIMARY KEY,
    CustomerName VARCHAR2(100) NOT NULL,
    AccountType VARCHAR2(20) NOT NULL,
    Balance NUMBER(12,2) DEFAULT 0 NOT NULL,
    CONSTRAINT chk_account_type CHECK (AccountType IN ('Savings', 'Current'))
);
