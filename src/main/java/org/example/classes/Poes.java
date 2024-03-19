package org.example.classes;

import org.example.parents.Kat;

public class Poes extends Kat {
    public Poes(String alias, int snelheid) {
        super(alias, snelheid);
    }

    @Override
    public void spin() {
        System.out.println("Miaauww");
    }
}
