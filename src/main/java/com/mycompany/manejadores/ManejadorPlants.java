/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.manejadores;


import com.mycompany.enums.*;
import com.mycompany.modelos.plants.*;
import com.mycompany.modelos.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author manu
 */
public class ManejadorPlants extends Thread implements SeresVivos {
    
    private Plant plant;
    private Player player;
    
    public ManejadorPlants(Plant plant, Player player) throws InterruptedException{
        this.plant = plant;
        this.player = player;
    }

    
    
    
   /* @Override
    public void run(){
        try{
            
        }catch(InterruptedException e){
        
        }
    }*/

    @Override
    public void ToGrow() {
        try {
            ManejadorPlants.sleep(this.plant.getTimeToGrow()+10000);
            this.plant.setStatus(PState.COSECHA);
        } catch (InterruptedException ex) {
            
        }
        
    }
        
   
    public void ToDie(){
        if(this.plant.getType() == PType.FRUTA){
            try {
                this.sleep(this.plant.getTimeToDie()*240000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ManejadorPlants.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.plant.setStatus(PState.MUERTE);
        }else{
            try {
                this.sleep(this.plant.getTimeToDie()*20000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ManejadorPlants.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.plant.setStatus(PState.MUERTE);
        } 
        
    }

    @Override
    public void ToProduce() {
        if(this.plant.getStatus() == PState.COSECHA){
            
        } else {
        }
        

    }

    
}