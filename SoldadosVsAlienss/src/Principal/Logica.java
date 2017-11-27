package Principal;

import Personajes.*;
import PowerUps.Bomba;
import PowerUps.MagiaTemporal;
import PowerUps.ObjetoPrecioso;
import PowerUps.Piedra;

import java.awt.Panel;
import java.util.LinkedList;

import javax.swing.JPanel;

import Disparo.Bala;
 
import Estate.Estado;
import Estate.EstadoCampo;

import Factory.AlienFactoryMethod;
 
import Factory.BalasFactoryMethod;
import Factory.FactoryRobot;
import Factory.ObjTemporalFactoryMethod;
import Factory.ObjVidaComprarFactoryMethod;
import Factory.ParedFactory;
import Factory.SoldadosFactoryMethod;
import Factory.TanqueFactory;
import Hilos.HiloActivarObjetoTemporal;
import Hilos.HiloBomba;
import Hilos.HiloLogico;
import Hilos.HiloMagia;
import Hilos.HiloMagiaTemporaCampo;
import Hilos.HiloMagiaTemporalFuerza;
import Hilos.HiloObjetoPreciosoPiedra;
import Hilos.HiloMagia;
import InterfazGrafica.PanelGano;
import InterfazGrafica.PanelNivel2;
import InterfazGrafica.panelGameOver;
import Factory.S1factory;
import Factory.S2factory;
import Factory.S3FactoryMethod;
import Factory.S3factory;
import Factory.S4factory;
import Factory.S5factory;
import Objetos.ObjetoTemporal;
import Objetos.ObjetoVidaComprar;
import Objetos.Obstaculo;
import Visitor.VisitorAlien;
import Visitor.VisitorBalaSoldado;
import Visitor.VisitorPremio;
import Visitor.VisitorSoldado;

public class Logica {
	
	protected int monedas;
	protected int puntos;
	protected LinkedList<Obstaculo> a_eliminarObstaculo;
	protected LinkedList<Obstaculo> a_eliminarObstaculoGrafica;
	protected LinkedList<Alien> aliensMapa;
	protected LinkedList<Soldado> soldadosMapa;
	protected LinkedList<S3> soldadosMapaS3;
	protected LinkedList<Soldado> soldados45;
	protected LinkedList<Alien> alien35;
	protected LinkedList<Bala> balasSoldado;
	protected LinkedList<Bala> balasAlien;
	protected LinkedList<ObjetoTemporal> listaObjetosTemporales;
	protected LinkedList<ObjetoVidaComprar> listaObjetosComprarVida;
	protected LinkedList<Bala> balasAeliminar;
	protected LinkedList<ObjetoPrecioso> bombas;
	protected LinkedList<ObjetoPrecioso> piedras;
	protected JPanel panelMapa;
	protected Mapa mapaCombate;
	protected Estado estadoMagia;
	private static int tamanioCelda = 80;
	protected SoldadosFactoryMethod factorySoldado;
	protected S3FactoryMethod factorySoldadoS3;
	protected AlienFactoryMethod factoryAlien; 
	protected BalasFactoryMethod factoryBala;
	protected ObjTemporalFactoryMethod fabricaObjetoTemporales;
	protected ObjVidaComprarFactoryMethod fabricaObjetoVidaComprar;
    protected static int columnas = ((1000 - 80 ) / tamanioCelda)+2;
    protected static int filas = ((500 - 40) / tamanioCelda)+1;
    protected int cantOrdas;
    protected int cantEnemigos;
    protected boolean juegoActivo;
    protected Mapa_GUI2 gui;
    protected int nivel;
    

