public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        double height = 1.87; // метры.
        int weight = 98;  // кг.

        int Bmi = service.calculate(height, weight); // должно получиться 2

        System.out.println("Ваш индекс массы тела " + Bmi + ";");
    }
}