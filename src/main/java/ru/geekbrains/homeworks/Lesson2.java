package ru.geekbrains.homeworks;

public class Lesson2 {
    public static void main(String[] args) {
        boolean d = checkFrom10to20(6, 8);
        System.out.println(d);

        positiveOrNegative(2);

        boolean v = trueOrFalse(10);
        System.out.println(v);

        printStringNTimes("Повтори строку", 7);
    }

    private static boolean trueOrFalse(int i) {
        return i <= 0;
    }


    private static void positiveOrNegative(int i) {
        if (i >= 0) {
            System.out.println("Число положительное");
        } else System.out.println("Число отрицательное");

    }

    public static boolean checkFrom10to20(int a, int b) {
        int c = a + b;
        return c >= 10 && c <= 20;
    }

    public static void printStringNTimes(String string, int f) {
        for (int i = 0; i < f; i++) {
            System.out.println(string);
        }

    }

}


