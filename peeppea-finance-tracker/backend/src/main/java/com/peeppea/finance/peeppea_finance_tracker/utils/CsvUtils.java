package com.peeppea.finance.peeppea_finance_tracker.utils;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CsvUtils {

    public static void writeCsv(String filePath, List<String[]> data) throws IOException {
        try (FileWriter writer = new FileWriter(filePath)) {
            for (String[] row : data) {
                writer.write(String.join(",", row));
                writer.write("\n");
            }
        }
    }
}
