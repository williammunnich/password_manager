package com.password_manager;

        import java.io.FileNotFoundException;
        import java.lang.*;

        import java.text.SimpleDateFormat;

public class main{
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");

    public static void main(String[] args) throws FileNotFoundException {
        binaryconvert.toBinary();
        binaryconvert.fromBinary("01100111 01100111");
        //binaryconvert.fromBinary(binaryconvert.toBinary());
        //password.write_to_txt_timestamp();
        //String passcode = password.write_to_txt_WUP();
        //StringBuffer passEncrypted = encryptor.encrypted(passcode);
        //System.out.println("Password: " + passEncrypted);
        //System.out.println("Decrypted Password: " + decryptor.decrypted(passEncrypted));
        //System.out.println(searcher.searcherFound("password.txt", "########"));
        //System.out.println("done");
    }

}