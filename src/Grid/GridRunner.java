package Grid;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class GridRunner {

    public static void main(String args[]) throws IOException {
        String[] vals = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        
        Grid graph = new Grid(vals);
        String out = graph.gridPrint();
        System.out.println(out);
        int[] valNums =graph.countVals(vals);
        
        for(int i = 0; i < vals.length; i++){
            System.out.println(vals[i] + " appeared " + valNums[i] + " times.");
        }
        System.out.println();
        System.out.println(graph.findMax(vals, valNums));
    }
}
