/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myfarm;

import com.mycompany.modelos.Player;
import com.mycompany.frames.*;


public class Game {
    
    private boolean activo;
    
    private int oroGenerado;
    private int oroGastado;
    private int alimentoGenerado;
    private int alimnetoConsumido;
    private int celdasCompradas;
    
    private int criasGeneradas;
    private int unidadesDestazadas;
    
    private int semillasObtenidas;
    private int celdasSembradas;
    
    private int duracion = 0;
        
    private Player player;
    
    public Game (String x, String y){
        this.player = new Player (x,y);
        
    }

    public int getOroGenerado() {
        return oroGenerado;
    }

    public void setOroGenerado(int oroGenerado) {
        this.oroGenerado = oroGenerado;
    }

    public int getAlimentoGenerado() {
        return alimentoGenerado;
    }

    public void setAlimentoGenerado(int alimentoGenerado) {
        this.alimentoGenerado = alimentoGenerado;
    }

    public int getAlimnetoConsumido() {
        return alimnetoConsumido;
    }

    public void setAlimnetoConsumido(int alimnetoConsumido) {
        this.alimnetoConsumido = alimnetoConsumido;
    }

    public int getCeldasCompradas() {
        return celdasCompradas;
    }

    public void setCeldasCompradas(int celdasCompradas) {
        this.celdasCompradas = celdasCompradas;
    }

    public int getCriasGeneradas() {
        return criasGeneradas;
    }

    public void setCriasGeneradas(int criasGeneradas) {
        this.criasGeneradas = criasGeneradas;
    }

    public int getUnidadesDestazadas() {
        return unidadesDestazadas;
    }

    public void setUnidadesDestazadas(int unidadesDestazadas) {
        this.unidadesDestazadas = unidadesDestazadas;
    }

    public int getSemillasObtenidas() {
        return semillasObtenidas;
    }

    public void setSemillasObtenidas(int semillasObtenidas) {
        this.semillasObtenidas = semillasObtenidas;
    }

    public int getCeldasSembradas() {
        return celdasSembradas;
    }

    public void setCeldasSembradas(int celdasSembradas) {
        this.celdasSembradas = celdasSembradas;
    }
    
    

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public int getOroGastado() {
        return oroGastado;
    }

    public void setOroGastado(int oroGastado) {
        this.oroGastado = oroGastado;
    }
    
    
    
    
}
