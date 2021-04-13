package com.mycompany.frames;

import javax.swing.*;

import com.mycompany.myfarm.Game;

import java.awt.event.*;


public class VentanaReportes extends JFrame implements ActionListener{

    private JPanel base, base_reportes;
    private JButton cerrar;
    private Game[] juegos;
    private int juegosHechos;


    public VentanaReportes(Game[] juegos, int i){
        this.juegos = juegos;
        this.juegosHechos = i;

        setBounds(0,0, 600,600);
        setResizable(false);
        setLocationRelativeTo(null);

        base = new JPanel();
        base.setLayout(null);
        this.add(base);

        base_reportes = new JPanel();
        base_reportes.setLayout(null);
        base_reportes.setBounds(20,20,560, 480);
        this.base.add(base_reportes);

        cerrar = new JButton("Cerrar");
        cerrar.setBounds(250, 520, 100, 30);
        cerrar.addActionListener(this);
        base.add(cerrar);

        GenerarReporte();

    }


    private void GenerarReporte(){
        JTextArea reportes = new JTextArea();
        reportes.setBounds(0,0,560, 480);
        reportes.setText("-------REPORTES DE PARTIDAS JUGADAS-------");
        //reportes.setBounds();
        

        JScrollPane desplazar = new JScrollPane(reportes,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        desplazar.setBounds(0,0,560, 480);
        this.base_reportes.add(desplazar);

        for(int i = 0; i <juegosHechos; i++){
            reportes.append("\n\nPartida No." +(i+1));
            reportes.append("\nNombre del Jugador: " +this.juegos[i].getPlayer().getName());
            reportes.append("\nNombre de Granjero: " +this.juegos[i].getPlayer().getNickname());
            reportes.append("\nDuracion de Partida: "+this.juegos[i].getDuracion()+" segundos");
            reportes.append("\nOro gastado durante la partida: "+this.juegos[i].getOroGastado());
            reportes.append("\nOro generado durante la partida: "+this.juegos[i].getOroGenerado());


        }


    }




    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==cerrar){
            this.setVisible(false);
        }
        
    }

    
}
