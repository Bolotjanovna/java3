public class BmiService {
    public long calculate(double weight, double height) {

        return (int) (weight / height / height);
    }
}
