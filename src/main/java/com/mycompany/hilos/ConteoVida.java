package com.mycompany.hilos;


import com.mycompany.modelos.*;
import com.mycompany.myfarm.Game;

import javax.swing.*;
import com.mycompany.frames.*;

public class ConteoVida implements Runnable{

    private Player jugador;
    private Table table;
    private int segundosParaRestarVida = 1;
    private Game juego;
    private int minutos, segundos;

    public ConteoVida(Player jugador, Table table, Game game){
        this.jugador = jugador;
        this.table = table;
        this.juego = game;
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
        
        JOptionPane.showMessageDialog(null,"Oh no! "+this.jugador.getNickname()+", has muerto. Fin del Juego\n La partida duro "+this.minutos+":"+this.segundos+" aproximadamente" );
        JOptionPane.showMessageDialog(null,"Gracias por jugar" );
        System.exit(0);
        this.table.setVisible(false);

    }


    @Override
    public void run() {
        ActualizaVida();
       
    }
    
}
