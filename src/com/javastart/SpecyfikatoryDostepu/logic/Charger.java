package com.javastart.SpecyfikatoryDostepu.logic;

import com.javastart.SpecyfikatoryDostepu.model.Telephone;

public class Charger {

    public void charge(Telephone telephone){
    telephone.setChargeLevel(telephone.getChargeLevel()+1);
    }
}
