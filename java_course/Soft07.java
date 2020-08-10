package java_course;

import java.util.Scanner;

/**
 *
 * @author Rafu
 */
public class Soft07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int entry=0;
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            entry=entry+sc.nextInt();
        }
        System.out.println("Resultado = "+ entry);
    }
}
