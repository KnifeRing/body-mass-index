public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight, height;
        weight = 30; // вес в кг
        height = 1.5; // рост в метрах
        String result = null;
        result = BmiService.calculate(weight, height);
        System.out.println(result);
    }
}
