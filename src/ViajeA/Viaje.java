package ViajeA;

public abstract class Viaje {
    public String origen;
    public String destino;
    public Double distancia;
    public int cant_vagones;
    public int cant_estaciones;
    public int cant_max_pasajeros;

    // constructor

    public Viaje(String origen, String destino, Double distancia, int cant_vagones, int cant_estaciones, int cant_max_pasajeros){
        this.origen = origen;
        this.destino = destino;
        this.distancia = distancia;
        this.cant_estaciones = cant_estaciones;
        this.cant_vagones = cant_vagones;
        this.cant_max_pasajeros = cant_max_pasajeros;

    }

    public abstract Double tiempoDemora();

}


