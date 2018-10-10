package com.password_manager;

import java.text.SimpleDateFormat;

public class main{
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
    public static void main(String[] args) {
    password.write_to_txt_timestamp();
    password.write_to_txt_WUP();
    encryptor.encrypted();
}}
