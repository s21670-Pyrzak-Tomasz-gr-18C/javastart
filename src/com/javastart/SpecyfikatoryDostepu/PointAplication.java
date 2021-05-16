package com.javastart.SpecyfikatoryDostepu;

import com.javastart.SpecyfikatoryDostepu.Point.Point;
import com.javastart.SpecyfikatoryDostepu.PointController.PointController;

public class PointAplication {
    public static void main(String[] args) {
        Point point1 = new Point();

        System.out.println(point1.toString());

        PointController pointController = new PointController();
        pointController.addX(point1);
        pointController.minusY(point1);

        System.out.println(point1.toString());

    }
}
