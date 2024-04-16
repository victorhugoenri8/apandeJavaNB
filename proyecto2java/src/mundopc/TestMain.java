package mundopc;

import com.gm.mundopc.*;


public class TestMain {


	public static void main(String[] args) {
		Monitor hhh = new Monitor("hola", 12.2 );
		
		Raton raton = new Raton ("usb","dell");
		Teclado teclado = new Teclado ("fisica","hp");
		computadora uno = new computadora("elias", hhh, teclado, raton);
		Orden Lana = new Orden (1);
		Lana.agregarComputadora(uno);
		Lana.mostrarOrder();
		
	}
}
