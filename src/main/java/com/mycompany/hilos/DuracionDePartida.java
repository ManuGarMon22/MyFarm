package com.mycompany.hilos;


import com.mycompany.modelos.*;
import com.mycompany.myfarm.Game;

public class DuracionDePartida implements Runnable{
    //variables a usar
    private Game juego;
    private Player jugador;
    //constructor de la clase
    public DuracionDePartida(Game juego, Player j){
        this.juego = juego;
        this.jugador = j; 
    }
    //metodo para saber cuanto tiempo ha transcurrido desde el inicio del juego  
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

    //metodo para ser ejecuta en el hilo
    @Override
    public void run() {
        Duracion();
        
    }

}
