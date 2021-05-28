package com.javastart.Wprowadzaniedanych;

import java.util.Scanner;

public class Calculator {


    public static void start() {
        double result = 0;
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj pierwsza wartość: ");
        double value1 = sc.nextDouble();

        System.out.println("Podaj znak działania: ");
        char operator = sc.next().charAt(0);

        System.out.println("Podaj drugą wartość: ");
        double value2 = sc.nextDouble();

        calculator.calculate(value1,value2,operator);
    }

    private void calculate(double value1, double value2, char operator){
        double result= 0;
        switch ( operator) {
            case '+':
                result = add(value1, value2);
                break;
            case '-':
                result = subtract(value1, value2);
                break;
            case '*':
                result = multiple(value1, value2);
                break;
            case '/':
                result = divide(value1, value2);
                break;
            default:
                System.out.println("Invalid action sign: ");;
        }
        System.out.println("Result: "+result);;
    }

    private double add(double value1,double value2){
        return value1+value2;
    }

    private double subtract(double value1, double value2){
        return  value1-value2;
    }

    private double multiple(double value1,double value2){
        return value1*value2;
    }

    private double divide(double value1, double value2){
        if (value2 == 0){
            System.out.println(" You can't divide by 0 !");
            return 1;
        }else
            return value1/value2;
    }
}


