package application;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Rafu
 */
public class TestProduto {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Produto prod = new Produto();
        System.out.print("Name: ");
        prod.setName(sc.nextLine());
        System.out.print("Price: ");
        prod.setPrice(sc.nextDouble());
        System.out.print(prod);
    }
}
