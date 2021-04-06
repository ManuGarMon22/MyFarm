/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.manejadores;

import com.mycompany.modelos.*;
/**
 *
 * @author manu
 */
public class ManejadorBodega {
    
    private Bodega bodega;
    private Player player;

    public ManejadorBodega(Player player) {
        this.bodega = new Bodega();
        this.player = player;
    }
    
    
}
