
package com.mycompany.modelos.grounds;



public class Desert extends Grounds {
    
    public static int cantidadMaxExistente = 25;

    public Desert() {
        super("Desierto");

    }

    
    public static int getCantidadMaxExistente(){
        return cantidadMaxExistente;
    }

    public static void setCantidadMaxExistente(int cantidadMaxExistente){
        Desert.cantidadMaxExistente = cantidadMaxExistente;
    }
    
    
    
    
    
    
}



