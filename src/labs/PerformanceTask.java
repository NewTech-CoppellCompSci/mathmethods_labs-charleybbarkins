package labs;

import java.util.Scanner;

public class PerformanceTask {

	public static void main(String[] args) {
		
		/////HAHHAHAHHAHAAH FINALLY 
		
		//creates scanner 
		Scanner inKey = new Scanner(System.in);
		
		//Asks for launch velocity 
	 System.out.println("Enter launch velocity (m/s)");
	 
	 //stores as a double 
	 double velo = inKey.nextLong();
	 
	 //asks for launch angle of t-shirt 
	 System.out.println("Enter launch angle (degrees)");
	 
	 // stores launch angle  as double 
	 double  launch = inKey.nextLong();
	 
	 // converts launch to radians for the .cos and .sin
	 launch =  Math.toRadians(launch);
	 
	 //xPosition = cosine of launch angle * time * launchVelocity;
	 
	 //keeps count of time in seconds 
	 double time = 0;
	 
	 //converts launch to sin, * time * velocity input
	 double xpos = Math.sin(launch) * time * velo ;
	 
	
	 //yPosition = sine of launch angle * time * lanuchVelocity – 0.5 * 9.8 * time2
	 
	 // covnverts y launch to sin * time * velocity -0.5 * 9.8 * time 
	 double ypos = Math.sin(launch) * time * velo - 0.5 * 9.8 * time;
	 
	 
	 
	 //x = Vx * t => t = x / Vx
	 
	 //WHILE y pos is greater than or equal to 	0 
	 while (ypos >= 0) {
		 
		 //Prints our time and current x and y position 
		 System.out.println("Time: " + time +" s");
		 System.out.println("     x-pos: " + xpos + "m");
		 System.out.println("     y-pos: " + ypos + "m");
		 
		 //incremnets time 
		 time++;
		 
		 //reevaluates x and y positions 
		  xpos = Math.cos(launch) * time * velo ;
		  ypos = Math.sin(launch) * time * velo - 0.5 * 9.8 * Math.pow(time, 2);
			

		 //repeats until t-shirt is on the ground 
	 }
	 
	 //prints out current time and final position of t-shirt on x positions 
	 System.out.println("Time: " + time +" s");
	 System.out.println("     x-pos: " + xpos + "m");
	 System.out.println("     y-pos: 0m");
	 
		
		
		
	}
	
	
}
