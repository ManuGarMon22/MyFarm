package com.mycompany.hilos;


import com.mycompany.modelos.*;
import javax.swing.*;
import com.mycompany.frames.*;

public class ConteoVida implements Runnable{

    private Player jugador;
    private Table table;
    private int segundosParaRestarVida = 7;

    public ConteoVida(Player jugador, Table table){
        this.jugador = jugador;
        this.table = table;
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

        JOptionPane.showMessageDialog(null,"El Granjero ha muerto. Fin del Juego");


    }

    @Override
    public void run() {
        ActualizaVida();
    }
    
}
