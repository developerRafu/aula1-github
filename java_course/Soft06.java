package java_course;

import java.util.Scanner;

/**
 *
 * @author Rafu
 */
public class Soft06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int entry,soma=0;
        entry=sc.nextInt();
        while(entry!=0){
            soma=soma+entry;
            entry=sc.nextInt();
        }
        System.out.println("Resultado="+soma);
        sc.close();
    }
}
