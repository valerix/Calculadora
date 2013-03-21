import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import org.omg.PortableInterceptor.ACTIVE;


public class componentePosicion extends Ventana implements MouseListener{
	
	/*private JButton btn;
	private JTextField txt;
	private JLabel lbl;*/
	private JButton uno;
	private JButton dos;
	private JButton tres;
	private JButton cuatro;
	private JButton cinco;
	private JButton seis;
	private JButton siete;
	private JButton ocho;
	private JButton nueve;
	private JButton cero;
	private JButton suma;
	private JButton resta;
	private JButton multiplicacion;
	private JButton divicion;
	private JButton igual;
	private JButton borrar;
	
	private double operando=0;
	private char operador;
	
	private JTextField pantalla;
	
	
	public componentePosicion(){
		this.setLayout(null);
		
		igual=new JButton("=");  
		Font fuenteIgual=new Font("Arial",Font.BOLD,30);
		igual.setFont(fuenteIgual);
		igual.addMouseListener(this);
		igual.setBounds(305, 229, 65, 105);
		igual.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(pantalla.getText()!=""){
				switch(operador){
				case '+':
					operando=operando+Double.parseDouble(pantalla.getText());
					break;
				case '-':
					operando=operando-Double.parseDouble(pantalla.getText());
					break;
				case '*':
					operando=operando*Double.parseDouble(pantalla.getText());
					break;
				case '/':
					operando=operando/Double.parseDouble(pantalla.getText());
					break;
				}
				}
				pantalla.setText(Double.toString(operando));
			}
		});
		this.add(igual); 
		
		
		pantalla=new JTextField();
		Font fp=new Font("Arial",Font.BOLD,30);
		pantalla.setFont(fp);
		pantalla.setBounds(10, 10, 368, 60);
		this.add(pantalla);
		pantalla.setEditable(false);
	
		
		uno=new JButton("1"); 
		Font fuenteUno =new Font("Arial",Font.BOLD,30);
		uno.setFont(fuenteUno);
		uno.addMouseListener(this);
		uno.setBounds(10, 230, 65, 55);
		uno.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				pantalla.setText(pantalla.getText()+uno.getText());
			}
		});
		this.add(uno);
		
		dos=new JButton("2");
		Font fuenteDos=new Font("Arial",Font.BOLD,30);
		dos.setFont(fuenteDos);
		dos.addMouseListener(this);
		dos.setBounds(85, 230, 65, 55);
		dos.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				pantalla.setText(pantalla.getText()+dos.getText());
			}
		});
		this.add(dos);
		
		tres=new JButton("3");
		Font fuenteTres=new Font("Arial",Font.BOLD,30);
		tres.setFont(fuenteTres);
		tres.addMouseListener(this);
		tres.setBounds(160,228,65, 55);
		tres.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				pantalla.setText(pantalla.getText()+tres.getText());
			}
		});
		this.add(tres);
		
		
		cuatro=new JButton("4");
		Font fuenteCuatro =new Font("Arial",Font.BOLD,30);
		cuatro.setFont(fuenteCuatro);
		cuatro.addMouseListener(this);
		cuatro.setBounds(10, 165, 65, 55);
		cuatro.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				pantalla.setText(pantalla.getText()+cuatro.getText());
			}
		});
		this.add(cuatro);
		
		cinco=new JButton("5");
		Font fuenteCinco=new Font("Arial",Font.BOLD,30);
		cinco.setFont(fuenteCinco);
		cinco.addMouseListener(this);
		cinco.setBounds(85, 165, 65, 55);
		cinco.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				pantalla.setText(pantalla.getText()+cinco.getText());
			}
		});
		this.add(cinco);
		
		seis=new JButton("6");
		Font fuenteSeis=new Font("Arial",Font.BOLD,30);
		seis.setFont(fuenteSeis);
		seis.addMouseListener(this);
		seis.setBounds(158, 165, 65, 55);
		seis.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				pantalla.setText(pantalla.getText()+seis.getText());
			}
		});
		this.add(seis);
		
		siete=new JButton("7");
		Font fuenteSiete=new Font("Arial",Font.BOLD,30);
		siete.setFont(fuenteSiete);
		siete.addMouseListener(this);
		siete.setBounds(10, 100, 65, 55);
		siete.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				pantalla.setText(pantalla.getText()+siete.getText());
			}
		});
		this.add(siete);
		
		ocho=new JButton("8");
		Font fuenteOcho=new Font("Arial",Font.BOLD,30);
		ocho.setFont(fuenteOcho);
		ocho.addMouseListener(this);
		ocho.setBounds(85, 100, 65, 55);
		ocho.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				pantalla.setText(pantalla.getText()+ocho.getText());
			}
		});
		this.add(ocho);
		
		nueve=new JButton("9");
		Font fuenteNueve=new Font("Arial",Font.BOLD,30);
		nueve.setFont(fuenteNueve);
		nueve.addMouseListener(this);
		nueve.setBounds(158, 100, 65, 55);
		nueve.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				pantalla.setText(pantalla.getText()+nueve.getText());
			}
		});
		this.add(nueve);
		
		cero=new JButton("0");
		Font fuenteCero=new Font("Arial",Font.BOLD,30);
		cero.setFont(fuenteCero);
		cero.addMouseListener(this);
		cero.setBounds(10, 290, 142, 45);
		cero.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				pantalla.setText(pantalla.getText()+cero.getText());
			}
		});
		this.add(cero);

		borrar=new JButton("BORRAR");
		Font fuenteBorrar=new Font("Arial",Font.ITALIC,20);//tipo de letra y tamaño de letra del boton
		borrar.setFont(fuenteBorrar);
		borrar.addMouseListener(this);
		borrar.setBounds(160, 290, 140, 45);
		borrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				pantalla.setText("");
			}
		});
		this.add(borrar);
		
		suma=new JButton("+");
		Font fuenteSuma=new Font("Arial",Font.BOLD,30);
		suma.setFont(fuenteSuma);
		suma.addMouseListener(this);
		suma.setBounds(305, 100, 65, 121);
		suma.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				operador='+';
				operando=Double.parseDouble(pantalla.getText());
				pantalla.setText("");
			}
		});
		this.add(suma);
		
		resta=new JButton("-");
		Font fuenteResta=new Font("Arial",Font.BOLD,30);
		resta.setFont(fuenteResta);
		resta.addMouseListener(this);
		resta.setBounds(233, 228, 65, 55);
		resta.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				operador='-';
				operando=Double.parseDouble(pantalla.getText());
				pantalla.setText("");
			}
		});
		this.add(resta);
		
		multiplicacion=new JButton("*");
		Font fuenteMultiplicacion=new Font("Arial",Font.BOLD,30);
		multiplicacion.setFont(fuenteMultiplicacion);
		multiplicacion.addMouseListener(this);
		multiplicacion.setBounds(233, 165, 65, 55);
		multiplicacion.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				operador='*';
				operando=Double.parseDouble(pantalla.getText());
				pantalla.setText("");
			}
		});
		this.add(multiplicacion);
		
		divicion=new JButton("/");
		Font fuenteDivicion=new Font("Arial",Font.BOLD,30);
		divicion.setFont(fuenteDivicion);
		divicion.addMouseListener(this);
		divicion.setBounds(233, 100, 65, 55);
		divicion.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				operador='/';
				operando=Double.parseDouble(pantalla.getText());
				pantalla.setText("");
			}
		});
		this.add(divicion);
		
		
		/*btn=new JButton("click");
		btn.setBounds(50, 50, 150, 30);
		btn.addMouseListener(this);
		this.add(btn);
		
		txt=new JTextField();
		txt.setBounds(10, 10, 300, 30);
		this.add(txt);
		
		lbl=new JLabel("Esta es mi etiqueta");
		lbl.setBounds(400, 10, 300, 100);
		this.add(lbl);*/
		
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("Clicked: "+e.getX()+"y: "+e.getY());
		//lbl.setText(txt.getText());//lo que tiene la caja de texto  se lo asigna al label
		//pantalla.setText(uno.getText());
		//pantalla.setText(dos.getText());
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("Pressed: "+e.getX()+"y: "+e.getY());
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
