package com.javastart;

public class Plant {
    private String name;
    private String desription;
    private double waterDemand;

    public Plant(String name, String desription, double waterDemand) {
        this.name = name;
        this.desription = desription;
        this.waterDemand = waterDemand;
    }

    public double  dayWaterDemand(){
        return waterDemand;
    }

    public double weekWaterDemand(){
        return (waterDemand*7);
    }

    public double yearWaterDemand(){
        return (waterDemand*365);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
