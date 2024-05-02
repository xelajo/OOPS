import java.util.Scanner;
public class MatrixSymmetryChecker {
public static void main(String[] args) {
System.out.println("Alex John \n 23MCA011 \n 13/02/2024");
Scanner input = new Scanner(System.in);
System.out.print("Enter the number of rows in the matrix: ");
int rows = input.nextInt();
System.out.print("Enter the number of columns in the matrix: ");
int cols = input.nextInt();
int[][] matrix = new int[rows][cols];
System.out.println("Enter the elements of the matrix:");
for (int i = 0; i < rows; i++) {
for (int j = 0; j < cols; j++) {
matrix[i][j] = input.nextInt();
}
}
boolean isSymmetric = true;
for (int i = 0; i < rows; i++) {
for (int j = 0; j < cols; j++) {
if (matrix[i][j] != matrix[j][i]) {
isSymmetric = false;
break;
}
}
if (!isSymmetric) {
break;
}
}
if (isSymmetric) {
System.out.println("The matrix is symmetric.");
} else {
System.out.println("The matrix is not symmetric.");
}
}
}
