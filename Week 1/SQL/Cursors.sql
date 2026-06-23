SET SERVEROUTPUT ON;

-- Scenario 1: Generate Monthly Statements

DECLARE
    CURSOR GenerateMonthlyStatements IS
        SELECT c.Name,
               t.TransactionID,
               t.TransactionDate,
               t.Amount,
               t.TransactionType
        FROM Customers c
        JOIN Accounts a
            ON c.CustomerID = a.CustomerID
        JOIN Transactions t
            ON a.AccountID = t.AccountID
        WHERE EXTRACT(MONTH FROM t.TransactionDate) =
              EXTRACT(MONTH FROM SYSDATE)
          AND EXTRACT(YEAR FROM t.TransactionDate) =
              EXTRACT(YEAR FROM SYSDATE);

    v_name Customers.Name%TYPE;
    v_tid Transactions.TransactionID%TYPE;
    v_date Transactions.TransactionDate%TYPE;
    v_amount Transactions.Amount%TYPE;
    v_type Transactions.TransactionType%TYPE;

BEGIN
    OPEN GenerateMonthlyStatements;

    LOOP
        FETCH GenerateMonthlyStatements
        INTO v_name, v_tid, v_date, v_amount, v_type;

        EXIT WHEN GenerateMonthlyStatements%NOTFOUND;

        DBMS_OUTPUT.PUT_LINE(
            'Customer: ' || v_name ||
            ', Transaction ID: ' || v_tid ||
            ', Amount: ' || v_amount ||
            ', Type: ' || v_type);
    END LOOP;

    CLOSE GenerateMonthlyStatements;
END;
/

-- Scenario 2: Apply Annual Fee

DECLARE
    CURSOR ApplyAnnualFee IS
        SELECT AccountID
        FROM Accounts;

    v_accid Accounts.AccountID%TYPE;
    annual_fee NUMBER := 100;

BEGIN
    OPEN ApplyAnnualFee;

    LOOP
        FETCH ApplyAnnualFee INTO v_accid;
        EXIT WHEN ApplyAnnualFee%NOTFOUND;

        UPDATE Accounts
        SET Balance = Balance - annual_fee
        WHERE AccountID = v_accid;

    END LOOP;

    CLOSE ApplyAnnualFee;

    COMMIT;
END;
/

-- Scenario 3: Update Loan Interest Rates

DECLARE
    CURSOR UpdateLoanInterestRates IS
        SELECT LoanID
        FROM Loans;

    v_loanid Loans.LoanID%TYPE;

BEGIN
    OPEN UpdateLoanInterestRates;

    LOOP
        FETCH UpdateLoanInterestRates INTO v_loanid;
        EXIT WHEN UpdateLoanInterestRates%NOTFOUND;

        UPDATE Loans
        SET InterestRate = InterestRate + 0.5
        WHERE LoanID = v_loanid;

    END LOOP;

    CLOSE UpdateLoanInterestRates;

    COMMIT;
END;
/

