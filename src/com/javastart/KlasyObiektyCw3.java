package com.javastart;

public class KlasyObiektyCw3 {
    public static void main(String[] args) {

        Plant plant1 = new Plant("Krzak","Pospolity krzak",0.3);
        Plant plant2 = new Plant("Kwiat", "Kwiat róży po burzy", 0.75);
        Plant plant3 = new Plant("Drzewo","Jeszcze nie spróchniałe", 2.3);

        System.out.println("Dzienne zużycie wody przez "+ plant1.getName()+" "+plant1.dayWaterDemand());
        System.out.println("Tygodniowe zużycie wody przez "+plant1.getName()+" "+plant1.weekWaterDemand());
        System.out.println("Roczne zużycie wody przez "+plant1.getName()+" "+plant1.yearWaterDemand());
        System.out.println("Dzienne zużycie wody przez "+plant2.getName()+" "+plant2.dayWaterDemand());
        System.out.println("Tygodniowe zużycie wody przez "+plant2.getName()+" "+plant2.weekWaterDemand());
        System.out.println("Roczne zużycie wody przez "+plant2.getName()+" "+plant2.yearWaterDemand());
        System.out.println("Dzienne zużycie wody przez "+plant3.getName()+" "+plant3.dayWaterDemand());
        System.out.println("Tygodniowe zużycie wody przez "+plant3.getName()+" "+plant3.weekWaterDemand());
        System.out.println("Roczne zużycie wody przez "+plant3.getName()+" "+plant3.yearWaterDemand());
    }
}
