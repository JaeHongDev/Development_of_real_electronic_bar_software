package com.book.chapter3;

public class HtmlExporter implements Exporter{

    @Override
    public String export(SummaryStatistics summaryStatistics) {
        return "<!doctype html>" +
                "<html lang='en'>" +
                "<head><title>Bank Transaction Report</title></head>" +
                "<body>" +
                "<ul>" +
                "<li><strong>The sum is</strong>:" + summaryStatistics.getSum() + "</li>";
    }
}
