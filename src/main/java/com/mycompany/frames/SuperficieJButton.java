
package com.mycompany.frames;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import com.mycompany.modelos.grounds.*;
import com.mycompany.modelos.plants.Plant;
import com.mycompany.modelos.*;
import com.mycompany.enums.SGround;
import com.mycompany.frames.*;

public class SuperficieJButton extends JButton implements ActionListener{
    
    private Player j;
    private Grounds ground;
    private JFrame ventanita;
    
    public SuperficieJButton(Player p, int tipo){
        super();
        super.addActionListener(this);
        DefinirTipo(tipo);
        this.j = p;
    }

    

    private void DefinirTipo(int numero) {
        switch(numero){
            case 1: super.setBackground(Color.GREEN);                
                    this.ground = new Grama(this.j);       
                    super.setText(this.ground.getNombre());             
                break;
            case 2: super.setBackground(Color.BLUE);
                    this.ground = new Water(this.j);       
                    super.setText(this.ground.getNombre()); 
                break;
            case 3: super.setBackground(Color.YELLOW);
                    this.ground = new Desert();       
                    super.setText(this.ground.getNombre()); 

                break;
            default:
                break;
        }
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this ){
            if(this.ground.isProcesando() == false){
                if(this.ground instanceof Desert){
                    JOptionPane.showMessageDialog(null, "los terrenos de tipo Desierto no puede realizar ninguna accion");
                }else{
                    this.ground.getVentana().setVisible(true);
                }
            }else if(this.ground.isProcesando()){
                if(this.ground instanceof Grama){
                    JOptionPane.showMessageDialog(null, "insertar aqui hilo de creciento de plantas");
                }else if(this.ground instanceof Water){
                    JOptionPane.showMessageDialog(null, "insertar aqui el proceso de hilos de pescados y barcos");

                }


            }
        }
        
    }
    

    
    
}

