package com.harshitha.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordRule1 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^[a-z]{8,}$");
        Matcher matcher = pattern.matcher("harshitha");
        if (matcher.find())
            System.out.println("Pattern matched");
        else
            System.out.println("Pattern  not matched");
    }
}
