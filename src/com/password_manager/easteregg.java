
        package com.password_manager;


        import java.awt.Desktop;
        import java.io.File;


/**
 *
 */
public class easteregg{//declares class

    public static void pic () throws Exception// can called from main

    {


        String f = new File("../password_manager/chawles2.bmp").getCanonicalPath();//defines file path for image
        File f2 = new File(f);
        Desktop d = Desktop.getDesktop();//creates a new desktop filler
        d.open(f2);//opens file
        System.out.println("imageviewer open;");  //lets user know imageviewer open


    }

}