import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Formulario extends JFrame implements  ActionListener{
	private JTextField nombre;
	private JComboBox cb1;
	private JButton boton1;
	private JLabel label1,label2;
	
	public Formulario ()
	{
		setLayout (null);
		label1 = new JLabel ("Nombre");
		label1.setBounds(220,165,120,40);
		add(label1);
		nombre = new JTextField ();
		nombre.setBounds(220,200,120,30);
		add(nombre);
		label2 = new JLabel ("Nacionalidad");
		label2.setBounds(220,220,120,40);
		add(label2);
		cb1 = new JComboBox ();
		cb1.setBounds(220,255,120,60);
		add(cb1);
		cb1.addItem("Seleccionar");
		cb1.addItem ("Argentina");
		cb1.addItem ("Brasil");
		cb1.addItem ("Chile");
		cb1.addItem ("Estados Unidos");
		cb1.addItem ("España");
		cb1.addItem ("Honduras");
		cb1.addItem ("Italia");
		cb1.addItem ("Francia");
		cb1.addItem ("Guatemala");
		cb1.addItem ("Nueva Zelana");
		cb1.addItem ("Nigeria");
	    cb1.addActionListener(this);
	    
	    boton1 = new JButton("Aceptar");
	    boton1.setBounds(220,320,120,40);
	    add(boton1);
	    boton1.addActionListener(this);
	}
	public void actionPerformed (ActionEvent e)
	{
		if(e.getSource ()==boton1)
		{
			String cad1 = nombre.getText();
			String cad2 =(String) cb1.getSelectedItem();
			
			setTitle(cad1 + " es de: " + cad2 );
		}
	}
public static void main (String [] ar)
{
	Formulario formulario1 = new Formulario ();
	formulario1.setBounds(10,10,600,600);
	formulario1.setVisible(true);
	formulario1.setResizable(false);
}
}
