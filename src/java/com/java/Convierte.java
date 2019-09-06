package com.java;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Convierte {

    public Convierte() {
    }
    public static Integer aInteger(String s) {
        Integer result = null;

        if (s != null) {
            try {
                result = Integer.valueOf(s);
            } catch (NumberFormatException ex) {
            }
        }

        return result;
    }

    public static Double aDouble(String s) {
        Double result = null;

        if (s != null) {
            try {
                result = Double.valueOf(s);
            } catch (NumberFormatException ex) {
            }
        }

        return result;
    }

    public static Timestamp aTimestamp(String fechahora) {
        Timestamp result = null;

        SimpleDateFormat sdf
                = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
        sdf.setLenient(false);
        
        try {
            java.util.Date ufechahora = sdf.parse(fechahora);
            result = new java.sql.Timestamp(ufechahora.getTime());
        } catch (ParseException ex) {
        }

        return result;
    }

    
}
