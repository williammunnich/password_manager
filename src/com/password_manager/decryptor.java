package com.password_manager;

public class decryptor {
    public static StringBuffer decrypted(String x){
        StringBuffer passWord = new StringBuffer(x);

        for  (int i = 0; i < passWord.length(); i++)
        {

            int temp = 0;
            temp = (int) passWord.charAt(i);
            temp = temp / masterkey.masterkeyGive();
            passWord.setCharAt(i, (char) temp);


        }

        System.out.println(passWord);
        return passWord;
    }

}