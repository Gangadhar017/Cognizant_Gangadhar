package FactoryMethodPatternExample.src.com.example.factory.factory;

import FactoryMethodPatternExample.src.com.example.factory.document.Document;
import FactoryMethodPatternExample.src.com.example.factory.document.WordDocument;

public class WordDocumentFactory extends DocumentFactory {

    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}