package FactoryMethodPatternExample.src.com.example.factory.factory;

import FactoryMethodPatternExample.src.com.example.factory.document.Document;
import FactoryMethodPatternExample.src.com.example.factory.document.PdfDocument;

public class PdfDocumentFactory extends DocumentFactory {

    @Override
    public Document createDocument() {
        return new PdfDocument();
    }
}