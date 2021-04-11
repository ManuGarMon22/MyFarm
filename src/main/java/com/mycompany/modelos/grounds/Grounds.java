/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.modelos.grounds;

import javax.swing.JFrame;

import com.mycompany.enums.*;
import com.mycompany.frames.*;

public abstract class Grounds {
    
    protected SGround state;
    protected JFrame ventana;
    protected String nombre;

    public Grounds(String nombre) {
        this.state = SGround.DESHABILITADO;
        this.nombre = nombre;
    }


    public SGround getState() {
        return state;
    }

    public void setState(SGround state) {
        this.state = state;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public JFrame getVentana() {
        return ventana;
    }
    
    
    
    
    
    
    
    
    
}
