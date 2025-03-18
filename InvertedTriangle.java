import java.util.Scanner;
//Left-Aligned Right Inverted Triangle
public class InvertedTriangle {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int row;
        do {
            System.out.print("Enter an odd number (total rows in the triangle): ");
            row = sc.nextInt();
            if (row % 2 == 0) {
                System.out.println("Please enter an odd number!");
            }
        } while (row % 2 == 0);

        int topColumn = (2 * row) - 1; // Maximum width of the top row

        // Loop to print the inverted triangle
        for (int i = 0; i < row; i++) {

            // Print asterisks
            for (int j = i; j < row; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
