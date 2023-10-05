package HomeWork5;

public class task4 {
    public task4() {
    }

    public static void main(String[] args) {
        int[] arrayFth = new int[37];
        int x = 0;
        int step = 10;

        for(int i = 0; i < arrayFth.length; ++i) {
            arrayFth[i] = x;
            System.out.println("Sin of " + x + " degrees = " + Math.sin((double)arrayFth[i]) + " rad");
            x = arrayFth[i] + step;
        }

    }
}