package com.example.tarotour_java.tarot;

public class Score {
    private int numeroScore;
    private int nombrePoint;
    private int nombreTour;
    private String prenom;
    private int numeroPartie;

    public Score() {
    }

    public Score(int numeroScore, int nombrePoint, int nombreTour, String prenom, int numeroPartie) {
        this.numeroScore = numeroScore;
        this.nombrePoint = nombrePoint;
        this.nombreTour = nombreTour;
        this.prenom = prenom;
        this.numeroPartie = numeroPartie;
    }

    public int getNumeroScore() {
        return numeroScore;
    }

    public void setNumeroScore(int numeroScore) {
        this.numeroScore = numeroScore;
    }

    public int getNombrePoint() {
        return nombrePoint;
    }

    public void setNombrePoint(int nombrePoint) {
        this.nombrePoint = nombrePoint;
    }

    public int getNombreTour() {
        return nombreTour;
    }

    public void setNombreTour(int nombreTour) {
        this.nombreTour = nombreTour;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getNumeroPartie() {
        return numeroPartie;
    }

    public void setNumeroPartie(int numeroPartie) {
        this.numeroPartie = numeroPartie;
    }

    @Override
    public String toString() {
        return "Score{" +
                "numeroScore=" + numeroScore +
                ", nombrePoint=" + nombrePoint +
                ", nombreTour=" + nombreTour +
                ", prenom='" + prenom + '\'' +
                ", numeroPartie=" + numeroPartie +
                '}';
    }

}
