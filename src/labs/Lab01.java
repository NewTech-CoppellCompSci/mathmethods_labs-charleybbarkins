package labs;


import java.util.Scanner;

public class Lab01 {

	public static void main(String[] args) {
		
		problem01();
		problem02();
		problem03();
		problem04();
		
	}
	

	
	public static void problem01() {
		
		//create scanner
		Scanner inKey = new Scanner(System.in);
				 
		//ask for number 
		System.out.println("Enter a positive interger");
				
		//store input 
		int posNum = inKey.nextInt();
		
		//ask for number 
		System.out.println("Enter a positive interger");
						
		//store input 2
		int posNum2 = inKey.nextInt();
		
		// find input 1 to the power of input 2 
		double pos3 = Math.pow(posNum, posNum2);
		
		//print results
		System.out.println(posNum + "^" + posNum2 + " = " + pos3);
				
	}
	
	
	
	
	public static void problem02() {
		
		//create scanner
		Scanner inKey = new Scanner(System.in);
		 
		//ask for number 
		System.out.println("Enter a positive interger");
				
		//store input 
		int posNum = inKey.nextInt();
		
		//find square root of posNum
		double posSQRT = Math.sqrt(posNum);
		
		//print results
		System.out.println("The square root of " +posNum + " is " + posSQRT);
	}

	
	

	public static void problem03() {
		
		// A^2 + B^2 = C^2
		
		//create scanner
		Scanner inKey = new Scanner(System.in);
				 
		//ask for side A 
		System.out.println("Enter length of side A");
						
		//store input
		int sideA = inKey.nextInt();
		
		//ask for side B
		System.out.println("Enter length of side B");
						
		//store input 2
		int sideB = inKey.nextInt();
		
		//find side A to the power of 2 
		double APowerOf = Math.pow(sideA, 2);
		
		
		//find side B to the power of 2 
		double BPowerOf = Math.pow(sideB,2);
		
		//add both results to find C^2
		double hypothoPowerOf = APowerOf + BPowerOf;
		
		//find square root of the result to find real hypotenuse
		double hypotho = Math.sqrt(hypothoPowerOf);
		
		
		//print hypotenuse
		System.out.println("Hypotenuse = " + hypotho);
				

	}


	
	
	public static void problem04() {
		
		// make scanner 
		Scanner inKey = new Scanner(System.in);
		 
		//find absolute max value
		int max = Integer.MIN_VALUE;
		//find absolute min value
		int min = Integer.MAX_VALUE;
		
		//ask for number 
		System.out.println("Enter an interger");
						
		//store input 
		int input = inKey.nextInt();
		
		//WHILE input is not equal to 0 
		while (input != 0){
			
			//compare input to max, store biggest
			max = Math.max(max, input);
			
			//compare input to min, store smallest 
			min = Math.min(min, input);
			
			//ask for another number
			System.out.println("Enter an interger");
			
			//store input
			 input = inKey.nextInt();
			
			
		}
		
		//print out min and max
		System.out.println("Max = " + max);
		System.out.println("Min = " + min);
		
		
	}
	
	
	
	
	
	
}
