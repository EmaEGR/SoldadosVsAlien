package Objetos;

import Principal.Celda;
import Visitor.Visitor;

public class ObjetoVidaComprar extends Obstaculo{
	
	protected int precio;
	public ObjetoVidaComprar(Celda pos) {
		this.pos = pos;
		this.grafico = null;
		this.vida = 100;
		
	}

	

	public void setVida(float f) {
		vida-=f;
	}
	
	public int getVida() {
		return vida;
	}

	 
	public void accept(Visitor v) {
		 v.visit(this);
	}
	 
	public boolean dejoPasar(Visitor v) {
		return v.puedoPasar(this);
	}
	
	public boolean puedoAtacar (Visitor v) {
		return v.Atacar(this);
	}

	
}
 
