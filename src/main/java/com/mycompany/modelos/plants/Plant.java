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
public class Plant {
    
    private String name; 
    private PState status;
    private PType type;
    private int timeToDie;
    private int timeToGrow;
    private int production;
    private int[] produccionDestaze;

    public Plant(String name, PType type, int timeToDie, int timeToGrow, int production, int[] produccionDestaze) {
        this.name = name;
        this.status = PState.SEMILLA;
        this.type = type;
        this.timeToDie = timeToDie;
        this.timeToGrow = timeToGrow;
        this.production = production;
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

    public PType getType() {
        return type;
    }

    public void setType(PType type) {
        this.type = type;
    }

    public int getTimeToDie() {
        return timeToDie;
    }

    public void setTimeToDie(int timeToDie) {
        this.timeToDie = timeToDie;
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

