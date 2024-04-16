package abstract2;

public class Contrarelojista extends Ciclistas{
	private double velocidadMaxima;

	public Contrarelojista(double velocidadMaxima, int identificador, String nombre) {
		super(identificador, nombre);
		this.velocidadMaxima = velocidadMaxima;
	}

	public double getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(double velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	


	@Override
	public String impimirTipo() {
		return "Contrarelojista" ;
	}

	@Override
	public void tipo() {
		System.out.println("la velocidad maxima es de: " + this.velocidadMaxima);
	}
	
}
