package FactoryMethodPatternExample;

import FactoryMethodPatternExample.src.com.example.factory.factory.DocumentFactory;
import FactoryMethodPatternExample.src.com.example.factory.factory.ExcelDocumentFactory;
import FactoryMethodPatternExample.src.com.example.factory.factory.PdfDocumentFactory;
import FactoryMethodPatternExample.src.com.example.factory.factory.WordDocumentFactory;

public class FactoryMethodTest {

    public static void main(String[] args) {

        DocumentFactory wordFactory = new WordDocumentFactory();
        DocumentFactory pdfFactory = new PdfDocumentFactory();
        DocumentFactory excelFactory = new ExcelDocumentFactory();

        wordFactory.openDocument();
        pdfFactory.openDocument();
        excelFactory.openDocument();
    }
}