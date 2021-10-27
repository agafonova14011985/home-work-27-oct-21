public class HomeWorkApp1 {
    //job1
    //Доброго Вечера
    //комп 7 винда 32 рызрядный еле установила программы,
    // и в итоге если создаешь пакет, то в пакете не может создаться класс.


    public static void main(String[] args) {
        printThereWorlds();
        sheckSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThereWorlds() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }


    public static void sheckSumSign() {
        int a = 10;
        int b = -11;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительна");
        } else {
            System.out.println("Сумма отрицательна");
        }
    }


    public static void printColor() {
        int value = 101;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 0 && value < 10) {
            System.out.println("Желтый");
        }
        else {
            System.out.println("Зеленый");
        }
    }


    public static void compareNumbers() {
        int a = 1;
        int b = 2;
        if (a >= b) {
            System.out.println("a > или = b");
        }
        if (a < b) {
            System.out.println("a < b");
        }
    }
}

