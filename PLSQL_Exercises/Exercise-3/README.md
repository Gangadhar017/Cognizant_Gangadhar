# Exercise 3 - PL/SQL Stored Procedures

## Overview

This exercise demonstrates stored procedures for banking and employee management tasks. The solutions create reusable procedures, pass input parameters, validate business rules, update tables, commit successful work, and print status messages.

## Directory Structure

```text
Exercise-3/
|-- README.md
`-- StoredProcedures/
    |-- Scenario-1/
    |   |-- README.md
    |   |-- process_monthly_interest.sql
    |   `-- output.txt
    |-- Scenario-2/
    |   |-- README.md
    |   |-- update_employee_bonus.sql
    |   `-- output.txt
    `-- Scenario-3/
        |-- README.md
        |-- transfer_funds.sql
        `-- output.txt
```

## Database Prerequisites

For Scenario 1 and Scenario 3, run:

1. `Database/bank_schema.sql`
2. `Database/sample_bank_data.sql`

For Scenario 2, run:

1. `Database/employee_schema.sql`
2. `Database/sample_employee_data.sql`

## Scenarios

### Scenario 1 - Process Monthly Interest

`ProcessMonthlyInterest` applies 1% monthly interest to all savings accounts.

### Scenario 2 - Update Employee Bonus

`UpdateEmployeeBonus` updates employee salaries in a specified department using a bonus percentage parameter.

### Scenario 3 - Transfer Funds

`TransferFunds` transfers money from one account to another only when the source account has sufficient balance.

## Execution Order

```text
1. Database/bank_schema.sql
2. Database/sample_bank_data.sql
3. Exercise-3/StoredProcedures/Scenario-1/process_monthly_interest.sql
4. Exercise-3/StoredProcedures/Scenario-3/transfer_funds.sql

5. Database/employee_schema.sql
6. Database/sample_employee_data.sql
7. Exercise-3/StoredProcedures/Scenario-2/update_employee_bonus.sql
```
