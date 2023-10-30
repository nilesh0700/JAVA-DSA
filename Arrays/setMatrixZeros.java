/* 
Q:73 Set matrix zeros:

Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.

You must do it in place.

 

Example 1:


Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
Output: [[1,0,1],[0,0,0],[1,0,1]]
Example 2:


Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]
  */

// import java.util.*;
//  public class setMatrixZeros{
//     public static void main(String[] args){
//         int[][] matrix = {
//                     {1,1,1,0},
//                     {1,0,1,1},
//                     {1,1,1,1}
//         };
//         for(int i = 0; i < matrix.length; i++){
//             for(int j = 0; j < matrix[i].length; j++){
//                 if(matrix[i][j] == 0){
//                     for(int row = 0; row < matrix.length; row++){
//                         if(matrix[row][j] != 0){
//                             matrix[row][j] = -1;
//                         }
//                     }
//                     for(int col = 0; col < matrix[i].length; col++){
//                         if(matrix[i][col] != 0){
//                             matrix[i][col] = -1;
//                         }
//                     }
//                 }
//             }
//         }
//         for(int i = 0; i < matrix.length; i++){
//             for(int j = 0; j <matrix[i].length; j++){
//                 if(matrix[i][j] == -1){
//                     matrix[i][j] = 0;
//                 }
//             }
//         }
//         for(int i = 0; i < matrix.length; i++){
//             for(int j = 0; j < matrix[i].length; j++){
//                 System.out.print(matrix[i][j]);
//             } 
//             System.out.println();
//         }
//     }
//  }


// /////////////////////////////////////////////////////////////////////

public class setMatrixZeros{
    public static void main(String[] args){
        int[][] matrix = {
                    {1,1,1,1},
                    {1,0,1,0},
                    {1,1,1,1}
        };
            int m = 3;
            int n = 4;
        int[] row = new int[n];
        int[] col = new int[m];

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] == 0){
                    row[i] = 1; 
                    col[j] = 1;
                }
            }
        }

        for(int i = 0; i < row.length; i++){
            for(int j = 0; j < col.length; j++){
                if(row[i] == 1){
                    matrix[i][j] = 0;
                }else if(col[j] == 1){
                    matrix[i][j] =0;
                }
            }
        }

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}