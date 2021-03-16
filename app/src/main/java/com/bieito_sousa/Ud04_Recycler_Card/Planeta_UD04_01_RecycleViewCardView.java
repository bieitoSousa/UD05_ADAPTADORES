package com.bieito_sousa.Ud04_Recycler_Card;

public class Planeta_UD04_01_RecycleViewCardView {

    int id;
    String nombre;
    boolean habitable;
    int fotoId;

    public Planeta_UD04_01_RecycleViewCardView(int id, String nombre, boolean habitable,int fotoId){
        this.id = id;
        this.nombre = nombre;
        this.habitable = habitable;
        this.fotoId = fotoId;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isHabitable() {
        return habitable;
    }

    public int getFotoId() {
        return fotoId;
    }

    @Override
    public String toString(){
        return "Planeta con id " + id + " e de nome " + nombre + (habitable ? " é habitable." : " non é habitable");
    }

}
