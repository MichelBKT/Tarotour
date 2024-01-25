package com.example.tarotour_java.jpa;

import jakarta.persistence.*;


@Entity
@Table(name = "joueurs")
public class JoueurEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private int numeroJoueur;
    private String prenom;

    public JoueurEntity(int numeroJoueur, String prenom) {
        this.numeroJoueur = numeroJoueur;
        this.prenom = prenom;
    }

    public JoueurEntity() {
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
        return "JoueurEntity{" +
                "numeroJoueur=" + numeroJoueur +
                ", prenom='" + prenom + '\'' +
                '}';
    }
}
