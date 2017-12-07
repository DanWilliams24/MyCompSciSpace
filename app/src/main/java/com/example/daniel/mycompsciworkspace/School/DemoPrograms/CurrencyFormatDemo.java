package com.example.daniel.mycompsciworkspace.School.DemoPrograms;

import java.text.NumberFormat;
import java.util.Locale;



public class CurrencyFormatDemo {
    public static void main(String[] args){
        System.out.println("Without formatting");

        System.out.println(27.8);
        System.out.println(27.81111);
        System.out.println(27.899999);
        System.out.println(27.899999);
        System.out.println(27);
        System.out.println();


        System.out.println("Default Position : ");
        NumberFormat FormattedCurrency = NumberFormat.getCurrencyInstance();
        System.out.println(FormattedCurrency.format(27.8));
        System.out.println(FormattedCurrency.format(27.81111));
        System.out.println(FormattedCurrency.format(27.899999));
        System.out.println(FormattedCurrency.format(27));
        System.out.println();

        System.out.println("US as location : ");
        NumberFormat FormattedCurrency2 = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println(FormattedCurrency2.format(27.8));
        System.out.println(FormattedCurrency2.format(27.81111));
        System.out.println(FormattedCurrency2.format(27.899999));
        System.out.println(FormattedCurrency2.format(27));
        System.out.println();
    }
}
