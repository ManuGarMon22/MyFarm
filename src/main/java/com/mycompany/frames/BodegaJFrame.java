package com.mycompany.frames;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import com.mycompany.modelos.*;
import com.mycompany.myfarm.Game;
//clase para mostrar el meni de bodega 
public class BodegaJFrame extends JFrame implements ActionListener {

    //atributos de la clase para formatar e interuactuar en la ventanta
    private Player player;
    private Game game;
    private JLabel oroLabel;
    private JPanel base, botones1,botones2,botones3,botones4,botones5, botones6 ;
    private JButton volverButton, semilla1, semilla2, cria1, cria2, alimento1, alimento2, alimento3 ;
    private JButton mejora1, mejora2, mejora3, comida1, comida2, comida3, compraMP, ventaMP,alimento4, alimento5, alimento6  ;
    //costructor 
    public BodegaJFrame(Game j){
        this.game = j;
        this.player = j.getPlayer();
        //porpiedades de la ventana
        setLayout(null);
        setTitle("Bodega");
        setBounds(0,0, 500, 550);
        setResizable(false);
        setLocationRelativeTo(null);
        //panel base
        base = new JPanel();
        base.setLayout(null);
        base.setBounds(0,0,this.getWidth(), this.getHeight());
        this.add(base);
        //base para los primeros botones 
        botones1 = new JPanel();
        botones1.setLayout(new GridLayout(1,3));
        botones1.setBounds(10, 45, 480, 30);
        this.base.add(botones1);
        //base para los botones de segunda fila
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
        JLabel comida = new JLabel("Comida que desea comer:");
        comida.setBounds(10, 10, 100, 30);
        this.base.add(comida);

        JLabel semillas = new JLabel("Semillas que posee:");
        semillas.setBounds(10, 80, 100, 30);
        base.add(semillas);
        
        JLabel materiaPrima = new JLabel("Materia Prima: (puede vender unicamente el cuero)");
        materiaPrima.setBounds(10, 150, 400, 30);
        base.add(materiaPrima);

        JLabel fertilizantes = new JLabel("Fertilizantes que posee:");
        fertilizantes.setBounds(10, 220, 200, 30);
        base.add(fertilizantes);

        JLabel alimento = new JLabel("Alimentos para animal que posee:");
        alimento.setBounds(10, 290, 300, 30);
        base.add(alimento);

        JLabel animales = new JLabel("Animales bebes que posee:");
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

        this.comida1 = new JButton("Carne  = " +this.player.getBodega().getCarne());
        this.comida1.addActionListener(this);
        this.botones1.add(this.comida1);

        this.comida2 = new JButton("Huevos = " +this.player.getBodega().getHuevos());
        this.comida2.addActionListener(this);
        this.botones1.add(this.comida2);

        this.comida3 = new JButton("Leche = " +this.player.getBodega().getLeche());
        this.comida3.addActionListener(this);
        this.botones1.add(this.comida3);
        

        this.semilla1 = new JButton("Semilla de Grano = " +this.player.getBodega().getGranos());
        this.botones2.add(this.semilla1);

        this.semilla2 = new JButton("Semilla de Fruto = " +this.player.getBodega().getFruta());
        this.botones2.add(this.semilla2);

        this.ventaMP = new JButton("Cuero = " +this.player.getBodega().getCuero());
        this.ventaMP.addActionListener(this);
        this.botones3.add(this.ventaMP);

        this.compraMP = new JButton("Barcos = " +this.player.getBodega().getBarcos());
        this.botones3.add(this.compraMP);

        this.mejora1 = new JButton("Normal = " +this.player.getBodega().getMejoraTierra1());
        this.botones4.add(this.mejora1);

        this.mejora2 = new JButton("Eficaz = " +this.player.getBodega().getMejoraTierra2());
        this.botones4.add(this.mejora2);

        this.mejora3 = new JButton("Super Eficaz = " +this.player.getBodega().getMejoraTierra3());
        this.botones4.add(this.mejora3);

        this.cria1 = new JButton("Ternero = " +this.player.getBodega().getTerneros());
        this.botones6.add(this.cria1);

        this.cria2 = new JButton("Pollito = " +this.player.getBodega().getPollo());
        this.botones6.add(this.cria2);


        this.alimento1 = new JButton("herbivoro 1 = " +this.player.getBodega().getHerv1());
        this.botones5.add(this.alimento1);

        this.alimento2 = new JButton("herbivoro 2 = " +this.player.getBodega().getHerv2());
        this.botones5.add(this.alimento2);

        this.alimento3 = new JButton("herbivoro 3 = " +this.player.getBodega().getHerv3());
        this.botones5.add(this.alimento3);

        this.alimento4 = new JButton("omnivoro 1 = " +this.player.getBodega().getOmni1());
        this.botones5.add(this.alimento4);

        this.alimento5 = new JButton("omnivoro 2 = " +this.player.getBodega().getOmni2());
        this.botones5.add(this.alimento5);

        this.alimento6 = new JButton("omnivoro 3 =" +this.player.getBodega().getOmni3());
        this.botones5.add(this.alimento6);

    }

    @Override
    public void actionPerformed(ActionEvent e) {       

        if (e.getSource() == volverButton){
           this.setVisible(false);
        }else if(e.getSource() == this.comida1){
            if(player.getBodega().getCarne()<= 0){
                JOptionPane.showMessageDialog(null, "No cuentas con Carne suficiente para realizar esta accion");
            }else{
                this.player.setVida(player.getVida()+15);
                this.player.getBodega().setCarne(player.getBodega().getCarne()-1);
                this.comida1.setText("Carne  = " +this.player.getBodega().getCarne());
            }
        }else if(e.getSource() == this.comida2){
            if(player.getBodega().getHuevos()<=0){
                JOptionPane.showMessageDialog(null, "No cuentas con huevos suficiente para realizar esta accion");
            }else{
                this.player.setVida(player.getVida()+10);
                this.player.getBodega().setHuevos(player.getBodega().getHuevos()-1);
                this.comida2.setText("Huevos  = " +this.player.getBodega().getHuevos());
            }
        }else if(e.getSource() == this.comida3){
            if(player.getBodega().getLeche()<=0){
                JOptionPane.showMessageDialog(null, "No cuentas con leche suficiente para realizar esta accion");
            }else{
                this.player.setVida(player.getVida()+10);
                this.player.getBodega().setLeche(player.getBodega().getLeche()-1);
                this.comida3.setText("Leche  = " +this.player.getBodega().getLeche());
            }
        }else if(e.getSource() == this.ventaMP){
            if(player.getBodega().getCuero()<=0){
                JOptionPane.showMessageDialog(null, "No cuentas con cuero para realizar vender");
            }else{
                this.player.setGold(player.getGold()+40);
                this.player.getBodega().setCuero(player.getBodega().getCuero()-1);
                this.comida3.setText("Cuero  = " +this.player.getBodega().getCuero());
                this.game.setOroGenerado(this.game.getOroGenerado()+40);
            }
        }
        this.oroLabel.setText("Oro disponible: "+this.player.getGold());

    }




    



}
