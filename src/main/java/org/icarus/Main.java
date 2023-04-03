package org.icarus;

import com.itextpdf.kernel.pdf.*;
import com.itextpdf.kernel.pdf.canvas.parser.PdfTextExtractor;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String filename = "/home/icarus/Downloads/job_application.pdf";
        PdfReader reader = new PdfReader(filename);
        PdfDocument pdfDoc = new PdfDocument(reader);
        for (int i = 1; i <= pdfDoc.getNumberOfPdfObjects(); i++) {
            PdfObject pdfObject = pdfDoc.getPdfObject(i);
            if (pdfObject.isDictionary()) {
                PdfDictionary dict = (PdfDictionary) pdfObject;
                System.out.println(dict.toString());
            }
        }
    }
}