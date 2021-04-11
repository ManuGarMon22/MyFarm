/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.modelos.plants;

import com.mycompany.enums.PState;
import com.mycompany.modelos.Comida;

/**
 *
 * @author manu
 */
public class Fruits extends Plant implements Comida{
    
    private int timeToDie;
    
    public Fruits(String name, int timeToGrow, int ttD, int production, int produccionDestaze) {
        super(name, timeToGrow, production, produccionDestaze);
        this.timeToDie = ttD;
    }

    public int getTimeToDie() {
        return timeToDie;
    }

    public void setTimeToDie(int timeToDie) {
        this.timeToDie = timeToDie;
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
