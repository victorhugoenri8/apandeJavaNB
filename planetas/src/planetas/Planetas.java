package planetas;
public class Planetas {

	public static void main(String[] args) {
		Planeta luna = new Planeta("luna",Tipos.ENANO,true,2,123,2333,123.44,445.44);
		Planeta dos = new Planeta("luna",Tipos.GASEOSO,false,4,2,44,23.4, 55.4);
		
		luna.imprimir();
		dos.imprimir();

	}
	
}
