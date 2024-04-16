package interfacesmultiples;

public class Acuatico extends Vehiculo implements Motor, Vela{

    public Acuatico(int velocidadActual, int velocidadMaxima) {
        super(velocidadActual, velocidadMaxima);
        //TODO Auto-generated constructor stub
    }

    
    @Override
    public void RecomendarVehiculo() {
        // TODO Auto-generated method stub
        Vela.super.RecomendarVehiculo();
    }


    @Override
    public int RevolucionesMotor(int fuerza, int radio) {
        return this.Revoluciones=Motor.super.RevolucionesMotor(fuerza, radio);
    }

    @Override
    public int acelerar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'acelerar'");
    }

    @Override
    public int frenar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'frenar'");
    }
    
}
