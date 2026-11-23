package cosas.envases;

public abstract class Envase {
	
	public static final int NUM_MAX_USOS=50;
	protected int numeroUsos;
	
	public Envase() {
		System.out.println("Envase.java: se crea un envase con numeroUsos=0.");
		numeroUsos=0;
	}
	


}
