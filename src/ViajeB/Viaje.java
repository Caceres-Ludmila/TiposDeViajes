package ViajeB;

public class Viaje {
    public String destino;
    public String origen;

    public double distancia;
    public int cant_vagones;
    public int cant_estaciones;
    public int cant_max_pasajeros;

    public TipoDeViaje tipoDeViaje;  //utilizado para usar su metodo de calcular demora
    public String tipoviajeString; //guardo el

    //CONSTRUCTOR
    public Viaje(String tipo, String destino, String origen, double distancia, int vagones,
                 int estaciones, int pasajeros) {

        this.tipoviajeString = tipo;
        this.destino = destino;
        this.origen = origen;
        this.distancia = distancia;
        this.cant_vagones = vagones;
        this.cant_estaciones = estaciones;
        this.cant_max_pasajeros = pasajeros;

        switch (tipo.toLowerCase()) {
            case "diesel":
                this.tipoDeViaje = new ViajeDiesel(distancia, vagones, pasajeros, estaciones);
                break;
            case "electrico":
                this.tipoDeViaje = new ViajeElectrico(distancia, estaciones);
                break;
            case "altavelocidad":
                this.tipoDeViaje = new ViajeAltaVelocidad(distancia);
                break;
            default:
                throw new IllegalArgumentException("Tipo de viaje no válido: " + tipo);
        }
    }

    //Metodo para calcular la demora según el tipo de viaje

    public double calcularDemora() {
        return this.tipoDeViaje.tiempoDemora();
    }

    public String toString() {
        return String.format("Tipo de viaje: %s, " +
                        "Destino: %s, Origen: %s, " +
                        "Distancia: %.2f km, " +
                        "Vagones: %d, " +
                        "Estaciones: %d, " +
                        "Pasajeros: %d",
                tipoviajeString, destino, origen, distancia, cant_vagones, cant_estaciones, cant_max_pasajeros);
    }
}