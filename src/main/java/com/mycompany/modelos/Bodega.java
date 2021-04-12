
package com.mycompany.modelos;

import com.mycompany.modelos.animals.Food;
import com.mycompany.modelos.plants.*;

import org.graalvm.compiler.java.BytecodeParserOptions_OptionDescriptors;



public class Bodega {
    //comidas
    private int granos = 0;
    private int fruta = 0;
    private int leche = 0;
    
    private int cuero = 0;
    private int carne = 0;
    private int huevos = 0;
    //ayudas para tierra
    private int  MejoraTierra1  = 0;
    private int  MejoraTierra2  = 0;
    private int  MejoraTierra3  = 0;
    //alimento hervivoros
    private int herv1 = 0;
    private int herv2 = 0;
    private int herv3 = 0;
    //alimento omnivoros
    private int omni1 = 0;
    private int omni2 = 0;
    private int omni3 = 0;

    private int barcos = 0;
  

    public int getCuero() {
        return cuero;
    }

    public void setCuero(int cuero) {
        this.cuero = cuero;
    }

    public int getCarne() {
        return carne;
    }

    public void setCarne(int carne) {
        this.carne = carne;
    }

    public int getHuevos() {
        return huevos;
    }

    public void setHuevos(int huevos) {
        this.huevos = huevos;
    }

    public int getMejoraTierra1() {
        return MejoraTierra1;
    }

    public void setMejoraTierra1(int MejoraTierra1) {
        this.MejoraTierra1 = MejoraTierra1;
    }

    public int getMejoraTierra2() {
        return MejoraTierra2;
    }

    public void setMejoraTierra2(int MejoraTierra2) {
        this.MejoraTierra2 = MejoraTierra2;
    }

    public int getMejoraTierra3() {
        return MejoraTierra3;
    }

    public void setMejoraTierra3(int MejoraTierra3) {
        this.MejoraTierra3 = MejoraTierra3;
    }

    public int getHerv1() {
        return herv1;
    }

    public void setHerv1(int herv1) {
        this.herv1 = herv1;
    }

    public int getHerv2() {
        return herv2;
    }

    public void setHerv2(int herv2) {
        this.herv2 = herv2;
    }

    public int getHerv3() {
        return herv3;
    }

    public void setHerv3(int herv3) {
        this.herv3 = herv3;
    }

    public int getOmni1() {
        return omni1;
    }

    public void setOmni1(int omni1) {
        this.omni1 = omni1;
    }

    public int getOmni2() {
        return omni2;
    }

    public void setOmni2(int omni2) {
        this.omni2 = omni2;
    }

    public int getOmni3() {
        return omni3;
    }

    public void setOmni3(int omni3) {
        this.omni3 = omni3;
    }
    

    public int getBarcos(){
        return this.barcos;
    }
    
    public void setBarcos(int barcos){
        this.barcos = barcos;
    }
    

    
    
}
