public class MRUA {
    private double initialPosition;
    private double initialSpeed;
    private Particle particle;

    public MRUA(double initialPosition, double initialSpeed, double acceleration) {
        this.initialPosition = initialPosition;
        this.initialSpeed = initialSpeed;
        String positionEquation = initialPosition + " + " + initialSpeed + "*t + " + (acceleration / 2) + "*t^2";
        this.particle = new Particle(positionEquation, 0);
    }

    public void evalTime(int time) {
        this.particle.setTime(time);
    }

    public double getInitialPosition() {
        return this.initialPosition;
    }

    public double getInitialSpeed() {
        return this.initialSpeed;
    }

    public double getPosition() {
        return this.particle.getPosition();
    }

    public double getSpeed() {
        return this.particle.getSpeed();
    }

    public double getAcceleration() {
        return this.particle.getAcceleration();
    }

    public String getPositionEquation() {
        return this.particle.getPositionEquation();
    }

    public String getSpeedEquation() {
        return this.particle.getSpeedEquation();
    }
}
