/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hilos;

import com.mycompany.enums.PState;
import com.mycompany.modelos.grounds.*;
import com.mycompany.modelos.plants.*;
import javax.swing.*;

/**
 *
 * @author manu
 */
public class ProcesoCrecimiento extends Thread {
    
    private JButton imagenSuelo;
    private Grounds suelo;
    private Plant actual;

    public ProcesoCrecimiento(JButton imagenSuelo, Grounds suelo) {
        this.imagenSuelo = imagenSuelo;
        this.suelo = suelo;
    }
    
    
    public void CrecerGrano(Grains p) throws InterruptedException{
        this.actual = p;
        
        if (p.getStatus() == PState.SEMILLA)
            this.sleep(p.getTimeToGrow()*1000);
            p.setStatus(PState.COSECHA);
            this.sleep(p.getTimeToGrow()*1000);
            p.setStatus(PState.MUERTE);            
    }
    
    
    public void CrecerFruta(Fruits f){
        
    }
}
