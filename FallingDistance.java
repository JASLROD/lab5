import java.util.Scanner;

/**
 * Program Description
 * 1) Fill in steps
 * 
 * @author Name, optional email
 * @version v1.0
 * @since date
 */

public class FallingDistance{ 
    public static final double ACCELERATION = 9.8;  
    public static void main (String[] args) {
        //create Scanner object
        double distance;
        int numOfSecs;
        
        Scanner input = new Scanner (System.in);
        System.out.print("Please enter how many seconds to compute: ");
        numOfSecs=input.nextInt();
        System.out.println("Time(secs)\tDistance(m)");
        System.out.println("==========\t=========");
        
        for (int i=1; i<=numOfSecs; i++){
            System.out.printf("%d\t\\%.2f\n", i,getDistance(i));
        }
        
   
    /**
     * Put getDistance javadocs here.  Include description along with @param and @return tags
     */
    //Create getDistance header with correct return type and parameter.  Since static method is calling, must be static. Can be public or private
        //the body just needs to be a single statement, a return that calculates distance.  See Lab5 for the formula
    public static double 
}//end class