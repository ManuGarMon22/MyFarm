/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.frames;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author manu
 */
public class Table extends JFrame implements ActionListener {
    
    
    private JPanel[][] grounds; 
    private int groundXMax = 5 , groundYMax = 5;
    
    public Table(){
        this.setLayout(new GridLayout(10,10)); //metodo para iniciar la ventana
        this.setTitle("My Farm"); //titulo para la ventana
        this.setBounds(0,0,1050, 700);//establecer tamaño de la ventana
        this.setResizable(true);// Codigo para no cambiar de tamaño la ventana
        this.setLocationRelativeTo(null);// codigo para que la panatalla aparesca en el centro
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); // metodo para que el programa termine de ejecutarse con el boton x
    
        //this.setLayout(new GirdLayout(5,5));
        
   
        this.Panels();
    }
    

    @Override
    public void actionPerformed(ActionEvent arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private void Panels(){
        
        grounds = new JPanel[10][10];
        
        for (int i = 0; i < groundYMax; i++){
            for (int j = 0; j < groundXMax; j++){
                grounds[i][j] = new JPanel();
                int tempx = ((i+1)*10);
                int tempy = ((j+1)*10);
                //this.grounds[i][j].setBounds(tempx, tempy, 10, 10);
                this.grounds[i][j].setBackground(new Color(i*15,j*12,0));
                this.add(grounds[i][j]);
                
            }
        }
        
    }
}
