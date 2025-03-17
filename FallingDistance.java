import java.util.Scanner;

/**
 * Program Description
 * 1) Fill in steps
 * 
 * Jasmin Leonrodriguez Jleonrodriquez@student.sdccd.edu
 * @version v1.0
 * @since 3/16/2025
 */

public class FallingDistance{ 
    public static final double ACCELERATION = 9.8;  
    public static void main (String[] args) {
        // variables
        double distance;
        int numOfSecs;
        //create Scanner object
        Scanner input = new Scanner (System.in);
        System.out.print("Please enter how many seconds to compute: ");
        numOfSecs=input.nextInt();
        System.out.println("Time(secs)\tDistance(m)");
        System.out.println("==========\t=========");

        for (int i=1; i<=numOfSecs; i++){
            System.out.printf("%d\t\t%.2f\n", i,getDistance(i));
        }
    }//end main

    /**
     * Calculates the distance an object falls under constant acceleration.
     * 
     * Uses the formula: distance = 0.5 * acceleration * (time^2).
     * 
     * @param inSecs The time in seconds for which the object falls.
     * @return The calculated distance the object has fallen.
     */

    //Create getDistance header with correct return type and parameter.  Since static method is calling, must be static. Can be public or private
    //the body just needs to be a single statement, a return that calculates distance.  See Lab5 for the formula
    public static double getDistance(int inSecs){
        return 0.5*ACCELERATION*Math.pow(inSecs,2);
    }
}//end class