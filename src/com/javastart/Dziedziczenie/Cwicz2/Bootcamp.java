package com.javastart.Dziedziczenie.Cwicz2;

public class Bootcamp extends OnlineCourse {
    private String trainerName;
    private String trainerSurname;
    private int numberOfConsultationHours;

    public Bootcamp(String courseId, int rating, String name, String description, int videoLength, int estimatedTime, String trainerName, String trainerSurname, int numberOfConsultationHours) {
        super(courseId, rating, name, description, videoLength, estimatedTime);
        this.trainerName = trainerName;
        this.trainerSurname = trainerSurname;
        this.numberOfConsultationHours = numberOfConsultationHours;
    }

    @Override
    public String toString() {
        return "Bootcamp{" +
                "trainerName='" + trainerName + '\'' +
                ", trainerSurname='" + trainerSurname + '\'' +
                ", numberOfConsultationHours=" + numberOfConsultationHours +
                "} "+super.toString();
    }
}
