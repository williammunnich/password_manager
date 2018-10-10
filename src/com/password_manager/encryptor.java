package com.password_manager;

public class encryptor{
  StringBuffer passWord = new StringBuffer("password1234");
  System.out.println("Original: " + passWord);
  
  for(int i=0; i < passWord.length(); i++);){
     int temp = 0;
     temp = (int)passWord.charAt(i);
     temp = temp * 9;
     passWord.setCharAt(i, (char)temp);
  }
  
  System.out.println("Encrypted: " + passWord);
  
}
