/** 
 * Represents a movement with constant acceleration
 */
public class MRUA {
    /** The initial position of the particle */
    private double initialPosition;
    /** The initial speed of the particle */
    private double initialSpeed;
    /** The particle that is moving */
    private Particle particle;

    /** 
     * Creates a new MRUA instance
     * 
     * @param initialPosition The initial position of the particle
     * @param initialSpeed The initial speed of the particle
     * @param acceleration The acceleration of the particle
     */
    public MRUA(double initialPosition, double initialSpeed, double acceleration) {
        this.initialPosition = initialPosition;
        this.initialSpeed = initialSpeed;
        String positionEquation = initialPosition + " + " + initialSpeed + "*t + " + (acceleration / 2) + "*t^2";
        this.particle = new Particle(positionEquation, 0);
    }

    /**
     * Evaluates the position and speed of the particle at a given time
     * 
     * @param time The time to evaluate
     */
    public void evalTime(int time) {
        this.particle.setTime(time);
    }

    /**
     * Gets the initial position of the particle
     */
    public double getInitialPosition() {
        return this.initialPosition;
    }

    /**
     * Gets the initial speed of the particle
     */
    public double getInitialSpeed() {
        return this.initialSpeed;
    }

    /**
     * Gets the current position of the particle
     */
    public double getPosition() {
        return this.particle.getPosition();
    }

    /**
     * Gets the current speed of the particle
     */
    public double getSpeed() {
        return this.particle.getSpeed();
    }

    /**
     * Gets the current acceleration of the particle
     */
    public double getAcceleration() {
        return this.particle.getAcceleration();
    }

    /**
     * Returns the position equation of the particle
     */
    public String getPositionEquation() {
        return this.particle.getPositionEquation();
    }

    /**
     * Returns the speed equation of the particle
     */
    public String getSpeedEquation() {
        return this.particle.getSpeedEquation();
    }

    /**
     * Prints the equations and variables of the particle at a given time
     * 
     * @param time The time to evaluate
     */
    public void printVariables(int time) {
        printEquations();
        System.out.println("Position at the second " + time + ": " + this.getPosition() + " m");
        System.out.println("Speed at the second " + time + ": " + this.getSpeed() + " m/s");
        System.out.println("Acceleration at the second " + time + ": " + this.getAcceleration() + " m/s^2");
    }

    /**
     * Prints the equations of the particle
     */
    public void printEquations() {
        System.out.println("Position Equation: " + getPositionEquation());
        System.out.println("Speed Equation: " + getSpeedEquation());
    }

    public static void main(String[] args) {
        MRUA mrua = new MRUA(3, 2, 2);
        
        int time = 3;
        mrua.evalTime(time);
        mrua.printVariables(time);
    }
}
