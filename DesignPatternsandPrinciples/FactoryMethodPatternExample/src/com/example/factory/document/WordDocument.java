package FactoryMethodPatternExample.src.com.example.factory.document;

public class WordDocument implements Document {

    @Override
    public void open() {
        System.out.println("Opening Microsoft Word Document...");
    }
}