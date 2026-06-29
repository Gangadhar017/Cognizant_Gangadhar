package FactoryMethodPatternExample.src.com.example.factory.factory;

import FactoryMethodPatternExample.src.com.example.factory.document.Document;
import FactoryMethodPatternExample.src.com.example.factory.document.ExcelDocument;

public class ExcelDocumentFactory extends DocumentFactory {

    @Override
    public Document createDocument() {
        return new ExcelDocument();
    }
}