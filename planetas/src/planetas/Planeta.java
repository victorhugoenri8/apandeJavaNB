package planetas;

public class Planeta {

	String nombre = null;
	int cantidadSatelites = 0;
	double masa = 0;
	double volumen = 0;
	int diametro = 0;
	int distancia = 0;
	boolean esObservable;
	double densidad;
	Tipos tipo;

	public Planeta(String nombre, Tipos tipo, boolean esObservable, int cantidadSatelites, int diametro, int distancia, double masa, double volumen) {
		this.esObservable = esObservable;
		this.cantidadSatelites = cantidadSatelites;
		this.diametro = diametro;
		this.distancia = distancia;
		this.nombre = nombre;
		this.volumen = volumen;
		this.tipo=tipo;
	}

	public void imprimir() {
		double aa = this.calcularDensidad();
		System.out.println(
			"Planeta{\n\t" + "nombre=" + nombre + ", \n\tcantidadSatelites=" + cantidadSatelites + ", \n\tmasa=" + masa + ", \n\tvolumen=" + volumen + ", \n\tdiametro=" + diametro + ", \n\tdistancia=" + distancia + ", \n\tesObservable=" + esObservable + ", \n\tdensidad=" + densidad +", \n\tpleaneta del tipo=" + tipo
);};
	

	private double calcularDensidad(){
		return this.densidad=this.masa/this.volumen;
	}

	


}
