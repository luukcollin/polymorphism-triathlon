package org.example;

import org.example.classes.*;
import org.example.parents.Dier;
import org.example.parents.Kat;
import org.example.parents.Vogel;

import java.util.ArrayList;
import java.util.List;

/**
 * Idee van applicatie:
 * Je laat dieren een triathlon doen die zich ter land, ter zee en in de lucht afspeelt.
 * Uiteraard wil je weten welk team van dieren het snelste is. Hierom hebben alle dieren
 * de volgende parameter: snelheid en alias.
 */
public class Main {
    public static void main(String[] args) {
        List<Dier> dierenOase = new ArrayList<>();
        Vogel grasParkiet = new Parkiet("Grasshopper", 24);
        Vogel koningsParkiet = new Parkiet("Pipo", 27);
        grasParkiet.stijg();
        Kat alexDeLeeuw = new Leeuw("Alex de Leeeuw", 45);
        Kat lilyDePoes = new Poes("Lily Billy", 14);
        Kat joeryDeKater = new Poes("Joery", 15);
        Kat tijger = new Tijger("Streepjespoes", 42);

        dierenOase.add(grasParkiet);
        dierenOase.add(koningsParkiet);

        dierenOase.add(alexDeLeeuw);
        dierenOase.add(lilyDePoes);
        dierenOase.add(joeryDeKater);
        dierenOase.add(tijger);


        // Roept automatisch de toString() methode aan van Dier
        dierenOase.forEach(System.out::println);
        System.out.println("===========================");


        Mens usainBolt = new Mens("The lightning bolt", 39);
        Mens churandyMartina = new Mens("Nederlandse sprinter", 36);

        // Echter, sommige Classes kunnen hun eigen toString() methode gedefinieerd hebben
        // waardoor sommige 'Dieren' een ander resultaat hebben wanneer de toString() methode wordt aangesproken
        dierenOase.add(usainBolt);
        dierenOase.add(churandyMartina);

        dierenOase.forEach(System.out::println);


        usainBolt.eet(grasParkiet);
        usainBolt.eet((Parkiet) grasParkiet);
    }
}