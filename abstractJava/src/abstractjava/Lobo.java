package abstractjava;

public class Lobo extends Canido{

	public Lobo() {
	}
	

	@Override
	public String getNombreCientifico() {
		return "canis lupus";
	
	}

	@Override
	public String getSonido() {
		return "aullido";
	
	}

	@Override
	public String getAlimentos() {
		return "carnivoro" ;
	}

	@Override
	public String getHabitat() {
		return "bosque";
	
	}
	
}
