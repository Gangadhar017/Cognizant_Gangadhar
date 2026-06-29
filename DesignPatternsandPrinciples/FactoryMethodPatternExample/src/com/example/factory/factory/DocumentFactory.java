package FactoryMethodPatternExample.src.com.example.factory.factory;

import FactoryMethodPatternExample.src.com.example.factory.document.Document;

public abstract class DocumentFactory {

    // Factory Method
    public abstract Document createDocument();

    // Common operation
    public void openDocument() {
        Document document = createDocument();
        document.open();
    }
}