package com.password_manager;

public class encryptor{

    public static void  encrypted(){
        StringBuffer passWord = new StringBuffer("password1234");
        System.out.println("Original: " + passWord);
        int i = 0;
        for ( i < passWord.length; i++) ;
        {

            int temp = 0;
            temp = (int) passWord.charAt(i);
            temp = temp * 9;
            passWord.setCharAt(i, (char) temp);


        }

        System.out.print("Encrypted: " + passWord);
    }

  
}
