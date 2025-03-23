import java.util.Scanner;

/**
 * Program Description
 * The program checks if a given number is prime. 
 * User will enter a number >2 using scanner keyboard.
 * A method is used to test if the number is prime.
 * It will display if number is prime or not prime.
 * Has a playagain feature that ignores case.
 *  
 * 
 * @author Jasmin Leonrodriguez jleonrodriquez@student.sdccd.edu
 * @version v1.1
 * @since 3/22/2025
 */
public class Prime{ 
    public static void main (String[] args) {
        //variables
        boolean isPrime;
        int number;            //original number to test
        String playAgain;      //string to test to calc another number

        do{ //get program working first and then incorporate do while to play again
            System.out.print("Enter a whole number>2 (ie 19) to test if prime: ");
            Scanner keyboard = new Scanner(System.in);
            number = keyboard.nextInt();

            isPrime = testForPrime(number);
            if (isPrime)
                System.out.println(number + " is prime.");
            else
                System.out.println(number + " is not prime.");

            System.out.print("Enter yes to test another number, no to quit. ");//Display message to test another number, something like 
            playAgain = keyboard.next().toLowerCase(); 
        }while(playAgain.equals("yes"));// to see if playAgain is String yes (recommend method that ignores case
    }//end main
    /**
     * Determines if a given number is prime.
     *
     * A prime number is only divisible by 1 and itself. This method checks divisibility 
     * from 2 up to the square root of the number, making the check more efficient.
     *
     * @param inNumber The number to test for primality.
     * @return `true` if the number is prime, `false` otherwise.
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