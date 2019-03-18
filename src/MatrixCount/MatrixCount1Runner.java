package MatrixCount;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
public class MatrixCount1Runner {

    public static void main(String args[]) throws Exception {
        
        MatrixCount1 counter = new MatrixCount1();
        int val = 7;
        counter.printMat();
        System.out.println("The " + val + " count is " + counter.count(val));
    }
}
