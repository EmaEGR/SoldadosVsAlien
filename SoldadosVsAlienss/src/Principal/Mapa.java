package Principal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
 
import javax.swing.JLabel;
import javax.swing.JPanel;
import Disparo.Bala;


import Factory.A1factory;
import Factory.A2factory;
import Factory.A3factory;
import Factory.A4factory;
import Factory.A5factory;
import Factory.A6factory;
import Factory.AlienFactoryMethod;
import Factory.BalaSoldadoFactory;
import Factory.BalasFactoryMethod;
import Factory.FactoryBomba;
import Factory.FactoryCampoProteccion;
import Factory.FactoryFuerza;
import Factory.FactoryPiedra;
import Hilos.HiloActivarObjetoTemporal;
import Objetos.ObjetoAgua;
import Objetos.ObjetoFuego;
import Objetos.ObjetoFuente;
import Objetos.ObjetoPiedra;
import Objetos.Obstaculo;
import Personajes.Alien;
 
import Personajes.Soldado;
 
import Visitor.VisitorSoldado;
 
 
import PowerUps.ObjetoPrecioso;
import Visitor.VisitorBomba;

import PowerUps.Bomba;


public class Mapa {
	private Celda mapa[][];
	private int columnas, filas;
	protected LinkedList<Obstaculo> objetosMapa;
	protected Obstaculo obs;
	protected JPanel panel;

	public Mapa(int f, int c, JPanel p){
		this.filas = f;
		this.columnas = c;
		panel = p;
		this.mapa = new Celda[filas][columnas];
		
		for(int i = 0; i < filas; i++){
			for(int j = 0; j < columnas; j++){
				this.mapa[i][j] = new Celda( i, j);
				this.mapa[i][j].setElemento(null);
			}
		}
		objetosMapa= new LinkedList<Obstaculo>();
	}
	
	public Celda getCelda(int x, int y){
		if((x < this.filas) && (x >= 0) && (y < this.columnas) && (y >= 0)) {
			return this.mapa[x][y];
		}
		return null;
	}
	
	public void setPanelMapa(JPanel p) {
		panel = p;
	}
	
	public Celda puedeInsertar(Celda c) {
		Celda celdaVecina = getCelda(c.getFila()+1, c.getColumna());
		if (celdaVecina != null)
			if (celdaVecina.getElemento() == null)
				return celdaVecina;
			else {
					celdaVecina = getCelda(c.getFila()-1, c.getColumna());
					if (celdaVecina != null)
						if (celdaVecina.getElemento() == null)
							return celdaVecina;
				 }
		else {
				celdaVecina = getCelda(c.getFila()-1, c.getColumna());
				if (celdaVecina.getElemento() == null)
					return celdaVecina;
			 }
		return null;
	}
	
	public Celda[][] getMapa() {
		return mapa;
	}

	public int getColumna() {
		return columnas;
	}

	public int getFila() {
		return filas;
	}
	
	public void setCeldaMapa(int x , int y , Obstaculo o) {
		mapa[x][y].setElemento(o);
	}
	
	public void insertarObjetos(Logica l) {

		 try {	
			FileReader f = new FileReader(getClass().getResource("/Archivos/mapa1.txt").getFile());
	        BufferedReader b = new BufferedReader(f);
	        String cadena = "";
	        char d;
	        int y = 0;
	        	while ((cadena = b.readLine()) != null) {
	        		int x = 0;
		        	for (int i = 0; i < cadena.length(); i++){
		      		   d = cadena.charAt(i);
		      		   Celda c = getCelda(y,x);
		                if (d == 'f') {
		                	obs= new ObjetoFuego(c);
		                	HiloActivarObjetoTemporal h = new HiloActivarObjetoTemporal (l,obs);
		                	h.start();
		                }
		                	else if (d == 'a')
		                	   obs=new ObjetoAgua(c);
		                	      else if(d == 'u')
		                		       obs= new ObjetoFuente(c);
		                		       else if(d == 'p')
		                				     obs= new ObjetoPiedra(c);
		             if (obs != null){
		            	 objetosMapa.addLast(obs); 
		            	 obs.getCelda().setElemento(obs);
		            	 insertar(obs.getGrafico(0));
		             }
		             obs=null;
		             x++; 
		          }
		          y++;
		        }
		        
		 b.close();
	 }
   catch (IOException e) {
	 System.out.println("Error en objeto - leerArchivo. ");
   }	 
}
	//VERRR
	public boolean puedeDisparar (Soldado s) {
		boolean toReturn = false;
		int distancia = s.getDistanciaAtaque() + s.getCelda().getColumna();
		Celda c = siguienteCeldaDer(s.getCelda());
		for ( int i = c.getColumna(); i < distancia && toReturn == false ; i++) {
			if ( mapa[c.getFila()][i].getElemento() != null) {
				VisitorSoldado v = new VisitorSoldado();
				v.setSoldado(s);
				if ( mapa[c.getFila()][i].getElemento().puedoAtacar(v)) {
					if (mapa[c.getFila()][i].getElemento().getVida() >0 )
						System.out.println("Encontre algo en la celda :"+ mapa[c.getFila()][i].getElemento());
						toReturn = true;
					}
				
			}
		}
		return toReturn;
}
	
