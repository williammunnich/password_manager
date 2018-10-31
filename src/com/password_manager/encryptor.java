package com.password_manager;


public class encryptor{

    public static StringBuffer encrypted(String x){
        StringBuffer passWord = new StringBuffer(x);

        for  (int i = 0; i < passWord.length(); i++)//for charectors in string
        {

            int temp = 0;
            temp = (int) passWord.charAt(i);//convert ascii to int
            temp = temp * masterkey.masterkeyGive();//multiply int by master password
            passWord.setCharAt(i, (char) temp); //convert from int to scii


        }


        return passWord;
    }

  
}