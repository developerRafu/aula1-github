package java_course;

import java.util.Scanner;

/**
 *
 * @author Rafu
 */
public class Soft10 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int mask = 0b100000;
            if((n&mask)==0){
                System.out.println("sim");
            }
            else{
                System.out.println("não");
            }
        
    }
}
