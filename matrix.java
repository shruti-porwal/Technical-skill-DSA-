import java.util.Scanner;
public class matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        System.out.println("rows : " +rows);
        int  cols = sc.nextInt();
        System.out.println("cols :" +cols);
        int[][] matrix = new int[rows][cols];
        for(int i = 0;i<rows;i++){
            for(int j = 0;j<cols;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i = 0;i<rows;i++){
            for(int j = 0;j<cols;j++){
                System.out.print(matrix[i][j]  + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
