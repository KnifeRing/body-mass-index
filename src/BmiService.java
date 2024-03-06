public class BmiService {
    // Проверка ИМТ по категориям
    public int calculate(double weight, double height) {
        double bmi = weight / Math.pow(height, 2); // масса на рост в квадрате
        bmi = (double) ((int) (bmi * 100)) / 100; // округление до двух чисел после запятой

        // получение ответа по категории ИМТ
        if (bmi <= 18.5) {
            if (bmi <= 16) {
                System.out.println("Ваш Индекс Массы Тела равен " + (int) bmi + ". У вас выраженный дефицит массы тела.");
            } else {
                System.out.println("Ваш Индекс Массы Тела равен " + (int) bmi + ". У вас недостаточный (дефицит) массы тела");
            }
        } else if (bmi > 18.5 & bmi <= 30) {
            if (bmi <= 25) {
                System.out.println("Ваш Индекс Массы Тела равен " + (int) bmi + ". Ваш вес в норме.");
            } else {
                System.out.println("Ваш Индекс Массы Тела равен " + (int) bmi + ". У вас избыточная масса тела (предожирение).");
            }
        } else {
            if (bmi <= 35) {
                System.out.println("Ваш Индекс Массы Тела равен " + (int) bmi + ". У вас ожирение 1 степени.");
            } else if (bmi <= 40) {
                System.out.println("Ваш Индекс Массы Тела равен " + (int) bmi + ". У вас ожирение 2 степени.");
            } else {
                System.out.println("Ваш Индекс Массы Тела равен " + (int) bmi + ". У вас ожирение 3 степени.");
            }
        }
        return 0;
    }
}