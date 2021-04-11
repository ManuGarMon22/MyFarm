/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.modelos.plants;


import com.mycompany.enums.*;
/**
 *
 * @author manu
 */
public abstract class Plant {
    
    protected String name; 
    protected PState status;
 
    protected int timeToGrow;
    protected int production;
    protected int[] produccionDestaze;

    public Plant(String name,  int timeToGrow, int production, int produccionDestaze) {
        this.name = name;
        this.status = PState.SEMILLA;
        this.timeToGrow = timeToGrow;
        this.production = production;
        this.produccionDestaze = new int [produccionDestaze];
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


