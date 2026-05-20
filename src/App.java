public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n----------- VECTOR RECTANGULAR -----------");

        // Vector Rectangular (4, 3)
        Rectangular rectangular = new Rectangular(4, 3);
        System.out.println(rectangular.toString());
        
        // Modificar Coordenadas: (4, 4)
        rectangular.setY(4);
        System.out.println(rectangular.toString());

        // Modificar Direccion 180 grados
        rectangular.setDireccion(180);
        System.out.println(rectangular.toString());

        // Modificar Magnitud 10
        rectangular.setMagnitud(10);
        System.out.println(rectangular.toString());


        System.out.println("\n----------- VECTOR POLAR -----------");

        // Vector Polar (5, 36.86989764584402)
        Polar polar = new Polar(5, 36.86989764584402);
        System.out.println(polar.toString());

        // Modificar direccion 45 grados
        polar.setDireccion(45);
        System.out.println(polar.toString());

        // Modificar Direccion 180 grados
        polar.setDireccion(180);
        System.out.println(polar.toString());

        // Modificar Magnitud 10
        polar.setMagnitud(10);
        System.out.println(polar.toString());
    }
}
