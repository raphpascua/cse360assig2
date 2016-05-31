//*Student Name: Raphael Pascua
//Instructor: Dr. Calliss
//Class: CSE 360 Intro to Software Engineering
//PIN 37
//Description: Tests the Analytics method and local methods 

package cse360assign2;
import java.util.*;
/*
 * TestAnalytics is a program that contains a main method that tests
 * all local and inherited methods from the Analytics class
 */
public class TestAnalytics
{
/**
 * Main method used to test inherited and local methods from analytics class,
 * methods: mean, median, low, high, numInts.
 * @param args
 * @return does not return anything
 */
	public static void main(String[] args)
	{
		int input; 
		
		System.out.println("To create a list of integers, type in a list of integers and press enter when finished.");
		Scanner scan = new Scanner(System.in);
		Analytics integers = new Analytics();
		
		while(scan.hasNextInt())
		{
			input = scan.nextInt();
			integers.insert(input);
		}
		
		System.out.println("The average of the inputted integers is: " + integers.mean());
		System.out.println("The median of hte inputted integers is: " + integers.median());
		System.out.println("The biggest number of the inputted integers is: " + integers.high());
		System.out.println("The smallest number of the inputted integers is: " + integers.low());
		System.out.println("The number of integers inputted is: " + integers.numInts());
	}
 }
