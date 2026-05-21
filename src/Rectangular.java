class Rectangular extends Vector {
    /**
     * Genera una nueva instancia
     * 
     * @param x - Coordenada x
     * @param y - Coordenada y
     */
    public Rectangular(double x, double y) {
        super(x, y, calcularMagnitud(x, y), calcularDireccion(x, y));
    }
}
