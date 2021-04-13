package com.mycompany.hilos;


import com.mycompany.modelos.*;
import com.mycompany.myfarm.Game;

import javax.swing.*;
import com.mycompany.frames.*;

public class ConteoVida implements Runnable{

    private Player jugador;
    private Table table;
    private int segundosParaRestarVida = 3;
    private Game juego;
    private int minutos, segundos;
    private JFrame x;

    public ConteoVida(Player jugador, Table table, Game game, JFrame x){
        this.jugador = jugador;
        this.table = table;
        this.juego = game;
        this.x = x;
    }

    public void ActualizaVida(){
        do{
            try {
                Thread.sleep(this.segundosParaRestarVida*1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
             e.printStackTrace();
            }

            this.jugador.setVida(this.jugador.getVida()-1);
            this.table.getVida().setText("Vida al "+this.jugador.getVida()+"%");
            this.table.getOroLabel().setText("Oro disponible:  " +this.jugador.getGold());
        }while(this.jugador.getVida()>0);

        this.minutos = this.juego.getDuracion()/60;
        this.segundos = this.juego.getDuracion()%60;
        
        JOptionPane.showMessageDialog(null,"Oh no! "+this.jugador.getNickname()+", has muerto. Fin del Juego\n La partida duro "+this.minutos+" miuntos y "+this.segundos+" aproximadamente" );
        JOptionPane.showMessageDialog(null,"Gracias por jugar" );
        this.table.setVisible(false);
        this.x.setVisible(true);


    }


    @Override
    public void run() {
        ActualizaVida();
       
    }
    
}
