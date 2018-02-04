package com.example.daniel.mycompsciworkspace.Current_Projects.Recursion;

/**
 * Created by Daniel on 1/31/18.
 */

public class DataRepProblem {
    public static void main(String[] args){
        System.out.println("Base Ten to Two - Recursive");
        baseTenTwo(61);
        System.out.println("");

        System.out.println("Base Two to Ten");

        baseTwoTen("1001010");

        System.out.println("Base Sixteen to Ten");
        baseHexTen("AB1");

    }

    public static void baseTenTwo(int n){
        if(n/2 != 0){
            baseTenTwo(n/2);
        }
        System.out.print(n%2);
    }


    public static void baseTwoTen(String binary){
        double sum = 0;
        int length = binary.length()-1;
        for(int i = 0; i < binary.length(); i++){
            int num = Integer.parseInt(""+binary.charAt(i));
            if(num == 1){
                sum += num*Math.pow(2,Math.abs(i-length));
            }
        }
        System.out.println((int)sum);

    }

    public static void baseHexTen(String hexadecimal){
        double sum = 0;
        int num;
        int length = hexadecimal.length()-1;
        for(int i = 0; i < hexadecimal.length(); i++){
            try{
                num = Integer.parseInt(""+hexadecimal.charAt(i));
                if(num == 1){
                    sum += num*Math.pow(16,Math.abs(i-length));
                }
            }catch (NumberFormatException e){
                switch (hexadecimal.charAt(i)){
                    case 'A': sum+= 10*Math.pow(16,Math.abs(i-length));
                        break;
                    case 'B':sum+= 11*Math.pow(16,Math.abs(i-length));
                        break;
                    case 'C':sum+= 12*Math.pow(16,Math.abs(i-length));
                        break;
                    case 'D':sum+= 13*Math.pow(16,Math.abs(i-length));
                        break;
                    case 'E':sum+= 14*Math.pow(16,Math.abs(i-length));
                        break;
                    case 'F':sum+= 15*Math.pow(16,Math.abs(i-length));
                        break;
                }
            }
        }
        System.out.println((int)sum);
    }

}




