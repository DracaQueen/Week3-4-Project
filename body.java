
public class body {

	public static void main(String[] args) {
		int [] ages = {3, 9, 23, 64, 2, 8, 12, 28, 93,};
		//1.(a)
		System.out.println(ages[0]-ages[ages.length-1]);
		
	//1. (b) I added 12 to the array
	
		//1. (c)
		int sum =0;
		for (int s : ages) {
			sum += s;
		}
		int average = sum / ages.length;
		System.out.println(average);
		
        String [] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
        
        //2. (a)
        int[] nameArr = new int [names.length];
		for(int i = 0; i < names.length; i++) {
			nameArr[i] =names[i].length();
			System.out.println(nameArr[i]);
		}
		
		double sumOfArr = 0;
		for (String name : names) {
			sumOfArr += name.length();
			System.out.println(sumOfArr/ names.length);
		}
		
       //2. (b)
        for (String name : names) {
        	System.out.print(name + " ");
        }
      //5.
       
        int[] nameLengths = new int [names.length];
		for(int i = 0; i < names.length; i++) {
			nameLengths[i] =names[i].length();
			System.out.println(nameLengths[i]);
		}
        //6.
		double sumOfLetters = 0;
		for (String name : names) {
			sumOfLetters += name.length();
			System.out.println(sumOfLetters);
		}
			
		//7.	
		hello("Hello", 3);
		
        //8.
       System.out.println(fullName("Bob", "Belcher"));
       
       //9.
       System.out.println(greaterThan100(ages));
       
       //10. refer to line 46 for doubleAverage
       double [] firstArray = {12.3, 3.14, 67.5};
       System.out.println(doubleAverage(firstArray));
       
       //11. refer to line 54 for twoArrays
       double[] secondArray = {23.65, 13.14, 23.45};
       System.out.println(twoArrays(firstArray, secondArray));
   
       //12.
       System.out.println(willBuyDrink(true,10));
       
       //13.
      passOrFail(70);
      
 }
	//This method helps determine based on your overall score if you passed or failed.
	public static void passOrFail(double testScore) {
	if (testScore > 70) {
		System.out.println("You Passed the class!");
	} else {
		System.out.println("You Failed! Try Again");
	}
}
	public static double doubleAverage(double[] array) {
		double sum = 0;
		for (double num : array) {
			sum += num;
		}
		return sum / array.length;
	}
	public static boolean twoArrays(double[] arr, double[] array) {
		double sum = 0;
		for (double num : array) {
			sum += num;
		}
		double sum2 = 0;
		for (double num2 : arr) {
			sum2 += num2;
		}
		return sum2 / arr.length > sum / array.length;
	}
	
	public static boolean greaterThan100(int[] array) {
		int sum = 0;
		for (int num : array) {
			sum += num;
		}
	return sum > 100;
}

	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		return isHotOutside = true && moneyInPocket > 10.50;	
}

	public static String hello(String word, int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(word);
		}
		return word;
	}
	
	public static String fullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}
	
		  
		 
	   }
