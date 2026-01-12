import java.lang.reflect.Array;

public class matrix {
    public static void main(String[] args)
    {
        int[][] mat = {
                {1, 2, 3}, {4, 5, 6}
        };
         int row=mat.length;
        System.out.println(row);
         int col=mat[0].length;
        System.out.println(col);




//        1.

        for(int i=0;i<mat.length;i++)
      {
          for(int j=0;j<mat[1].length;j++)
          {
              System.out.print(mat[i][j] + " ");
          }
          System.out.println();
      }

//        2.

//        for(int[] row : mat){
//            for(int element : row )
//            {
//                System.out.print(element + " ");
//            }
//        }
//        System.out.println();
    }
}
