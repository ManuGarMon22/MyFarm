/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.modelos.grounds;

import com.mycompany.enums.GroundMejora;
import com.mycompany.frames.*;
import com.mycompany.modelos.*;
import com.mycompany.modelos.plants.*;
import javax.swing.*;

//clase para definir otro tipo de terreno 
public class Grama extends Grounds{
    //atributos de la clase 
    public static int cantidadMaxExistente = 40; 
    private boolean parcela;
    private GroundMejora tipoMejora;
    private JFrame ventana;
    private Player jugador;
    private Plant planta;
    //Constructor de la clase
    public Grama(Player j) {
        super("Grama");
        this.parcela = false;
        this.tipoMejora = GroundMejora.NORMAL;
        super.ventana = new OpcionesGrama(j);
        this.planta = null;
    }

    //getters y setter de los atributos
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
    

    public Plant getPlanta() {
        return planta;
    }

    public void setPlanta(Plant planta) {
        this.planta = planta;
    }
    
}
