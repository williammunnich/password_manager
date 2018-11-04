package com.password_manager;

public class everyeighth {

    public static String deleteeigth(String x){
        StringBuffer delt = new StringBuffer(x);

        for(int i = 9; i <= delt.length(); i += 8){
          delt = delt.delete((i-1), (i));

        }
        String f = new String(delt);
        System.out.println(f);
        return f;
    }
    public static String addeigth(String x){
        StringBuffer delt = new StringBuffer(x);

        for(int i = 8; i <= delt.length(); i += 8){
            delt = delt.insert((i), " ");
            i++;
        }
        String f = new String(delt);
        System.out.println(f);
        return f;
    }



}
