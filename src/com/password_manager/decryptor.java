package com.password_manager;

public class decryptor {
    public static StringBuffer decrypted(StringBuffer x){
        StringBuffer passWord = new StringBuffer(x);

        for  (int i = 0; i < passWord.length(); i++)//for charectors in encrypted password
        {

            int temp = 0;
            temp = (int) passWord.charAt(i);//convert from ascii to int
            temp = temp / masterkey.masterkeyGive(); //divide password by master
            passWord.setCharAt(i, (char) temp);//convert back to ascii encrytpted

        }

        return passWord;
    }

}