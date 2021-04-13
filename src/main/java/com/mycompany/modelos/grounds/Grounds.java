/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.modelos.grounds;

import javax.swing.JFrame;

import com.mycompany.enums.*;

//clase padre y abstracta para definir cosa en comun de los terrenos 
public abstract class Grounds {
    //atributos 
    protected SGround state;
    protected JFrame ventana;
    protected String nombre;
    protected boolean procesando = false;
    //Costructor 
    public Grounds(String nombre) {
        this.state = SGround.DESHABILITADO;
        this.nombre = nombre;
    }

    //getters y setters 
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


    public void setVentana(JFrame ventana) {
        this.ventana = ventana;
    }


    public boolean isProcesando() {
        return procesando;
    }


    public void setProcesando(boolean procesando) {
        this.procesando = procesando;
    }
    
    
    
    
    
    
    
    
    
}
