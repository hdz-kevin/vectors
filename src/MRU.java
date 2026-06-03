/**
 * MRU -> (Movimiento Rectilíneo Uniforme)
 */
public class MRU {
    private double initialPosition;
    private Particle particle;

    public MRU(double speed, double initialPosition) {
        this.initialPosition = initialPosition;
        String positionEquation = initialPosition + " + " + speed + "*t";
        this.particle = new Particle(positionEquation, 0);
    }

    public void evalTime(int time) {
        this.particle.setTime(time);
    }

    public double getSpeed() {
        return this.particle.getSpeed();
    }

    public double getInitialPosition() {
        return this.initialPosition;
    }

    public String getPositionEquation() {
        return this.particle.getPositionEquation();
    }

    public double getPosition() {
        return this.particle.getPosition();
    }
    
    public static void main(String[] args) {
        
        MRU mru = new MRU(2, 3);

        System.out.println("Position Equation: " + mru.getPositionEquation());
        System.out.println("Position: " + mru.getPosition());
        mru.evalTime(2);
        System.out.println("Position: " + mru.getPosition());
        
    }
}
