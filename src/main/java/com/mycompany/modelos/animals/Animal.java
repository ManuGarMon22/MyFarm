/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.modelos.animals;


import com.mycompany.enums.*;
/**
 *
 * @author manu
 */
public abstract class Animal {
    
    protected int comida;
    protected AState state;
    protected int cantidadProductoGenerado;

    public abstract void Comer();
    
    public abstract void Morir();
    
    public abstract void Producir();
    
    
    
    
    
    
}
