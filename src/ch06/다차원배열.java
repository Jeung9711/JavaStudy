package ch06;

public class 다차원배열 {
    public static void main(String[] args) {
        // 구조가 일정하지 않은 배열에 접근
        int[][] matrix = {
                {1,2,3},
                {4,5},
                {6,7,8,9}
        };

        for (int row=0; row<matrix.length; row++) {
            for(int col=0; col<matrix[row].length; col++) {
                System.out.print(matrix[row][col]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
