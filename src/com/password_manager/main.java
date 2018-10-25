package com.password_manager;

        import java.io.FileNotFoundException;
        import java.lang.*;

        import java.text.SimpleDateFormat;
        import java.util.Scanner;

public class main{
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");

    public static void main(String[] args) throws FileNotFoundException {
        password.write_to_txt_timestamp();
        StringBuffer masterKey = password.MasterPassword();
        System.out.println(masterKey);
        String passcode = password.write_to_txt_WUP();
        StringBuffer passEncrypted = encryptor.encrypted(passcode);
        System.out.println("Do you wish to decrypt your password? Answer Y or N.");
        Scanner userInput = new Scanner(System.in);
        String response = userInput.nextLine();
        if (response.equals("Y")){
            System.out.println("Enter your Master Password");
            StringBuffer PassComp = encryptor.encrypted(userInput.nextLine());
            System.out.println(PassComp);

            if (PassComp == masterKey){
                System.out.println("Decrypted Password: " + decryptor.decrypted(passEncrypted));
            }
            else {
                System.out.println("Wrong Password");
            }
        }
        else if (response.equals("N")){
            System.out.println("Thank you for using our service");
        }
        else {
            System.out.println("Not a valid response");
        }
        System.out.println("Password: " + passEncrypted);

        //System.out.println(searcher.searcherFound("password.txt", "########"));
        //System.out.println("done");
    }

}