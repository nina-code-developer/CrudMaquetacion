// ExcelExporter.java
package com.ninacode.crudmaquetacion.clases;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelExporter {

    public static void exportToExcel(String[][] data, String filePath) throws IOException {
        try (Workbook workbook = new XSSFWorkbook()) {
            Sheet sheet = workbook.createSheet("Data");

            // Encabezados de columna
            Row headerRow = sheet.createRow(0);
            for (int colIndex = 0; colIndex < data[0].length; colIndex++) {
                Cell headerCell = headerRow.createCell(colIndex);
                headerCell.setCellValue(data[0][colIndex]);
            }

            // Datos de la tabla
            for (int rowIndex = 1; rowIndex < data.length; rowIndex++) {
                Row row = sheet.createRow(rowIndex);

                for (int colIndex = 0; colIndex < data[rowIndex].length; colIndex++) {
                    Cell cell = row.createCell(colIndex);
                    cell.setCellValue(data[rowIndex][colIndex]);
                }
            }

            try (FileOutputStream outputStream = new FileOutputStream(filePath)) {
                workbook.write(outputStream);
            }
        }
    }
}

