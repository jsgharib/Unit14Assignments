package Grid;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
public class Grid {

    private String[][] grid;

    //load vals into the rows x cols grid randomly
    public Grid(){
    }
    public Grid(String[] vals) {
         int rows = vals.length;
         int cols = vals.length;
        grid = new String[rows][cols];
        int loc = 0;
        for(int i = 0; i < grid.length; i++){
            for(int n = 0; n < grid[i].length; n++){
                loc = (int)Math.floor(Math.random()*vals.length);
                grid[i][n] = vals[loc];
            }
        }
        
        
        
    }

    //find out which of the vals occurs the most
    public String findMax(String[] vals, int[] valNums) {
         int maxVal = 0; 
         for( int i = 0; i < valNums.length; i++){
             maxVal = Math.max(maxVal, valNums[i]);
         }
         for( int n = 0; n < valNums.length; n++){
             if (valNums[n] == maxVal){
                 maxVal = n;
             }
         }
        return (vals[maxVal] + " occured the most at " + valNums[maxVal] + " times.");
    }

    //returns a count of how many times val occurs in the matrix
    public int[] countVals(String[] val) {
        String valAt = "";
        int[] valCount = new int[val.length];
        for(int j = 0; j < val.length; j++){
            valAt = val[j];
            for(int i = 0; i < grid.length; i++){
                for(int n = 0; n < grid[i].length; n++){
                    if (grid[i][n] == valAt){
                        valCount[j]++;
                    }
                }
            }
        }
        return valCount;
    }

    //display the grid
    public String gridPrint(){
        String output = "";
        for(int i = 0; i < grid.length; i++){
            for(int n = 0; n < grid[i].length-1; n++){
                output += grid[i][n] + " ";
            }
            output += grid[i][grid[i].length-1];
            output+= "\n";
        }
        return output;
    }
}
