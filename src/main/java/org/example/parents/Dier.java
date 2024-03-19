package org.example.parents;

public abstract class Dier {
    private String alias;
    private int snelheid;
    public Dier(String soort, int snelheid){
        this.alias = soort;
        this.snelheid = snelheid;
    }
    public String getAlias() {
        return alias;
    }

    public int getSnelheid() {
        return snelheid;
    }

    @Override
    public String toString(){
        return String.format("%s, snelheid: %s", getAlias(), getSnelheid());
    }
}
