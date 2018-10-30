package com.password_manager;

import java.util.Scanner;

public class entry {
    public static void entries() {
        StringBuffer masterKey = password.MasterPassword();
        String passcode = password.write_to_txt_WUP();
        StringBuffer passEncrypted = encryptor.encrypted(passcode);

        System.out.println("Do you wish to decrypt your password? Answer Y or N.");
        Scanner userInput = new Scanner(System.in);
        String response = userInput.nextLine();
            while (response != "Y") {

                if (response.equals("Y")) {
                    System.out.println("Enter your Master Password");
                    StringBuffer PassComp = encryptor.encrypted(userInput.nextLine());
                    String PassComp1 = PassComp.toString();
                    String masterKey1 = masterKey.toString();

                    if (PassComp1.equals(masterKey1)) {
                        System.out.println("Decrypted Password: " + decryptor.decrypted(passEncrypted));
                        break;
                    } else {
                        System.out.println("Wrong Password");

                    }
                } else if (response.equals("N")) {
                    System.out.println("Thank you for using our service");
                    break;
                } else {
                    System.out.println("Not a valid response");
                    System.out.println("Try again, make sure it is Y or N:");
                    response = userInput.nextLine();
                }
            }
        }
    }
