package com.book.chapter3;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Objects;

public class OverlySpecificBankStatementValidator {
    private String description ;
    private String date;
    private String amount;

    public OverlySpecificBankStatementValidator(final String description,final String date, final String amount){
        this.description = Objects.requireNonNull(description);
        this.date = Objects.requireNonNull(date);
        this.amount = Objects.requireNonNull(amount);
    }

    public boolean validate() throws DescriptionTooLongException,InvalidDateFormat{
        if(this.description.length() > 100){
            throw new DescriptionTooLongException();
        }

        final LocalDate parsedDate;
        try{
            parsedDate = LocalDate.parse(this.date);
        }catch(DateTimeParseException e) {
            throw new InvalidDateFormat();
        }
    }

}
