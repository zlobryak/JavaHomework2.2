public class Main {
    public static void main(String[] args) {

        int balance = 100; //  Начальный баланс
        int cacheInn = 1001; // Входящаяя сумма
        int cacheBonus = 0; //  Сколько будет начисленно бонусов
        int treshold = 1000; // Граничное значение минимаьной суммы для начилсения бонусов
        int bonusFactor = 100; // За сколько рублей начисляется 1 рубль бонуса

        if (cacheInn > treshold) {
            cacheBonus = cacheInn / bonusFactor;
        }
        balance = balance + cacheInn + cacheBonus;

        System.out.println("Баланс: " + balance);
        System.out.println("Бонус: " + cacheBonus);
    }
}