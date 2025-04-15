package ViajeB;

public class ViajeElectrico extends TipoDeViaje{
    public double distancia;
    public int cant_estaciones;

    public ViajeElectrico(double distancia,int cant_estaciones){

        this.distancia = distancia;
        this.cant_estaciones = cant_estaciones;

    }
    @Override
    public Double tiempoDemora(){
        return (distancia * cant_estaciones) / 2;

    }
}