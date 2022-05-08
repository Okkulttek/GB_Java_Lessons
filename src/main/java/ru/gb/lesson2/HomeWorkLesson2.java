package ru.gb.lesson2;

public class HomeWorkLesson2 {
    public static void main(String[] args) {
        System.out.println(summ(10, 78));
        checkPosNegNum(-20);
        System.out.println(checkPosNegNum2(7));
        printStringSomeTimes("строка", 5);
    }

    public static int summ(int a, int b) {
        if (a + b >= 10 && a + b <= 20) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        return (a + b);
    }

    public static int checkPosNegNum(int c) {
        if (c >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
        return c;
    }


    public static boolean checkPosNegNum2(int d) {
        if (d >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void printStringSomeTimes(String word, int e) {
        for (e = 0; e < 5; e++) {
            System.out.print(word + " ");
        }
    }

}
