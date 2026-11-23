package cosas;

public interface Reciclable {

	default void reciclar() {
		System.out.println("Reciclable.java: Se recicla de manera genérica.");
	}
	
}
