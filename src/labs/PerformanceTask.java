package labs;

import java.util.Scanner;

public class PerformanceTask {

	public static void main(String[] args) {
		
		Scanner inKey = new Scanner(System.in);
		
	 System.out.println("Enter launch velocity (m/s)");
	 
	 double velo = inKey.nextLong();
	 
	 System.out.println("Enter launch angle (degrees)");
	 
	 double  launch = inKey.nextLong();
	 
	 launch =  Math.toRadians(launch);
	 
	 //xPosition = cosine of launch angle * time * launchVelocity;
	 
	 double time = 0;
	 
	 double xpos = Math.sin(launch) * time * velo ;
	 
	 //yPosition = sine of launch angle * time * lanuchVelocity – 0.5 * 9.8 * time2
	 double ypos = Math.sin(launch) * time * velo - 0.5 * 9.8 * time;
	 
	 
	 
	 //x = Vx * t => t = x / Vx
	 
	 while (time != 2) {
		 
		 System.out.println("Time: " + time +" s");
		 System.out.println("     x-pos: " + xpos + "m");
		 System.out.println("     y-pos: " + ypos + "m");
		 time++;
		  xpos = Math.sin(launch) * time * velo ;
		  ypos = Math.sin(launch) * time * velo - 0.5 * 9.8 * time;
			
		//UNFINSHED
		 
		 
	 }
	 
	 
		
		
		
	}
	
	
}
