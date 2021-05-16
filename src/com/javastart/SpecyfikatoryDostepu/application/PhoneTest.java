package com.javastart.SpecyfikatoryDostepu.application;

import com.javastart.SpecyfikatoryDostepu.logic.Charger;
import com.javastart.SpecyfikatoryDostepu.model.Telephone;

public class PhoneTest {
    public static void main(String[] args) {
        Telephone telephone = new Telephone("Samsung", "Galaxy S10", 3400, 75);
        System.out.println(telephone.toString());
        Charger charger = new Charger();
        charger.charge(telephone);
        System.out.println(telephone.toString());

    }
}
