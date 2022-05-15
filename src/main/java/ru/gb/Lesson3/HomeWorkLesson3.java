package ru.gb.Lesson3;

public class HomeWorkLesson3 {
    public static void main(String[] args) {
        changeArr();
        arrHundred();
        onTwo();
        diagonal();
        ArrReturn(10, 9);
    }

    public static void changeArr() {
        int[] array = new int[6];
        array[0] = 1;
        array[1] = 0;
        array[2] = 1;
        array[3] = 1;
        array[4] = 0;
        array[5] = 1;
        for (int a = 0; a < 6; a++) {
            if (array[a] == 0) {
                System.out.println("array[" + a + "] = " + (array[a] + 1));
            } else {
                System.out.println("array[" + a + "] = " + (array[a] - 1));
            }
        }
    }

    public static void arrHundred() {
        int[] arrHun = new int[101];
        for (int a = 1; a < arrHun.length; a++) {
            arrHun[a] = a;
            System.out.println("arrHun[" + a + "] = " + (arrHun[a]));
        }

    }

    public static void onTwo() {
        int[] arrOnTwo = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int a = 0; a < arrOnTwo.length; a++) {
            if (arrOnTwo[a] < 6) {
                System.out.println("arrOnTwo[" + a + "] = " + (arrOnTwo[a] * 2));
            }

        }
    }

    public static void diagonal() {
        int[][] arrDiag = new int[4][4];
        for (int a = 0; a < 4; a++) {
            for (int b = 0; b < 4; b++) {
                if (a == b) {
                    System.out.print(" " + (arrDiag[a][b] + 1));
                } else {
                    System.out.print(" " + arrDiag[a][b]);
                }
            }
            System.out.println();
        }
    }

    public static int[] ArrReturn(int len, int initialValue) {
        int retarr[] = new int[len];
        for (int a = 0; a < retarr.length; a++) {
            retarr[a] = initialValue;
            System.out.print(" " + retarr[a]);
        }
        return retarr;
    }
}

