package PowerUps;

 
import Objetos.Obstaculo;
import Principal.Celda;
import Visitor.Visitor;

public abstract class MagiaTemporal extends Obstaculo {
	
 
	
	public MagiaTemporal () {
		this.pos = null;
		grafico =null;

	}

	 
	public void  setCeldaMagia (Celda c) {
		this.pos = c;
		
	}
	/*
	public abstract void accept(Visitor v) {
		// v.visit(this);
		
	}

	 
	public boolean dejoPasar(Visitor v) {
		 
		return false;
	}
	*/
	
	 
	

}
