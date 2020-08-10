/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_course;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Soft02 {
    public static void main(String[] args) {
        String s1,s2,s3,s4;
        int x;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        s4 = sc.nextLine();
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        sc.close();
    }
}
