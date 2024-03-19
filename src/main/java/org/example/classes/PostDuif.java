package org.example.classes;

import org.example.parents.Vogel;

public class PostDuif extends Vogel {
    public PostDuif(String alias, int snelheid) {
        super(alias, snelheid);
    }

    public void brengPost(String bericht, String adres){
        System.out.printf("%s verspreid het bericht %s naar %s",getAlias(), bericht, adres);
    }

    @Override
    public void daal(){
        System.out.println("Kan pas dalen als ik gescheten heb");
    }
}