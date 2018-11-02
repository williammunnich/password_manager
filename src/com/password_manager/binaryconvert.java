package com.password_manager;

import java.util.Scanner;

public class binaryconvert {
    public static String userinputString(){
        String s ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an ascii string for conversion to a binary string");
        s = sc.nextLine();
        s = toBinary(s);
        return s;
    }

    public static String userinputBinary(){
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary string for conversion to an ascii string");
        s = sc.nextLine();
        s = fromBinary(s);
        return s;
    }

    public static String toBinary(String x){
        String s;
        //Scanner sc = new Scanner(System.in);
        //System.out.println("Enter a string");
        //s = sc.nextLine();
        s= x;
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
        return s;
    }

    public static String fromBinary(String binary)
    {
        String s2 = "";
        char nextChar;

        for(int i = 0; i <= binary.length()-8; i += 9) //this is a little tricky.  we want [0, 7], [9, 16], etc (increment index by 9 if bytes are space-delimited)
        {
            nextChar = (char)Integer.parseInt(binary.substring(i, i+8), 2);
            s2 += nextChar;
        }
        System.out.println(s2);
        return s2;
    }

}
