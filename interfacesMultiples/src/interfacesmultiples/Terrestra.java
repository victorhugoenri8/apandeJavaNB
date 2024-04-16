package interfacesmultiples;

public class Terrestra extends Vehiculo implements Motor{
   


    public Terrestra(int velocidadMaxima, int velocidadActual){
        super(velocidadActual, velocidadMaxima);
    }
    @Override
    public int RevolucionesMotor(int fuerza, int radio) {
        // TODO Auto-generated method stub
        return this.Revoluciones=Motor.super.RevolucionesMotor(fuerza, radio);
    }

    

    @Override
    public int acelerar() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int frenar() {
        // TODO Auto-generated method stub
        return 0;
    }
    
}
