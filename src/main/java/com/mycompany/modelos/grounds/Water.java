package com.mycompany.modelos.grounds;

import com.mycompany.modelos.animals.Fish;
import com.mycompany.modelos.*;
import com.mycompany.frames.*;

//clase hija de terrenos. es un tipo de tierra que hay
public class Water extends Grounds {
    //atributos
    public static int cantidadMaxExistente = 35; 
    private int catidadMaxDePeces;
    private Fish[] fish;
    private boolean barco = false;
    
    //costructor
    public Water(Player  j) {
        super("Agua");
        super.ventana = new OpcionesAgua(this , j);
        this.catidadMaxDePeces = 10;
        this.fish = new Fish[this.catidadMaxDePeces];
         
        this.GenerarPeces();
    }
    
    //metodo para generar los peces que hay este terreno
    public void GenerarPeces(){
        for(int i = 0; i< this.catidadMaxDePeces; i++){
            this.fish[i]= new Fish();
        }         
    }

    //getter y setter 
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

    public boolean isBarco() {
        return barco;
    }

    public void setBarco(boolean barco) {
        this.barco = barco;
    }
    
}
