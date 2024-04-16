package abstractjava;

//classe main
import java.util.ArrayList;

public class AbstractJava {

	public static void main(String[] args) {
		//crear un arraylist de animales
		ArrayList<Animal> animalist = new ArrayList<>();
		animalist.add(new Leon());
		animalist.add(new Perro());
		animalist.add(new Lobo());
		animalist.add(new Gato());

		for (int i = 0; i < animalist.size(); i++) {
			System.out.println(animalist.get(i).getAlimentos());

		}
		System.out.println("///////");
		for (int i = 0; i < animalist.size(); i++) {
			System.out.println(animalist.get(i).getHabitat());

		}

		System.out.println("///////");
		for (int i = 0; i < animalist.size(); i++) {
			System.out.println(animalist.get(i).getNombreCientifico());

		}

		System.out.println("///////");
		for (int i = 0; i < animalist.size(); i++) {
			System.out.println(animalist.get(i).getSonido());

		}
	}

}
