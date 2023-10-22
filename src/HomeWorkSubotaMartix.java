
import java.util.Random;
import java.util.Scanner;

public class HomeWorkSubotaMartix {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введіть довжину M : " );
        int m = scanner.nextInt();
        System.out.println("Введіть ширину N : " );
        int n = scanner.nextInt();

        int[][] Matrix1 = new int[m][n];
        int[][] Matrix2 = new int[n][m];



        System.out.println("Перший масив");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                Matrix1[i][j] = random.nextInt(100);
                System.out.print(Matrix1[i][j] + ".");

            }
            System.out.println();

            }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                Matrix2[j][i] = Matrix1[i][j];
            }

        }
        System.out.println("Другий масив");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(Matrix2[i][j] + ".");

            }
            System.out.println();
        }
        }
    }

