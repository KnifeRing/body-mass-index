public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight, height;
        weight = 98; // вес в кг
        height = 1.87; // рост в метра
        int result = service.calculate(weight, height);
        System.out.println(result);
    }
}