	public Logica(JPanel p, Mapa_GUI2 gui){
		this.gui = gui;
		panelMapa=p;
		puntos = 100;
		monedas = 500;
		juegoActivo = true;
		gui.setMonedasGUI(monedas);
		
		bombas = new LinkedList<ObjetoPrecioso>();
		piedras = new LinkedList<ObjetoPrecioso>();
		aliensMapa=new LinkedList<Alien>();
		soldadosMapa= new LinkedList<Soldado>();
		soldadosMapaS3= new LinkedList<S3>();
		soldados45= new LinkedList<Soldado>();
		a_eliminarObstaculo= new LinkedList<Obstaculo>();
		a_eliminarObstaculoGrafica= new LinkedList<Obstaculo>();
		balasSoldado = new LinkedList<Bala>();
		balasAlien = new LinkedList<Bala>();
		balasAeliminar = new LinkedList<Bala>();
		listaObjetosTemporales = new LinkedList<ObjetoTemporal>();
		listaObjetosComprarVida = new LinkedList<ObjetoVidaComprar>();
		
		nivel = 1;
		cantEnemigos = 12;
		cantOrdas = 1;
		mapaCombate = new Mapa(filas,columnas,p);
		
		estadoMagia = new EstadoCampo();
		ejecutarHilos(juegoActivo);
	
	
	}
	
	 
	
	public void ejecutarHilos(boolean resultado) {
		if(resultado == true) {
			insertarObjetos();	
			HiloLogico h = new HiloLogico(this);
			h.start();
		}
	}

	public void setJuegoActivo(boolean j) {
		juegoActivo = j;
	}
	
	public boolean getjuegoActivo() {
		return juegoActivo;
	}
	
	public int getNivel() {
		return nivel;
	}
	
	public void setGUI(Mapa_GUI2 g) {
		gui = g;
	}
	
	public void setNivel(int n) {
		aliensMapa.clear();
		soldadosMapa.clear();
		soldadosMapaS3.clear();
		soldados45.clear();
		a_eliminarObstaculo.clear();
		a_eliminarObstaculoGrafica.clear();
		balasSoldado.clear();
		balasAlien.clear();
		balasAeliminar.clear();
		listaObjetosTemporales.clear();
		listaObjetosComprarVida.clear();
		this.nivel = n;
		cantOrdas = 1;
		cantEnemigos = 12;
		//this.juegoActivo = true;
		//ejecutarHilos(true);	
	}

	public LinkedList<Soldado> getSoldados () {
		return soldadosMapa;
	}
	

	public void insertarObjetos() {
		mapaCombate.insertarObjetos(this);
	}
		
	public void limpiarBalasSoldado() {
	 if ( balasAeliminar != null){
		while (balasAeliminar.size() > 0) {
			Bala b = balasAeliminar.removeFirst();
			balasSoldado.remove(b);
		}
	 }
	}
	
	public void limpiarMuertos (){
		if ( a_eliminarObstaculo != null){
			while (a_eliminarObstaculo.size() > 0){
				Obstaculo o = a_eliminarObstaculo.removeFirst();
				a_eliminarObstaculoGrafica.addLast(o);
				if (aliensMapa.remove(o)) {
					cantEnemigos--;
					puntos += o.getPuntos();
					monedas += o.getMonedas();
					gui.setMonedasGUI(monedas);
					gui.setPuntosGUI(puntos);
				}
				else {
						soldadosMapa.remove(o);
						mapaCombate.getLista().remove(o);
						listaObjetosComprarVida.remove(o);
					 }	
			}
		}
	}
	
	public void insertarEnemigos() {
	 if (cantEnemigos != 0) {
		if ( aliensMapa.size() == 0) {
			while ( aliensMapa.size() < 4)
				aliensMapa.addLast(mapaCombate.insertarEnemigo(factoryAlien,nivel,cantOrdas));	 
			cantOrdas++;
		  }
	 }
	 else { juegoActivo = false;
	 		if (nivel == 1) {
	 			System.out.println("Nivel = "+nivel);
	 			setNivel(2);
	 			System.out.println("Nivel2 = "+nivel);
	 			PanelNivel2 p = new PanelNivel2(gui);
	 			p.setLocationRelativeTo(null);
	 			p.setVisible(true);
	 			gui.setVisible(false);
	 		}
	 		else gano();
	 	  }
	}
	
	public void inicioMovimientoAliens() {
		for (Alien p :aliensMapa){				
			moverAlien(p);	
		}
	}
	
