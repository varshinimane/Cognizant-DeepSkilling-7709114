-- Scenario 1: CustomerManagement Package

CREATE OR REPLACE PACKAGE CustomerManagement AS
    PROCEDURE AddCustomer(
        p_customerid NUMBER,
        p_name VARCHAR2,
        p_dob DATE,
        p_balance NUMBER);

    PROCEDURE UpdateCustomer(
        p_customerid NUMBER,
        p_name VARCHAR2);

    FUNCTION GetCustomerBalance(
        p_customerid NUMBER)
    RETURN NUMBER;
END CustomerManagement;
/

CREATE OR REPLACE PACKAGE BODY CustomerManagement AS

    PROCEDURE AddCustomer(
        p_customerid NUMBER,
        p_name VARCHAR2,
        p_dob DATE,
        p_balance NUMBER)
    IS
    BEGIN
        INSERT INTO Customers
        VALUES(p_customerid, p_name, p_dob, p_balance, SYSDATE);
    END;

    PROCEDURE UpdateCustomer(
        p_customerid NUMBER,
        p_name VARCHAR2)
    IS
    BEGIN
        UPDATE Customers
        SET Name = p_name
        WHERE CustomerID = p_customerid;
    END;

    FUNCTION GetCustomerBalance(
        p_customerid NUMBER)
    RETURN NUMBER
    IS
        v_balance NUMBER;
    BEGIN
        SELECT Balance INTO v_balance
        FROM Customers
        WHERE CustomerID = p_customerid;

        RETURN v_balance;
    END;

END CustomerManagement;
/

-- Scenario 2: EmployeeManagement Package

CREATE OR REPLACE PACKAGE EmployeeManagement AS
    PROCEDURE HireEmployee(
        p_empid NUMBER,
        p_name VARCHAR2,
        p_position VARCHAR2,
        p_salary NUMBER,
        p_department VARCHAR2,
        p_hiredate DATE);

    PROCEDURE UpdateEmployee(
        p_empid NUMBER,
        p_salary NUMBER);

    FUNCTION CalculateAnnualSalary(
        p_empid NUMBER)
    RETURN NUMBER;
END EmployeeManagement;
/

CREATE OR REPLACE PACKAGE BODY EmployeeManagement AS

    PROCEDURE HireEmployee(
        p_empid NUMBER,
        p_name VARCHAR2,
        p_position VARCHAR2,
        p_salary NUMBER,
        p_department VARCHAR2,
        p_hiredate DATE)
    IS
    BEGIN
        INSERT INTO Employees
        VALUES(p_empid,p_name,p_position,p_salary,p_department,p_hiredate);
    END;

    PROCEDURE UpdateEmployee(
        p_empid NUMBER,
        p_salary NUMBER)
    IS
    BEGIN
        UPDATE Employees
        SET Salary = p_salary
        WHERE EmployeeID = p_empid;
    END;

    FUNCTION CalculateAnnualSalary(
        p_empid NUMBER)
    RETURN NUMBER
    IS
        v_salary NUMBER;
    BEGIN
        SELECT Salary INTO v_salary
        FROM Employees
        WHERE EmployeeID = p_empid;

        RETURN v_salary * 12;
    END;

END EmployeeManagement;
/

-- Scenario 3: AccountOperations Package

CREATE OR REPLACE PACKAGE AccountOperations AS
    PROCEDURE OpenAccount(
        p_accid NUMBER,
        p_customerid NUMBER,
        p_type VARCHAR2,
        p_balance NUMBER);

    PROCEDURE CloseAccount(
        p_accid NUMBER);

    FUNCTION GetTotalBalance(
        p_customerid NUMBER)
    RETURN NUMBER;
END AccountOperations;
/

CREATE OR REPLACE PACKAGE BODY AccountOperations AS

    PROCEDURE OpenAccount(
        p_accid NUMBER,
        p_customerid NUMBER,
        p_type VARCHAR2,
        p_balance NUMBER)
    IS
    BEGIN
        INSERT INTO Accounts
        VALUES(p_accid,p_customerid,p_type,p_balance,SYSDATE);
    END;

    PROCEDURE CloseAccount(
        p_accid NUMBER)
    IS
    BEGIN
        DELETE FROM Accounts
        WHERE AccountID = p_accid;
    END;

    FUNCTION GetTotalBalance(
        p_customerid NUMBER)
    RETURN NUMBER
    IS
        v_total NUMBER;
    BEGIN
        SELECT SUM(Balance)
        INTO v_total
        FROM Accounts
        WHERE CustomerID = p_customerid;

        RETURN v_total;
    END;

END AccountOperations;
/

