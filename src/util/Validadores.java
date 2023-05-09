/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author sarin
 */
public class Validadores {

    public static boolean isValidEmailAddressRegex(String email) {
    boolean isEmailIdValid = false;
    if (email != null && email.length() > 0) {
        String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
        Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            isEmailIdValid = true;
        }
    }
    return isEmailIdValid;
}
    
    public static boolean senhaForte(String senha) {
    if (senha.length() < 6) return false;

    boolean achouNumero = false;
    boolean achouMaiuscula = false;
    boolean achouMinuscula = false;
    boolean achouSimbolo = false;
    for (char c : senha.toCharArray()) {
         if (c >= '0' && c <= '9') {
             achouNumero = true;
         } else if (c >= 'A' && c <= 'Z') {
             achouMaiuscula = true;
         } else if (c >= 'a' && c <= 'z') {
             achouMinuscula = true;
         } else {
             achouSimbolo = true;
         }
    }
    return achouNumero && achouMaiuscula && achouMinuscula && achouSimbolo;
}
}
