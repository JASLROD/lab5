//import JOptionPane
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.io.*;  

/**
 * Program Description
 * 1) Fill in steps
 * 
 * @author Name, optional email
 * @version v1.0
 * @since 3/11/2025
 */
public class Grades{ 
    public static void main (String[] args) throws IOException{  //look how small main() is when we divide and conquer into (resusable) methods!  Only 4 lines!!!
        //variables
        String inFile, outFile;
        inFile = getInFile();//set inFile using getInFile()
        outFile = getOutFile();//set outFile using getOutFile()
        processFile(inFile, outFile);//call processFile() with inFile and outFile as arguments
        System.exit(0); //System.exit(0) since JOptionPane was used
    }//end main

    /**
     * Uses JOptionPane to get and return input file name
     * @return name of file from JOptionPane  //NOTE - Description only for return
     */
    public static String getInFile() throws IOException{ //Requires throws IOException since File throws IOException
        String temp;//String from JOptionPane sowInputDialog
        temp = JOptionPane.showInputDialog("Enter the name of the input file (ie input.txt): ");
        File test;//file object to determine if valid path
        test = new File(temp);
        while(!test. exists()){ 
            temp = JOptionPane.showInputDialog("Enter the name of the input file (ie input.txt): ");
            test = new File(temp);
        }
        return temp;//return String var from above
    }//end getInFile()
    /**
     * <Put description here-see above as example>
     * <@return - see above as example>
     */
    private static String getOutFile(){
        String temp;
        temp = JOptionPane.showInputDialog("Enter the name of the output file (ie output.txt): ");
        return temp;
        //return JOptionPane.showInputDialog("Enter the name of the output file (ie output.txt): "); other way 
    }//end getOutFile
    //create a method to generate and return a String for the output file name.  NOTE - No throws IOException here.  
    //can be a simple return with a JOptionPane Input Dialog 

    /**
     * <Put description in here for processFile method.  NOTE can be several lines if necessary
     * <Need to create two @param entry lines>
     */    
    public static void processFile(String inInFile, String inOutFile) throws IOException{ //create a void processFile method with 2 String parameters.  Since working with File, will need throws IOException
        //variables
        int number; //to assign from Scanner input
        int  As,Bs,Cs,Ds,Fs,min,max;
        int total,count;
        double avg;     
        int set = 1;

        ////Scanner and PrintWriter streams section
        File inFileName = new File (inInFile);//create File object to create a file from inFileName param
        Scanner input = new Scanner (inFileName);//create Scanner object with File object from above.  NOTE-You know this will work based on while pit in getInFile()
        PrintWriter output = new PrintWriter(inOutFile);//create PrintWriter object with inOutFile from method param.  NOTE-PrintWriter creates a new file or overwrites an 

        while(input.hasNextLine()){//outer while loop to test if input .hasNextLine()
            As=Bs=Cs=Ds=Fs=count=0; //since new line of scores to average
            avg = 0.0;// since new line of scores to average
            number = input.nextInt();
            min=max=number;
            total=count=0;
            while (number!=-1){// inner while loop
                if(number<min)
                    min=number;
                if(number>max)//repeat the same except for max this time 
                    max=number;
                count++;//increment count since you will use this as the denominator to calculate average
                total+=number;//add number to the total accumulator.  Think += here

                //if-else if section to set increment the proper letter grade accumulators
                if(number>=90)
                    As++;
                else if(number>=80)//else if (number>=?)
                Bs++;//increment Bs
                else if(number>=70)//account for all letter grades
                Cs++;
                else if(number>=60)
                Ds++;
                else
                Fs++;
                number = input.nextInt();//need to read in the next number using Scanner object with .nextInt().  You are in a while pit to process each grade for each line
            }//end while

            output.println("Set " + set + " of grades calculated");//Write to the PrintWriter object (ie outStream) like you would to the screen
            set++; // increment set so the next number is 2
            if(count==0)//if to determine whether a line with -1 only, if so, count is still 0
            output.println("No grades to average.\n");//print to PrintWriter object, No grades to average
            else{
            output.println("Number of As: "+ As);//print to PrintWriter object, Number of As: along with the value in the As accumulator
            output.println("Number of Bs: "+ Bs);//repeat above for Bs, Cs,Ds, and Fs
            output.println("Number of Cs: "+ Cs);
            output.println("Number of Ds: "+ Ds);
            output.println("Number of Fs: "+ Fs);
            output.println("The high score was: "+ max);//print to PrintWriter object, The high score was: along with the value in max
            output.println("The low score was: "+ min);//repeat above but for min
            avg=(double)total/count;//compute avg. NOTE-Both total and count are integers.  You will need to cast here (double).
            output.printf("The avg score is: %.1f\n\n",avg);//print to PrintWriter object, The avg score is: nicely formatted to 1 decimal place
        }//end else
    }//end while for each line
    System.out.println("Grade processing is completed");//message out to the console screen (System.out.println("Grade processing is completed");
    System.out.println("You can retrieve the output file at, "+ inOutFile); //Perhaps a message out to console screen, You can retrieve the output file at, <output file location>
    input.close();//close the inStream and outStream using the .close() for each
    output.close();
}//end processFile()
}//end Grades class