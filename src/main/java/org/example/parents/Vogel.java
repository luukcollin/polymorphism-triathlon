package org.example.parents;

import org.example.interfaces.IVliegend;

public abstract class Vogel extends Dier implements IVliegend {
    public Vogel(String alias, int snelheid){
        super(alias, snelheid);
    }

    public void stijg() {
        System.out.println("Vogel stijgt op");
    }

    public void daal() {
        System.out.println("Vogel daalt neer");
    }
}
