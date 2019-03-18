package TotalRow;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
public class TotalRowRunner {

    public static void main(String args[]) throws Exception {
        TotalRow totRow = new TotalRow();
        
        int[][] rows = {{1,2,3},{5,5,5,5}};
        
        
        ArrayList<Integer> listy = totRow.getRowTotals(rows);
        
        System.out.println("Row totals are: " + listy);
        
    }
}
