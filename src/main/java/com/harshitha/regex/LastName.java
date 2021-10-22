package com.harshitha.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LastName {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}");
        Matcher matcher = pattern.matcher("Chigulla");
        if (matcher.find())
            System.out.println("Pattern matched");
        else
            System.out.println("Pattern  not matched");
    }
}
