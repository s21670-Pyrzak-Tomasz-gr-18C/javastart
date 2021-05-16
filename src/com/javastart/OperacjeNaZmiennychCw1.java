package com.javastart;

public class OperacjeNaZmiennychCw1 {
    public static void main(String[] args) {
        int x = 2;
        int y = 5;

        System.out.println("Czy x>y? : "+(x>y));
        System.out.println("Czy 2x>y i y>x-2? : "+((2*x>y)&&(y>x-2)));
        System.out.println("Czy y<x+3? : "+(y<x+3));
        System.out.println("Czy x*y jest parzysty? : "+((x*y)%2==0));
    }
}
