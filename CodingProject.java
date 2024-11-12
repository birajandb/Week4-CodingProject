package week4CodingProject;

public class CodingProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93}; //Creating array with specified values.
		
		//1. a
		int result7 = ages[ages.length-1] - ages[0]; //Accessing the elements by their index.
		System.out.println(result7); //Printing the value ie 93-3 = 90.
		
		//1.b
		int [] ages2 = {3, 9, 23, 64, 2, 8, 28, 93, 105, 123}; //Creating array with specified values.
		int result9 = ages2[ages2.length-1] - ages2[0]; //Accessing the elements by their index.
		System.out.println(result9);  //Printing the value ie 93-3 = 90.
		
		//1.a.iii : Using index values to access elements makes the code dynamic because it adapts to any changes in the array size. Here's is how it works:
		//Accessing the last element: ages.length -1 - It always refers to the last index of the array, regardless of the array size.
		//Accessing the First element: ages[0] - It always give the 1st element.
		
		//1.c
		int sum = 0;  //Initializing sum to 0
		for (int age : ages) {     //Using enhanced for loop to iterate over each element in ages & add it to sum.
			sum += age;
		}
		double average = sum / ages.length;        //Calculation the average by dividing sum by age.length.
		System.out.println(average);
		
		//2.
		String [] names = {"Sam","Tommy", "Tim", "Sally", "Buck", "Bob"}; //Creating array with specified names.
		//2.a
		int totalLetters = 0;
		for (String name : names) {
			totalLetters += name.length(); //Adding the length of each name to totalLetters.
		}
		System.out.println(totalLetters); // Printing total number ie 23.
		double averageletters = totalLetters / names.length; // Calculating the average number.
		System.out.println(averageletters); // Printing out the average number.
		//2.b
		String concatenatedNames = " "; //Initializing as an empty string " "
		for (String name : names) {				//Loop goes through each name in the names array.
			concatenatedNames += name + " ";   //Adding each name followed by a space
		}
			concatenatedNames = concatenatedNames.trim();  //trim() is used to remove any extra space at the end.
			System.out.println(concatenatedNames);  // Printing the result.
		//3
			//To access the last element of any array  we gonna use array's length property , ie array.length - 1.
		//4
			//We gonna use index 0, as we know arrays are zero-indexed.
		//5
			int  [] nameLengths = new int [names.length]; //Creating an array with the same size as names
			for (int i = 0; i < names.length; i++) {
				nameLengths[i] = names[i].length();  // Storing the length of each name in nameLengths.
			}
			for (int length : nameLengths) {      //Printing the nameLengths array to verify 
				System.out.print(length + " ");
			}
			System.out.println(" ");
		//6.
			int sums = 0;
			for (int length : nameLengths) {
				sums += length;  //Adding each element to sum
			}
			System.out.println(sums);
		//7.
			String result = repeatWord("Hello", 3);  //Passing Hello 3 times
					System.out.println(result);
		//8.
			String fullName = getFullName("Linda", "Jones");  //Passing 2 strings
			System.out.println(fullName);
			
		//9.
			int [] array1 = {20, 30, 50};
			int [] array2 = {20, 30, 60};
			System.out.println(isSumGreaterThan100(array1));
			System.out.println(isSumGreaterThan100(array2));
		//10
			double [] array = {10.5, 20.3, 30.7, 40.2};
			double averag = calculateAverage(array);
			System.out.println(averag);
		
		//11
			double[] array3 = {10.5, 20.3, 30.7};
			double[] array4 = {15.0, 18.0, 25.0};
			System.out.println(isFirstAverageGrater(array3, array4));
		
		//12
			boolean isHotOutside = true;
			double moneyInPocket = 15.00;
			System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
			
		//13 - This method checks weather a person qualifies for a discount, either due to age or membership.It could be useful in a retail environment or any
			// service industry offering discount to seniors & loyal customers.
			int age = 70;
			boolean isMember = false;
			System.out.println(" ");
			System.out.println(isEligibleForDiscount(age, isMember));
			
			
		
			
			
	}
	//7 Method:
	public static String repeatWord(String word, int n) {   // Method it takes String & int
		StringBuilder result = new StringBuilder();
		for (int i =0; i < n; i++) {
			result.append(word);
		} 
		return result.toString();
	}
	//8 Method:
		public static String getFullName(String firstName, String lastName) {  //Method it takes 2 Strings
			return firstName + " " + lastName;
		}
	//9 Method
		public static boolean isSumGreaterThan100 (int [] numbers) {   //Method it takes an array of int
			int sum = 0;
			for (int num : numbers) {
				sum += num;
			}
			return sum > 100;
		}
	//10 Method
		public static double calculateAverage(double[] numbers) {   //Method it takes an array of double
			double sum = 0;
			for (double num : numbers) {
				sum += num;
			}
			return sum / numbers.length;
		}
		
	//11 Method
		public static boolean isFirstAverageGrater(double[] array3, double [] array4) {   //Method it takes two arrays of double
			double sum1 = 0;
			for (double num : array3) {
				sum1 += num;
			}
			double average1 = sum1 / array3.length;
			double sum2 = 0;
			for (double num : array4) {
				sum2 += num;
			}
			double average2 = sum2 / array4.length;
			return average1 > average2;
		}
		
		//12 Method
		public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {  //Method it takes 2 boolean & double
			return isHotOutside && moneyInPocket > 10.50;
		}
		
		//13 Method
		public static boolean isEligibleForDiscount( int age, boolean isMember) {  //Method takes int & boolean. If age is 65 or greater than 65 or if person in member,
			// is qualified for discount.
			return age >= 65 || isMember;
		}
	
	

}
