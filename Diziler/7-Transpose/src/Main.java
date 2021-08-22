public class Main {
    public static void main(String[] args) {
        int matrix[][] = new int[2][3];
        matrix[0][0] = 1;
        matrix[0][1] = 4;
        matrix[0][2] = 3;
        matrix[1][0] = 5;
        matrix[1][1] = 6;
        matrix[1][2] = 2;
        System.out.println("Matris ");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + "\t");
            }

            System.out.print("\n");
        }

        int transpose[][] = new int[3][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        System.out.println("***************************************");
        System.out.println("Transpose ");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(transpose[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }
}
