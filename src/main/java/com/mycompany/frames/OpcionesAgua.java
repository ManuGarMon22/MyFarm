package com.mycompany.frames;

import javax.swing.*;

import com.mycompany.modelos.grounds.Water;
import com.mycompany.modelos.*;
import java.awt.*;
import java.awt.event.*;

public class OpcionesAgua extends JFrame implements ActionListener {
    
    private JPanel base;
    private Label etiqueta1;
    private JButton AgregarBarco, quitarBarco, volverButton;
    private Player jugador;
    private Water terreno;

    private int pecesActuales;

    public OpcionesAgua(Water Terreno, Player J){
        this.terreno = Terreno;
        this.jugador = J;
        setBounds(0,0,400,300);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Menu Agua");
        this.pecesActuales = 10;

        base = new JPanel();
        base.setLayout(null);
        this.add(base);

        
        AgregaEtiquetas();
        agregarBotones();

    }

    public void AgregaEtiquetas(){
        this.etiqueta1 = new Label("Hay "+pecesActuales+" peces en este sector");
        this.etiqueta1.setBounds(0,0,300, 40);
        this.base.add(this.etiqueta1);

    }

    public void agregarBotones(){

        this.volverButton = new JButton("Volver");
        this.volverButton.setBounds(380, 460, 100, 30);
        this.volverButton.addActionListener(this);
        this.base.add(this.volverButton);
        
        AgregarBarco = new JButton("Agregar Barco");
        AgregarBarco.setBounds(100, 50, 200, 100);
        AgregarBarco.addActionListener(this);
        this.base.add(AgregarBarco);
        
        quitarBarco = new JButton("Quitar Barco");
        quitarBarco.setBounds(100, 150, 200, 100);
        quitarBarco.addActionListener(this);
        this.base.add(quitarBarco);
        
        if (this.terreno.isBarco()){
            quitarBarco.setEnabled(true);
            AgregarBarco.setEnabled(false);
        }/*else if( this.jugador.getBodega().getBarcos()> 0){
            quitarBarco.setEnabled(false);
            AgregarBarco.setEnabled(true);
        }*/else{
            quitarBarco.setEnabled(false);
            AgregarBarco.setEnabled(true);
            //JOptionPane.showMessageDialog(null,"no puede relizar ninguna accion ya que no cuneta con barcos para poder pescar. \n Vaya al mercado a comprar para poder realizar alguna accion");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == AgregarBarco){
            if (this.jugador.getBodega().getBarcos()>0){
                this.terreno.setBarco(true);
                this.AgregarBarco.setEnabled(false);
                this.quitarBarco.setEnabled(true);
            }else{
                JOptionPane.showMessageDialog(null,"No cuentas con ningun barco en bodega");
            }
        }else if( e.getSource() == quitarBarco){
            this.terreno.setBarco(false);
            this.AgregarBarco.setEnabled(true);
            this.quitarBarco.setEnabled(false);
        }else if(e.getSource() == volverButton){
            this.setVisible(false);
        }
        
    }

    
}
