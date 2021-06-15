package com.javastart.Dziedziczenie.Cwicz2;

public class OnlineCourse extends Course {
    private int videoLength;
    private int estimatedTime;

    public OnlineCourse(String courseId, int rating, String name, String description, int videoLength, int estimatedTime) {
        super(courseId, rating, name, description);
        this.videoLength = videoLength;
        this.estimatedTime = estimatedTime;
    }

    @Override
    public String toString() {
        return "OnlineCourse{" +
                "videoLength=" + videoLength +
                ", estimatedTime=" + estimatedTime +
                "} "+ super.toString();
    }
}
