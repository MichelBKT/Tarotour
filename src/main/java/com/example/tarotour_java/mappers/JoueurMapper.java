package com.example.tarotour_java.mappers;

import com.example.tarotour_java.jpa.JoueurEntity;
import com.example.tarotour_java.tarot.Joueur;

public class JoueurMapper {

    public static JoueurEntity fromTarotToEntity(Joueur joueur){
        JoueurEntity entity = new JoueurEntity(joueur.getNumeroJoueur(), joueur.getPrenom());
        return entity;
    }
}
