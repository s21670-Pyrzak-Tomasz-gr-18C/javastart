package com.javastart.Enkapsulacja.Cinema;

public class Client {
   private String firstName1;
   private String lastName1;
   private int age;

    public Client(String firstName1, String lastName1, int age) {
        this.firstName1 = firstName1;
        this.lastName1 = lastName1;
        this.age = age;
    }

    public String getFirstName1() {
        return firstName1;
    }

    public void setFirstName1(String firstName1) {
        this.firstName1 = firstName1;
    }

    public String getLastName1() {
        return lastName1;
    }

    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
