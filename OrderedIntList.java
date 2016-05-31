//*Student Name: Raphael Pascua
//Instructor: Dr. Calliss
//Class: CSE 360 Intro to Software Engineering
//PIN 37
//Description: Program uses a list as an array to input a value into an array and prints it in ascending order
package cse360assign2;

/**
 * OrderedIntList inserts a new value into an array and in doing so keeps the array
 * in ascending order.
 */
public class OrderedIntList 
{
	protected int[] array;
	protected int count;
	private boolean debug;
	
	
/**
 * OrderedIntList is a class constructor 
 * @param has no parameters
 * @return returns nothing
 */
	OrderedIntList ()
	{
		array = new int[10];
		debug = true;
	}
	
	/**
	 * Insert methods inserts an integer to the array list in order 
	 * @param Parameter for the insert method
	 * @return doesnt return a value 
	 */
	public void insert (int value) 
	{
		if(count == array.length)
		{
			grow();
		}
		
		if(count == 0)
		{
			array[0] = value;
			count++;
			
			if(debug)
			{
				System.out.println("Debug position " + array[0]);
				System.out.println("Debug value " + value);
			}
		}
		else
		{
			int min = 0;
			
			for(int index = 0; index < count; index++)
			{
				if(value < array[index])
				{
					if(debug)
					{
						System.out.println("Debug index " + index);
						System.out.println("Debug value " + value);
					}
					
					break;
				}
				min++;
			}
		
		for( int index = count; index > min; index--)
		{
			array[index] = array[index - 1];
		
			if(debug)
			{
				System.out.println("Debug at index :"+ index + " ");
				System.out.println("Debug value" + value);
			}
		}
	array[min] = value;
	
	if(debug)
	{
		System.out.println("Debug index " + array[min]);
		System.out.println("Debug value " + value);
	}
	count++;
 }
}
	
	
	/**
	 * The Grow is used to increase the size of the array when > 10 elements are inputed
	 * @param no parameter
	 * @return no value is returned
	 */
	private void grow()
	{
		int []newSize = new int[count * 2];
		
		for (int index = 0; index < count; index++)
		{
			newSize[index] = array[index];
			array = newSize;
		}
		if(debug)
		{
			System.out.println("Array new size: " + (count * 2));
		}
		array = newSize;
	}
	/**
	 * The Print method prints the list in ascending order
	 * @param no parameters
	 * @return no value is returned 
	 */
	public void print() 
	{
		for (int index = 0; index < count; ) 
		{
			if (index % 5 == 0) 
				System.out.println();
				System.out.print(array[index++] + "\t");	
				
		}
		System.out.println();
	}
	
}
