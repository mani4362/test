
package clonetab.main;
import colnetab.util.Caluclator;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Caluclator obj =  new Caluclator();
        System.out.println("Enter two numbers to add");
        int a = new Scanner(System.in).nextInt();
        int b = new Scanner(System.in).nextInt();
        int result = obj.add(a,b);
        System.out.println(a+" "+" + "+b+" = "+result);
        System.out.println("Naku emi radhu ");
    }
}
