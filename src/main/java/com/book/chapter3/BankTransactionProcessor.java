package com.book.chapter3;

import java.time.Month;
import java.util.List;

public class BankTransactionProcessor {
    private final List<BankTransaction> bankTransactions ;

    public BankTransactionProcessor(final List<BankTransaction> bankTransactions){
        this.bankTransactions = bankTransactions;
    }


    public double summarizeTransactions(final BankTransactionSummarizer bankTransactionSummarizer){
        double result = 0;
        for(final BankTransaction bankTransaction: bankTransactions){
            result = bankTransactionSummarizer.summarize(result,bankTransaction);
        }
        return result;
    }

    public double calculateTotalInMonth(final Month month){
        return summarizeTransactions((acc,bankTransaction)-> bankTransaction.getDate().getMonth() == month ? acc + bankTransaction.getAmount() : acc);
    }

}

