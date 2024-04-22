package Day45assignments;

public class Task1 {
    private int[][] matrix;

    // Constructor to initialize the dimensions of the matrix
    public Task1(int rows, int cols) {
        if (rows <= 0 || cols <= 0) {
            throw new IllegalArgumentException("Matrix dimensions must be positive.");
        }
        this.matrix = new int[rows][cols];
    }

    // Method to fill the matrix with values
    public void fillMatrix(int[][] values) {
        if (values.length != matrix.length || values[0].length != matrix[0].length) {
            throw new IllegalArgumentException("Input values must have the same dimensions as the matrix.");
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = values[i][j];
            }
        }
    }

    // Method to print the matrix
    public void printMatrix() {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] values = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        Task1 matrix = new Task1(3, 3);
        matrix.fillMatrix(values);
        matrix.printMatrix();
    }
}
