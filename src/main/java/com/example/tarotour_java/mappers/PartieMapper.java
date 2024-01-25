package com.example.tarotour_java.mappers;

import com.example.tarotour_java.jpa.PartieEntity;
import com.example.tarotour_java.tarot.Partie;

public class PartieMapper {

    public static PartieEntity fromTarotToEntity(Partie partie){
        PartieEntity entity = new PartieEntity();
        entity.setDate(partie.getDate());
        entity.setNumeroPartie(partie.getNumeroPartie());
        entity.setNombreJoueurs(partie.getNombreJoueurs());
        return entity;
    }
}
