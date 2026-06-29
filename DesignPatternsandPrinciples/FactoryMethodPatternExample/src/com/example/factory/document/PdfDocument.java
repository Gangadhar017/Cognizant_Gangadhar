package FactoryMethodPatternExample.src.com.example.factory.document;

public class PdfDocument implements Document {

    @Override
    public void open() {
        System.out.println("Opening PDF Document...");
    }
}