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
    private String name;
    private String nickname;
    private int gold = 50;
    private int vida = 100;
    
    
    
    public Player(String name, String nickname){
        this.name = name;
        this.nickname = nickname;     
    }

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
        this.vida = vida;
    }

   
    
    
    
    

}


