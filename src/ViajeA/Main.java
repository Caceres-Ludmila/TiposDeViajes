package ViajeA;

public class Main {
    public static void main(String[] args){
        ViajeDiesel viajeD = new ViajeDiesel("Miguelete","Puerreydon", 1.9, 10, 1,500 );
        System.out.println("Tiempo de demora en viaje Diesel " + viajeD.tiempoDemora() + " minutos.");
    }
}