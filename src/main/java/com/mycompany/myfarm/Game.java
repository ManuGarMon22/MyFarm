/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myfarm;

import com.mycompany.modelos.Player;
import com.mycompany.frames.*;


public class Game {
    
    private Player player;
    
    public Game (String x, String y){
        this.player = new Player (x,y);
        
    }
    
    
    public void starGame(){
        Table table = new Table();
        table.setVisible(true);
    }
    
}
