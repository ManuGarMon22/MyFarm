/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myfarm;

import com.mycompany.modelos.Player;
import com.mycompany.frames.*;


public class Game {
    
    public static int oroGenerado;
    public static int alimentoGenerado;
    public static int alimnetoConsumido;
    public static int celdasCompradas;
    
    public static int criasGeneradas;
    public static int unidadesDestazadas;
    
    public static int semillasObtenidas;
    public static int celdasSembradas;
        
    private Player player;
    
    public Game (String x, String y){
        this.player = new Player (x,y);
        
    }
    
    
    public void starGame(){
        Table table = new Table();
        table.setVisible(true);
    }

    public static int getOroGenerado() {
        return oroGenerado;
    }

    public static void setOroGenerado(int oroGenerado) {
        Game.oroGenerado = oroGenerado;
    }

    public static int getAlimentoGenerado() {
        return alimentoGenerado;
    }

    public static void setAlimentoGenerado(int alimentoGenerado) {
        Game.alimentoGenerado = alimentoGenerado;
    }

    public static int getAlimnetoConsumido() {
        return alimnetoConsumido;
    }

    public static void setAlimnetoConsumido(int alimnetoConsumido) {
        Game.alimnetoConsumido = alimnetoConsumido;
    }

    public static int getCeldasCompradas() {
        return celdasCompradas;
    }

    public static void setCeldasCompradas(int celdasCompradas) {
        Game.celdasCompradas = celdasCompradas;
    }

    public static int getCriasGeneradas() {
        return criasGeneradas;
    }

    public static void setCriasGeneradas(int criasGeneradas) {
        Game.criasGeneradas = criasGeneradas;
    }

    public static int getUnidadesDestazadas() {
        return unidadesDestazadas;
    }

    public static void setUnidadesDestazadas(int unidadesDestazadas) {
        Game.unidadesDestazadas = unidadesDestazadas;
    }

    public static int getSemillasObtenidas() {
        return semillasObtenidas;
    }

    public static void setSemillasObtenidas(int semillasObtenidas) {
        Game.semillasObtenidas = semillasObtenidas;
    }

    public static int getCeldasSembradas() {
        return celdasSembradas;
    }

    public static void setCeldasSembradas(int celdasSembradas) {
        Game.celdasSembradas = celdasSembradas;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
    
    
    
}
