package com.example.daniel.mycompsciworkspace.School.OOP;

/**
 * Created by Daniel on 12/1/17.
 */

public class Fraction {
    private int num;
    private int denom;

    public Fraction()
    {
        num = 0;
        denom = 1;
    }

    public Fraction(int n)
    {
        num = n;
        denom = 1;
    }

    public Fraction(int n, int d)
    {
        if (d != 0)
        {
            num = n;
            denom = d;
            reduce();
        }
        else
        {
            throw new IllegalArgumentException( "Fraction construction error: denominator is 0");
        }
    }

    /*    Public Methods */
    public Fraction(Fraction other)
    {
        num = other.num;
        denom = other.denom;
    }

    // returns the sum of the fraction and other
    public Fraction add (Fraction other)
    {
        int newNum = num * other.denom + denom * other.num;
        int newDenom = denom * other.denom;
        return new Fraction (newNum, newDenom);

    }

    // returns the sum of the fraction and m
    public Fraction add (int m)
    {
        return new Fraction (num + m * denom, denom);
    }

    // returns the product of this fraction and other
    public Fraction multiply (Fraction other)
    {
        int newNum = num * other.num;
        int newDenom = denom * other.denom;
        return new Fraction (newNum, newDenom);
    }

    // returns the product of this fraction and m
    public Fraction multiply (int m)
    {
        return new Fraction(num * m, denom);
    }

    // return the value of this fraction as a double
    public double getValue ()
    {
        return (double) num/ (double)denom;
    }

    // return a string representation of this fraction
    public String toString()
    {
        return num + "/" + denom;
    }

    // reduces the fraction by the gcf and makes the denom > 0
    private void reduce()
    {
        if (num == 0)
        {
            denom = 1;
            return;
        }
        if (denom < 0)
        {
            num = -num;
            denom = -denom;
        }
        int q = gcf (Math.abs(num), denom);
        num /= q;
        denom /= q;
    }
    // return the greatst common factor of two positive integers
    private int gcf(int n, int d)
    {
        if (n <= 0 || d<= 0)
        {
            throw new IllegalArgumentException("GCF precondition failed:" + n + " ' " + d);
        }
        if(n % d == 0)
        {
            return d;
        }
        else if (d % n ==0)
        {
            return n;
        }
        else
        {
            return gcf (n % d, d % n);
        }
    }

    public static void main(String[] args) {

		/*
		Fraction f1 = new Fraction(2, 3);
		System.out.println(f1);
		*/

        Fraction f1 = new Fraction(3,7);
        Fraction f2 = f1;
        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);

        Fraction f3 = new Fraction(5, 75);
        System.out.println("f3 = " + f3);

        Fraction f4 = new Fraction(12, -30);
        System.out.println("f4 = " + f4);

        Fraction f5 = new Fraction(23);
        System.out.println("f5 = " + f5);

        Fraction f6 = new Fraction(f4);
        System.out.println("f4 = " + f4);
        System.out.println("f6 = " + f6);

        Fraction answer = f1.add(f2);
        System.out.println(f1 + " + " + f2 + " = " + answer);

        int val = 7;
        answer = f1.add(val);
        System.out.println(f1 + " + " + val + " = " + answer);

        answer = f1.multiply(f2);
        System.out.println(f1 + " * " + f2 + " = " + answer);

        val = 3;
        answer = f1.multiply(val);
        System.out.println(f1 + " * " + val + " = " + answer);

        double ans = f3.getValue();
        System.out.println("f3 = " + f3);
        System.out.println("type casting f3 = " + ans);

        System.out.println("f1 = " + f1);
        System.out.println("type casting f1 = " + f1.getValue());

        int val1 = 12; int val2 = 20;
        Fraction f7 = new Fraction(val1, val2);
        System.out.println("num = " + f7.num + " denom = " + f7.denom + " Greatest Common Factor = " + f7.gcf(val1,  val2));

    }

}




