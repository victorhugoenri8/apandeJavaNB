package interfacesmultiples;

public class vehiculoAerea implements Reactor, Alas{
	
	public void despegar(){
		System.out.println("estoy despegando.");
	}
	
	public void aterrizar(){
		System.out.println("estoy aterrizando.");
	}
	 

	public void volar(){
		System.out.println("estoy volando.");
	}

	@Override
	public void encender() {
		System.out.println("estoy encendiendo");
	}

	@Override
	public void apagar() {
		System.out.println("estoy apagando");
	}

	@Override
	public void soltar() {
		System.out.println("estoy soltando.");
	}

	@Override
	public void subirTren() {
		System.out.println("estoy subiendo el tren");
	}
}
