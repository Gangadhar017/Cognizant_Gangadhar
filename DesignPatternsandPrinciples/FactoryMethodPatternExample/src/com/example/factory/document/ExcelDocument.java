package FactoryMethodPatternExample.src.com.example.factory.document;

public class ExcelDocument implements Document {

    @Override
    public void open() {
        System.out.println("Opening Excel Spreadsheet...");
    }
}