package TotalRow;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
import java.util.*;

public class TotalRow {

    public static ArrayList<Integer> getRowTotals(int[][] m) {
        int sum = 0;
        ArrayList<Integer> sums = new ArrayList<Integer>();
         for(int i = 0; i < m.length;  i++){
             for(int j = 0; j < m[i].length; j++){
                 sum += m[i][j];
             }
            sums.add(i, sum);
            sum = 0;
         }
         return sums;
    }
}
