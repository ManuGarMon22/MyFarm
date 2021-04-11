
package com.mycompany.frames;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import com.mycompany.modelos.grounds.*;
import com.mycompany.modelos.*;
import com.mycompany.frames.*;

public class SuperficieJButton extends JButton implements ActionListener{
    
    private Grounds ground;
    private JFrame ventanita;
    
    public SuperficieJButton(Player p, int tipo){
        super();
        super.addActionListener(this);
        DefinirTipo(tipo);
        //this.ventanita = new MercadoJFrame(p);
    }

    

    private void DefinirTipo(int numero) {
        switch(numero){
            case 1: super.setBackground(Color.GREEN);                
                    this.ground = new Grama();       
                    super.setText(this.ground.getNombre());             
                break;
            case 2: super.setBackground(Color.BLUE);
                    this.ground = new Water();       
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
        if (e.getSource() == this){
            ground.getFrame().setVisible(true);

        }
        
    }
    

    
    
}

