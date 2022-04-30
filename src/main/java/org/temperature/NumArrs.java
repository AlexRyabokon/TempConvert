package org.temperature;

import java.util.Arrays;

public class NumArrs {
/*10. Используя оператор switch, написать программу, которая выводит на экран сообщения
 о принадлежности некоторого значения `k` интервалам:
    - `(-10k, 0], (0, 5], (5, 10], (10, 10k]`.
    - `(-10k, 5], [0, 10], [5, 15], [10, 10k]`.   */

    public void findIntervall(double k) {

        int i = ((int) k);

        switch (i > -10000 && i < 0 ? 0 : 1) {
            case 0:
                System.out.println("Число в интервале (-10000, 5]");
                break;
            case 1:
                switch (i >= 0 && i < 5 ? 0 : 1) {
                    case 0:
                        System.out.println("Число в интервале (-10000, 5] и [0,10] ");
                        break;
                    case 1:
                        switch (i == 5 ? 0 : 1) {
                            case 0:
                                System.out.println("Число в интервале (-10000, 5] и [0,10] и [5,15] ");
                                break;
                            case 1:
                                switch (i > 5 && i < 10 ? 0 : 1) {
                                    case 0:
                                        System.out.println("Число в интервале [0,10] и [5,15] ");
                                        break;
                                    case 1:
                                        switch (i == 10 ? 0 : 1) {
                                            case 0:
                                                System.out.println("Число в интервале  [0,10] и [5,15] и [10,10000] ");
                                                break;
                                            case 1:
                                                switch (i > 10 && i <= 15 ? 0 : 1) {
                                                    case 0:
                                                        System.out.println("Число в интервале [5,15] и [10,10000] ");
                                                        break;
                                                    case 1:
                                                        switch (i > 15 && i <= 10000 ? 0 : 1) {
                                                            case 0:
                                                                System.out.println("Число в интервале  [10,10000] ");
                                                                break;
                                                            case 1:
                                                                System.out.println("Число не в интервале  ");
                                                                break;

                                                        }
                                                        break;
                                                }
                                                break;
                                        }
                                }
                                break;

                        }
                        break;


                }
                break;

        }
    }

/*11. Написать программу, которая выводит числа от 1 до 25 в виде матрицы 5x5 слева
    направо и сверху вниз.*/

    public void Matrix25() {
        int num = 0;

        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = ++num;

            }
        }

        System.out.println(arr[0][0] + "  " + arr[0][1] + "  " + arr[0][2] + "  " + arr[0][3] + "  " + arr[0][4]);
        System.out.println(arr[1][0] + "  " + arr[1][1] + "  " + arr[1][2] + "  " + arr[1][3] + "  " + arr[1][4]);
        System.out.println(arr[2][0] + " " + arr[2][1] + " " + arr[2][2] + " " + arr[2][3] + " " + arr[2][4]);
        System.out.println(arr[3][0] + " " + arr[3][1] + " " + arr[3][2] + " " + arr[3][3] + " " + arr[3][4]);
        System.out.println(arr[4][0] + " " + arr[4][1] + " " + arr[4][2] + " " + arr[4][3] + " " + arr[4][4]);

    }


}




class real{
    public static void main(String[] args) {
        NumArrs n = new NumArrs();
n.Matrix25();


    }
}
