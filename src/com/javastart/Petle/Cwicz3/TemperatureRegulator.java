package com.javastart.Petle.Cwicz3;

import java.util.Scanner;

public class TemperatureRegulator {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the current temperature");
        int currentTemperature = sc.nextInt();
        System.out.println("Enter expected temperature");
        int expectedTemperature = sc.nextInt();
        changeTemperature(currentTemperature, expectedTemperature);
    }

    private static void changeTemperature(int temp1, int temp2) throws InterruptedException {
        double temp = temp1;
        while (temp <= temp2) {
            if (temp < temp2) {
                System.out.println("Actual temperature: " + temp);
            } else
                System.out.println("Target temperature reached: " + temp);
            Thread.sleep(1000);
            temp += 0.5;
        }

    }
}
