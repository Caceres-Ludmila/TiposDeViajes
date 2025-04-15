package ViajeB;

public class ViajeDiesel extends TipoDeViaje {
    public double distancia;
    public int cant_vagones;
    public int cant_max_pasajeros;
    public int cant_estaciones;

    public ViajeDiesel(double distancia, int cant_vagones, int cant_max_pasajeros, int cant_estaciones){
        this.distancia = distancia;
        this.cant_vagones = cant_vagones;
        this.cant_max_pasajeros = cant_max_pasajeros;
        this.cant_estaciones = cant_estaciones;
    }

    @Override
    public Double tiempoDemora(){
        return (distancia*cant_vagones)/2 + (cant_max_pasajeros + cant_estaciones)/10 ;
    }
}