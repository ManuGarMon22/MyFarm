/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.modelos;


/**
 *
 * @author manu
 */
public class Player {
    //atributos de la clase
    private String name;
    private String nickname;
    private int gold = 100;
    private int vida = 100;
    private Bodega bodega;
    
    //constructor de la clase
    public Player(String name, String nickname){
        this.name = name;
        this.nickname = nickname;     
        this.bodega = new Bodega();
    }
    //Getters y setters de los atributos
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        if(vida >100){
            this.vida = 100;
        }else{
        this.vida = vida;
        }
    }

   public Bodega getBodega(){
       return this.bodega;
   }
    
    
    
    

}


