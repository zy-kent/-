public class Main {
    public static void main(String[] args) {
        System.out.println(maina(0.1,0.2));
    }
    public static String maina(double x, double y) {
        return (0 < x && x < 1) && (0 < y && y < 1) ? "true" : "false";
    }
}
