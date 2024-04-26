import java.util.Scanner;

public class Prob226 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose the type of equation:");
            System.out.println("1. The first-degree equation (linear equation) with one variable");
            System.out.println("2. The second-degree equation with one variable");
            System.out.println("3. The system of first-degree equations (linear system) with two variables");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 1) sol1equa();
            else if (choice == 2) sol2equa(); 
            else if (choice == 3) sollisys();
            else 
            {
                scanner.close();
                System.out.println("Exiting");
                System.exit(0);            	
            }
        }
    }

    private static void sol1equa() {
    	
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter coefficients for ax + b = 0:");
        System.out.println("Enter a: ");
        int a =  scanner.nextInt();
        System.out.println("Enter b: ");
        int b =  scanner.nextInt();
        if (a == 0)
        {
            if (b == 0) System.out.println("Infinitely solutions");
            else System.out.println("No solution");
        }
        else 
        {
            double sol = - b /a;
            System.out.println("The solution is: " + sol);
        }
    }

    private static void sol2equa() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter cofficients for (ax^2 + bx + c = 0)");
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();
        if (a == 0) {
            System.out.println("This is not a second-degree equation.");
            scanner.close();
            return;
        }
        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();

        double delta = b * b - 4 * a * c;
        if (delta == 0) {
        	double root = -b / (2 * a);
            System.out.println("The equation has a unique root :");
            System.out.println("Root = " + root);
        } else if (delta > 0) {
        	double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("The equation has 2 roots are :");
            System.out.println("Root 1 = " + root1);
            System.out.println("Root 2 = " + root2);
        } else {
            System.out.println("There are no real roots in this equation");
        }
    }    
    
    private static void sollisys() {
    	
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter coefficients for the first equation (ax + by = c):");
        System.out.println("ax + by = c:");
        System.out.println("dx + ey = f:");
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter c: ");
        double c = scanner.nextDouble();
        System.out.print("Enter d: ");
        double d = scanner.nextDouble();
        System.out.print("Enter e: ");
        double e = scanner.nextDouble();
        System.out.print("Enter f: ");
        double f = scanner.nextDouble();

        double det = a * e - b * d;
        if (det == 0) {
            System.out.println("This system of equations has infinitely many solutions.");
        } else {
            double x = (c * e - b * f) / det;
            double y = (a * f - c * d) / det;
            System.out.println("The solution for the system of equations are:");
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }
    }


}