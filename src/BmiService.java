public class BmiService {
    public int calculate (int kg, double m) {
        double result = kg / m / m;
        return (int) result;

    }
}
