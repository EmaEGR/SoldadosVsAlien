package Factory;

import PowerUps.ObjetoPrecioso;
import PowerUps.Piedra;

public class FactoryPiedra implements ObjetoPreciosoMethodFactory {
	
	public ObjetoPrecioso crearObjetoPrecioso() {
		Piedra b = new Piedra();
		return b;
	}

}
