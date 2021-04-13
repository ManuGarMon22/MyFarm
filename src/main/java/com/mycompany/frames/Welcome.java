
package com.mycompany.frames;

import com.mycompany.manejadores.ManejadorGame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import com.mycompany.myfarm.*;

public class Welcome extends JFrame implements ActionListener {
    
    private JPanel b;
    private JLabel logo, textI, textName, textNick;
    private JButton acepted, created, close;
    private JTextField fieldName, fieldNick;
    private String name = "", nick = "";
    private Game[] game = new Game[10];
    private ManejadorGame[] manejadorJuegos = new ManejadorGame[10];
    private int i = 0;
    
    public Welcome(){
       
        this.setTitle("Bienvenido a My Farm"); //titulo para la ventana
        this.setBounds(0,0,500, 500);//establecer tamaño de la ventana
        this.setResizable(false);// Codigo para no cambiar de tamaño la ventana
        this.setLocationRelativeTo(null);// codigo para que la panatalla aparesca en el centro
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); // metodo para que el programa termine de ejecutarse con el boton x
        
        this.componentes();
    }
    
    private void componentes(){
        //panel base
        b = new JPanel(); //creamos el panel para modificar la ventana
        b.setLayout(null);//anulamos el diseño por defecto del panel
        b.setBackground(new Color(255,51,0));//definimos el colos de panel con codigo RGB
        this.getContentPane().add(b); //agregar el panel a la ventana
        //metodos para implementar los demas objetos 
        this.Etiquetas();
        this.CuadrosDeTexto();
        this.Botones();
        
        
    }
    private void CuadrosDeTexto(){
        //cuadro para ingresar texto nombre
        fieldName = new JTextField(); //creacion de cuadro de texto donde ingresamos nombre de jugador
        fieldName.setBounds(275, 225, 150, 30);//establecemos las dimensiones
        fieldName.setBackground(new Color(255, 255, 255));
        b.add(fieldName); // agramos a ventana
        
        //cuadro de texto para ingresar el nickname
        fieldNick = new JTextField(); //creacion de cuadro de texto donde ingresamos nickname de jugador
        fieldNick.setBounds(275, 275, 150, 30);//establecemos las dimensiones
        fieldNick.setBackground(new Color(255, 255, 255));
        b.add(fieldNick); // agramos a ventana
    }
    
    private void Etiquetas(){
        //etiqueta instrucciones
        textI = new JLabel("Llena los siguientes campos para continuar: "); //creacion de la etiqueta e introduciones texto
        textI.setBounds(100, 175, 400, 30); //establecer las dimenciones de etiqueta
        textI.setForeground(Color.BLACK);//Color de letra
        b.add(textI); // agregamos la etiqueta en la ventana
        
        //etiqueta de nombre
        textName = new JLabel("Nombre: "); //creacion de la etiqueta con texto nombre
        textName.setBounds(150, 225, 100, 30); // definicion de dimensiones
        textName.setForeground(Color.BLACK);//Color de letra
        b.add(textName); // agregamos la etiqueta a la ventana
    
        //etiqueta de nickname
        textNick = new JLabel("Nickname: "); // Creacion de etiqueta nickname
        textNick.setBounds(150, 275, 100, 30); // establecemos dimensiones
        textNick.setForeground(Color.BLACK);//Color de letra
        b.add(textNick);// agregamos a ventana
        
        //etiqueta donde esta el logo
        final ImageIcon imagelogo = new ImageIcon(getClass().getResource("Imagen/logo.png"));//definimos el icon para obtener el logo
        logo = new JLabel(imagelogo);//creamos la etiqueta con la imagen dentor de esta
        logo.setBounds(143, 25, 232, 150);//definimos lugar donde aparece y dimensiones dentro de panel base 
        logo.setIcon(new ImageIcon(imagelogo.getImage().getScaledInstance(logo.getWidth(),logo.getHeight(), Image.SCALE_SMOOTH)));//redimensionamos la imagen al tamaño de la etiqueta
        b.add(logo);//agregamos la etiqueta con el logo dentro del panel base
    }

    private void Botones(){
        //boton aceptar
        acepted = new JButton("aceptar");//creamos el boton con el texto que llevara dentro
        acepted.setBounds(200, 325, 100, 30);//dimensionamos el boton
        acepted.addActionListener(this);//agrgamos la accion al boton
        b.add(acepted);//agregamos el boton al panel
        
        //Boton crear
        created = new JButton("Reportes");//creamos el boton con el texto que llevara dentro
        created.setBounds(50, 400, 100, 30);//dimensionamos el boton
        created.addActionListener(this);//amplementamos accion al boton
        b.add(created);//agregamos el boton al panel
        
        //Boton crear
        close = new JButton("cerrar");//creamos el boton con el texto que llevara dentro
        close.setBounds(375, 400, 85, 30);//dimensionamos el boton
        close.addActionListener(this);//amplementamos accion al boton
        b.add(close);//agregamos el boton al panel
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== acepted){
            this.name = fieldName.getText().trim();
            this.nick = fieldNick.getText().trim();

            this.fieldName.setText("");
            this.fieldNick.setText("");

            if(this.name.equals("") || this.nick.equals("")){
                JOptionPane.showMessageDialog(null, "Debes llenar ambos campos para continuar");
            }else{
                this.setVisible(false);
                game[i] = new Game(this.name, this.nick);
                manejadorJuegos[i]= new ManejadorGame(game[i], this);
                manejadorJuegos[i].starGame();
                i++;
            }


        }else if( e.getSource() == this.close){
            System.exit(0);
        }else if (e.getSource() == created){
            JFrame reportes = new VentanaReportes(this.game,this.i);
            reportes.setVisible(true);
        }
    }
}
