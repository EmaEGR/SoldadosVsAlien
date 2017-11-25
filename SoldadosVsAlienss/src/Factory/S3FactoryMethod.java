package Factory;

import Personajes.S3;
import Personajes.Soldado;
import Principal.Celda;

public interface S3FactoryMethod {

	public S3 createPersonaje (Celda c, Celda v);

}
