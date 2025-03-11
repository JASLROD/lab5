import java.util.Scanner;

/**
 * Program Description
 * 1) Fill in steps
 * 
 * @Jasmin Leonrodriguez jleonrodriquez@student.sdccd.edu
 * @version v1.0
 * @since 3/11/2025
 */
public class Prime{ 
    public static void main (String[] args) {
        //variables
        boolean isPrime;
        int number;            //original number to test
        String playAgain;      //string to test to calc another number
        
        //do{ //get program working first and then incorporate do while to play again
        System.out.print("Enter a whole number>2 (ie 19) to test if prime: ");
        Scanner keyboard = new Scanner(System.in);
        number = keyboard.nextInt();
        
        isPrime = testForPrime(number);
        if (isPrime)
        System.out.println(number + "is prime.");
        else
        System.out.println(number + "is not prime.");

        //System.out.print("Enter yes to test another number, no to quit");//Display message to test another number, something like 
        //set playAgain to user choice    
        //}//while to see if playAgain is String yes (recommend method that ignores case
    }//end main

    /**
     * Insert javadocs here - description, @param inNumber discription, @return disripition
     */
    private static boolean testForPrime(int inNumber){
        int inNumberSqRt;   //gets input from user and takes square root.  this shortens the testing and makes more efficient
        inNumberSqRt = (int)Math.sqrt(inNumber);
        boolean isPrimeMeth = true; // assumes number is prime

        for(int i=2;isPrimeMeth&&i<=inNumberSqRt;i++){  //declare and set int var to 2  //Can start here vs 1 for one less run
            if (inNumber%i==0)
                isPrimeMeth=false; 
        }
        return isPrimeMeth;
    }//end testForPrime
}//end Prime