package cse360assign2;
//*Student Name: Raphael Pascua
//Instructor: Dr. Calliss
//Class: CSE 360 Intro to Software Engineering
//PIN 37
//Description: This class inherits form orderedintlist.java class and contains the methods mean, median, high and low

import java.util.*;
/**
 * Analytics class computes the various methods of mean, median, high, low and numInts
 * @author Raphael Pascua
 */
public class Analytics extends OrderedIntList
{	/**Mean method calculates the average of the list
	 * @param no parameter
	 * @return returns the average of the list
	 */

	public double mean()
	{
		double total1 = 0.0;

		if(count == 0 || array == null)
			return -1;

		for(int index = 0; index < count; index++)
		{
			total1 = total1 + array[index];
		}			
		
		double average = total1 / count;
		return average;
		
	}
	/**
	 * Median method calculates the median from the list
	 * @param no parameter
	 * @return returns the median of the list
	 */
	public int median()
	{
		if (count == 0 || array == null)
			return -1;

		if (count % 2 == 0)
			return (array[count / 2] + array[count / 2 - 1 ]) / 2;
		else
			return array[count / 2];
}

	/**
	 * Method high finds the highest value in the list
	 * @param This value is the value to be used from the insert method
	 * @return The largest value of the list is returned
	 */
	public int high()
	{
		if(count == 0 || array == null)
			return -1;
		
		int biggest = array[0];
		
		for(int index = 0; index < count; index++)
		{
			if(array[index] > biggest)
			{
				biggest = array[index];
			}
		}
		return biggest;
			
	}

	/**
	 * Method numInts Find the number of integers in the list
	 * @param no parameters
	 * @return Returns count, number of integers in the list
	 */
	public int numInts()
	{
		if (count == 0 || array == null)
			return -1;

		return count;
	}
	/**
	 * Method low find the smallest value number of integers in the list
	 * @param no paremeters
	 * @return smallest, the smallest value number of the integers in the list
	 */
	public int low()
	{
		if( array == null || count == 0)
			return -1;

		int smallest = array[0];
		
		for(int index = 0; index < count; index++)
		{
			if(array[index] < smallest)
			{
				smallest = array[index];
			}
		}
		return smallest;
	}

}
