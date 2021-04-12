package com.mycompany.frames;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


import com.mycompany.modelos.Player;



public class MercadoJFrame extends JFrame implements ActionListener{
    
    private int precioComida=25, precioBarco= 100, precioFertilizantes = 30;
    private int precioAlimento=25, preciosemillas= 20, precioMP = 30, precioMPventa = 40;
    private int precioPollo=15, precioTernero= 25 ;
    
    private Player player;
    private JLabel oroLabel;
    private JPanel base, botones1,botones2,botones3,botones4,botones5, botones6 ;
    private JButton volverButton, semilla1, semilla2, cria1, cria2, barco, alimento1, alimento2, alimento3 ;
    private JButton mejora1, mejora2, mejora3, comida1, comida2, comida3, compraMP, ventaMP,alimento4, alimento5, alimento6  ;

    public MercadoJFrame(Player player){
        this.player = player;

        setLayout(null);
        setTitle("Mercado");
        setBounds(0,0, 500, 550);
        setResizable(false);
        setLocationRelativeTo(null);

        base = new JPanel();
        base.setLayout(null);
        base.setBounds(0,0,this.getWidth(), this.getHeight());
        this.add(base);

        botones1 = new JPanel();
        botones1.setLayout(new GridLayout(1,3));
        botones1.setBounds(10, 45, 480, 30);
        this.base.add(botones1);

        botones2 = new JPanel();
        botones2.setLayout(new GridLayout(1,3));
        botones2.setBounds(10, 115, 480, 30);
        this.base.add(botones2);

        botones3 = new JPanel();
        botones3.setLayout(new GridLayout(1,3));
        botones3.setBounds(10, 185, 480, 30);
        this.base.add(botones3);

        botones4 = new JPanel();
        botones4.setLayout(new GridLayout(1,3));
        botones4.setBounds(10, 255, 480, 30);
        this.base.add(botones4);

        botones5 = new JPanel();
        botones5.setLayout(new GridLayout(2,3));
        botones5.setBounds(10, 325, 480, 50);
        this.base.add(botones5);

        botones6 = new JPanel();
        botones6.setLayout(new GridLayout(1,3));
        botones6.setBounds(10, 415, 480, 30);
        this.base.add(botones6);

        agregarLabels();     
        AgregarBotones();       
    }

    public void agregarLabels(){
        JLabel comida = new JLabel("Comida:");
        comida.setBounds(10, 10, 100, 30);
        this.base.add(comida);

        JLabel semillas = new JLabel("Semillas:");
        semillas.setBounds(10, 80, 100, 30);
        base.add(semillas);
        
        JLabel materiaPrima = new JLabel("Materia Prima:");
        materiaPrima.setBounds(10, 150, 200, 30);
        base.add(materiaPrima);

        JLabel fertilizantes = new JLabel("Fertilizantes:");
        fertilizantes.setBounds(10, 220, 200, 30);
        base.add(fertilizantes);

        JLabel alimento = new JLabel("Alimentos para animal:");
        alimento.setBounds(10, 290, 300, 30);
        base.add(alimento);

        JLabel animales = new JLabel("Animales bebes:");
        animales.setBounds(10, 380, 300, 30);
        base.add(animales);

        oroLabel = new JLabel("Oro disponible: " +this.player.getGold());
        oroLabel.setBounds(20, 460, 200, 30);
        base.add(oroLabel);
    }

