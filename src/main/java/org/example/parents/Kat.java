package org.example.parents;

import org.example.classes.Mens;
import org.example.interfaces.IKat;
import org.example.interfaces.ILopend;

public abstract class Kat extends Dier implements IKat, ILopend {
    public Kat(String alias, int snelheid){
        super(alias, snelheid);
    }

    public void spin() {
        System.out.println("Miauww prrrrrrrr");
    }

    public void spring() {
        System.out.printf("%s springt op het toetsenbord!", getAlias());
    }

    public void kruip() {
        System.out.printf("%s kruipt richting het muisje", getAlias());
    }
}
