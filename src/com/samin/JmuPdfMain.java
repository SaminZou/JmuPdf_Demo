package com.samin;

import com.jmupdf.enums.ImageType;
import com.jmupdf.exceptions.DocException;
import com.jmupdf.exceptions.DocSecurityException;
import com.jmupdf.page.Page;
import com.jmupdf.pdf.PdfDocument;
import com.jmupdf.xps.XpsDocument;

/**
 * Created by samin on 2017/7/28.
 */
public class JmuPdfMain {
    public static void printXps() {
        try {
//            XpsDocument xpsDocument = new XpsDocument("F:/xps/Report.xps", 20);
//            System.out.println(xpsDocument.getDocumentName());
//            xpsDocument.saveAsBmp(1, "F:/xps/", 1, ImageType.IMAGE_TYPE_RGB);
            XpsDocument e = new XpsDocument("F:/xps/Report.xps");
            e.saveAsPng(1, "F:/xps/Report.png", 1.0F, ImageType.IMAGE_TYPE_RGB);
            e.dispose();
            PdfDocument a = new PdfDocument("F:/xps/Report.pdf");
            a.saveAsPng(1, "F:/xps/Report2.png", 1.0F, ImageType.IMAGE_TYPE_RGB);
            a.dispose();
        } catch (DocException e) {
            e.printStackTrace();
        } catch (DocSecurityException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        JmuPdfMain.printXps();
    }
}
