public class HomeWorkApp1 {

    public static void main(String[] args) {
        //Практическая 1
        //printThereWorlds();
        //sheckSumSign();
        //printColor();
        //compareNumbers();

        // практическая №2
        theSummaOfTwoNumbers();
        comparisonOfNumbers();
        comparisonOfNumbers1();
        stringandnamber("word:");
        leapyear();
    }



    //упражнение 2
    public static void theSummaOfTwoNumbers() {
        int a = 21;
        int b = 10;
        int f = a + b;
        if ( f >= 10 && f <= 20 ) {
            System.out.println( "True"); }
        else if ( f < 10 ){ System.out.println( "False"); }
        else if ( f > 20 ){ System.out.println( "False"); } }


        // упражнение 2
    public static void comparisonOfNumbers() {
    int a = -1;
    if ( a >= 0 ) {System.out.println("Число положительно");}
    else if ( a < 0 ) {System.out.println("Число отрицательно");} }

    // Упражнение 3
    public static void comparisonOfNumbers1() {
        int a = 10;
        if ( a >= 0 ) { System.out.println("True"); }
        else if ( a < 0 ) {System.out.println("False");} }

    // Упражнение 4
    public static void stringandnamber(String word){
        int counter = 1;
        while ( counter < 4 ) {System.out.println( word + counter ++);} }

        // упражнение 5 в процессе проверка
    public static void leapyear() {
        for ( int a = 1000; a < 1010; a++ ) {
         if (!( a  % 4 == 0) || (( a  % 100 == 0) && !( a  % 400 == 0)))
             System.out.println( a  + " не високосный");
                  else System.out.println( a  + " високосный");
        }
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

