package abstractjava;

public class Perro extends Canido{

	public Perro() {
	}
	
	@Override
	public String getNombreCientifico() {
	
		return "Canis lupus familias"; 
	}

	@Override
	public String getSonido() {
		return " ladrido";
	
	}

	@Override
	public String getAlimentos() {
		return "carnivoro";
	
	}

	@Override
	public String getHabitat() {
		return "domestico";
	
	}
	
}
