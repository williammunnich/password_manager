package com.password_manager;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class searcher {

        public static String searcherFound(String fileName,String searchStr) throws FileNotFoundException {
            Scanner scan = new Scanner(new File(fileName));

            String OutLine = "";
            while (scan.hasNext()) {
                String line = scan.nextLine().toLowerCase().toString();
                if (line.contains(searchStr)) {
                    System.out.println(line);
                    return line;
                }
            }
            return OutLine;
        }

    }


