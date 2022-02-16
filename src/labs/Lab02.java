package labs;

import java.util.Scanner;

public class Lab02 {

	public static void main(String[] args) {
		
		problem01();
		problem02();
		problem03();
		problem04();
		
	}
	

	
	public static void problem01() {
		
		// make scanner 
		Scanner inKey = new Scanner(System.in);
	
		//ask for number 
		System.out.println("Enter a positive interger");
		
		// stores posNum input
		int posNum = inKey.nextInt();
		
		//enter a positive interger prompt
		System.out.println("Enter another positive interger");
		
		//stores posnum2
		int posNum2 = inKey.nextInt();
		
		//keeps count 
		int count = 0;
		
		//finds minimum
		int min = Math.min(posNum, posNum2);
		
		//creates the scope of numbers computer can choose from
		int scope = Math.max(posNum2, posNum) - min + 1;
				
		//WHILE count is NOT 10 
		while (count != 10) {
			
			//collects random number
			int num = (int) (Math.random() * scope  + min);
			
			//prints random number
			System.out.print(num + " ");
			
			//adds to count 
			count++;
		}
		System.out.println("");
	}
	
	
	
	
	public static void problem02() {
		
		//v= Pi*R^2 * h
		
		Scanner inKey = new Scanner(System.in);
		
		//ask for number 
		System.out.println("Enter the radius");
		
		//stores radius
		int radius = inKey.nextInt() ;
		
		//enter height 
		System.out.println("Enter the height");
		
		//store height 
		int height = inKey.nextInt();
		
		//radius^2 * PI
		double radius2 = Math.pow(radius, 2) * Math.PI;
		
		//finds volume
		double volume = radius2 * height;
		
		
		//prints volume
		System.out.println("The cylinder's volume is " + volume);
		
		
		
	}

	
	

	public static void problem03() {

		// make scanner 
		Scanner inKey = new Scanner(System.in);
			
		// Asks for 2 coordinate points and stores info //////////////
		
		System.out.println("Enter x1:");
			
		double x1 = inKey.nextInt();
		
		System.out.println("Enter y1:");
		
		double y1 = inKey.nextInt();
		
		System.out.println("Enter x2:");
		
		double x2 = inKey.nextInt();
		
		System.out.println("Enter y2:");
		
		double y2 = inKey.nextInt();
		
		/////////////////////////////////////////
		
		//combines both X's^2
		double combineX = Math.pow(x2 - x1, 2);
		
		//combines both Y's^2
		double combineY = Math.pow(y2 - y1, 2);
		
		//combines combined X and Y's
		double almostThere = combineX + combineY;
		
		//answer
		double answer = Math.sqrt(almostThere);
		
		//prints distance between spaces
		System.out.println("Distance between points = " + answer);
		
		//(y2-y1) / (x2-x1)
		
	}


	
	
	public static void problem04() {
		
		// make scanner 
		Scanner inKey = new Scanner(System.in);
		
		//enter Values, stores values /////////////////////////////
		System.out.println("Enter a-value:");
		
		double a = inKey.nextInt();
		
		System.out.println("Enter b-value:");
		
		double b = inKey.nextInt();
		
		System.out.println("Enter c-value:");
		
		double c = inKey.nextInt();
		/////////////////////////////////////////////
		// x= -b plus or minus the sqrt of b^2 - 4AC / 2A
		
		//copies B to the ^2
		double B2 = Math.pow(b,2); 
			
		//makes B negative 
		b = b * -1;
		
		// 4 * a 
		double fourTimes = 4 * a;
		
		//step one of sqrt, b^2 - 4ac
		double sqrt = B2 - fourTimes * c;
		
		//finds sqrt of sqrt
		 sqrt = Math.sqrt(sqrt);
		 
		 //option 1 (x1)
		 double plus = b + sqrt;
			
		 //option 2 (x2)
		double minus = b - sqrt;
		
		//divides x1 choice
		double plusDIVIDE = plus / (2 * a);
		
		//divides x2 choice 
		double minusDIVIDE = minus / (2 * a);
		
		//prints out both options 
		
		System.out.println("x1 = " + plusDIVIDE);
		
		System.out.println("x2 = " + minusDIVIDE);
	}
	
	

	
}
