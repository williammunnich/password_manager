package com.password_manager;

import java.util.Scanner;

public class entry {
    public static void entries() {
        StringBuffer masterKey = password.MasterPassword();
        System.out.println(masterKey);
        String passcode = password.write_to_txt_WUP();
        StringBuffer passEncrypted = encryptor.encrypted(passcode);

        System.out.println("Do you wish to decrypt your password? Answer Y or N.");
        Scanner userInput = new Scanner(System.in);
        String response = userInput.nextLine();
            while (response != "Y") {
                if (response.equals("Y")) {
                    System.out.println("Enter your Master Password");
                    StringBuffer PassComp = encryptor.encrypted(userInput.nextLine());
                    System.out.println(PassComp);

                    if (PassComp == masterKey) {
                        System.out.println("Decrypted Password: " + decryptor.decrypted(passEncrypted));
                    } else {
                        System.out.println("Wrong Password");

                    }
                } else if (response.equals("N")) {
                    System.out.println("Thank you for using our service");
                    break;
                } else {
                    System.out.println("Not a valid response");
                }
                System.out.println("Password: " + passEncrypted);
            }
        }
    }
