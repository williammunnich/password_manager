
        package com.password_manager;


        import java.awt.Desktop;
        import java.io.File;


/**
 *
 */
public class easteregg{//declares class

    public static void pic () throws Exception// can called from main

    {


        File f = new File ("C:\\Users\\wmun1901\\Documents\\GitHub\\password_manager\\src\\com\\password_manager\\chawles.bmp");//defines file path for image
        Desktop d = Desktop.getDesktop();//creates a new desktop filler
        d.open(f);//opens file
        System.out.println("imageviewer open;");//lets user know imageviewer open



    }

}