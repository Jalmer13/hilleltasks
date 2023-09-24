package firstapp;

public class Homework {
    public static void main(String[] args) {
        // Task 1
        System.out.println("2nd Home Work");
        // Task 2
        // Celsius = 5/9 (F - 32) Kelvin = C + 273.16
        int c = 13;
        double k = c + 273.16;
        float f = ((float) c * 9 / 5) + 32;
        System.out.println(c + " Celsius " + f + " Fahrenheit " + k + " Kelvin ");
        // Task 3
        int cateta = 12;
        int catetb = 16;
        int hypotenuse2 = ((cateta * cateta) + (catetb * catetb)) ;
        double hypotenuse = Math.sqrt(hypotenuse2);
        double s = (float)1/2 * cateta * cateta;
        System.out.println( s + " area of a right triangle " + hypotenuse + " Hypotenuse ");
        System.out.println("Pythagorean Theorem c2=a2+b2");
    }
}