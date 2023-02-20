public class Loops {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }

    public static void task1() {
        System.out.println("task 1");

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + "  ");
        }
        System.out.println();
        System.out.println();
    }

    public static void task2() {
        System.out.println("task 2");

        for (int i = 10; i > 0; i--) {
            System.out.print(i + "  ");
        }
        System.out.println();
        System.out.println();
    }

    public static void task3() {
        System.out.println("task 3");

        for (int i = 0; i <= 17; i++) {
            if (i % 2 == 0)
            System.out.print(i + "  ");
        }
        System.out.println();
        System.out.println();
    }

    public static void task4() {
        System.out.println("task 4");

        for (int i = 10; i >= -10; i--) {
            System.out.print(i + "  ");
        }
        System.out.println();
        System.out.println();
    }

    public static void task5() {
        System.out.println("task 5");

        for (int i = 1904; i <= 2096; i += 4) {
            System.out.print(i + "  ");
            if (i == 1996)
                System.out.println();
        }
        System.out.println();
        System.out.println("Above there is the list of leap-years from 1904 to 2094");
        System.out.println();
    }

    public static void task6() {
        System.out.println("task 6");

        for (int i = 7; i <= 98; i += 7) {
            System.out.print(i + "  ");
        }
        System.out.println();
        System.out.println();
    }

    public static void task7() {
        System.out.println("task 7");

        for (int i = 1; i <= 512; i *= 2) {
            System.out.print(i + "  ");
        }
        System.out.println();
        System.out.println();
    }

    public static void task8() {
        System.out.println("task 8");
        int stash = 0;
        int deposit = 29000;

        for (int i = 1; i <= 12; i++) {
            stash += deposit;
            System.out.println("Month - " + i + ", stash - " + stash);
        }
        System.out.println();
    }

    public static void task9() {
        System.out.println("task 9");
        double stash = 0;
        int deposit = 29000;

        for (int i = 1; i <= 12; i++) {
            stash = stash + deposit + ((deposit + stash) / 100);
            String format = String.format("%.2f", stash);
            System.out.println("Month - " + i + ", stash - " + format);
        }
        System.out.println();
    }

    public static void task10() {
        System.out.println("task 10");

        for (int i = 1; i <= 10; i++) {
            System.out.println("2 * " + i + " = " + i * 2);
        }
    }
}
