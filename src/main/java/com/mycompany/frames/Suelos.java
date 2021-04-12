/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.frames;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import com.mycompany.modelos.*;
import com.mycompany.modelos.grounds.*;
import com.mycompany.frames.*;



/**
 *
 * @author manu
 */
public class Suelos extends JPanel  {
    
    private Player jugador;
    
    private int  grama =0, agua=0, desierto=0;
    private int casillasHabilitadas, casillasCreadas;
    private JButton botones[]; // arreglo de botones
    
    private GridLayout cuadricula; 
   

    // constructor
    public Suelos(Player j){
        this.jugador = j;
        this.setLayout(null);
        this.setBounds(0,0, 650, 630 ); // establece el tamaño del marco
        
        
        
        ColocarBotones();
        HabilitarCasillasIniciales();
    } 
    
    private void ColocarBotones(){
        cuadricula = new GridLayout(12, 5 ); 
        setLayout( cuadricula );         
        botones = new JButton[60]; // crea arreglo de objetos JButton
        for ( int i = 0; i < 60; i++ ){
            botones[i] = new SuperficieJButton(this.jugador, this.tipoNuevaCasilla());
            this.casillasCreadas++;            
            botones[i].setEnabled(false);
            this.add( botones[i] ); // agrega boton a objeto JFrame
        } // fin de for
    }
    
    
    
    public void HabilitarCasillasIniciales(){
        for (int i = 0; i < 25; i++) {
            botones[i].setEnabled(true);
            
        }
        this.casillasHabilitadas = 25;
    }
    
    
    
    public void HablitiarNuevaCasilla(){
        this.botones[this.casillasHabilitadas].setEnabled(true);
        this.setCasillasHabilitadas(getCasillasHabilitadas()+1);
    }


    public int getCasillasHabilitadas() {
        return casillasHabilitadas;
    }

    public void setCasillasHabilitadas(int casillasHabilitadas) {
        this.casillasHabilitadas = casillasHabilitadas;
    }
    
    private int tipoNuevaCasilla(){
        if(desierto < (this.casillasCreadas*(0.01 * Desert.getCantidadMaxExistente()))){
            desierto++;
            return 3;
        }else if(agua < (this.casillasCreadas*(0.01 * Water.getCantidadMaxExistente()))){
            agua++;
            return 2;
        }else if (grama <= (this.casillasCreadas*(0.01 * Grama.getCantidadMaxExistente()))){
            grama++;
            return 1;
        }else {
            return 0;
        }
    }
    
}

