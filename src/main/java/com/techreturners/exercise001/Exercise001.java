package com.techreturners.exercise001;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Exercise001 {

    private static final DecimalFormat df = new DecimalFormat("0.00");
    public String capitalizeWord(String word) {
        return Character.toUpperCase(word.charAt(0)) + word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {
        return (firstName.substring(0, 1) + "." + lastName.substring(0, 1));
    }

    public double addVat(double originalPrice, double vatRate) {
        return Double.parseDouble(df.format((originalPrice * vatRate)/100 + originalPrice));
    }

    public String reverse(String sentence) {
        String reverseStr = "";
        for (int i = (sentence.length() - 1); i >= 0; i--) {
            reverseStr = reverseStr + sentence.charAt(i);
        }
        return reverseStr;
    }

    public int countLinuxUsers(List<User> users) {
        List<User> linuxUsers = new ArrayList<User>();

        for (User linusers : users ){
            if (linusers.getType() =="Linux"){
                linuxUsers.add(linusers);
            }
        }

        return linuxUsers.size();
    }
}
