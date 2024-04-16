package abstract2;

public class Velocista extends Ciclistas{
	private double potenciaPromedio;
	private double velocidadPromedio;
//constructor
	public Velocista(double potenciaPromedio, double velocidadPromedio, int identificador, String nombre) {
		super(identificador, nombre);
		this.potenciaPromedio = potenciaPromedio;
		this.velocidadPromedio = velocidadPromedio;
	}
//set y get
	public double getPotenciaPromedio() {
		return potenciaPromedio;
	}

	public void setPotenciaPromedio(double potenciaPromedio) {
		this.potenciaPromedio = potenciaPromedio;
	}

	public double getVelocidadPromedio() {
		return velocidadPromedio;
	}

	public void setVelocidadPromedio(double velocidadPromedio) {
		this.velocidadPromedio = velocidadPromedio;
	}

	
	@Override
	public String impimirTipo() {
		return "Velocista";
	}

	@Override
	public void tipo() {
		System.out.println("Potencia promedio: " + this.potenciaPromedio);
		System.out.println("Velocidad Promedio: " + this.velocidadPromedio);
	}
	
}
