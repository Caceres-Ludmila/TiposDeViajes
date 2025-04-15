package ViajeA;

public class Main {
    public static void main(String[] args){
        ViajeDiesel viajeD = new ViajeDiesel("Miguelete","Puerreydon", 1.9, 10, 1,500 );
        System.out.println("Tiempo de demora en viaje Diesel " + viajeD.tiempoDemora() + " minutos.");

        ViajeElectrico viajeE = new ViajeElectrico("Miguelete","Puerreydon", 1.9, 10, 1,500 );
        System.out.println("Tiempo de demora en viaje Electrico " + viajeE.tiempoDemora() + " minutos.");

        ViajeAltaVelocidad viajeA = new ViajeAltaVelocidad("Miguelete","Puerreydon", 1.9, 10, 1,500 );
        System.out.println("Tiempo de demora en viaje Alta velocidad " + viajeA.tiempoDemora() + " minutos.");
    }
}