package com.company.services;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class IOservice {

    private static String url = "/Users/andrey/Desktop/Программировнаие java(доп)/yellow_book-master-master/src/main/java/com/company/database.txt";
    private Scanner scanner;
    private static IOservice instance;

    private IOservice() {
        this.scanner = new Scanner(url);
    }

    public void saveAndClose(List<String> stringList) throws IOException {
        PrintWriter writer = new PrintWriter(new FileWriter(url, false));
        stringList.forEach(writer::println);
        writer.close();
        System.exit(0);
    }

    public List<String> initialRead() throws IOException {
        List<String> notes = Files.readAllLines(Paths.get(url), StandardCharsets.UTF_8);
        notes.remove(url);
        return notes;
    }

    public static IOservice getInstance() {
        if (instance == null) {
            instance = new IOservice();
        }
        return instance;
    }

}
