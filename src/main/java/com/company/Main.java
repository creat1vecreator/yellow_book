package com.company;

import com.company.services.IOservice;
import com.company.services.PersonService;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    private static IOservice iOservice = IOservice.getInstance();

    private static List<String> consoleValues = new ArrayList<>(Arrays.asList("1", "2", "3", "4", "5"));

    public static void main(String[] args) throws Exception {

        List<String> bookNotes = iOservice.initialRead();
        PersonService personService = PersonService.getInstance(bookNotes);

        while (true) {
            System.out.println("Choose :\n " +
                    "1.Add new record to the phone book\n " +
                    "2.Edit user record\n " +
                    "3.Delete a record\n " +
                    "4.Print all stored records\n " +
                    "5.Quit\n");

            String userInput = reader.readLine();
            if (consoleValues.contains(userInput)) {
                switch (userInput) {
                    case "1":
                        personService.addRecord();
                        break;
                    case "2":
                        personService.edit();
                        break;
                    case "3":
                        personService.delete();
                        break;
                    case "4":
                        personService.printAll();
                        break;
                    case "5":
                        System.out.println("Are you sure? Input: Yes/No");
                        String userInput1 = reader.readLine();
                        if (userInput1.toLowerCase().equals("yes"))
                            iOservice.saveAndClose(personService.getBook());
                }
            } else System.out.println("Invalid data");
        }
    }
}

