public class App {
    public static void main(String[] args) throws Exception {
        Rectangular a = new Rectangular(30, -45);
        Rectangular b = new Rectangular(-25, -10);
        Polar c = new Polar(40, 130);
        Polar d = new Polar(30, 35);

        System.out.println("B + C = " + Vector.suma(b, c).toString());
    }
}
