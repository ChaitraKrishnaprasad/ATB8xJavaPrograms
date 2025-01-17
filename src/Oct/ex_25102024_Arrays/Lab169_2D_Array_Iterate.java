package Oct.ex_25102024_Arrays;

public class Lab169_2D_Array_Iterate {
    public static void main(String[] args) {
        int [][] matrix_3_3 = {{1,2,3},{4,5,6},{7,8,9}};

        for(int i=0; i<matrix_3_3.length; i++){
            for(int j=0; j<matrix_3_3[0].length; j++){
                System.out.println(matrix_3_3[i][j]);

            }
            System.out.println();
        }
    }
}
