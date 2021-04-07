/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.manejadores;


import com.mycompany.enums.*;
import com.mycompany.modelos.plants.*;
import com.mycompany.modelos.*;



/**
 *
 * @author manu
 */
public class ManejadorNuevoGrano extends Thread implements Grains {
    
    private Plant plant;
    private Player player;
    
    public ManejadorNuevoGrano(NuevoGrano plant, Player player) throws InterruptedException{
        this.plant = plant;
        this.player = player;
    }

    
    
    
   /* @Override
    public void run(){
        try{
            
        }catch(InterruptedException e){
        
        }
    }*/
    
    
    public void ToGrow() {
        try {
            ManejadorNuevoGrano.sleep(this.plant.getTimeToGrow()+10000);
            this.plant.setStatus(PState.COSECHA);
        } catch (InterruptedException e) {
            
        }
        
    }
        
   
   
    
}