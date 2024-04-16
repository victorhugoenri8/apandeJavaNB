package abstract2;

public class mainAbstrac2 {

	public static void main(String[] args) {
	Equipo uno = new Equipo("perros", "mexico");
	Velocista lana = new Velocista(12.3, 33.2, 1243, "lana");
	Escalador belen = new Escalador(12.4, 44.2, 23,"belen");
	belen.setTiempoAcumulado(67);
	
	lana.setTiempoAcumulado(35);
	

	uno.anadirCiclistas(new Escalador(12.3, 3.2, 34, "daniel fernandez"));
	uno.anadirCiclistas(lana);
	uno.anadirCiclistas(belen);
	uno.calcularTiempoTotal();
	
	uno.listarEquipo();
	}
	
}
