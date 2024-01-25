package com.example.tarotour_java.tarot;

public class Joueur {

    private int numeroJoueur;
    private String prenom;

    public Joueur() {
    }

    public Joueur(int numeroJoueur, String prenom) {
        this.numeroJoueur = numeroJoueur;
        this.prenom = prenom;
    }

    public int getNumeroJoueur() {
        return numeroJoueur;
    }

    public void setNumeroJoueur(int numeroJoueur) {
        this.numeroJoueur = numeroJoueur;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "Joueur{" +
                "numeroJoueur=" + numeroJoueur +
                ", prenom='" + prenom + '\'' +
                '}';
    }
}
