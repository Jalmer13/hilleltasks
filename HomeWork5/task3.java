package HomeWork5;

import java.util.Random;

public class task3 {
    public task3() {
    }

    public static void main(String[] args) {
        int[] arrayTrd = new int[10];
        Random rnd = new Random();

        for(int i = 0; i < arrayTrd.length; ++i) {
            arrayTrd[i] = rnd.nextInt(100);
            double result = (double)(arrayTrd[i] % 2);
            if (result == 0.0) {
                arrayTrd[i] = 0;
            }

            System.out.println(arrayTrd[i]);
        }

    }
}