	public void gano() {
		juegoActivo = false;
		PanelGano p = new PanelGano();
		p.setLocationRelativeTo(null);
		p.setVisible(true);
		gui.setVisible(false);
	}
	
	public void gameOver() {
		juegoActivo = false;
		panelGameOver panelPerdio = new panelGameOver();
		panelPerdio.setVisible(true);
		gui.setVisible(false);
	}
	
	public void moverAlien(Personaje p) {	
		Celda siguiente = mapaCombate.siguienteCeldaIzq(p.getCelda());
		p.getCelda().setElemento(null);
		
		if (siguiente != null) {
			VisitorAlien v = new VisitorAlien();
			v.setAlien(p);
			v.setEstado(null);
			Obstaculo o = siguiente.getElemento();
			if ( o == null  || o.dejoPasar(v)) {
				mapaCombate.setCeldaMapa(p.getCelda().getFila(),p.getCelda().getColumna(), null);
				mapaCombate.setCeldaMapa(siguiente.getFila(), siguiente.getColumna(), p);
				p.setCelda(siguiente.getFila(),siguiente.getColumna());
				p.actualizarGrafico(0);	
			}
		}else gameOver();
			 
	}
	
	public void inicioAtaqueAlien (){
		for (Alien p : aliensMapa){
			ataqueAlien(p);
		}
	}
	
	public void ataqueAlien (Alien p){
		Celda c = p.getCelda();	
		Celda siguiente = mapaCombate.siguienteCeldaIzq(c);
		
		if (siguiente != null ){
			Obstaculo o = siguiente.getElemento();
			if (o != null){
				VisitorAlien v = new VisitorAlien();
				v.setAlien(p);
				v.setEstado(estadoMagia);
				if (o.puedoAtacar(v)) {
					if (o.getVida() > 0){
						p.actualizarGrafico(1);
						o.accept(v);
					}
					else{
						o.actualizarGrafico(2);
						a_eliminarObstaculo.addLast(o);
						mapaCombate.setCeldaMapa(siguiente.getFila(), siguiente.getColumna(), null);			
					}
				}
		   }
	   }
	}
	
	/**Ataque de soldado cuerpo a cuerpo **/
	public LinkedList<S3> getS3(){
		return soldadosMapaS3;
	}
	
	public void setEstado_MTLogica (Estado e) {
		estadoMagia = e;
	}
	
	public LinkedList<Alien> getAliens() {
		return aliensMapa;
	}
	
	public LinkedList<Bala> getBalas() {
		return balasSoldado;
	}

	public void ataqueSoldado (Personaje p ) {
	HiloMagia h ;
	Celda c = p.getCelda();	
	Celda siguiente = mapaCombate.siguienteCeldaDer(c);
	
	if (siguiente != null ){
		Obstaculo o = siguiente.getElemento();
		if ( o != null){
			VisitorSoldado v = new VisitorSoldado();
			v.setSoldado(p);
			v.setEstado(estadoMagia);
			if(o.puedoAtacar(v)) {				 
				if ( o.getVida() > 0){
					p.actualizarGrafico(1);
				 	o.accept(v);
				}
				else{
					
					if ( o.getMagiaTemporal() != null) {
						o.getMagiaTemporal().setPosicion(o.getCelda());
						o.getMagiaTemporal().setCelda(o.getCelda().getFila(), o.getCelda().getColumna());
						mapaCombate.setCeldaMapa(siguiente.getFila(), siguiente.getColumna(), o.getMagiaTemporal());
						mapaCombate.insertar(o.getMagiaTemporal().getGrafico(0));
						h = new HiloMagia(this,o.getMagiaTemporal());
						h.start();
						
					}
					else {
						if (o.getObjetoPrecioso() != null) {
							o.getObjetoPrecioso().setPosicion(o.getCelda());
							o.getObjetoPrecioso().setCelda(o.getCelda().getFila(), o.getCelda().getColumna());
							mapaCombate.setCeldaMapa(siguiente.getFila(), siguiente.getColumna(), o.getObjetoPrecioso());
							mapaCombate.insertar(o.getObjetoPrecioso().getGrafico(0));
							h = new HiloMagia(this,o.getObjetoPrecioso());
							h.start();
						}
						else mapaCombate.setCeldaMapa(siguiente.getFila(),siguiente.getColumna(), null);
							
					}
					
					o.actualizarGrafico(2); 
					a_eliminarObstaculo.addLast(o);
					System.out.println("Se inserto magia en celda siguiente ultimo ."+siguiente.getElemento());

				}	   
			}
		}
	}
	}
	
