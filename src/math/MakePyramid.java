package math;

import java.util.Scanner;

public class MakePyramid {
    public static void main(String[] args) {

        //   Implement a large Pyramid of stars in the screen with java.
        //
        //                    *
        //                   * *
        //                  * * *
        //                 * * * *
        //                * * * * *
        //               * * * * * *

        int i, space, rows, k = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        rows = sc.nextInt();
        for (i = 1; i <= rows; i++) {
            for (space = 1; space <= (rows - i) ; space++) {
                System.out.print(" ");
            }
            while (k != ( 2*i - 1)) {
                System.out.print("*");
                k++;
            }
            k = 0;
            System.out.println();
        }

    }
  }
