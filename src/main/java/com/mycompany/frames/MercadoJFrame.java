package com.mycompany.frames;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


import com.mycompany.modelos.Player;



public class MercadoJFrame extends JFrame implements ActionListener{
    
    private Player player;
    private JPanel base;
    private JButton volverButton, Semilla1, Semilla2, Cria1, Cria2, barco ;
    private JButton mejora1, mejora2, mejora3, comida1, Comida2, comida3 ;

    public MercadoJFrame(Player player){
        this.player = player;

        setLayout(null);
        setTitle("Mercado");
        setBounds(0,0, 500, 500);
        setResizable(false);
        setLocationRelativeTo(null);

        base = new JPanel();
        base.setLayout(null);
        base.setBounds(0,0,this.getWidth(), this.getHeight());
        this.add(base);


        agregarLabels();     
        AgregarBotones();       
    }

    public void agregarLabels(){
        JLabel comida = new JLabel("Comida:");
        comida.setBounds(10, 20, 100, 30);
        this.base.add(comida);

        JLabel semillas = new JLabel("Semillas:");
        semillas.setBounds(10, 90, 100, 30);
        base.add(semillas);
        
        JLabel materiaPrima = new JLabel("Materia Prima:");
        materiaPrima.setBounds(10, 160, 200, 30);
        base.add(materiaPrima);

        JLabel fertilizantes = new JLabel("Fertilizantes:");
        fertilizantes.setBounds(10, 230, 200, 30);
        base.add(fertilizantes);

        JLabel alimento = new JLabel("Alimentos para animal:");
        alimento.setBounds(10, 300, 300, 30);
        base.add(alimento);
    }

    public void AgregarBotones(){
        volverButton = new JButton("Volver");
        volverButton.setBounds(380, 420, 100, 30);
        volverButton.addActionListener(this);
        this.base.add(volverButton);

        

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == volverButton){
           this.setVisible(false);

        }
        
    }

    


}
