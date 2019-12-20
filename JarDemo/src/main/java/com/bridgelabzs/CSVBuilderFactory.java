package com.bridgelabzs;

public class CSVBuilderFactory {

    public static ICSVBuilder createOpenCSVBuilder() {

        return new OpenCSVBuilder<>();
    }
}
