import org.matheclipse.core.eval.ExprEvaluator;

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
     * The time that is used to calculate the position, speed, and acceleration
     */
    private int time;
    
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
    public Particle(String positionEquation, int time) {
        this.positionEquation = positionEquation;
        calculateSpeedEquation();
        calculateAccelerationEquation();

        this.time = time;

        this.calculatePosition(time);
        this.calculateSpeed(time);
        this.calculateAcceleration(time);
    }

    /**
     * Calculate the speed equation by deriving the position equation
     */
    private void calculateSpeedEquation() {
        this.speedEquation = evaluator.eval("D[" + this.positionEquation + ", t]").toString();
    }

    /**
     * Calculate the acceleration equation by deriving the speed equation
     */
    private void calculateAccelerationEquation() {
        this.accelerationEquation = evaluator.eval("D[" + this.speedEquation + ", t]").toString();
    }

    /**
     * Calculate the position for the given time
     */
    public void calculatePosition(int time) {
        this.position = Double.valueOf(evaluator.eval(this.positionEquation.replace("t", "(" + time + ")")).toString());
    }

    /**
     * Calculate the speed for the given time
     */
    public void calculateSpeed(int time) {
        this.speed = Double.valueOf(evaluator.eval(this.speedEquation.replace("t", "(" + time + ")")).toString());
    }

    /**
     * Calculate the acceleration for the given time
     */
    public void calculateAcceleration(int time) {
        this.acceleration = Double.valueOf(evaluator.eval(this.accelerationEquation.replace("t", "(" + time + ")")).toString());
    }

    /**
     * Get the current time of the motion
     * 
     * @return the time of the motion
     */
    public int getTime() {
        return this.time;
    }
    
    /**
     * Set the time of the motion and calculate the position, speed, and acceleration
     * 
     * @param time - The time of the motion
     */
    public void setTime(int time) {
        this.time = time;

        this.calculatePosition(time);
        this.calculateSpeed(time);
        this.calculateAcceleration(time);
    }

    /**
     * Get the current position of the particle
     */
    public double getPosition() {
        return this.position;
    }

    /**
     * Get the current speed of the particle
     */
    public double getSpeed() {
        return this.speed;
    }

    /**
     * Get the current acceleration of the particle
     */
    public double getAcceleration() {
        return this.acceleration;
    }

    /**
     * Get the position equation of the particle
     */
    public String getPositionEquation() {
        return this.positionEquation;
    }

    /**
     * Get the speed equation of the particle
     */
    public String getSpeedEquation() {
        return this.speedEquation;
    }

    /**
     * Get the acceleration equation of the particle
     */
    public String getAccelerationEquation() {
        return this.accelerationEquation;
    }

    public static void main(String[] args) {

        Particle particle = new Particle("t^2 + 3*t - 1", 0);

        System.out.println("Position Equation: " + particle.getPositionEquation());
        System.out.println("Speed Equation: " + particle.getSpeedEquation());
        System.out.println("Acceleration Equation: " + particle.getAccelerationEquation());


        System.out.println("\nInitial position: " + particle.getPosition());
        System.out.println("Initial speed: " + particle.getSpeed());
        System.out.println("Initial acceleration: " + particle.getAcceleration());

        particle.setTime(5);

        System.out.println("\nPosition: " + particle.getPosition());
        System.out.println("Speed: " + particle.getSpeed());
        System.out.println("Acceleration: " + particle.getAcceleration());
    }
}
