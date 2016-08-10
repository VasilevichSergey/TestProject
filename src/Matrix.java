/**
 * Created by v on 10.08.2016.
 */

import java.security.SecureRandom;

public class Matrix {
    public static int[][] RotateMatrix270(int[][] matrix) {
        int[][] ret = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[0].length; ++j) {
                ret[i][j] = matrix[matrix[0].length - j - 1][i];
            }
        }
        return ret;
    }

    public static int[][] RotateMatrix90(int[][] matrix) {
        int[][] ret = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[0].length; ++j) {
                ret[i][j] = matrix[j][matrix[0].length - i - 1];
            }
        }
        return ret;
    }

    public static int[][] RotateMatrix180(int[][] matrix) {
        int[][] ret = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[0].length; ++j) {
                ret[i][j] = matrix[matrix[0].length - i - 1][matrix[0].length - j - 1];
            }
        }
        return ret;
    }

    public static void fillMatrix(int[][] matrix, int k) {
        SecureRandom random = new SecureRandom();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = random.nextInt(k);
            }
        }
    }

    public static void fillMatrix(int[] matrix, int k) {
        SecureRandom random = new SecureRandom();

        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = random.nextInt(k);
        }
    }


    public static void showMatrix(int[][] matrix) {
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[i].length; j++) {
                System.out.print(" "+matrix[i][j]);
            }
            System.out.println("");
        }
    }
}
