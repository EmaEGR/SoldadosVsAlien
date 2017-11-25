package InterfazGrafica;

import javax.swing.JFrame;

import Principal.Mapa_GUI2;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.Container;
import java.awt.Image;
import java.awt.event.ActionEvent;

public class PanelNivel1 extends JFrame{
	
	protected Container contenedor = getContentPane();
	protected PanelNivel1 panel;
	
	protected ImageIcon imagenBotonFlechaAdelante;
	protected ImageIcon imagenBotonFlechaAtras;
	protected Icon iconoBotonFlechaAdelante;
	protected Icon iconoBotonFlechaAtras;
	protected ImagenNivel1 panelPrincipal;
	
	protected JButton botonAdelante;
	protected JButton botonAtras;
	
	public PanelNivel1() {
		panel = this;
		
		botonAdelante = new JButton("");
		botonAdelante.setBounds(724, 372, 60, 60);
		imagenBotonFlechaAdelante = new ImageIcon(Mapa_GUI2.class.getResource("/Sprites/botones/flechaAdelante.png"));
		iconoBotonFlechaAdelante = new ImageIcon(imagenBotonFlechaAdelante.getImage().getScaledInstance(botonAdelante.getWidth(), botonAdelante.getHeight(), Image.SCALE_SMOOTH));
		botonAdelante.setIcon(iconoBotonFlechaAdelante);
		
		botonAtras = new JButton("");
		botonAtras.setBounds(654, 372, 60, 60);
		imagenBotonFlechaAtras = new ImageIcon(Mapa_GUI2.class.getResource("/Sprites/botones/flechaAtras.png"));
		iconoBotonFlechaAtras = new ImageIcon(imagenBotonFlechaAtras.getImage().getScaledInstance(botonAtras.getWidth(), botonAtras.getHeight(), Image.SCALE_SMOOTH));
		botonAtras.setIcon(iconoBotonFlechaAtras);
		
		iniciar();
		
	}
	
	public void iniciar() {
		this.setIconImage(new ImageIcon(getClass().getResource("/Sprites/fondo/IconoMenu.jpg")).getImage());
		this.setResizable(false);
		
		panelPrincipal = new ImagenNivel1();
		panelPrincipal.setLayout(null);
		setBounds(100,30,800,500);
		setLocationRelativeTo(null);
		setVisible(true);
		
		contenedor.add(panelPrincipal);
		
		botonAdelante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Mapa_GUI2 imagenPanelPrincipal = new Mapa_GUI2();
				imagenPanelPrincipal.setLocationRelativeTo(null);
				imagenPanelPrincipal.setVisible(true);
				setVisible(false);
			}
		});
		panelPrincipal.add(botonAdelante);
		
		botonAtras.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					MenuInicio menu = new MenuInicio();
					menu.setLocationRelativeTo(null);
					menu.setVisible(true);
					setVisible(false);
				}
		});
		panelPrincipal.add(botonAtras);
	}
}
