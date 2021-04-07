/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.modelos.plants;

import com.mycompany.enums.PState;
import com.mycompany.enums.PType;

/**
 *
 * @author manu
 */
public class NuevoFruto extends Plant {
    
    private int timetoDie;
    
    //constructor
    public NuevoFruto(String nombre, int tiempoC, int produccion, int productos, int tiempoM ){
        super(nombre, tiempoC, produccion, productos);
        this.timetoDie = tiempoM;
    }
    
    //getters y setters 
    public int getTimetoDie() {
        return timetoDie;
    }

    public void setTimetoDie(int timetoDie) {
        this.timetoDie = timetoDie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PState getStatus() {
        return status;
    }

    public void setStatus(PState status) {
        this.status = status;
    }


    public int getTimeToGrow() {
        return timeToGrow;
    }

    public void setTimeToGrow(int timeToGrow) {
        this.timeToGrow = timeToGrow;
    }

    public int getProduction() {
        return production;
    }

    public void setProduction(int production) {
        this.production = production;
    }

    public int[] getProduccionDestaze() {
        return produccionDestaze;
    }

    public void setProduccionDestaze(int[] produccionDestaze) {
        this.produccionDestaze = produccionDestaze;
    }
    
    
}
