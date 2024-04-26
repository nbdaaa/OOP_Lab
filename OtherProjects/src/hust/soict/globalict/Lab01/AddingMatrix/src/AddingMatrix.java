import java.util.Scanner;

public class AddingMatrix {
	
    public static void main(String[] args) {
    	
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the number of rows and columns: ");
        int n = input.nextInt();
        int m = input.nextInt();
        
        int[][] a = new int[n][m];
        int[][] b = new int[n][m];
        
        System.out.println("Enter the matrix a: ");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                a[i][j] = input.nextInt();
            }
            System.out.println();
        }

        System.out.println("Enter the matrix b: ");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                b[i][j] = input.nextInt();
            }
            System.out.println();
        }
        
        int[][] res = new int[n][m];
        System.out.println("The sum of two matrix is : ");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                res[i][j] = a[i][j] + b[i][j];
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
