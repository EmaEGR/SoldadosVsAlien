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
import PowerUps.Piedra;

public class VisitorBalaSoldado implements Visitor{
	protected Bala myDisparoSoldado;
	
	
	public void setBala (Bala b){
		  myDisparoSoldado = b;
	}
	 
	public void visit(Alien a) {
		a.setVida(20);
	}

	 
	public void visit(Soldado a) {
		
		
	}
	
	public void visit(Bala b){
		
	}

	 
	public void visit(ObjetoVida a) {
		
	}

	 
	public void visit(ObjetoTemporal a) {
		 
		
	}

	 
	public void visit(ObjetoAgua a) {
		 
	}

	 
	public void visit(ObjetoFuego a) {
	 
	}

	 
	public void visit(ObjetoFuente a) {
	 
	}

	 
	public void visit(ObjetoPiedra a) {
	 
	}

	public boolean puedoPasar(Bala a) {
		return true;
	}

	public boolean puedoPasar(Alien a) {
		return false;
	}

	public boolean puedoPasar(Soldado a) {
		return true;
	}
	
	@Override
	public void visit(MagiaTemporal m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean puedoPasar(ObjetoTemporal a) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean puedoPasar(ObjetoAgua a) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean puedoPasar(ObjetoFuego a) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean puedoPasar(ObjetoFuente a) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean puedoPasar(ObjetoPiedra a) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean puedoPasar(ObjetoVida a) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean puedoPasar(MagiaTemporal m) {
		// TODO Auto-generated method stub
		return true;
	}
	
	 
	public boolean Atacar(ObjetoTemporal a) {
		 
		return false;
	}

	 
	public boolean Atacar(ObjetoAgua a) {
	 
		return false;
	}

	 
	public boolean Atacar(ObjetoFuego a) {
	 
		return false;
	}

	 
	public boolean Atacar(ObjetoFuente a) {
		 
		return false;
	}

	 
	public boolean Atacar(ObjetoPiedra a) {
		 
		return false;
	}

	 
	public boolean Atacar(Bala a) {
		 
		return false;
	}

	 
	public boolean Atacar(Alien a) {
		 
		return true;
	}

	 
	public boolean Atacar(Soldado a) {
		 
		return false;
	}

	 
	public boolean Atacar(ObjetoVida a) {
	 
		return false;
	}

	 
	public boolean Atacar(MagiaTemporal m) {
	 
		return false;
	}

 
	public void visit(ObjetoVidaComprar a) {
	 
		
	}

	 
	public boolean puedoPasar(ObjetoVidaComprar a) {
		 
		return false;
	}

	 
	public boolean Atacar(ObjetoVidaComprar a) {
	 
		return false;
	}

	@Override
	public void visit(Bomba b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Fuerza b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Piedra p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean puedoPasar(Piedra p) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void visit(Campo_de_Proteccion c) {
		// TODO Auto-generated method stub
		
	}
 
}