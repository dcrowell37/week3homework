package codingassignment;

public class codingassignment {

	public static void main(String[] args) {
		
		//Question 1 code:
		int[] ages = new int[8];
		ages[0] = 3;
		ages[1] = 9;
		ages[2] = 23;
		ages[3] = 64;
		ages[4] = 2;
		ages[5] = 8;
		ages[6] = 28;
		
		//b:
		
		ages[7] = 1;
		
		//a:
		
		int lastAge = ages[ages.length - 1];
		System.out.println(ages[0] - lastAge);
			
		//c
		double sum = 0;
		for (double number : ages) {
			sum += number;
		}
		double avg = sum / ages.length;
		System.out.println("Average calculates to: " + avg);
		
		//Question 2:
		//a
		
		String[] names = new String[6]; {
		
		names[0] = "Sam";
		names[1] = "Tommy";
		names[2] = "Tim";
		names[3] = "Sally";
		names[4] = "Buck";
		names[5] = "Bob";
		
		int numWords = names.length;
		double numChars = 0;
		for (int i = 0; i < numWords; i++) {
			numChars = numChars + names[i].length();
		}
		double avgWordLength = numChars / numWords;
		System.out.println(avgWordLength);
		
		//b
		String allNames = "";
		for (int i = 0; i < names.length; i++) {
			if (i == 0) {
				allNames = allNames + names[i];
			} else {
			allNames = allNames + " " + names[i];
			}
		}
		System.out.println(allNames);
		
		//Question 3:
		
		String lastNameInArray = names[names.length - 1];
		
		//Question 4:
		
		String firstNameInArray = names[0];
		
		//Question 5:
		
		int[] nameLengths = new int[6]; {
			for (int i = 0; i < names.length; i++) {
				int nameLength = names[i].length();
				nameLengths[i] = nameLength;
				System.out.println(nameLengths[i]);
						
				}
			int sumOfLetters = 0;
			for (int i = 0; i < nameLengths.length; i++) {
				sumOfLetters += nameLengths[i];
			}
			System.out.println(sumOfLetters);
				
				
			}
				
		}
		//Question 9 code
		int nums[] = new int[5];
		
		nums[0] = 1;
		nums[1] = 51;
		nums[2] = 5;
		nums[3] = 1;
		nums[4] = 5;
		
		boolean isGreaterThan100 = isGreaterThan100(nums);
		System.out.println(isGreaterThan100);
		
		//Question 10 code
		double array[] = new double[5];
		
		array[0] = 13;
		array[1] = 777;
		array[2] = 37;
		array[3] = 9;
		array[4] = 27;
		double average = avgOfArray(array);
		System.out.println(average);
		
		double array2[] = new double[5];
		
		array2[0] = 9;
		array2[1] = 64;
		array2[2] = 20;
		array2[3] = 23;
		array2[4] = 1;
		
		//Question 11 code
		boolean isAvg1GreaterThanAvg2 = avgFirstGreaterAvgSecond(array, array2);
		System.out.println(isAvg1GreaterThanAvg2);
		
		//Question12 code
		boolean isHotOutside = false;
		double moneyInWallet = 11.0;
		boolean willBuyDrink = willBuyDrink(isHotOutside, moneyInWallet);
		System.out.println(willBuyDrink);
		
		//Question13 code
		double[] rentStuff = new double[5];
		
		rentStuff[0] = 2400.00;
		rentStuff[1] = 129.46;
		rentStuff[2] = 91.07;
		rentStuff[3] = 140.32;
		rentStuff[4] = 200.0;
		double rentTotal = findRentTotal(rentStuff);
		System.out.println(rentTotal);
		
	}
		//Question 7:
	public static String createNewWord(String word, int n) {
		String newWord = word.repeat(n);
		return newWord;
	}
		//Question 8
	public static String createFullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}
	
		//Question 9
	public static boolean isGreaterThan100(int nums[]) {
		int sum = 0;
		for (int num : nums) {
			sum += num;
	}
		if (sum > 100) {
		return true;
		} else { 
		return false;
		}
	}
	//Question 10
	public static double avgOfArray(double array[]) {
		double sum = 0;
		for (double number : array) {
			sum += number;
	}
		double avg = sum / array.length;
		return avg;
}
	//Question 11
	public static boolean avgFirstGreaterAvgSecond(double array[], double array2[]) {
		double sum1 = 0;
		double sum2 = 0;
		for (double number : array) {
			sum1 += number;
	
		}
		for (double number2 : array2) {
				sum2 += number2;
				
		}
		double avg1 = sum1 / array.length;
		double avg2 = sum2 / array2.length;
		
		if (avg1 > avg2) {
		return true;
		} else {
			return false;
		}
	}
	
	//Question 12
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		
		if (isHotOutside == true && moneyInPocket > 10.50) {
		return true;
		} else { 
			return false;
	}
}
	/*
	 * Question 13: This method basically takes the array rentStuff and adds
	 * it all together so I can have a program where i can calculate
	 * rent easily and modify the variables.
	 */
	public static double findRentTotal(double[] rentStuff) {
		double rentTotal = 0;
		for (double number : rentStuff) {
			rentTotal += number;
		}
		
		return rentTotal;
	}
}


