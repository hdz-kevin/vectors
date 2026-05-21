public class Polar extends Vector {
    /**
     * Genera una nueva instancia
     * 
     * @param magnitud  - Magnitud del vector
     * @param direccion - Direccion del vector
     */
    public Polar(double magnitud, double direccion) {
        super(calcularX(magnitud, direccion), calcularY(magnitud, direccion), magnitud, direccion);
    }
}
