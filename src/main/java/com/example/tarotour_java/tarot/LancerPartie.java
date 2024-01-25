package com.example.tarotour_java.tarot;

public class LancerPartie {
    private String prenom;
    private int nombreJoueur;

    public LancerPartie() {
    }

    public LancerPartie(String prenom, int nombreJoueur) {
        this.prenom = prenom;
        this.nombreJoueur = nombreJoueur;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getNombreJoueur() {
        return nombreJoueur;
    }

    public void setNombreJoueur(int nombreJoueur) {
        this.nombreJoueur = nombreJoueur;
    }

    @Override
    public String toString() {
        return "LancerPartie{" +
                "prenom='" + prenom + '\'' +
                ", nombreJoueur=" + nombreJoueur +
                '}';
    }
}
