package com.book.chapter4;

import java.io.File;
import java.io.IOException;

public class InvoiceImporter  implements Importer{
    private static final String NAME_PREFIX = "Dear ";
    private static final String AMOUNT_PREFIX = "Amount: ";

    @Override
    public Document importFile(File file) throws IOException {
        final TextFile textFile = new TextFile(file);


    }
}
