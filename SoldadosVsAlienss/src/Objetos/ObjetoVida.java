package Objetos;

import Principal.Celda;
import Visitor.Visitor;
 

public class ObjetoVida extends Obstaculo {
	

	public ObjetoVida(Celda pos) {
		this.pos = pos;
		grafico = null;
		
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