    public void AgregarBotones(){
        this.volverButton = new JButton("Volver");
        this.volverButton.setBounds(380, 460, 100, 30);
        this.volverButton.addActionListener(this);
        this.base.add(this.volverButton);

        this.comida1 = new JButton("carne");
        this.comida1.addActionListener(this);
        this.botones1.add(this.comida1);

        this.comida2 = new JButton("huevos");
        this.comida2.addActionListener(this);
        this.botones1.add(this.comida2);

        this.comida3 = new JButton("leche");
        this.comida3.addActionListener(this);
        this.botones1.add(this.comida3);
        

        this.semilla1 = new JButton("Semilla de Grano");
        this.semilla1.addActionListener(this);
        this.botones2.add(this.semilla1);

        this.semilla2 = new JButton("Semilla de Fruto");
        this.semilla2.addActionListener(this);
        this.botones2.add(this.semilla2);

        this.ventaMP = new JButton("Vender");
        this.ventaMP.addActionListener(this);
        this.botones3.add(this.ventaMP);

        this.compraMP = new JButton("comprar");
        this.compraMP.addActionListener(this);
        this.botones3.add(this.compraMP);

        this.mejora1 = new JButton("Normal");
        this.mejora1.addActionListener(this);
        this.botones4.add(this.mejora1);

        this.mejora2 = new JButton("Eficaz");
        this.mejora2.addActionListener(this);
        this.botones4.add(this.mejora2);

        this.mejora3 = new JButton("Super Eficaz");
        this.mejora3.addActionListener(this);
        this.botones4.add(this.mejora3);

        this.cria1 = new JButton("Ternero");
        this.cria1.addActionListener(this);
        this.botones6.add(this.cria1);

        this.cria2 = new JButton("Pollito");
        this.cria2.addActionListener(this);
        this.botones6.add(this.cria2);

        this.barco = new JButton("Barco");
        this.barco.setBounds(250, 460, 100, 30);
        this.barco.addActionListener(this);
        this.base.add(this.barco);


        this.barco = new JButton("Barco");
        this.barco.setBounds(250, 460, 100, 30);
        this.barco.addActionListener(this);
        this.base.add(this.barco);
        //boton Barco

        this.barco = new JButton("Barco");
        this.barco.setBounds(250, 460, 100, 30);
        this.barco.addActionListener(this);
        this.base.add(this.barco);

        this.alimento1 = new JButton("herbivoro 1");
        this.alimento1.addActionListener(this);
        this.botones5.add(this.alimento1);

        this.alimento2 = new JButton("herbivoro 2");
        this.alimento2.addActionListener(this);
        this.botones5.add(this.alimento2);

        this.alimento3 = new JButton("herbivoro 3");
        this.alimento3.addActionListener(this);
        this.botones5.add(this.alimento3);

        this.alimento4 = new JButton("omnivoro 1");
        this.alimento4.addActionListener(this);
        this.botones5.add(this.alimento4);

        this.alimento5 = new JButton("omnivoro 2");
        this.alimento5.addActionListener(this);
        this.botones5.add(this.alimento5);

        this.alimento6 = new JButton("omnivoro 3");
        this.alimento6.addActionListener(this);
        this.botones5.add(this.alimento6);

    }

    @Override
    public void actionPerformed(ActionEvent e) {       

        if (e.getSource() == volverButton){
           this.setVisible(false);
        }else if(e.getSource() == this.barco){
            if (player.getGold()<precioBarco){
                JOptionPane.showMessageDialog(null, "No cuentas con dinero suficiente para realizar esta accion");
            }else{
                this.player.setGold(player.getGold()-this.precioBarco);
                this.player.getBodega().setBarcos(player.getBodega().getBarcos()+1);
                this.precioBarco=+100;
            }
        }else if(e.getSource() == this.alimento1){
            if(player.getGold()<precioAlimento){
                JOptionPane.showMessageDialog(null, "No cuentas con dinero suficiente para realizar esta accion");
            }else{
                this.player.setGold(player.getGold()-this.precioAlimento);
                this.player.getBodega().setBarcos(player.getBodega().getHerv1()+1);
            }
        }else if(e.getSource() == this.alimento2){
            if(player.getGold()<precioAlimento){
                JOptionPane.showMessageDialog(null, "No cuentas con dinero suficiente para realizar esta accion");
            }else{
                this.player.setGold(player.getGold()-this.precioAlimento);
                this.player.getBodega().setBarcos(player.getBodega().getHerv2()+1);
            }
        }else if(e.getSource() == this.alimento3){
            if(player.getGold()<precioAlimento){
                JOptionPane.showMessageDialog(null, "No cuentas con dinero suficiente para realizar esta accion");
            }else{
                this.player.setGold(player.getGold()-this.precioAlimento);
                this.player.getBodega().setBarcos(player.getBodega().getHerv3()+1);
            }
        }









        this.oroLabel.setText("Oro disponible: "+this.player.getGold());
    }

    


}
