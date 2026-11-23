package cosas.envases;
import cosas.*;

public class EnvasePlastico extends Envase implements Reciclable {
	
	public static final int NUM_MAX_USOS=30;
	
	public void reciclar() {
		numeroUsos++;
		System.out.println("EnvasePlastico.java: Se recicla un envase de plástico, numeroUsos="+numeroUsos);
	}

}
