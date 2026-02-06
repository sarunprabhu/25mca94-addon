package core;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] a = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };

        // Display array using normal for loop
        System.out.println("Normal for loop:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print("\t" + a[i][j]);
            }
            System.out.println();
        }

        // Header for marks summary
        System.out.println("\n     mark-1     mark-2   mark-3   total  average  maximum   minimum");

        // Calculations: total, average, max, min
        for (int i = 0; i < a.length; i++) {
            int total = 0;
            int min = a[i][0];
            int max = a[i][0];

            for (int j = 0; j < a[i].length; j++) {
                System.out.print("\t" + a[i][j]);
                total += a[i][j];

                if (a[i][j] > max) max = a[i][j];
                if (a[i][j] < min) min = a[i][j];
            }

            float avg = (float) total / a[i].length;

            System.out.println("\t  "+ total + "  \t   " + avg + " \t  " + max + "    \t     " + min);


        }

        sc.close();
    }
}
