package interfacesmultiples;

public interface Motor {
    default int RevolucionesMotor(int fuerza, int radio){
        return fuerza * radio;
    }
}
