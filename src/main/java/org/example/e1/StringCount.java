package org.example.e1;

import java.util.ArrayList;

public class StringCount {

    public static int countWords(String text) {
        String[] wordsList = text.split(" ");
        return wordsList.length;
    }

    public static int countChar(String text, char c) {
        int contador = 0;
        for(int i=0;i<text.length();i++){
            if(text.charAt(i)==c){
                contador++;
            }
        }
        return contador;
    }

    public static int countCharIgnoringCase(String text, char c) {
        int contador = 0;
        for(int i=0;i<text.length();i++){
            if(text.toLowerCase().charAt(i)==c){
                contador++;
            }
        }
        return contador;

    }

    public static boolean isPasswordSafe(String password){
        boolean validacionUpper =false;
        boolean validacionLower =false;
        boolean validacionDigit =false;
        boolean validacionCharSpecial = false;

        if(password.length() < 8) {
            return false;
        } else {
            for(int i = 0; i<password.length(); i++) {
                if(Character.isUpperCase(password.charAt(i))){
                    validacionUpper = true;
                };
                if(Character.isLowerCase(password.charAt(i))){
                    validacionLower = true;
                };
                if(Character.isDigit(password.charAt(i))){
                    validacionDigit = true;
                };
                if(!(Character.isDigit(password.charAt(i))&&Character.isAlphabetic(password.charAt(i)))){
                    validacionCharSpecial = true;
                }
            }
            return validacionUpper && validacionLower && validacionDigit && validacionCharSpecial;
        }
    }
}
