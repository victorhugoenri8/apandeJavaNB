package abstract2;
public abstract class Ciclistas {
	private int identificador;
	private String nombre;
	private int tiempoAcumulado = 0;
	private int posicionGeneral;

//constructor

	public Ciclistas(int identificador, String nombre) {
		this.identificador = identificador;
		this.nombre = nombre;
	}
	
//metodos
	public abstract String impimirTipo();
	public abstract void tipo();
	


//get y set
	public int getPosicionGeneral() {
		return posicionGeneral;
	}

	public void setPosicionGeneral(int posicionGeneral) {	
		this.posicionGeneral = posicionGeneral;
	}

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTiempoAcumulado() {
		return tiempoAcumulado;
	}

	public void setTiempoAcumulado(int tiempoAcumulado) {
		this.tiempoAcumulado = tiempoAcumulado;
	}
	

}
