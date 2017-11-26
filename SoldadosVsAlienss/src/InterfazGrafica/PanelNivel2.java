package InterfazGrafica;

import javax.swing.JFrame;

import Principal.Logica;
import Principal.Mapa_GUI2;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.Container;
import java.awt.Image;
import java.awt.event.ActionEvent;

public class PanelNivel2 extends JFrame{
	
	protected Container contenedor = getContentPane();
	protected PanelNivel2 panel;
	
	protected ImageIcon imagenBotonFlechaAdelante;
	protected ImageIcon imagenBotonVolverMenu;
	protected Icon iconoBotonFlechaAdelante;
	protected Icon iconoBotonVolverMenu;
	protected ImagenNivel2 panelPrincipal;
	
	protected JButton botonAdelante;
	protected JButton botonVolverMenu;
	protected Mapa_GUI2 gui;
	
	public PanelNivel2(Mapa_GUI2 g) {
		gui = g;
		panel = this;
		
		botonAdelante = new JButton("");
		botonAdelante.setBounds(724, 360, 60, 60);
		imagenBotonFlechaAdelante = new ImageIcon(Mapa_GUI2.class.getResource("/Sprites/botones/flechaAdelante.png"));
		iconoBotonFlechaAdelante = new ImageIcon(imagenBotonFlechaAdelante.getImage().getScaledInstance(botonAdelante.getWidth(), botonAdelante.getHeight(), Image.SCALE_SMOOTH));
		botonAdelante.setIcon(iconoBotonFlechaAdelante);
		
		botonVolverMenu = new JButton("");
		botonVolverMenu.setBounds(580, 360, 133, 60);
		imagenBotonVolverMenu= new ImageIcon(Mapa_GUI2.class.getResource("/Sprites/botones/botonVolverAmenu.png"));
		iconoBotonVolverMenu = new ImageIcon(imagenBotonVolverMenu.getImage().getScaledInstance(botonVolverMenu.getWidth(), botonVolverMenu.getHeight(), Image.SCALE_SMOOTH));
		botonVolverMenu.setIcon(iconoBotonVolverMenu);
		
		iniciar();
		
	}
	
	public void iniciar() {
		this.setIconImage(new ImageIcon(getClass().getResource("/Sprites/fondo/IconoMenu.jpg")).getImage());
		this.setResizable(false);
		
		panelPrincipal = new ImagenNivel2();
		panelPrincipal.setLayout(null);
		setBounds(100,30,800,500);
		setLocationRelativeTo(null);
		setVisible(true);
		
		contenedor.add(panelPrincipal);
		
		botonAdelante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				gui.modificarPaneles();
				gui.getLogica().setJuegoActivo(true);
				gui.getLogica().ejecutarHilos(true);
				gui.setVisible(true);
				setVisible(false);
			}
		});
		panelPrincipal.add(botonAdelante);
		
		botonVolverMenu.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					MenuInicio menu = new MenuInicio();
					menu.setLocationRelativeTo(null);
					menu.setVisible(true);
					setVisible(false);
				}
		});
		panelPrincipal.add(botonVolverMenu);
	}
}
