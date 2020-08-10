package java_course;

import java.util.Scanner;

/**
 *
 * @author Rafu
 */
public class Soft08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char resp = 's';
        do {
            float cel = sc.nextFloat();
            float far = (float) (9.0 * cel / 5.0 + 32.0);
            System.out.println(far);
            System.out.println("Deseja repetir?(s/n)");
            resp = sc.next().charAt(0);
        }while (resp != 'n');
    }
}
