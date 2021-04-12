package com.mycompany.frames;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import com.mycompany.modelos.*;

public class OpcionesGrama extends JFrame implements ActionListener{
    /*
    private Player jPlayer;
    private JPanel panelSiembra, panelAnimal;
    private JButton eleccionButton;*/

    private Player player;
    private JLabel oroLabel;
    private JPanel base, baseTerrenos, baseFrutos;
    private JButton volverButton, semilla1, semilla2, cria1, cria2, barco, alimento1, alimento2, alimento3 ;
    private JButton mejora1, mejora2, mejora3, terreno, parcela, comida3, compraMP, ventaMP,alimento4, alimento5, alimento6  ;

    public OpcionesGrama(Player jugador){
        
        this.player = player;
    
        setLayout(null);
        setTitle("Menu de Terreno");
        setBounds(0,0, 500, 550);
        setResizable(false);
        setLocationRelativeTo(null);

        base = new JPanel();
        base.setLayout(null);
        base.setBounds(0,0,this.getWidth(), this.getHeight());
        this.add(base);

        JLabel comida = new JLabel("Seleccione el modo de terreno que quiere para esta ");
        comida.setBounds(10, 10, 400, 30);
        this.base.add(comida);
        
        this.volverButton = new JButton("Volver");
        this.volverButton.setBounds(380, 460, 100, 30);
        this.volverButton.addActionListener(this);
        this.base.add(this.volverButton);

        this.terreno = new JButton("Terreno Siembra");
        this.terreno.setBounds(10, 40, 200, 35);
        this.terreno.addActionListener(this);
        this.base.add(this.terreno);

        this.parcela = new JButton("Parcela");
        this.parcela.setBounds(250, 40, 200, 35);
        this.parcela.addActionListener(this);
        this.base.add(this.parcela);
        

    }


    public void AgregarTerreno(){

        this.baseTerrenos = new JPanel();
        this.baseTerrenos.setLayout(null);
        this.baseTerrenos.setBounds(10, 80, 480, 300);
        this.base.add(this.baseTerrenos)
        
        JLabel semillas = new JLabel("Haga click en la opcion que desea:");
        semillas.setBounds(10, 80, 300, 30);
        base.add(semillas);

        

        this.mejora1 = new JButton("Agregar fertilizante 1");
        this.mejora1.addActionListener(this);
        this.baseTerrenos.add(this.mejora1);

        this.mejora2 = new JButton("Agregar fertilizante 2");
        this.mejora2.addActionListener(this);
        this.baseTerrenos.add(this.mejora2);

        this.mejora3 = new JButton("comprar");
        this.mejora3.addActionListener(this);
        this.baseTerrenos.add(this.mejora3);



    }

    

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == volverButton){
           this.setVisible(false);

        }else if(e.getSource() == this.terreno){    
            this.AgregarTerreno();
            this.terreno.setEnabled(false);
            this.parcela.setEnabled(false);
        }else if(e.getSource() == this.parcela){
            this.terreno.setEnabled(false);
            this.parcela.setEnabled(false);
        }


        
    }


}
