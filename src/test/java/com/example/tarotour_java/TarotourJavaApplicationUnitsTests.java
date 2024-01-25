package com.example.tarotour_java;

import com.example.tarotour_java.tarot.LancerPartie;
import com.example.tarotour_java.tarot.Partie;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;


class TarotourJavaApplicationUnitsTests {

    static Partie partie;


    @BeforeEach
    void setup() {
        partie = Partie.creationPartie();
    }
    @Test
    void testNbJoueursMini(){
        LancerPartie lancer = new LancerPartie("François", 2);
        assertEquals("Erreur, les joueurs sont de minimum 3.", partie.validerPartie(lancer));
    }
    @Test
    void testNbJoueursMax(){
        LancerPartie lancer = new LancerPartie("Chime", 6);
        assertEquals("Erreur, les joueurs sont de maximum 5.", partie.validerPartie(lancer));
    }
    @Test
    void testNbJoueursOk(){
        LancerPartie lancer = new LancerPartie("Gilles", 4);
        assertEquals("partie initialisée", partie.validerPartie(lancer));
    }
}
