package com.password_manager;

import java.util.Scanner;

public class binaryconvert {
    public static void toBinary(){
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        s = sc.nextLine();
        byte[] bytes = s.getBytes();
        StringBuilder binary = new StringBuilder();
        for (byte b : bytes)
        {
            int val = b;
            for (int i = 0; i < 8; i++)
            {
                binary.append((val & 128) == 0 ? 0 : 1);
                val <<= 1;
            }
            binary.append(' ');
        }
        System.out.println("'" + s + "' to binary: " + binary);

    }

    public static void fromBinary(){
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        s = sc.nextLine();
        for(int index = 0; index < s.length(); index+=9) {
            String temp = s.substring(index, index+8);
            int num = Integer.parseInt(temp,2);
            char letter = (char) num;
            s = s+letter;
        }
        System.out.print(s);
    }

}
