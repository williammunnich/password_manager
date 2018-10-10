package com.password_manager;

import java.util.*;

public class encryptor{

    public static StringBuffer encrypted(String x){
        StringBuffer passWord = new StringBuffer(x);

        for  (int i = 0; i < passWord.length(); i++)
        {

            int temp = 0;
            temp = (int) passWord.charAt(i);
            temp = temp * 9;
            passWord.setCharAt(i, (char) temp);


        }


        return passWord;
    }

  
}
