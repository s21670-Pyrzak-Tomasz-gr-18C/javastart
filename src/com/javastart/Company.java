package com.javastart;

public class Company {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Adam", "Nowak",1997,5);
        Employee employee2 = new Employee("Ewa", "Klucha",1995,12);
        Employee employee3 = new Employee("Jacek", "Gacek",1987,2);

        System.out.println(employee1+"\n");
        System.out.println(employee2+"\n");
        System.out.println(employee3+"\n");
    }
}
