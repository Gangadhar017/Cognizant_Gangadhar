# Exercise 1 - PL/SQL Control Structures

## Overview

This exercise demonstrates PL/SQL control structures for three banking scenarios. The solutions use explicit cursors, loops, conditional statements, updates, commits, Oracle date functions, and `DBMS_OUTPUT.PUT_LINE`.

## Directory Structure

```text
Exercise-1/
|-- README.md
`-- ControlStructures/
    |-- Scenario-1/
    |   |-- README.md
    |   |-- scenario1.sql
    |   `-- output.txt
    |-- Scenario-2/
    |   |-- README.md
    |   |-- scenario2.sql
    |   `-- output.txt
    `-- Scenario-3/
        |-- README.md
        |-- scenario3.sql
        `-- output.txt
```

## Database Prerequisites

Run these scripts from the `PLSQL_Exercises/Database` folder before executing the scenarios:

1. `schema.sql`
2. `sample_data.sql`

## Scenarios

### Scenario 1 - Loan Interest Discount

Customers older than 60 receive a 1% discount on their current loan interest rates.

### Scenario 2 - Customer VIP Promotion

Customers with balances greater than 10000 are marked as VIP.

### Scenario 3 - Loan Due Reminder

Reminder messages are printed for loans due within the next 30 days.

## Execution Order

```text
1. Database/schema.sql
2. Database/sample_data.sql
3. Exercise-1/ControlStructures/Scenario-1/scenario1.sql
4. Exercise-1/ControlStructures/Scenario-2/scenario2.sql
5. Exercise-1/ControlStructures/Scenario-3/scenario3.sql
```
