package com.password_manager;

import java.util.Scanner;

public class entry {
    public static void entries() {
        StringBuffer masterKey = password.MasterPassword();                                             //Creates the master account and stores the encrypted version of your master password as a variable in this file
        String passcode = password.write_to_txt_WUP();                                                  //Runs for a specific website and stores that password as a variable
        StringBuffer passEncrypted = encryptor.encrypted(passcode);                                     //Encrypts the password and stores that encryption

        System.out.println("Do you wish to decrypt your password? Answer Y or N.");
        Scanner userInput = new Scanner(System.in);
        String response = userInput.nextLine();                                                         //Stores user response for whether or not to encrypt
            while (response != "Y") {                                                                   //Checks to see if your response is Y and if it isn't Y or N it prompts you to try again

                if (response.equals("Y")) {
                    System.out.println("Enter your Master Password");
                    StringBuffer PassComp = encryptor.encrypted(userInput.nextLine());                  //Creates an encrypted version of what is entered when prompting for your master password
                    String PassComp1 = PassComp.toString();                                             //Turns the encrypted version from StringBuffer to String for comparison
                    String masterKey1 = masterKey.toString();                                           //Same thing as last line but for a different variable

                    if (PassComp1.equals(masterKey1)) {
                        System.out.println("Decrypted Password: " + decryptor.decrypted(passEncrypted));
                        break;                                                                          //Stops the code from continuing to run
                    } else {
                        System.out.println("Wrong Password");

                    }
                } else if (response.equals("N")) {
                    System.out.println("Thank you for using our service");
                    break;
                } else {
                    System.out.println("Not a valid response");
                    System.out.println("Try again, make sure it is Y or N:");
                    response = userInput.nextLine();                                                    //Resets the value of the user response
                }
            }
        }
    }
