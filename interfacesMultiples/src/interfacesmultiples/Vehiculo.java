package interfacesmultiples;

public abstract class Vehiculo{
    public int Revoluciones=0;
    protected int velocidadActual;
    protected int velocidadMaxima;
    public Vehiculo(int velocidadActual, int velocidadMaxima) {
        this.velocidadActual = velocidadActual;
        this.velocidadMaxima = velocidadMaxima;
    }
    public void imprimir(){
        System.out.println("Vehiculo [Revoluciones=" + Revoluciones + ", velocidadActual=" + velocidadActual + ", velocidadMaxima="
                + velocidadMaxima + "]");

    }

    public abstract int acelerar();
    public abstract int frenar();
    
}