
package com.mycompany.manejadores;

import com.mycompany.enums.PState;
import com.mycompany.modelos.plants.*;

public class ManejadorNuevoGrano implements Grains {
    
    private NuevoGrano grano;
   
    
    public ManejadorNuevoGrano(NuevoGrano plant){
        this.grano = plant;
    }
    
    public void Crecer(){
        this.grano.setStatus(PState.COSECHA);
    }
    

    
        
   
   
    
}