	public void ataqueSoldadoS3 (S3 p ) {
		HiloMagia h ;
		Celda c = p.getCelda();	
		Celda cv = p.getCeldaVecina();
		Celda siguiente = mapaCombate.siguienteCeldaDer(c);
		Celda siguienteVecina = mapaCombate.siguienteCeldaDer(cv);
		
		if (siguiente != null){
			Obstaculo o = siguiente.getElemento();
			Obstaculo ov = siguienteVecina.getElemento();
			if ( o != null ){
				VisitorSoldado v = new VisitorSoldado();
				v.setSoldado(p);
				v.setEstado(estadoMagia);
				if(o.puedoAtacar(v)) {				 
					if ( o.getVida() > 0){
						p.actualizarGrafico(1);
					 	o.accept(v);
					}
					else{
						if ( o.getMagiaTemporal() != null) {
							o.getMagiaTemporal().setPosicion(o.getCelda());
							o.getMagiaTemporal().setCelda(o.getCelda().getFila(), o.getCelda().getColumna());
							mapaCombate.setCeldaMapa(siguiente.getFila(), siguiente.getColumna(), o.getMagiaTemporal());
							mapaCombate.insertar(o.getMagiaTemporal().getGrafico(0));
							h = new HiloMagia(this,o.getMagiaTemporal());
							h.start();
						}
						else {
							if (o.getObjetoPrecioso() != null) {
								o.getObjetoPrecioso().setPosicion(o.getCelda());
								o.getObjetoPrecioso().setCelda(o.getCelda().getFila(), o.getCelda().getColumna());
								mapaCombate.setCeldaMapa(siguiente.getFila(), siguiente.getColumna(), o.getObjetoPrecioso());
								mapaCombate.insertar(o.getObjetoPrecioso().getGrafico(0));
								h = new HiloMagia(this,o.getObjetoPrecioso());
								h.start();
							}
							else {
									mapaCombate.setCeldaMapa(siguiente.getFila(),siguiente.getColumna(), null);
									
								 }
							}
						
	
					/*	puntos += o.getPuntos();
						monedas += o.getMonedas();
						gui.setMonedasGUI(monedas);
						gui.setPuntosGUI(puntos);*/
						System.out.println("Despues -Puntos :"+puntos + " Monedas :"+monedas);
						o.actualizarGrafico(2); 
						a_eliminarObstaculo.addLast(o);

					}	   
			}
		}
		if (ov != null) {
			VisitorSoldado v = new VisitorSoldado();
			v.setSoldado(p);
			v.setEstado(estadoMagia);
			if(ov.puedoAtacar(v)) {				 
				if ( ov.getVida() > 0){
					p.actualizarGrafico(1);
				 	ov.accept(v);
				}
				else{
					if ( ov.getMagiaTemporal() != null) {
						ov.getMagiaTemporal().setPosicion(ov.getCelda());
						ov.getMagiaTemporal().setCelda(ov.getCelda().getFila(), ov.getCelda().getColumna());
						mapaCombate.setCeldaMapa(siguienteVecina.getFila(), siguienteVecina.getColumna(), ov.getMagiaTemporal());
						mapaCombate.insertar(ov.getMagiaTemporal().getGrafico(0));
						h = new HiloMagia(this,ov.getMagiaTemporal());
						h.start();
					}
					
					else {
						if (ov.getObjetoPrecioso() != null) {
							ov.getObjetoPrecioso().setPosicion(ov.getCelda());
							ov.getObjetoPrecioso().setCelda(ov.getCelda().getFila(), ov.getCelda().getColumna());
							mapaCombate.setCeldaMapa(siguienteVecina.getFila(), siguienteVecina.getColumna(), ov.getObjetoPrecioso());
							mapaCombate.insertar(ov.getObjetoPrecioso().getGrafico(0));
							h = new HiloMagia(this,ov.getObjetoPrecioso());
							h.start();
						}
						else {
								mapaCombate.setCeldaMapa(siguienteVecina.getFila(),siguienteVecina.getColumna(), null);
								
							 }
						}
						/*puntos += ov.getPuntos();
						monedas += ov.getMonedas();
						gui.setMonedasGUI(monedas);
						gui.setPuntosGUI(puntos);*/
						ov.actualizarGrafico(2); 
						a_eliminarObstaculo.addLast(ov);
			
					}
		
				}
			}
		}
	}
	 
		
	public void moverDisparoSoldado(Bala p){
		Celda siguiente = mapaCombate.siguienteCeldaDer(p.getCelda());
		  
		if (siguiente != null) {
			VisitorBalaSoldado v = new VisitorBalaSoldado();
			v.setBala(p);
			Obstaculo o = siguiente.getElemento();
			if (o == null || o.dejoPasar(v)){
				mapaCombate.setCeldaMapa(p.getCelda().getFila(),p.getCelda().getColumna(), null);
				mapaCombate.setCeldaMapa(siguiente.getFila(), siguiente.getColumna(), p);
				p.setCelda(siguiente.getFila(),siguiente.getColumna());
				p.actualizarGrafico(0);	
			}
		}
		else {
			balasAeliminar.addLast(p);
			mapaCombate.eliminar(p);
			mapaCombate.setCeldaMapa(p.getCelda().getFila(),p.getCelda().getColumna(), null);
		}
	 
	}
	
