package com.password_manager;

import java.io.*;
import java.util.Scanner;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class password {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
    public static void write_to_txt_timestamp(){
            Timestamp timestamp = new Timestamp(System.currentTimeMillis()); //current time usimg format above
        try
        {
            String filename= "passwords.txt";
            FileWriter fw = new FileWriter(filename,true); //the true will append the new data
            fw.write("\n");//appends the string to the file
            fw.write("@@@@@@@@"+timestamp+"@@@@@@@@");//appends the string to the file
            fw.close();
        }
        catch(IOException ioe)
        {
            System.err.println("IOException: " + ioe.getMessage()); //catches exception
        }
    }







    public static String write_to_txt_WUP(){
        Scanner userInput = new Scanner(System.in); //set up scanner for user input
        System.out.println("website:"); //ask for user input
        String website = userInput.nextLine();//take user input
        System.out.println("username:");//ask for user input
        String username = userInput.nextLine();//take user input
        System.out.println("password");//ask for user input
        String password = userInput.nextLine();//take user input

        try
    {
        String filename= "passwords.txt";
        FileWriter fw = new FileWriter(filename,true); //the true will append the new data

        fw.write("\n");//appends the string to the file

        fw.write("@@@@@@@@website:"+ website +"@@@@@@@@\n");//appends the string to the file
        fw.write("@@@@@@@@username:"+ username +"@@@@@@@@\n");
        fw.write("########encrypted password: " + encryptor.encrypted(password)  + "########\n");

        fw.close();
    }
        catch(IOException ioe)
    {
        System.err.println("IOException: " + ioe.getMessage());
    }
    return password;
    }
    public static StringBuffer MasterPassword(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Account Name: ");
        String account = userInput.nextLine();
        System.out.println("Create Password: ");
        String password = userInput.nextLine();
        StringBuffer masterPass = encryptor.encrypted(password);

        try
        {
            String filename= "masterPasswords.txt";
            FileWriter fw = new FileWriter(filename,true); //the true will append the new data

            fw.write("\n");//appends the string to the file

            fw.write("@@@@@@@@Account:"+ account +"@@@@@@@@\n");
            fw.write("########encrypted password: " + encryptor.encrypted(password)  + "########\n");

            fw.close();
        }
        catch(IOException ioe)
        {
            System.err.println("IOException: " + ioe.getMessage());
        }
        return masterPass;
    }
}