/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_course;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Matriz01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número de linhas e colunas: ");
        int n = sc.nextInt();
        int [][] mat = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print("Valor de ["+i+"]["+j+"]: ");
                mat [i][j] = sc.nextInt();
        }
        }
        System.out.println("===============================");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        for(int i = 0; i < n; i++){
            System.out.println("Diagonal["+i+"]["+i+"]:"+mat[i][i]);
        }
        int count = 0;
         for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
            if(mat[i][j]<0){
                count++;
            }
            }
            }
         System.out.println("Quantidade de negativos = "+count);
        sc.close();
    }
}
