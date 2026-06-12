import Lalo.Mrua;

public class Examen {

    public static void main(String[] args) {

        System.err.println("============= Exercise 1 =============");

        Polar a = new Polar(35, 120);
        Polar b = new Polar(40, 220);

        Vector sum = Vector.suma(a, b);
        System.out.println(sum);

        System.err.println("\n============= Exercise 2 =============");
        Particle particle = new Particle("((2*t^3)/3) +((t^2)/2)-6*t+5", 1.88);
        System.out.println("Ecuacion Position: " + particle.getPositionEquation());
        System.out.println("Ecuacion Velocidad: " + particle.getSpeedEquation());
        System.out.println("Ecuacion Aceleracion: " + particle.getAccelerationEquation());
        System.out.println("Time: " + particle.getTime());
        System.out.println("====================================");
        System.out.println("Position: " + particle.getPosition());
        System.out.println("Speed: " + particle.getSpeed());
        System.out.println("Acceleration: " + particle.getAcceleration());

        System.err.println("\n============= Exercise 2 =============");
        Mrua mrua = new Mrua(0, 0, 9.81);
        mrua.evaluarTiempo(3);

        System.out.println("Altura = " + mrua.getPosicion());
        System.out.println("Velocidad con la que impacta = " + mrua.getVelocidad());
    }

}
