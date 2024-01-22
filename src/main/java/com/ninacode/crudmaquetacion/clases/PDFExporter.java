// PDFExporter.java
package com.ninacode.crudmaquetacion.clases;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

import java.awt.*;
import java.io.IOException;

public class PDFExporter {

    private static final float MARGIN = 50;
    private static final float ROW_HEIGHT = 20;
    private static final float CELL_MARGIN = 10;

    public static void exportToPDF(String[][] data, String filePath) throws IOException {
        try (PDDocument document = new PDDocument()) {
            PDPage page = new PDPage();
            document.addPage(page);

            try (PDPageContentStream contentStream = new PDPageContentStream(document, page)) {
                contentStream.setFont(PDType1Font.HELVETICA_BOLD, 12);

                float yStart = page.getMediaBox().getHeight() - MARGIN;
                float tableWidth = page.getMediaBox().getWidth() - 2 * MARGIN;
                float yPosition = yStart;
                float tableHeight = MARGIN + (ROW_HEIGHT * data.length);
                int cols = data[0].length;

                // Encabezados de columna
                contentStream.setNonStrokingColor(Color.GRAY);
                contentStream.setLineWidth(1.5f);

                float nexty = yPosition;
                for (int i = 0; i < data.length; i++) {
                    contentStream.drawLine(MARGIN, nexty, MARGIN + tableWidth, nexty);
                    nexty -= ROW_HEIGHT;
                }

                // Datos de la tabla
                float tableYPosition = yPosition - tableHeight;

                contentStream.setLineWidth(1.5f);
                contentStream.drawLine(MARGIN, yPosition, MARGIN + tableWidth, yPosition);
                contentStream.drawLine(MARGIN, tableYPosition, MARGIN, yPosition);
                contentStream.drawLine(MARGIN + tableWidth, tableYPosition, MARGIN + tableWidth, yPosition);

                contentStream.setNonStrokingColor(Color.BLACK);
                contentStream.setFont(PDType1Font.HELVETICA_BOLD, 12);

                float textX = MARGIN + CELL_MARGIN;
                float textY = yPosition - 15;

                for (int j = 0; j < cols; j++) {
                    contentStream.beginText();
                    contentStream.newLineAtOffset(textX, textY);
                    contentStream.showText(data[0][j]);
                    contentStream.endText();
                    textX += (tableWidth / cols);
                }

                textY -= ROW_HEIGHT;
                for (int i = 1; i < data.length; i++) {
                    textX = MARGIN + CELL_MARGIN;
                    for (int j = 0; j < cols; j++) {
                        contentStream.beginText();
                        contentStream.newLineAtOffset(textX, textY);
                        contentStream.showText(data[i][j]);
                        contentStream.endText();
                        textX += (tableWidth / cols);
                    }
                    textY -= ROW_HEIGHT;
                }
            }

            document.save(filePath);
        }
    }
}


