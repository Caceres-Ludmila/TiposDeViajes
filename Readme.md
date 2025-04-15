Dentro de nuestro código encotramos los siguientes tipos de polimorfismos:

Polimorfismo de inclusión, dentro de la clase Viaje, del paquete B

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


Polimorfismo de Coerción, dentro del paquete Viaje B, en cada una de las subclases de Tipo de Viaje

Por ejemplo: modificación implícita de los valores int ingresados a double.

    public Double tiempoDemora(){
        return (distancia*cant_vagones)/2 + (cant_max_pasajeros + cant_estaciones)/10 ;
    }