package com.example.tarotour_java;

import com.example.tarotour_java.jpa.JoueurEntity;
import com.example.tarotour_java.jpa.PartieEntity;
import com.example.tarotour_java.jpa.PartieRepository;
import com.example.tarotour_java.mappers.JoueurMapper;
import com.example.tarotour_java.mappers.PartieMapper;
import com.example.tarotour_java.tarot.Joueur;
import com.example.tarotour_java.tarot.Partie;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.SQLOutput;
import java.util.List;

@SpringBootTest
class TarotourJavaApplicationTests {

    @Autowired
    PartieRepository partieRepository;

    @Test
    void testCreationPartie() {
        Partie maPartie = Partie.creationPartie();
        PartieEntity entity = PartieMapper.fromTarotToEntity(maPartie);
        partieRepository.save(entity);
    }
    @Test
    void testLirePartie() {
        List<PartieEntity> parties = partieRepository.findAll();
        for(PartieEntity p : parties){
            System.out.println(p);;
        }
    }
    @Test
    void testJoueur(){
        Joueur joueur = new Joueur(1,"Gilles");
        JoueurEntity entity = JoueurMapper.fromTarotToEntity(joueur);
    }



}
