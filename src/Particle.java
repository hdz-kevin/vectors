import org.matheclipse.core.eval.ExprEvaluator;


/**
 * 
 * Receive time in the constructor
 * 
 * Implement `setTime(time)` method:
 *  - Recalculate position, speed, and acceleration
 * 
 */


public class Particle {
    /**
     * Current position of the particle
     */
    private double position;
    
    /**
     * Current speed of the particle
     */
    private double speed;
    
    /**
     * Current acceleration of the particle
     */
    private double acceleration;
    
    /**
     * Equation for the position of the particle
     */
    private String positionEquation;
    
    /**
     * Equation for the speed of the particle
     */
    private String speedEquation;
    
    /**
     * Equation for the acceleration of the particle
     */
    private String accelerationEquation;

    ExprEvaluator evaluator = new ExprEvaluator();

    /**
     * Generate a new particle with the given position equation
     * 
     * @param positionEquation
     */
    public Particle(String positionEquation) {
        this.positionEquation = positionEquation;
        calculateSpeedEquation();
        calculateAccelerationEquation();

        int initialTime = 0;

        this.calculatePosition(initialTime);
        this.calculateSpeed(initialTime);
        this.calculateAcceleration(initialTime);
    }

    private void calculateSpeedEquation() {
        this.speedEquation = evaluator.eval("D[" + this.positionEquation + ", t]").toString();
    }

    private void calculateAccelerationEquation() {
        this.accelerationEquation = evaluator.eval("D[" + this.speedEquation + ", t]").toString();
    }

    public void calculatePosition(int time) {
        this.position = Double.valueOf(evaluator.eval(this.positionEquation.replace("t", "(" + time + ")")).toString());
    }

    public void calculateSpeed(int time) {
        this.speed = Double.valueOf(evaluator.eval(this.speedEquation.replace("t", "(" + time + ")")).toString());
    }

    public void calculateAcceleration(int time) {
        this.acceleration = Double.valueOf(evaluator.eval(this.accelerationEquation.replace("t", "(" + time + ")")).toString());
    }

    public double getPosition() {
        return this.position;
    }

    public double getSpeed() {
        return this.speed;
    }

    public double getAcceleration() {
        return this.acceleration;
    }

    public String getPositionEquation() {
        return this.positionEquation;
    }

    public String getSpeedEquation() {
        return this.speedEquation;
    }

    public String getAccelerationEquation() {
        return this.accelerationEquation;
    }

    public static void main(String[] args) {
        
        Particle particle = new Particle("t^2 + 3*t - 1");

        System.out.println("Position Equation: " + particle.getPositionEquation());
        System.out.println("Speed Equation: " + particle.getSpeedEquation());
        System.out.println("Acceleration Equation: " + particle.getAccelerationEquation());

        System.out.println("\nInitial position: " + particle.getPosition());
        System.out.println("Initial speed: " + particle.getSpeed());
        System.out.println("Initial acceleration: " + particle.getAcceleration());

        // particle.calculatePosition(1);
        // particle.calculateSpeed(1);
        // particle.calculateAcceleration(1);

        // System.out.println("Position at t=1: " + particle.getPosition());
        // System.out.println("Speed at t=1: " + particle.getSpeed());
        // System.out.println("Acceleration at t=1: " + particle.getAcceleration());
    }
}
