package com.password_manager;
import java.io.*;
import java.util.Scanner;
import java.util.*;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class password {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
    public static void write_to_txt_timestamp(){
            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
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
            System.err.println("IOException: " + ioe.getMessage());
        }
    }







    public static void write_to_txt_WUP(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("website:");
        String website = userInput.nextLine();
        System.out.println("username:");
        String username = userInput.nextLine();

        try
    {
        String filename= "passwords.txt";
        FileWriter fw = new FileWriter(filename,true); //the true will append the new data

        fw.write("\n");//appends the string to the file

        fw.write("@@@@@@@@website:"+ website +"@@@@@@@@\n");//appends the string to the file
        fw.write("@@@@@@@@username:"+ username +"@@@@@@@@\n");

        fw.close();
    }
        catch(IOException ioe)
    {
        System.err.println("IOException: " + ioe.getMessage());
    }
    }
    public static String write_to_password_WUP() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("password");
        String password = userInput.nextLine();
        System.out.println("Password: " + encryptor.encrypted(password));

        try
    {
        String filename = "password2.txt";
        FileWriter fw = new FileWriter(filename,true); //the true will append the new data

        fw.write("password:"+ password +"\n");
        fw.write("########encrypted password: " + encryptor.encrypted(password)  + "########\n");
        fw.close();
    }
        catch(IOException ioe)
    {
        System.err.println("IOException: "+ ioe.getMessage());
    }
    return password;
    }

}