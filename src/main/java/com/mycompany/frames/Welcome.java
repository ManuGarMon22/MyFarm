
package com.mycompany.frames;

import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;
import com.mycompany.myfarm.*;

public class Welcome extends JFrame implements ActionListener {
    
    private JPanel b;
    private JLabel logo, textI, textName, textNick;
    private JButton acepted, created;
    private JTextField fieldName, fieldNick;
    private String name = "", nick = "";
    
    public Welcome(){
        this.setLayout(null); //metodo para iniciar la ventana
        this.setTitle("Bienvenido a My Farm"); //titulo para la ventana
        this.setBounds(0,0,500, 500);//establecer tamaño de la ventana
        this.setResizable(false);// Codigo para no cambiar de tamaño la ventana
        this.setLocationRelativeTo(null);// codigo para que la panatalla aparesca en el centro
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); // metodo para que el programa termine de ejecutarse con el boton x
        
        
        
        textI = new JLabel("Llena los siguientes campos para continuar: "); //creacion de la etiqueta e introduciones texto
        textI.setBounds(100, 175, 400, 30); //establecer las dimenciones de etiqueta
        add(textI); // agregamos la etiqueta en la ventana
        
        
        textName = new JLabel("Nombre: "); //creacion de la etiqueta con texto nombre
        textName.setBounds(150, 225, 100, 30); // definicion de dimensiones
        add(textName); // agregamos la etiqueta a la ventana
        
        
        fieldName = new JTextField(); //creacion de cuadro de texto donde ingresamos nombre de jugador
        fieldName.setBounds(275, 225, 150, 30);//establecemos las dimensiones
        fieldName.setBackground(new Color(255, 255, 255));
        add(fieldName); // agramos a ventana

        textNick = new JLabel("Nickname: "); // Creacion de etiqueta nickname
        textNick.setBounds(150, 275, 100, 30); // establecemos dimensiones
        add(textNick);// agregamos a ventana
        
        fieldNick = new JTextField(); //creacion de cuadro de texto donde ingresamos nickname de jugador
        fieldNick.setBounds(275, 275, 150, 30);//establecemos las dimensiones
        fieldNick.setBackground(new Color(255, 255, 255));
        add(fieldNick); // agramos a ventana
        
        acepted = new JButton("aceptar");
        acepted.setBounds(200, 325, 100, 30);
        acepted.addActionListener(this);
        add(acepted);
        
        created = new JButton("crear");
        created.setBounds(50, 400, 75, 30);
        created.addActionListener(this);
        add(created);
        
        b = new JPanel();
        b.setBounds(0, 0, 500, 500);
        b.setBackground(new Color(139,69,19));
        this.getContentPane().add(b); //agregar el panel
        
        /*ImageIcon l = new ImageIcon("logo.png");
        logo = new JLabel (l);
        logo.setBounds(100, 25, 323, 180);
        add(com/mycompany/images/logo.png);*/
        
      
        
    
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== acepted){
            this.name = fieldName.getText().trim();
            this.nick = fieldNick.getText().trim();
            
            if(this.name.equals("") || this.nick.equals("")){
                JOptionPane.showMessageDialog(null, "Debes llenar ambos campos para continuar");
            }else{
                Game game = new Game(this.name, this.nick);
                game.starGame();
                this.setVisible(false);
            }
        } else if( e.getSource() == created){
            
        } 
    }
    
}
