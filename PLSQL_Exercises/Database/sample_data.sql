INSERT INTO Customers (CustomerID, Name, DOB, Balance, IsVIP) VALUES
(101, 'John', DATE '1955-03-15', 15000, 'FALSE');

INSERT INTO Customers (CustomerID, Name, DOB, Balance, IsVIP) VALUES
(102, 'Alice', DATE '1988-07-18', 8500, 'FALSE');

INSERT INTO Customers (CustomerID, Name, DOB, Balance, IsVIP) VALUES
(103, 'David', DATE '1958-01-12', 25000, 'FALSE');

INSERT INTO Customers (CustomerID, Name, DOB, Balance, IsVIP) VALUES
(104, 'Emma', DATE '1995-08-28', 6000, 'FALSE');

INSERT INTO Customers (CustomerID, Name, DOB, Balance, IsVIP) VALUES
(105, 'Robert', DATE '1949-06-02', 18000, 'FALSE');


INSERT INTO Loans (LoanID, CustomerID, InterestRate, DueDate) VALUES
(501, 101, 9.5, TRUNC(SYSDATE) + 15);

INSERT INTO Loans (LoanID, CustomerID, InterestRate, DueDate) VALUES
(502, 102, 10.0, TRUNC(SYSDATE) + 50);

INSERT INTO Loans (LoanID, CustomerID, InterestRate, DueDate) VALUES
(503, 103, 8.5, TRUNC(SYSDATE) + 25);

INSERT INTO Loans (LoanID, CustomerID, InterestRate, DueDate) VALUES
(504, 104, 9.0, TRUNC(SYSDATE) + 10);

INSERT INTO Loans (LoanID, CustomerID, InterestRate, DueDate) VALUES
(505, 105, 8.0, TRUNC(SYSDATE) + 5);

COMMIT;
