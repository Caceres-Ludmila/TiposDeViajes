package ViajeB;
public class MainB {
    public static void main(String[] args){
        Viaje viajeDiesel = new Viaje("Diesel","Miguelete","Puerreydon", 1.9, 10, 1,500 );
        Viaje viajeElectrico = new Viaje("Electrico","Miguelete","Puerreydon", 1.9, 10, 1,500);
        Viaje viajeAltaVelocidad = new Viaje("AltaVelocidad","Miguelete","Puerreydon", 1.9, 10, 1,500);

        System.out.println("  ");
        System.out.println(" Info del viaje \uD83D\uDE82 " );
        System.out.println(" " + viajeDiesel);
        System.out.println(" Tipo de viaje  --> " + viajeDiesel.tipoviajeString);
        System.out.println(" Tiempo de demora | " + viajeDiesel.calcularDemora() + " | minutos.");

        System.out.println("  ");
        System.out.println(" Info del viaje \uD83D\uDE86 " );
        System.out.println(" " + viajeElectrico);
        System.out.println(" Tipo de viaje  --> " + viajeElectrico.tipoviajeString);
        System.out.println(" Tiempo de demora | " + viajeElectrico.calcularDemora() + " | minutos.");

        System.out.println("  ");
        System.out.println(" Info del viaje  \uD83D\uDE84" );
        System.out.println(" " + viajeAltaVelocidad);
        System.out.println(" Tipo de viaje  --> " + viajeAltaVelocidad.tipoviajeString);
        System.out.println(" Tiempo de demora | " + viajeAltaVelocidad.calcularDemora() + " | minutos.");
        System.out.println("  ");

    }
}
/* ejecuciÃ³n en terminal
javac src/ViajeB/*.java
(o solo este )  java ViajeB.MainB
 */
