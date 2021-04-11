package com.mycompany.modelos.grounds;

import com.mycompany.modelos.animals.Fish;

public class Water extends Grounds {
    
    public static int cantidadMaxExistente = 35; 

    private int catidadMaxDePeces;
    private Fish[] fish;
    private boolean barco = false;
    
    
    public Water() {
        super("Agua");
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

    

 
    
    
    
}
