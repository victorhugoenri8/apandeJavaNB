package abstractjava;

public class Gato extends Felinos{

	public Gato() {
	}
	

	@Override
	public String getNombreCientifico() {
		return "Felis silvestris catus";
	
	}

	@Override
	public String getSonido() {
		return  "maullar";
	}

	@Override
	public String getAlimentos() {
		return "ratones";
	}

	@Override
	public String getHabitat() {
		return "domestico";
	}
	
}
