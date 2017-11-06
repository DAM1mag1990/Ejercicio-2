import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class VentanaPrincipal {

	//La ventana principal, en este caso, guarda todos los componentes:
	JFrame ventana;
	BufferedImage imagenBuffer = null;
	ImageIcon imagenIcono;
	JLabel imagenLabel;
	
	//Constructor, marca el tamaño y el cierre del frame
	public VentanaPrincipal() {
		ventana = new JFrame();
		ventana.setBounds(100, 50, 900, 700);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	//Inicializa todos los componentes del frame
	public void inicializarComponentes(){
		
		//Definimos el layout:
		ventana.setLayout(null);
		
		//Cargamos la imagen:
		try {
			imagenBuffer = ImageIO.read(new File("Imagenes/bb.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		imagenIcono = new ImageIcon(imagenBuffer.getScaledInstance(200, 200, Image.SCALE_SMOOTH));
		imagenLabel = new JLabel(imagenIcono);
		imagenLabel.setBounds(0,0,imagenIcono.getIconWidth(),imagenIcono.getIconHeight());
		ventana.add(imagenLabel);
		
		
	}
	
	public void inicializarListeners(){

	}
	
	public void inicializar(){
		//IMPORTANTE, PRIMERO HACEMOS LA VENTANA VISIBLE Y LUEGO INICIALIZAMOS LOS COMPONENTES.
		ventana.setVisible(true);
		inicializarComponentes();	
		inicializarListeners();		
	}
}
