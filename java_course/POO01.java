package java_course;

import java.util.Scanner;

/**
 *
 * @author Rafu
 */
public class POO01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Triângulo 1:");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int z1 = sc.nextInt();
        System.out.println("Triângulo 2:");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int z2 = sc.nextInt();
        
        int p = (x1 + y1 + z1)/2;
        int area1 = (int) Math.sqrt(p*(p-x1)*(p-y1)*(p-z1));
        
        p= (x2 + y2 + z2)/2;
         int area2 = (int) Math.sqrt(p*(p-x2)*(p-y2)*(p-z2));
         if(area1>area2){
             System.out.println("Triângulo 1 é maior. = "+area1);
         }else{
             System.out.println("Triângulo 2 é maior. = "+area2);
         }
    }
}
