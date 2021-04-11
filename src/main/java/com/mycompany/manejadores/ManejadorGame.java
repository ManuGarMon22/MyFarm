/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.manejadores;

import com.mycompany.frames.Table;
import com.mycompany.modelos.Player;
import com.mycompany.myfarm.Game;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author manu
 */
public class ManejadorGame  {
    
    private Game game;
    private Player JPrincipal;
    private Thread duracion;
    private Table table ;
    
    public ManejadorGame(Game juego){
        this.game = juego;
       
    }
    
    
    public void starGame(){
        
        table = new Table( this.game);
        table.setVisible(true);
        
        
    }
    
    
    
   
    
    
    
    
}
