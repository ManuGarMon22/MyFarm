/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.manejadores;

import javax.swing.JFrame;

import com.mycompany.frames.Table;
import com.mycompany.modelos.Player;
import com.mycompany.myfarm.Game;

import com.mycompany.hilos.*;

//clase para determinar la acciones de la clase modelos juego
public class ManejadorGame{
    //variables a usar
    private Game game;
    private Player JPrincipal;
    private Table table ;
    private JFrame x;
    //costructor
    public ManejadorGame(Game juego, JFrame x ){
        this.game = juego;
        this.x = x;
        this.JPrincipal = this.game.getPlayer();
       
    }
    
    //metodo para iniciar el juego
    public void starGame(){
        //se genera el tablero
        table = new Table(this.game, this.x);
        table.setVisible(true);
        
        
        //ejecucion de hilo para determinar el tiempo que el juego ha estado en ejecucion
       Runnable r = new DuracionDePartida(game, JPrincipal);

       Thread tiempo = new Thread(r);
       tiempo.start();

    }



    
    
    
   
    
    
    
    
}
