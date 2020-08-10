package application;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Rafu
 */
public class ObjectProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name=sc.nextLine();
        System.out.print("Price: ");
        double price=sc.nextDouble();
        System.out.print("Quantity in stock: ");
        int quant=sc.nextInt();
        System.out.println();
        Product product = new Product(name,price,quant);
        System.out.println("Product data: "+product);
        System.out.print("Enter the number of products to be added in stock: ");
        quant = sc.nextInt();
        product.addProducts(quant);
        System.out.println("Update data: "+product);
        System.out.print("Enter the number of products to be removed from stock: ");
        quant = sc.nextInt();
        product.removeProducts(quant);
        System.out.println("Update data: "+product);
    }
}
