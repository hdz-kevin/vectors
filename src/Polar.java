public class Polar {
    /**
     * Magnitud del vector
     */
    private double magnitud;
    /**
     * Direccion del vector
     */
    private double direccion;

    /**
     * Coordenada x
     */
    private double x;

    /**
     * Coordenada y
     */
    private double y;

    /**
     * Genera una nueva instancia
     * 
     * @param magnitud  - Magnitud del vector
     * @param direccion - Direccion del vector
     */
    public Polar(double magnitud, double direccion) {
        this.magnitud = magnitud;
        this.direccion = direccion;

        // Calcular coordenadas x e y
        this.x = magnitud * Math.cos(Math.toRadians(direccion));
        this.y = magnitud * Math.sin(Math.toRadians(direccion));
    }

    /**
     * Retorna la 'magnitud' del vector
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
        this.x = magnitud * Math.cos(Math.toRadians(direccion));
        this.y = magnitud * Math.sin(Math.toRadians(direccion));
    }

    /**
     * Retorna la direccion del vector
     * 
     * @return double
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
        this.x = magnitud * Math.cos(Math.toRadians(direccion));
        this.y = magnitud * Math.sin(Math.toRadians(direccion));
    }

    /**
     * Retorna la coordenada 'x' del vector
     * 
     * @return double
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

        // Calcular magnitud
        this.magnitud = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

        // vector en el primer cuadrante (+x, +y)
        if (x >= 0 && y >= 0)
            this.direccion = Math.toDegrees(Math.atan(y / x));

        // vector en el segundo cuadrante (-x, +y)
        else if (x < 0 && y >= 0)
            this.direccion = 180 + Math.toDegrees(Math.atan(y / x));

        // vector en el tercer cuadrante (-x, -y)
        else if (x < 0 && y < 0)
            this.direccion = 180 + Math.toDegrees(Math.atan(y / x));

        // vector en el cuarto cuadrante (+x, -y)
        else if (x >= 0 && y < 0)
            this.direccion = 360 + Math.toDegrees(Math.atan(y / x));
    }

    /**
     * Retorna la coordenada 'y' del vector
     * 
     * @return double
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

        // Calcular magnitud
        this.magnitud = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

        // vector en el primer cuadrante (+x, +y)
        if (x >= 0 && y >= 0)
            this.direccion = Math.toDegrees(Math.atan(y / x));

        // vector en el segundo cuadrante (-x, +y)
        else if (x < 0 && y >= 0)
            this.direccion = 180 + Math.toDegrees(Math.atan(y / x));

        // vector en el tercer cuadrante (-x, -y)
        else if (x < 0 && y < 0)
            this.direccion = 180 + Math.toDegrees(Math.atan(y / x));

        // vector en el cuarto cuadrante (+x, -y)
        else if (x >= 0 && y < 0)
            this.direccion = 360 + Math.toDegrees(Math.atan(y / x));
    }

    @Override
    public String toString() {
        return "Polar [magnitud=" + magnitud + ", direccion=" + direccion + ", x=" + x + ", y=" + y + "]";
    }
}