	public void soldadosBala() {
		for (Soldado p: soldados45){
			if (mapaCombate.puedeDisparar(p)) {
				Bala b = mapaCombate.insertarBalasMapa(factoryBala, p);	
				balasSoldado.addLast(b);
			}
		}
	}
	
	public void balaSoldado(Bala b) {
		Celda c = b.getCelda();	
		Celda siguiente = mapaCombate.siguienteCeldaDer(c);
		
		if (siguiente != null ){
			Obstaculo o = siguiente.getElemento();
			if ( o != null){
				VisitorBalaSoldado v = new VisitorBalaSoldado();
				v.setBala(b);
				if (!o.dejoPasar(v)) {
					balasAeliminar.addLast(b);
					mapaCombate.eliminar(b);
					mapaCombate.setCeldaMapa(c.getFila(), c.getColumna(), null);
					o.accept(v);
					if (o.getVida() <= 0){
						o.actualizarGrafico(2);
						a_eliminarObstaculo.add(o);
						mapaCombate.setCeldaMapa(siguiente.getFila(), siguiente.getColumna(), null);
						mapaCombate.eliminar(b);
					}
				}
			}
		}
	}
 
	public boolean crearS1(int x, int y) {
		boolean toReturn = false;
		Celda c = mapaCombate.getCelda(x, y);	
		if ( monedas >= 25) {
			if (c.getElemento() == null) {
				toReturn = true;
				factorySoldado = new S1factory(panelMapa);
				soldados45.addLast(factorySoldado.createPersonaje(c));
				monedas-=45;
				gui.setMonedasGUI(monedas);
			}
		}
		return toReturn;
	}
		
	public boolean crearS2(int x, int y) {
		boolean toReturn = false;
		Celda c = mapaCombate.getCelda(x, y);	
		if (monedas >= 25 ) {
			if (c.getElemento() == null) {
				toReturn = true;
				factorySoldado = new S2factory(panelMapa);
				soldadosMapa.addLast(factorySoldado.createPersonaje(c));	
				monedas -=25;
				gui.setMonedasGUI(monedas);
			}
		}
	 return toReturn;
	}
	
