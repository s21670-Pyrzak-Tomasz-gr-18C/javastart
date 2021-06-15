package com.javastart.Dziedziczenie.Cwicz1;

public class ExhaustPart extends Part{
    private boolean isEmissinStandard;

    public ExhaustPart(int idNumber, String producer, String model, int series, boolean isEmissinStandard) {
        super(idNumber, producer, model, series);
        this.isEmissinStandard = isEmissinStandard;
    }

    public boolean isEmissinStandard() {
        return isEmissinStandard;
    }

    public void setEmissinStandard(boolean emissinStandard) {
        isEmissinStandard = emissinStandard;
    }

    @Override
    public String toString() {
        return "ExhaustPart{" +
                "isEmissinStandard=" + isEmissinStandard +
                "} "+super.toString();
    }
}
