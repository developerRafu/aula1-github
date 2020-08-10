package application;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Rafu
 */
public class Vector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.print("How many people?:");
        int n = sc.nextInt();
        ObjectVector[] pro = new ObjectVector[n];
        for(int i=0;i<n;i++){
            sc.nextLine();
            String name=sc.nextLine();
            double price = sc.nextDouble();
            pro[i]=new ObjectVector(name,price);
        }
        double sum = 0.0;
        for(int i = 0; i<n;i++){
            sum+=pro[i].getPrice();
        }
        double avg = sum/n;
        System.out.println("Media = "+avg);
        sc.close();
    }
}
