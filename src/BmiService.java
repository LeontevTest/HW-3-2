public class BmiService {

    public int calculate(double height, int weight) {


        if (height < 0 || weight < 0) {
            height = 0;
        }

        return (int) (weight / (height * height));

    }
}