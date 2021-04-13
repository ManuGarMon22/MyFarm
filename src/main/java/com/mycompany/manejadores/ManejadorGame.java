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

/**
 *
 * @author manu
 */
public class ManejadorGame{
    
    private Game game;
    private Player JPrincipal;
    private Table table ;
    private JFrame x;
    
    public ManejadorGame(Game juego, JFrame x ){
        this.game = juego;
        this.x = x;
        this.JPrincipal = this.game.getPlayer();
       
    }
    
    
    public void starGame(){
        
        table = new Table(this.game, this.x);
        table.setVisible(true);
        
       Runnable r = new DuracionDePartida(game, JPrincipal);

       Thread tiempo = new Thread(r);
       tiempo.start();

    }



    
    
    
   
    
    
    
    
}
