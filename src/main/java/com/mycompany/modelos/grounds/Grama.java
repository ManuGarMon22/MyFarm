/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.modelos.grounds;

import com.mycompany.enums.GroundMejora;
import com.mycompany.frames.*;

/**
 *
 * @author manu
 */
public class Grama extends Grounds{
    
    public static int cantidadMaxExistente = 40; 
    private boolean parcela;
    private GroundMejora tipoMejora;
    private JFrame ventana;
    private Player jugador;


    public Grama(Player j) {
        super("Grama");
        this.parcela = false;
        this.tipoMejora = GroundMejora.NORMAL;
        this.ventana = new OpcionesGrama()
    }

    public static int getCantidadMaxExistente() {
        return cantidadMaxExistente;
    }

    public static void setCantidadMaxExistente(int cantidadMaxExistente) {
        Grama.cantidadMaxExistente = cantidadMaxExistente;
    }

    public GroundMejora getTipoMejora() {
        return tipoMejora;
    }

    public void setTipoMejora(GroundMejora tipoMejora) {
        this.tipoMejora = tipoMejora;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
       public boolean isParcela() {
        return parcela;
    }

    public void setParcela(boolean parcela) {
        this.parcela = parcela;
    }
    
    
    
    
}
