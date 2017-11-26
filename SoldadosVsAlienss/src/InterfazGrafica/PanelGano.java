
package InterfazGrafica;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Principal.Mapa_GUI2;

import java.awt.Container;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class PanelGano extends JFrame{
	protected Container contenedor = getContentPane();
	protected PanelGano panel;
	
	protected ImageIcon imagenBotonFlechaAdelante;
	protected ImageIcon imagenBotonFlechaAtras;
	protected Icon iconoBotonFlechaAdelante;
	protected Icon iconoBotonFlechaAtras;
	protected ImagenPanelGano panelPrincipal;
	
	protected JButton botonVolverMenu;
	protected JButton botonSalir;
	
	public PanelGano() {
		panel = this;
		
		botonVolverMenu = new JButton("");
		botonVolverMenu.setBounds(631, 329, 153, 60);
		imagenBotonFlechaAdelante = new ImageIcon(Mapa_GUI2.class.getResource("/Sprites/botones/botonVolverAmenu.png"));
		iconoBotonFlechaAdelante = new ImageIcon(imagenBotonFlechaAdelante.getImage().getScaledInstance(botonVolverMenu.getWidth(), botonVolverMenu.getHeight(), Image.SCALE_SMOOTH));
		botonVolverMenu.setIcon(iconoBotonFlechaAdelante);
		
		botonSalir = new JButton("");
		botonSalir.setBounds(631, 400, 153, 60);
		imagenBotonFlechaAtras = new ImageIcon(Mapa_GUI2.class.getResource("/Sprites/botones/botonSalir.png"));
		iconoBotonFlechaAtras = new ImageIcon(imagenBotonFlechaAtras.getImage().getScaledInstance(botonSalir.getWidth(), botonSalir.getHeight(), Image.SCALE_SMOOTH));
		botonSalir.setIcon(iconoBotonFlechaAtras);
		
		iniciar();
		
	}
	
	public void iniciar() {
		this.setIconImage(new ImageIcon(getClass().getResource("/Sprites/fondo/IconoMenu.jpg")).getImage());
		this.setResizable(false);
		
		panelPrincipal = new ImagenPanelGano();
		panelPrincipal.setLayout(null);
		setBounds(100,30,798,500);
		setLocationRelativeTo(null);
		setVisible(true);
		
		contenedor.add(panelPrincipal);
		
		botonVolverMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MenuInicio menu = new MenuInicio();
				menu.setLocationRelativeTo(null);
				menu.setVisible(true);
				setVisible(false);
			}
		});
		panelPrincipal.add(botonVolverMenu);
		
		botonSalir.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
				}
		});
		panelPrincipal.add(botonSalir);
	}
	
}