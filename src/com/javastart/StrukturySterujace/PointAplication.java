package com.javastart.StrukturySterujace;

import com.javastart.SpecyfikatoryDostepu.Point.Point;
import com.javastart.SpecyfikatoryDostepu.PointController.PointController;

import java.util.Scanner;

public class PointAplication {
    public static void main(String[] args) {
        Point point1 = new Point();

        System.out.println("Punkt pierwotny: "+point1.toString());
        System.out.println();

        System.out.println("Wybierz opcję: \n" +
                "4 - przesuń punkt w lewo \n" +
                "6 - przesun punkt w prawo \n" +
                "8 - przesuń punkt w górę \n" +
                "2 - przesuń punkt w dół ");

        Scanner sc = new Scanner(System.in);
        sterowanie(point1,sc.nextInt());
        System.out.println("punkt po zmianie: "+point1.toString());
    }
    static void sterowanie(Point point, int wybor){
        PointController pointController  = new PointController();
        switch (wybor){
            case 4:
                pointController.minusX(point);
                break;
            case 6:
                pointController.addX(point);
                break;
            case 8:
                pointController.addY(point);
                break;
            case 2:
                pointController.minusY(point);
                break;
            default:
                System.out.println("Niepoprawny wybór");
        }


    }
}
