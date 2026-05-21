public class Vector {
    /**
     * Coordenada x
     */
    protected double x;
    /**
     * Coordenada y
     */
    protected double y;

    /**
     * Magnitud del vector
     */
    protected double magnitud;

    /**
     * Direccion/Angulo del vector
     */
    protected double direccion;

    /**
     * Genera un nuevo Vector
     * 
     * @param x         - Coordenada x
     * @param y         - Coordenada y
     * @param magnitud  - Magnitud
     * @param direccion - Direccion
     */
    public Vector(double x, double y, double magnitud, double direccion) {
        this.x = x;
        this.y = y;
        this.magnitud = magnitud;
        this.direccion = direccion;
    }

    /**
     * Suma dos vectores y retorna el Vector resultante
     * 
     * @param a - Vector A
     * @param b - Vector B
     * @return Vector resultante
     */
    public static Vector suma(Vector a, Vector b) {
        double x = a.getX() + b.getX();
        double y = a.getY() + b.getY();
        double magnitud = calcularMagnitud(x, y);
        double direccion = calcularDireccion(x, y);

        return new Vector(x, y, magnitud, direccion);
    }

    /**
     * Resta el vector 'b' al vector 'a' y retorna el Vector resultante
     * 
     * @param a - Vector A
     * @param b - Vector B
     * @return Vector resultante
     */
    public static Vector resta(Vector a, Vector b) {
        double x = a.getX() - b.getX();
        double y = a.getY() - b.getY();
        double magnitud = calcularMagnitud(x, y);
        double direccion = calcularDireccion(x, y);

        return new Vector(x, y, magnitud, direccion);
    }

    /**
     * Calcular la magnitud a partir de las coordenadas x e y
     * 
     * @param x - Coordenada x
     * @param y - Coordenada y
     * @return Magnitud
     */
    protected static double calcularMagnitud(double x, double y) {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    /**
     * Calcular la direccion a partir de las coordenadas x e y
     * 
     * @param x - Coordenada x
     * @param y - Coordenada y
     * @return Direccion
     */
    protected static double calcularDireccion(double x, double y) {
        return
             // vector en el primer cuadrante (+x, +y)
            (x >= 0 && y >= 0) ? Math.toDegrees(Math.atan(y / x))

            // vector en el segundo cuadrante (-x, +y)
            : (x < 0 && y >= 0) ? 180 + Math.toDegrees(Math.atan(y / x))

            // vector en el tercer cuadrante (-x, -y)
            : (x < 0 && y < 0) ? 180 + Math.toDegrees(Math.atan(y / x))

            // vector en el cuarto cuadrante (+x, -y)
            : 360 + Math.toDegrees(Math.atan(y / x));
    }

    /**
     * Calcular la coordenada x a partir de la magnitud y la direccion
     * 
     * @param magnitud  - Magnitud
     * @param direccion - Direccion
     * @return Coordenada x
     */
    protected static double calcularX(double magnitud, double direccion) {
        return magnitud * Math.cos(Math.toRadians(direccion));
    }

    /**
     * Calcular la coordenada y a partir de la magnitud y la direccion
     * 
     * @param magnitud  - Magnitud
     * @param direccion - Direccion
     * @return Coordenada y
     */
    protected static double calcularY(double magnitud, double direccion) {
        return magnitud * Math.sin(Math.toRadians(direccion));
    }

    /**
     * Retorna la coordenada 'x' actual
     */
    public double getX() {
        return x;
    }

    /**
     * Actualiza la coordenada 'x' y recalcula la magnitud y direccion
     * 
     * @param x - Nueva coordenada x
     */
    public void setX(double x) {
        this.x = x;

        // Recalcular magnitud
        this.magnitud = calcularMagnitud(this.x, this.y);

        // Recalcular direccion
        this.direccion = calcularDireccion(this.x, this.y);
    }

    /**
     * Retorna la coordenada 'y' actual
     */
    public double getY() {
        return y;
    }

    /**
     * Actualiza la coordenada 'y' y recalcula la magnitud y direccion
     * 
     * @param y - Nueva coordenada y
     */
    public void setY(double y) {
        this.y = y;

        // Recalcular magnitud
        this.magnitud = calcularMagnitud(this.x, this.y);

        // Recalcular direccion
        this.direccion = calcularDireccion(this.x, this.y);
    }

    /**
     * Retorna la magnitud del vector
     */
    public double getMagnitud() {
        return magnitud;
    }

    /**
     * Actualiza la magnitud y recalcula las coordenadas 'x' y 'y'
     * 
     * @param magnitud - Nueva magnitud del vector
     */
    public void setMagnitud(double magnitud) {
        this.magnitud = magnitud;

        // Recalcular coordenadas 'x' y 'y'
        this.x = calcularX(this.magnitud, this.direccion);
        this.y = calcularY(this.magnitud, this.direccion);
    }

    /**
     * Retorna la direccion del vector
     */
    public double getDireccion() {
        return direccion;
    }

    /**
     * Actualiza la direccion y recalcula las coordenadas 'x' y 'y'
     * 
     * @param direccion - Nueva direccion del vector
     */
    public void setDireccion(double direccion) {
        this.direccion = direccion;

        // Recalcular coordenadas 'x' y 'y'
        this.x = calcularX(this.magnitud, this.direccion);
        this.y = calcularY(this.magnitud, this.direccion);
    }

    /**
     * Retorna una representacion en formato string del vector
     */
    @Override
    public String toString() {
        return "Rectangular [x=" + x + ", y=" + y + ", magnitud=" + magnitud + ", direccion=" + direccion + "]";
    }
}
