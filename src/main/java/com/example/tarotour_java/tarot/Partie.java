package com.example.tarotour_java.tarot;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Partie {
    private int numeroPartie;
    private int nombreJoueurs;
    private LocalDateTime date;
    private List<Joueur> joueurs = new ArrayList<>();

    public Partie() {
    }

    public Partie(int numeroPartie, int nombreJoueurs, LocalDateTime date) {
        this.numeroPartie = numeroPartie;
        this.nombreJoueurs = nombreJoueurs;
        this.date = date;
    }

    public int getNumeroPartie() {
        return numeroPartie;
    }

    public void setNumeroPartie(int numeroPartie) {
        this.numeroPartie = numeroPartie;
    }

    public int getNombreJoueurs() {
        return nombreJoueurs;
    }

    public void setNombreJoueurs(int nombreJoueurs) {
        this.nombreJoueurs = nombreJoueurs;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
    public List<Joueur> getJoueurs() {
        return joueurs;
    }

    public void setJoueurs(List<Joueur> joueurs) {
        this.joueurs = joueurs;
    }

    @Override
    public String toString() {
        return "Partie{" +
                "numeroPartie=" + numeroPartie +
                ", nombreJoueurs=" + nombreJoueurs +
                ", date=" + date +
                ", joueurs=" + joueurs +
                '}';
    }

    public static Partie creationPartie(){

        Partie partie = new Partie(1,
                3,
                LocalDateTime.of(2024,1,24,13,45));

        partie.ajouterJoueur(1,"Michel");
        partie.ajouterJoueur(2,"Vivian");
        partie.ajouterJoueur(3,"Nadine");

        return partie;
    }
    private void ajouterJoueur(int numeroJoueur, String prenom){
        joueurs.add(new Joueur(numeroJoueur, prenom));
    }

    public String validerPartie(LancerPartie lancer){
        if (lancer.getNombreJoueur() < 3){
            return "Erreur, les joueurs sont de minimum 3.";
        }
        if (lancer.getNombreJoueur() > 5){
            return "Erreur, les joueurs sont de maximum 5.";
        }
        return "partie initialisée";
    }

}