	public boolean crearS3(int x, int y) {
		boolean toReturn = false;
		Celda c = mapaCombate.getCelda(x, y);	
		if (monedas >= 25 ) {
			if (c.getElemento() == null) {
				Celda v = mapaCombate.puedeInsertar(c); 
				if (v != null){
					toReturn = true;
					factorySoldadoS3 = new S3factory(panelMapa);
					soldadosMapaS3.addLast(factorySoldadoS3.createPersonaje(c,v));	
					monedas -=30;
					gui.setMonedasGUI(monedas);
				}
			}
		}
	 return toReturn;
	}
	
	public boolean crearS4(int x, int y) {
		boolean toReturn = false;
		Celda c = mapaCombate.getCelda(x, y);	
		if (monedas >= 25 ) {
			if (c.getElemento() == null) {
				toReturn = true;
				factorySoldado = new S4factory(panelMapa);
				Soldado s =  factorySoldado.createPersonaje(c);
				soldados45.addLast(s);
				monedas -=45;
				gui.setMonedasGUI(monedas);
			}
		}
	 return toReturn;
	}
	
	public boolean crearS5(int x, int y) {
		boolean toReturn = false;
		Celda c = mapaCombate.getCelda(x, y);	
		if (monedas >= 25 ) {
			if (c.getElemento() == null) {
				toReturn = true;
				factorySoldado = new S5factory(panelMapa);
				Soldado s =  factorySoldado.createPersonaje(c);
				soldados45.addLast(s);
				monedas -=45;
				gui.setMonedasGUI(monedas);
			}
		}
	 return toReturn;
	}
	
	public void activarMagia_Fuerza () {
		 
		HiloMagiaTemporalFuerza h1 = new HiloMagiaTemporalFuerza (this);
		h1.start();	
	}
	
	public void activarMagia_Campo () {
		HiloMagiaTemporaCampo h1 = new HiloMagiaTemporaCampo (this);
		h1.start();	
	}
	
	/**Verifica si la posicion corresonde al panel de combate 
	 * 
	 * @param x Fila del elemento a verificar
	 * @param y Columna del elemento a verificar
	 * @return Verdadero en caso de encontrar un Soldado , Falso en caso que haya seleccionado un objeto no correspondiente a un soldado, o un casillero vacio
	 */
	public boolean verificarPosicion(int x, int y) {
		Celda c= mapaCombate.getCelda(x, y);
		if ( c.getElemento() != null) {
			for(Soldado p: soldadosMapa) {
				if (p.getCelda().equals(c)) {
					if ( p.getVida() != 100) {
						monedas += p.getVida()*0.5;
						gui.setMonedasGUI(monedas);
					}
					else {
						monedas += p.getVida();
						gui.setMonedasGUI(monedas);
					}
					mapaCombate.eliminar(p);
					a_eliminarObstaculo.add(p);
					return true;
				}
			}
			for(Soldado p: soldados45) {
				if (p.getCelda().equals(c)) {
					if ( p.getVida() != 100) {
						monedas += p.getVida()*0.5;
						gui.setMonedasGUI(monedas);
					}
					else {
						monedas += p.getVida();
						gui.setMonedasGUI(monedas);
					}
					mapaCombate.eliminar(p);
					a_eliminarObstaculo.add(p);
					return true;
				}
			}
			for(Soldado p: soldadosMapaS3) {
				if (p.getCelda().equals(c)) {
					if ( p.getVida() != 100) {
						monedas += p.getVida()*0.5;
						gui.setMonedasGUI(monedas);
					}
					else {
						monedas += p.getVida();
						gui.setMonedasGUI(monedas);
					}
					mapaCombate.eliminar(p);
					a_eliminarObstaculo.add(p);
					return true;
				}
			}
		}
	   return false;
	}
	
	public void activarBomba(int x, int y) {
		Celda celda = mapaCombate.getCelda(x, y);
		if (celda.getElemento() == null) {
			ObjetoPrecioso b = bombas.getLast();
			b.setPosicion(celda);
			b.setCelda(x, y);
			mapaCombate.setCeldaMapa(x, y, b);
			b.actualizarGrafico(0);
			mapaCombate.insertar(b.getGrafico(0));
			LinkedList<Obstaculo> l = mapaCombate.activarBomba(celda);
			while (l.size() > 0) {
				Obstaculo o = l.removeFirst();
				a_eliminarObstaculo.add(o);
			}
			HiloBomba h = new HiloBomba(this,b);
			h.start();
		}
	}
	
