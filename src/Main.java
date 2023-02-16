public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    private static void task1() {
        System.out.println("Задача №1");
        int storage = 15000;
        int total = 0;
        int i = 0;
        while (total < 2_459_000) {
            i++;
            total = total + storage;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println();
    }

    private static void task2() {
        System.out.println("Задача №2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (int j = 10; j >= 1; j--) {
            System.out.print(j + " ");

        }
        System.out.println();
        System.out.println();
    }

    private static void task3() {
        System.out.println("Задача №3");
        int population = 12_000_000;
        int birthRate;
        int mortality;
        int i = 0;

        while (i < 10) {
            mortality = population / 1000 * 8;
            population = population - mortality;
            birthRate = population / 1000 * 7;
            population = population + birthRate;
            i++;
            System.out.println("Год " + i + ", численность населения составляет " + population);
        }
        System.out.println();
    }

    private static void task4() {
        System.out.println("Задача №4");
        double storage = 15000;
        double total = 0;
        int i = 0;

        while (total < 12_000_000) {
            i++;
            storage = storage * 1.07;
            total = total + storage;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println();

    }

    private static void task5() {
        System.out.println("Задача №5");
        double storage = 15000;
        double total = 0;
        int i = 0;

        while (total < 12_000_000) {
            i++;
            storage = storage * 1.07;
            total = total + storage;
            if (i % 6 == 0)
                System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println();
    }

    private static void task6() {
        System.out.println("Задача №6");
        double storage = 15000;
        double total = 0;
        int i = 0;
        for (; i <= 108; i++) {
            total = total * 1.07;
            total = total + storage;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
            }

        }
        System.out.println();

    }

    private static void task7() {
        System.out.println("Задача №7");

        int firstFriday = 5;
        int dayInMonth = 31;
        int i = 1;
        while ( i  <= dayInMonth) {
            i++;
            if (firstFriday == i) {
                System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет");
                firstFriday = firstFriday + 7;
            }

        }
        System.out.println();
    }
    private static void task8() {
        System.out.println("Задача №8");

        int currentYear = 2023;
        int last200Years = currentYear - 200;
        int next100Years = currentYear + 100;
        int comet = 79;
        int startYear = 0;

        for (int year = startYear; year <= next100Years; year += comet){
            if (year >= last200Years){
                System.out.println(year);
            }


        }
    }
}

