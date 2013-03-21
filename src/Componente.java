import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;


public class Componente extends Ventana{//Extiende de clase ventana

	private JButton btnPrueva;//Inicializa el boton
	
	public Componente(){
		btnPrueva=new JButton("Boton de prueva");//Se crea el boton

		//GridLayout gl=new GridLayout(3,4,30,50);
		//BorderLayout bl=new BorderLayout();
		//FlowLayout fl=new FlowLayout();//gestionador de capas//FlowLayout fl=new FlowLayout(FlowLayout.TRAILING);
		Box izq=Box.createVerticalBox();
		
		ButtonGroup grupoRadio=new ButtonGroup();
		JRadioButton rbutton;
		
		grupoRadio.add(rbutton = new JRadioButton("Rojo"));
		izq.add(rbutton);
		
		grupoRadio.add(rbutton = new JRadioButton("Azul"));
		izq.add(rbutton);
		
		grupoRadio.add(rbutton = new JRadioButton("Amarillo"));
		izq.add(rbutton);
		
		grupoRadio.add(rbutton = new JRadioButton("Verde"));
		izq.add(rbutton);
		
		Box der=Box.createVerticalBox();
		der.add(new JCheckBox("Hola"));
		der.add(new JCheckBox("Buenas tardes"));
		der.add(new JCheckBox("Buenas noches"));
		
		Box arriba=Box.createHorizontalBox();
		arriba.add(izq);
		arriba.add(der);
		
		Container content=this.getContentPane();//elemento para manipular mas facil el comtenedor de la ventana
		//content.setLayout(new BorderLayout());
		content.add(arriba);
		//content.setLayout();
		/*for(int i=0; i<=10; i++){
			content.add(new JButton("Boton "+i));
		}*/
		//content.add(new JButton("Este"), BorderLayout.EAST);
		//content.add(new JButton("Oste"), BorderLayout.WEST);
		
		/*for(int i=0; i<10; i++){
			content.add(new JButton("Boton"+i));
		}*/
		this.pack();
		//content.add(btnPrueva);
		
		
		//this.add(btnPrueva);//se añade el boton
		
	}
}
