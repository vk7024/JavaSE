/*
1.	定义一个matrix [2][2]的二维数组
2.	通过遍历二维数组并输入, 输入对数组初始化
3.	用公式求矩阵行列式|A|, 判断结果是否为0
    i.	是 返回null;
    ii.	否 继续第4 步
4.	用公式求伴随矩阵 A*
5.	逆A = 1 / |A| * 伴随矩阵


 */
package com.itheima_01;

import java.awt.font.FontRenderContext;
import java.util.Arrays;
import java.util.Scanner;

public class InverseMatrix {
    public static void main(String[] args) {
        double[][] matrix = new double[3][3];
        System.out.print("Enter a11, a12, a13, a21, a22, a23, a31, a32, a33: ");
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextDouble();
            }
        }

        System.out.println(GetDeterminant(matrix));
        System.out.println("原矩阵为: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

//        inverse(matrix);
        System.out.println("逆矩阵为: ");
        double [][] inverseMatrix = inverse(matrix);
        for (int i = 0; i < inverseMatrix.length; i++){
            for (int j = 0; j < inverseMatrix[i].length; j++){
                System.out.print(inverseMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }


    //求行列式
    public static double GetDeterminant(double[][] matrix) {
        double determinant = matrix[0][0] * matrix[1][1] * matrix[2][2] +
                matrix[2][0] * matrix[0][1] * matrix[1][2] +
                matrix[0][2] * matrix[1][0] * matrix[2][1] -
                matrix[0][2] * matrix[1][1] * matrix[2][0] -
                matrix[0][0] * matrix[1][2] * matrix[2][1] -
                matrix[2][2] * matrix[1][0] * matrix[0][1];
        if (determinant == 0) {
            return 0;
        }
        return determinant;
    }

    // 求伴随矩阵
    public static void GetSubMatrix(double[][] matrix) {
        double[][] subMatrix = new double[3][3];
        subMatrix[0][0] = matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1];
        subMatrix[0][1] = matrix[0][2] * matrix[2][1] - matrix[0][1] * matrix[2][2];
        subMatrix[0][2] = matrix[0][1] * matrix[1][2] - matrix[0][2] * matrix[1][1];
        subMatrix[1][0] = matrix[1][2] * matrix[2][0] - matrix[1][0] * matrix[1][2];
        subMatrix[1][1] = matrix[0][0] * matrix[2][2] - matrix[0][2] * matrix[2][0];
        subMatrix[1][2] = matrix[0][2] * matrix[1][0] - matrix[0][0] * matrix[1][2];
        subMatrix[2][0] = matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0];
        subMatrix[2][1] = matrix[0][1] * matrix[2][0] - matrix[0][0] * matrix[2][1];
        subMatrix[2][2] = matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        for (int i = 0; i < subMatrix.length; i++){
            for (int j = 0; j < subMatrix[i].length; j++){
                matrix[i][j] = subMatrix[i][j];
            }
        }
    }

    //逆矩阵
    public static double[][] inverse(double[][] matrix) {
        double determinant = GetDeterminant(matrix);

        GetSubMatrix(matrix);
        double[][] subMatrix = new double[3][3];

//        System.out.println("逆矩阵为: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
               subMatrix[i][j] = (1 / determinant) * matrix[i][j];
//                System.out.print(subMatrix[i][j] + " ");
            }
//            System.out.println();
        }
        return subMatrix;
    }
}
