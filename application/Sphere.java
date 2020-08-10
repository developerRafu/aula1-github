package application;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Rafu
 */
public class Sphere {
    public static final double Pi = 3.14159;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        System.out.print("Radius: ");
        double radius = sc.nextDouble();
        double c = circum(radius);
        double v = volume(radius);
        
        System.out.printf("Circumference = %.2f%n"+c);
        System.out.printf("Volume = %.2f%n"+v);
        
        sc.close();
    }
    public static double circum(double raio){
        return 2*Pi*raio;
    }
    public static double volume(double raio){
        return 4.0 * Pi * raio*raio*raio/3.0;
    }
}
