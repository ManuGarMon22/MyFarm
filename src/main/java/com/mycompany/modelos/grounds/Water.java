package com.mycompany.modelos.grounds;

import com.mycompany.modelos.animals.Fish;

public class Water extends Grounds {
    
    public static int cantidadMaxExistente = 35; 

    private int catidadMaxDePeces;
    private Fish[] fish; 
    
    public Water(String nombre, String color ) {
        super(nombre, color);
        this.catidadMaxDePeces = 10;
        this.fish = new Fish[this.catidadMaxDePeces];
                
    }

    public static int getCantidadMaxExistente() {
        return cantidadMaxExistente;
    }

    public static void setCantidadMaxExistente(int cantidadMaxExistente) {
        Water.cantidadMaxExistente = cantidadMaxExistente;
    }

    public int getCatidadMaxDePeces() {
        return catidadMaxDePeces;
    }

    public void setCatidaMaxDePeces(int catidadMaxDePeces) {
        this.catidadMaxDePeces = catidadMaxDePeces;
    }

    public Fish[] getFish() {
        return fish;
    }

    public void setFish(Fish[] fish) {
        this.fish = fish;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    
}
