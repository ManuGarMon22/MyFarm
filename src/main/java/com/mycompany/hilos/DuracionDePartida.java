package com.mycompany.hilos;


import com.mycompany.modelos.*;
import com.mycompany.myfarm.Game;

public class DuracionDePartida implements Runnable{

    private Game juego;
    private Player jugador;

    public DuracionDePartida(Game juego, Player j){
        this.juego = juego;
        this.jugador = j; 
    }

    public void Duracion(){
        do {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            this.juego.setDuracion(this.juego.getDuracion()+1);

        }while(this.jugador.getVida()>0);


    }


    @Override
    public void run() {
        Duracion();
        
    }

}
