class Rectangular {
    /**
     * Coordenada x
     */
    private double x;
    /**
     * Coordenada y
     */
    private double y;

    /**
     * Magnitud del vector
     */
    private double magnitud;

    /**
     * Direccion/Angulo del vector
     */
    private double direccion;

    /**
     * Genera una nueva instancia
     * 
     * @param x - Coordenada x
     * @param y - Coordenada y
     */
    public Rectangular(double x, double y) {
        this.x = x;
        this.y = y;

        // Calcular magnitud
        this.magnitud = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

        /** Calcular angulo/direccion */
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
        this.x = magnitud * Math.cos(Math.toRadians(direccion));
        this.y = magnitud * Math.sin(Math.toRadians(direccion));
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
        this.x = magnitud * Math.cos(Math.toRadians(direccion));
        this.y = magnitud * Math.sin(Math.toRadians(direccion));
    }

    /**
     * Retorna una representacion en formato string del vector
     */
    @Override
    public String toString() {
        return "Rectangular [x=" + x + ", y=" + y + ", magnitud=" + magnitud + ", direccion=" + direccion + "]";
    }
}
