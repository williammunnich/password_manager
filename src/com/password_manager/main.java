package com.password_manager;

        import java.lang.*;

        import java.text.SimpleDateFormat;


public class main{
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");

    public static void main(String[] args) throws Exception {
        password.write_to_txt_timestamp(); //Creates a timestamp pn th text file
        entry.entries(); //Runs everything in use
        easteregg.pic();
        }
    }
