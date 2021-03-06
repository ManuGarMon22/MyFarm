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
import com.mycompany.frames.*;
import com.mycompany.hilos.*;
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
    private JLabel oroLabel;
    private JFrame mercadoFrame, bodegaFrame;

    
    
    public Table(Game l, JFrame x){
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
    
        
        this.suelo = new Suelos(this.jugador);
        this.base.add(suelo);
        this.AgregarBotones();
        this.AgregarEtiqueta();

        Runnable vidaRunnable = new ConteoVida(jugador, this, juego,x);
        
        Thread hilosVida = new Thread(vidaRunnable);

        hilosVida.start();
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == ComprarTerreno){
            if (this.jugador.getGold()<100){
                JOptionPane.showMessageDialog(null, "No cuentas con oro suficiente para comprar otro terreno");
            }else{    
                this.suelo.HablitiarNuevaCasilla();
                this.jugador.setGold(jugador.getGold()-100);
                this.juego.setCeldasCompradas(this.juego.getCeldasCompradas()+1);
                
                if(this.suelo.getCasillasHabilitadas()>=60){
                    this.ComprarTerreno.setEnabled(false);
                }
            }
        }else if(e.getSource() == Bodega){
            this.bodegaFrame = new BodegaJFrame(juego);
            this.bodegaFrame.setVisible(true);
        
            this.juego.getPlayer().setGold(juego.getPlayer().getGold()+100);
           
        }else if(e.getSource() == mer){
            this.mercadoFrame = new MercadoJFrame(this.jugador, this.juego);
            this.mercadoFrame.setVisible(true);
        }
        this.oroLabel.setText("Oro disponible:  " +this.jugador.getGold());
    }
        
    public void AgregarBotones(){
        this.ComprarTerreno = new JButton("Comprar terreno");
        this.ComprarTerreno.setBounds(750, 600, 250, 40);
        this.ComprarTerreno.addActionListener(this);
        this.base.add(this.ComprarTerreno);
        
        this.Bodega = new JButton("Bodega");
        this.Bodega.setBounds(750, 560, 250, 40);
        this.Bodega.addActionListener(this);
        this.base.add(this.Bodega);
        
        this.mer = new JButton("Mercado");
        this.mer.setBounds(750, 520, 250, 40);
        this.mer.addActionListener(this);
        this.base.add(this.mer) ;
      }
    
    public void AgregarEtiqueta(){
        vida = new JLabel("Vida al "+this.jugador.getVida()+"%");
        vida.setBounds(10, 630, 200, 30);
        this.base.add(vida);
        
        oroLabel = new JLabel("Oro disponible:  " +this.jugador.getGold());
        oroLabel.setBounds(300, 630, 200, 30);
        this.base.add(oroLabel);
        
    }

    public JLabel getVida() {
        return vida;
    }

    public void setVida(JLabel vida) {
        this.vida = vida;
    }

    public JLabel getOroLabel() {
        return oroLabel;
    }

    public void setOroLabel(JLabel oroLabel) {
        this.oroLabel = oroLabel;
    }    
    
}
