/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.frames;


import com.mycompany.modelos.*;
import com.mycompany.myfarm.Game;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author manu
 */
public class Table extends JFrame implements ActionListener {
    
    
    
    private Suelos suelo;
    private JPanel base;
    private JButton ComprarTerreno, Bodega, mer;
    private Player jugador;
    private Game juego;
    private JLabel vida;
    private JLabel tiempo;
    private JFrame mercado;

    
    
    public Table(Game l){
        this.juego = l; 
        this.jugador = this.juego.getPlayer();
        this.setLayout(null); //metodo para iniciar la ventana
        this.setTitle("My Farm"); //titulo para la ventana
        this.setBounds(0,0,1050, 700);//establecer tamaño de la ventana
        this.setResizable(false);// Codigo para no cambiar de tamaño la ventana
        this.setLocationRelativeTo(null);// codigo para que la panatalla aparesca en el centro
        base = new JPanel();
        base.setLayout(null);
        base.setBounds(0,0,this.getWidth(), this.getHeight());
        this.add(base);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); // metodo para que el programa termine de ejecutarse con el boton x
    
        this.mercado = new MercadoJFrame(this.jugador);
        this.suelo = new Suelos(this.jugador);
        this.base.add(suelo);
        this.AgregarBotones();
        this.AgregarEtiqueta();
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == ComprarTerreno){
            if (this.jugador.getGold()<100){
                JOptionPane.showMessageDialog(null, "No cuentas con dinero suficiente para comprar otro terreno");
            }else{    
                this.suelo.HablitiarNuevaCasilla();
                this.jugador.setGold(jugador.getGold()-100);
                if(this.suelo.getCasillasHabilitadas()>=60){
                    this.ComprarTerreno.setEnabled(false);
                }
            }
        }else if(e.getSource() == Bodega){
        
            this.juego.getPlayer().setGold(juego.getPlayer().getGold()+100);
           
        }else if(e.getSource() == mer){
            this.mercado.setVisible(true);
        }
        
    }
        
    public void AgregarBotones(){
        this.ComprarTerreno = new JButton("Comprar terreno");
        this.ComprarTerreno.setBounds(800, 600, 200, 40);
        this.ComprarTerreno.addActionListener(this);
        this.base.add(this.ComprarTerreno);
        
        this.Bodega = new JButton("Bodega");
        this.Bodega.setBounds(800, 560, 200, 40);
        this.Bodega.addActionListener(this);
        this.base.add(this.Bodega);
        
        this.mer = new JButton("Mercado");
        this.mer.setBounds(800, 520, 200, 40);
        this.mer.addActionListener(this);
        this.base.add(this.mer) ;
      }
    
    public void AgregarEtiqueta(){
        vida = new JLabel("Vida al "+this.jugador.getVida()+"%");
        vida.setBounds(10, 630, 200, 30);
        this.base.add(vida);
        
        tiempo = new JLabel("Oro disponible:  " +this.jugador.getGold());
        tiempo.setBounds(300, 630, 200, 30);
        this.base.add(tiempo);
        
    }
    
    
}
