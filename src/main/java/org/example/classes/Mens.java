package org.example.classes;
import org.example.interfaces.IDier;
import org.example.interfaces.ILopend;
import org.example.interfaces.IZwemmend;
import org.example.parents.Dier;
import org.example.parents.Vogel;


public class Mens extends Dier implements ILopend, IZwemmend, IDier<Vogel> {
    public Mens(String alias, int snelheid) {
        super(alias, snelheid);
    }

    @Override
    public String toString(){
        return "Ik ben een mens en " + super.toString();
    }

    @Override
    public void eet(Vogel dier) {
        System.out.println(super.getAlias() + " eet een vogel");
    }
    public void eet(Parkiet parkiet) {
        System.out.println(super.getAlias() + " eet een parkiet");
    }

    public void spring() {
        System.out.println();
    }

    public void kruip() {

    }

    public void barrelRoll() {

    }

    public void springUitHetWater() {

    }
}






