package com.example.tarotour_java.jpa;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "parties")
public class PartieEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private int numeroPartie;
    private int nombreJoueurs;
    private LocalDateTime date;

    public PartieEntity() {
    }

    public PartieEntity(int numeroPartie, int nombreJoueurs, LocalDateTime date) {
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

    @Override
    public String toString() {
        return "PartieEntity{" +
                "id=" + id +
                ", numeroPartie=" + numeroPartie +
                ", nombreJoueurs=" + nombreJoueurs +
                ", date=" + date +
                '}';
    }
}
