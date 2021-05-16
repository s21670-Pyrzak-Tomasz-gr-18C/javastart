package com.javastart.StrukturySterujace.PointController;

import com.javastart.StrukturySterujace.Point.Point;

public class PointController {

    public void addX(Point point){
        point.setWspX(point.getWspX()+1);
    }

    public void minusX(Point point){
        point.setWspX(point.getWspX()-1);
    }

    public void addY(Point point){
        point.setWspY(point.getWspY()+1);
    }

    public void minusY(Point point){
        point.setWspY(point.getWspY()-1);
    }
}
