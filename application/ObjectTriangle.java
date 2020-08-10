package application;
import com.sun.org.apache.xerces.internal.dom.DOMMessageFormatter;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Rafu
 */
public class ObjectTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Triangle x = new Triangle();
        Triangle y = new Triangle();
         Locale.setDefault(Locale.US);
        
        System.out.println("X triangle:");
        x.a=sc.nextDouble();
        x.b=sc.nextDouble();
        x.c=sc.nextDouble();
        System.out.println("Y triangle:");
        y.a=sc.nextDouble();
        y.b=sc.nextDouble();
        y.c=sc.nextDouble();
        
        double areax = x.area();
        double areay = y.area();
        System.out.println("Área x = "+areax);
        System.out.println("Área y = "+areay);
    }
}
