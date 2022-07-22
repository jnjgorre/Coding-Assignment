import java.util.Arrays;

public class CodingWeek3 {

	public static void main(String[] args) {
// 1. create an array of int ages : 3, 9, 23, 64, 2, 8, 28, 93
		
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
		for (int i = 0; i < ages.length; i++) {
			System.out.println(ages[i]);
		}
		 
// 1a. Programmatically subtract the value of the first element in the array 
//from the value in the last element of the array		
			
		System.out.println(ages[ages.length -1] - ages[0]);
		
		
// 1b. Add a new age to your array and 
//repeat the step above to ensure it is dynamic (works for arrays of different lengths).		
		
		int[] ages2 = {3, 9, 23, 64, 2, 8, 28, 93, 27};
		
		
		System.out.println(ages2[ages2.length -1] - ages2[0]);
		
// 1c. Use a loop to iterate through the array and calculate the average age. 
//Print the result to the console.
		
		int sum = 0;
		for (int i = 0; i < ages2.length; i++) {
		sum = sum + ages2[i];
		}
		System.out.println(sum / ages2.length );
		
		
// 2. Create an array of String called names that 
//contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.			
			
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
			
			
// 2a. Use a loop to iterate through the array and 
//calculate the average number of letters per name. Print the result to the console.	
		
		int lengthOfNames = 0;
		for ( int i = 0; i < names.length; i++); {
		lengthOfNames = lengthOfNames + names[lengthOfNames].length();
		}

// 2b. Use a loop to iterate through the array again and 
//concatenate all the names together, separated by spaces, and print the result to the console.	
		
		String[] allNames = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		for (int i = 0; i < names.length; i++) {
			System.out.print(allNames[i] + " ");
		}
			
		
// 3. How do you access the last element of any array?
		
// - 	//array[array.length -1];

		
		
// 4. How do you access the first element of any array?			
			
// 		//array[0];			
		
// 5. Create a new array of int called nameLengths. 
//Write a loop to iterate over the previously created names array 
//and add the length of each name to the nameLengths array.

		int[] nameLengths = new int[names.length];
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		System.out.println(Arrays.toString(nameLengths));
	

	
//6. Write a loop to iterate over the nameLengths array and 
//calculate the sum of all the elements in the array. Print the result to the console.

		int sum1 = 0; 
		for (int i = 0; i < names.length; i++) {
			sum1 = sum1 + nameLengths[i];
			}
		System.out.println("The sum of all elements are : " + nameLengths.length);
			
// 7. Write a method that takes a String, word, and an int, n, 
//as arguments and returns the word concatenated to itself n number of times. 
//(i.e. if I pass in “Hello” and 3, I would expect the method to return “HelloHelloHello”).	
		
		
		System.out.println(wordNumberOfTimes("Hello", 3));
	

		
// 8. Write a method that takes two Strings, firstName and lastName, 
//and returns a full name (the full name should be the first and 
//the last name as a String separated by a space).
	
		
		
		System.out.println(createFullName("Tyrande", "Whisperwind"));
		
		
// 9. Write a method that takes an array of int and 
//returns true if the sum of all the ints in the array is greater than 100.
		
		System.out.println(sum > 100);
			

		
		
// 10. Write a method that takes an array of double and 
//returns the average of all the elements in the array.

		double [] myDoubArr = { 21.1, 21.1, 21.2 };
		
		System.out.println("Average elements: " + sum);
		
	
	
// #11. Write a method that takes two arrays of double and returns true 
//if the average of the elements in the first array 
//is greater than the average of the elements in the second array.
		
		double[] arr1 = {2.2, 3.3, 4.4, 5.5};
		
		double[] arr2 = {1.1, 1.1, 1.1, 1.1};
		
		System.out.println(averageArrays(arr1, arr2));
		
		
// 12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, 
//and returns true if it is hot outside and if moneyInPocket is greater than 10.50.		
		boolean willBuyDrink = true;
		boolean isHotOutside = true;
		double moneyInPocket = 11.00;
		
		System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
		
		
	}	
	
	
	
	
	//METHODS
	
	// #7 method
	public static String wordNumberOfTimes(String word, int n) {
		String wordNumberOfTimes = "";
		for (int i = 0; i < n; i++) {
			wordNumberOfTimes += word;
		}
		return wordNumberOfTimes;
	}
	
	
	// #8 method
	public static String createFullName ( String firstName, String lastName) {
		String fullName = firstName + " " + lastName;
		return fullName;
	}
	
	
	// #9 method
	public static boolean sumGreaterThan100(int[] numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		while(sum > 100) {
			return true;
		}  
			return false;
	}
	
	
	// #10 method
	public static double averageFound ( double[] elements) {
		double sum = 0;
		for ( int i = 0; i < elements.length; i++) {
			sum = elements[i] + sum;
		}
		double average = sum / elements.length;
		return average; }
	
	// #11 method
	public static boolean averageArrays(double[] arr1, double[] arr2) {
		double sumArr1 = 0;
		double sumArr2 = 0;
		for ( double num : arr1) {
			sumArr1 += num;
		}
		for (double num : arr2) {
			sumArr2+= num;
		}
		if ( (sumArr1 / arr1.length) > (sumArr2 / arr2.length)) {
			return true;
		} else {
			return false; }
		}
		
		
	// #12 method
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		double moneyInPocket1 = 11.00;
		if (isHotOutside && moneyInPocket1 > 10.50) {
			return true;
		} else {
			return false;
		}
		
			
	}
	
		
	
	
	
	
	
	
		
	
		
		
		
		
		
	}
	
