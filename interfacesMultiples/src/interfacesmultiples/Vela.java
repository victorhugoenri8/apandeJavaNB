package interfacesmultiples;
public interface Vela {
    default void RecomendarVehiculo(){
        System.out.println("es muy recomendado.");
    }
}
