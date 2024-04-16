package mamiferos;

public class Ornitorrinco extends Mamiferos implements Oviparo {

	public Ornitorrinco() {
	}

	@Override
	public void amamantarCrias() {
		System.out.println("los Ornitorrincos amamantan a sus crias.");
	}

	@Override
	public void ponerHuevos() {
		System.out.println("los ornitorrincos ponen huevos");
	}

}
