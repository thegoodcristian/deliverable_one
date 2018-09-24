package com.partOne;

//I import the Scanner class, as my program will require user input.

import java.util.Scanner;

public class sumCheckLab {

	/*
	 * I have written the task of my program in a separate method from the
	 * main() method, which I have defined as sumChecker().
	 */
	
	public static void sumChecker () {

        //I create a Scanner in order to receive user input.
		
        Scanner scnr = new Scanner(System.in);
        
        //I prompt the user to enter the number of digits both test numbers will have.
        System.out.println("Welcome to Grant Chirpus' fantabulous sum checker! Get ready to have some fun!"
				+"\nWith just two numbers, I can perform some real computational magic! No joke!"
    			+"\n"
    			+"\nWhen you're ready, please enter the amount of digits you'd like both "
    			+"\ntest numbers to have, however many you'd like!: ");
        int userInputNumberOfDigits = scnr.nextInt();
  
        /* 
         * Here I declare an array, the elements of which will contain the first set
         * of numbers input by the user. I then prompt the user to enter the first
         * test number. 
         */
        
        int [] testNumberArray1 = new int[userInputNumberOfDigits];
        System.out.println("\nUnbelieveable! " + userInputNumberOfDigits + " is my favorite number of digits. "
        		+ "\nOk, now enter your first " + userInputNumberOfDigits + " digit test number: ");
        String userInputNumber1 = scnr.next();

        /*
         * This portion validates the user input, making sure it only contains numbers,
         * does not contain any letters or special characters, and is of the 
         * correct length. The program exits if the user enters an improper value.
         */
        
        if (userInputNumber1.length() < testNumberArray1.length
        		|| userInputNumber1.length() > testNumberArray1.length 
        		|| !userInputNumber1.matches("^[0-9]*$"))
        {
            System.out.println("\nDrat! Make sure you only enter numbers (of your specified length) next time."
            		+ "\nNo letters, special characters, dots, or any other funny business!"
            		+ "\nPlease restart the program.");
            System.exit(0);
        }
        for (int i = 0; i < testNumberArray1.length; i++) {

            testNumberArray1[i] = Character.digit(userInputNumber1.charAt(i), 10);
        }

        // Here I get user input for the second test number and validate it as before.
        
        int [] testNumberArray2 = new int[userInputNumberOfDigits];
        System.out.println("\nCrazy, I heard last week's winning lotto numbers started with " + userInputNumber1 + "."
        			+"\nNow all I need is one more " + userInputNumberOfDigits + " digit number: ");
        String userInputNumber2 = scnr.next();
        if (userInputNumber2.length() < testNumberArray2.length
        		|| userInputNumber2.length() > testNumberArray2.length
        		|| !userInputNumber2.matches("^[0-9]*$")) 
        {
            System.out.println("\nDrat! Make sure you only enter numbers (of your specified length) next time."
            		+ "\nNo letters, special characters, dots, or any other funny business!"
            		+ "\nPlease restart the program.");
            System.exit(0);
        }
        for (int j = 0; j < testNumberArray2.length; j++) {

            testNumberArray2[j] = Character.digit(userInputNumber2.charAt(j), 10);
        }


        //I close the scanner to avoid a resource leak, as I no longer require user input.
        
        scnr.close();

        /*
         * Here I use a while loop in conjunction with an if-else statement to
         * compare the corresponding elements in both arrays(representing the ones, 
         * tens, hundreds places, etc.). I check to make sure their all of their
         * individual sums are equal.
         */
        
        int k = 0;
        int sumAtIndexK = testNumberArray1[k] + testNumberArray2[k];
        boolean isEqual = true;


        	while (k < userInputNumberOfDigits - 1) {
                if( sumAtIndexK == (testNumberArray1[k + 1] + testNumberArray2[k + 1])) {	

                }
                else {
                	System.out.print("\n" + !isEqual + "\nOh no, that means that the corresponding "
                			+ "places in your test numbers didn't sum to the same total."
                			+ " \nYou're still awesome though *chirp chirp*!");
                	System.exit(0);
                }
                
                ++k;	
        	}
        	
        /*
         * If the corresponding sums are equal along the full length of the arrays
         * representing test numbers, the program will print "true". If there is
         * but one inconsistency,the program will print "false".
         */   
        	
        if (isEqual = true) {
        	System.out.print("\n" + isEqual + "\nThat means all the corresponding places in"
        			+ " both your numbers summed to the same total! \nYou are *chirp* awesome!");
        	System.exit(0);
        }
        else {
        	System.exit(0);
        }		
	
	}

	/*
	 * Here I introduce the main() method. This triggers an instance of the JVM
	 * and begins the execution of the method sumChecker().
	 */
	
	public static void main (String [] args) {
		
		sumChecker();
		
	}
}