import java.util.Scanner;

public class Prob225 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First number: ");
        double n1 = scanner.nextDouble();

        System.out.print("Second number: ");
        double n2 = scanner.nextDouble();

        double sum = n1 + n2;
        System.out.println("Sum: " + sum);

        double diff = n1 - n2;
        System.out.println("Difference: " + diff);

        double prod = n1 * n2;
        System.out.println("Product: " + prod);
        
        if (n2 != 0) 
        {
            double q = n1 / n2;
            System.out.println("Quotient: " + q);
        } 
        else System.out.println("Error due to dividing by 0");

        scanner.close();
    }
}