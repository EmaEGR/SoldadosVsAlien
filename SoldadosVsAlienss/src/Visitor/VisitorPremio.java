package Visitor;

import Disparo.Bala;
import Objetos.ObjetoAgua;
import Objetos.ObjetoFuego;
import Objetos.ObjetoFuente;
import Objetos.ObjetoPiedra;
import Objetos.ObjetoTemporal;
import Objetos.ObjetoVida;
import Objetos.ObjetoVidaComprar;
import Personajes.Alien;
import Personajes.Soldado;
import PowerUps.Bomba;
import PowerUps.Campo_de_Proteccion;
import PowerUps.Fuerza;
import PowerUps.MagiaTemporal;
import PowerUps.ObjetoPrecioso;
import PowerUps.Piedra;
import Principal.Celda;
import Principal.Logica;

public class VisitorPremio  implements Visitor{
	private Logica l;
	
	public VisitorPremio (Logica l) {
		this.l = l;
	}
	 
	//-------------------------------------------------Visit--------------------------------------------
	public void visit(ObjetoTemporal o) {
		
		
	}

	 
	public void visit(MagiaTemporal m) {
		 

	}
 
	public void visit(Piedra p) {
		System.out.println("Entre a visitar Piedra ");
		l.getPiedras().addLast(p);
		l.getGui().incrementarPiedras();
		//l.getMapaCombate().eliminar(p);
	}
	
	public void visit (Bomba b) {
 
		System.out.println("Entre a visitar BOMBA ");
		l.getBombas().addLast(b);
		l.getGui().incrementarBomba();
		//l.eliminar(b);
		 
 
	}
	
	public void visit (Fuerza b) {
		System.out.println("Entre a visitar FUERZA");
		l.activarMagia_Fuerza();
	//	l.eliminar(b);
		 
	}
	
	public void visit (Campo_de_Proteccion b ) {
		System.out.println("Entre a visitar CAMPO PROTECCION");
		l.activarMagia_Campo();
		//l.eliminar(b);
		 
		 
	}
 
	public void visit(ObjetoAgua a) {
	 
		
	}

	 
	public void visit(ObjetoFuego a) {
		 
		
	}

	@Override
	public void visit(ObjetoFuente a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(ObjetoPiedra a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Bala a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Alien a) {
		// TODO Auto-generated method stub
		
	}
	
 	public void visit(Soldado a) {
		int monedas = l.getMonedas();
		//l.eliminar(a);
		if ( a.getVida() != 100) {
			monedas = l.getMonedas();
			monedas += a.getVida()*0.5;
			l.getGui().setMonedasGUI(monedas);
		}
		else {
			monedas += a.getVida();
			l.getGui().setMonedasGUI(monedas);
		}
		
	}
		 
		
 

	@Override
	public void visit(ObjetoVida a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(ObjetoVidaComprar a) {
		// TODO Auto-generated method stub
		
	}
	//--------------------------------------------------------puedoPasar--------------------------------------

	@Override
	public boolean puedoPasar(ObjetoTemporal a) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean puedoPasar(ObjetoAgua a) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean puedoPasar(ObjetoFuego a) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean puedoPasar(ObjetoPrecioso o) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public boolean puedoPasar(ObjetoFuente a) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean puedoPasar(ObjetoPiedra a) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean puedoPasar(Bala a) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean puedoPasar(Alien a) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean puedoPasar(Soldado a) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean puedoPasar(ObjetoVida a) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean puedoPasar(ObjetoVidaComprar a) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean puedoPasar(MagiaTemporal m) {
		// TODO Auto-generated method stub
		return false;
	}

	//-------------------------------------------------------Atacar-------------------------------------------

	@Override
	public boolean Atacar(ObjetoAgua a) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean Atacar(ObjetoFuego a) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean Atacar(ObjetoFuente a) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean Atacar(ObjetoPiedra a) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean Atacar(Bala a) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean Atacar(Alien a) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean Atacar(Soldado a) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean Atacar(ObjetoVida a) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean Atacar(ObjetoVidaComprar a) {
		// TODO Auto-generated method stub
		return false;
	}

	


	


}
