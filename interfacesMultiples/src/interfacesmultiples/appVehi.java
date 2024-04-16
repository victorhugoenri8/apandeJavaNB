package interfacesmultiples;

public class appVehi {
    public static void main(String[] args) {
        Terrestra lana = new Terrestra(33, 22);
         Acuatico belen = new Acuatico(33, 22);
         belen.RecomendarVehiculo();
         

        lana.RevolucionesMotor(44, 44);
        
        lana.imprimir();
	///aereo
	vehiculoAerea avion =new vehiculoAerea();
	avion.apagar();
	
    }
}