	public void activarPiedra(int x, int y) {
		Celda celda = mapaCombate.getCelda(x, y);
		if (celda.getElemento() == null) {
			ObjetoPrecioso b = piedras.getLast();
			b.setPosicion(celda);
			b.setCelda(x, y);
			mapaCombate.setCeldaMapa(x, y, b);
			b.actualizarGrafico(0);
			mapaCombate.insertar(b.getGrafico(0));
			HiloObjetoPreciosoPiedra h = new HiloObjetoPreciosoPiedra(this,b);
			h.start();
		}
	}
	
	public boolean comprarPared (int x, int y) {
		boolean toReturn = false;
		Celda c = mapaCombate.getCelda(x, y);	
		if (monedas >= 50 ) {
			if (c.getElemento() == null) {
				toReturn = true;
				fabricaObjetoVidaComprar = new ParedFactory(panelMapa);
				listaObjetosComprarVida.addLast(fabricaObjetoVidaComprar.createObjeto(c));	
				monedas -=50;
				gui.setMonedasGUI(monedas);
			}
		}
	 return toReturn;
	}
	
	
	public boolean comprarRobot(int x, int y) {
		boolean toReturn = false;
		Celda c = mapaCombate.getCelda(x, y);	
		if (monedas >= 50 ) {
			if (c.getElemento() == null) {
				toReturn = true;
				fabricaObjetoVidaComprar = new FactoryRobot(panelMapa);
				listaObjetosComprarVida.addLast(fabricaObjetoVidaComprar.createObjeto(c));	
				monedas -=200;
				gui.setMonedasGUI(monedas);
			}
		}
	 return toReturn;
	}
	
	
	public boolean comprarTanque (int x, int y) {
		boolean toReturn = false;
		Celda c = mapaCombate.getCelda(x, y);	
		if (monedas >= 100 ) {
			if (c.getElemento() == null) {
				toReturn = true;
				fabricaObjetoTemporales = new TanqueFactory(panelMapa);
				listaObjetosTemporales.addLast(fabricaObjetoTemporales.createObjetoTemporal(c));	
				monedas -=100;
				gui.setMonedasGUI(monedas);
				HiloActivarObjetoTemporal h = new HiloActivarObjetoTemporal (this,listaObjetosTemporales.getLast());
				h.start();
				
			}
		}
	 return toReturn;
	}
	
	
	public boolean puedeComprar(ObjetoTemporal o) {
	   return (o.getPrecio() > monedas);
	}
	
	
	public void setPanel(JPanel frame) {
		panelMapa = frame;		
	}	
	
	public LinkedList<Obstaculo> getObstaculos_a_Limpiar(){
		return a_eliminarObstaculoGrafica;
	}
	
	public Mapa getMapaCombate () {
		return mapaCombate;
	}
	
	public int getMonedas () {
		return monedas;
	}
	
	public int getPuntos () {
		return puntos;
	}
	
	public Mapa_GUI2 getGui () {
		return gui;
	}
	
	public void accionMagia (int x, int y) {
		
		Celda c = mapaCombate.getCelda(x,y);
		System.out.println(c.getElemento()+" acicona magia");
		VisitorPremio v = new VisitorPremio (this);
		if (c.getElemento()!=null) { 
			c.getElemento().accept(v);
			mapaCombate.eliminar(c.getElemento());
			//c.setElemento(null);
		}
	}
	
	public void eliminar (Obstaculo o ) {
		Celda c = o.getCelda();
	    mapaCombate.eliminar(o);
		mapaCombate.setCeldaMapa(c.getFila(), c.getColumna(), null);
	}
	
	public LinkedList<ObjetoPrecioso> getBombas(){
		return bombas;
	}
	
	public LinkedList<ObjetoPrecioso> getPiedras(){
		return piedras;
	}
	
}
