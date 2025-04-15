package ViajeA;

public class ViajeAltaVelocidad extends Viaje {

    public ViajeAltaVelocidad(String origen, String destino, Double distancia, int cant_vagones, int cant_estaciones, int cant_max_pasajeros){
        super(origen, destino, distancia, cant_vagones, cant_estaciones, cant_max_pasajeros);

    }
    // Metoodo sobreescrito
    @Override

    public Double tiempoDemora(){

        return distancia/10 ;
    }

}