package com.book.chapter3;

import java.time.Month;

public class BankTransactionIsInFebruaryAndExpensive implements BankTransactionFilter{

    @Override
    public boolean test(final BankTransaction bankTransaction) {
        return (bankTransaction.getDate().getMonth() == Month.FEBRUARY && bankTransaction.getAmount() >= 10000 );
    }
}
