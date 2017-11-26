package PowerUps;

 
import Objetos.Obstaculo;
import Principal.Celda;
import Visitor.Visitor;

public abstract class MagiaTemporal extends Obstaculo {
	
 
	
	public MagiaTemporal () {
		this.pos = null;
		grafico =null;

	}

	public boolean dejoPasar(Visitor v) {
		 
		return v.puedoPasar(this);
	}

 
	public boolean puedoAtacar(Visitor v) {
		 return false;
	}
	 
	

}
