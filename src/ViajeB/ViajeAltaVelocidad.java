package ViajeB;

public class ViajeAltaVelocidad extends TipoDeViaje{
    public double distancia;

    public ViajeAltaVelocidad(double distancia){
        this.distancia = distancia;
    }
    @Override
    public Double tiempoDemora() {
        return (distancia / 10);
    }
}