	public void insertar(JLabel l) {
		panel.add(l);
		panel.repaint();
	}
	
	public Alien insertarEnemigo(AlienFactoryMethod factory, int nivel, int orda) {
		int x = (int ) (Math.random() * 5);
		Celda c = new Celda(x,11);
		while (c.getElemento() != null & siguienteCeldaIzq(c).getElemento() != null) {
			x = (int ) (Math.random() * 5);
			c.set(x, 11);;
		}
		return crearEnemigos(c,nivel,factory,orda);
	}
	
	public Alien crearEnemigos(Celda c, int nivel,AlienFactoryMethod factory,int orda) {
		Alien p;
		
		if (nivel == 1) {
			if (orda == 1)
				factory = new A1factory(panel);
			else if (orda == 2)
					factory = new A2factory(panel);
				 else if (orda == 3)
					 	factory = new A3factory(panel);
		}
		else {
			if (orda == 1) {
				System.out.println("Entre a crear alien 4");	
				factory = new A5factory(panel);
			}
			else if (orda == 2)
					factory = new A5factory(panel);
				 else if (orda == 3)
					 	factory = new A6factory(panel);
			
		}
		System.out.println("Celda = "+c);
		p = factory.createPersonaje(c);
		System.out.println("P2 = "+p);
		
		 int r = (int) (Math.random() * 10)+1;
		
		 if (r == 1) {
			FactoryCampoProteccion f2 = new FactoryCampoProteccion ();
			p.setMagiaTemporal(f2.crearMagia());
		}
		 else {
			 if ( r == 2) {
				 FactoryFuerza f3 = new FactoryFuerza();
				 p.setMagiaTemporal(f3.crearMagia());
			 }
			 else
				 if (r == 3) {
					 FactoryBomba f4 = new FactoryBomba();
					 p.setObjetoPrecioso(f4.crearObjetoPrecioso());
				 }
				 else 
					 if (r == 4) {
						 FactoryPiedra f5 = new FactoryPiedra();
						 p.setObjetoPrecioso(f5.crearObjetoPrecioso());
					 }
					 
		 }
	  return  p;
	}
	
	public Bala insertarBalasMapa(BalasFactoryMethod factory, Soldado p) {
		
		Celda c = siguienteCeldaDer(p.getCelda());
		Celda nueva = new Celda(c.getFila(),c.getColumna());
		factory = new BalaSoldadoFactory(panel);
		Bala b = factory.crearBalas(nueva,p);
	 
		return b;
	 
	}

	public Celda siguienteCeldaIzq(Celda c) {
		int col = c.getColumna()-1;		
		return  getCelda(c.getFila(),col);
	}
	
	public Celda siguienteCeldaDer(Celda c) {
		int col = c.getColumna()+1;		
		return getCelda(c.getFila(),col);
	}
	
	public LinkedList<Obstaculo> activarBomba(Celda c) {
		
		
		LinkedList<Obstaculo> eliminados = new LinkedList<Obstaculo>();
		LinkedList<Celda> celdas = new LinkedList<Celda>();
		
		if (getCelda(c.getFila()-1,c.getColumna()-1) != null)
			celdas.addLast(getCelda(c.getFila()-1,c.getColumna()-1));
		if (getCelda(c.getFila()-1,c.getColumna()) != null)
			celdas.addLast(getCelda(c.getFila()-1,c.getColumna()));
		if (getCelda(c.getFila()-1,c.getColumna()+1) != null)
			celdas.addLast(getCelda(c.getFila()-1,c.getColumna()+1));
		if (getCelda(c.getFila(),c.getColumna()-1) != null)
			celdas.addLast(getCelda(c.getFila(),c.getColumna()-1));
		if (getCelda(c.getFila(),c.getColumna()+1) != null)
			celdas.addLast(getCelda(c.getFila(),c.getColumna()+1));
		if (getCelda(c.getFila()+1,c.getColumna()-1) != null)
			celdas.addLast( getCelda(c.getFila()+1,c.getColumna()-1));
		if (getCelda(c.getFila()+1,c.getColumna()) != null)
			celdas.addLast(getCelda(c.getFila()+1,c.getColumna()));
		if (getCelda(c.getFila()+1,c.getColumna()+1) != null)
			celdas.addLast(getCelda(c.getFila()+1,c.getColumna()+1));
		
		
		VisitorBomba vb = new VisitorBomba();
		Obstaculo o ;
		for (Celda celda : celdas) {
			o = celda.getElemento();
			if (o != null) {
				if (o.puedoAtacar(vb)) {
					o.actualizarGrafico(2);
					setCeldaMapa(celda.getFila(),celda.getColumna(),null);			
					eliminados.add(o);
				}
			}
		}
	  return eliminados;
	}
	
	public void eliminar(Obstaculo o) {
		panel.remove(o.getGrafico(0));
		panel.revalidate();
		panel.repaint();
	}
	 
	public LinkedList<Obstaculo> getLista() {
		return objetosMapa;
	}


}

