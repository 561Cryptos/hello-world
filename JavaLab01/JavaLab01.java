import java.util.Scanner;
public class JavaLab01 {
	
	public static void main(String[] args) 
	{
	
		Scanner keyboard = new Scanner(System.in);
		
		
		
		System.out.println("Welcome, To Lab 1");
		
		
		boolean quit=false;
		
		
		
		
		
		while(quit==!true)
		{
			System.out.println("What question would you like to run: ");
			System.out.println("Please Enter a number, 1 thorugh 6 ");
			System.out.println("Enter 7 to terminate the console app ");
			
		
		int name = keyboard.nextInt();
		switch(name)
		{
		
		
				
	
		
		case 1:
		q1(keyboard);
		break;
	
		
		case 2:
		q2(keyboard);
		break;
		
		
		case 3:
		q3(keyboard);
		break;
		
			
		case 4:
		q4(keyboard);
		break;
		
		
		case 5:
		q5(keyboard);
		break;
		
		case 6:
		q6(keyboard);
	    break;
	    
		case 7:
		quit=true;
		break;
		
	    
	
		}
		
		System.out.println("Program Terminated");
		           
		}
		}
		
	

	public static void q1(Scanner keyboard) 
	
	{
		
		System.out.println("what is your name?");
		String name = keyboard.nextLine();
		System.out.println("Hello " +name);
		
		
	}
	public static void q2(Scanner keyboard)
	{
		
	
		System.out.println("print an integer");
		int num = keyboard.nextInt();
		if(num%2==0)
			System.out.println("The integer" + num + "is even");
		else
			System.out.println("The integer" + num + "is odd");
		
	}
		
		
		public static void q3(Scanner keyboard)
		{
			
			System.out.println("Enter Your name");
			
			String name = keyboard.next();
			int counter=0; 
			for (int i=0;i<name.length();i++)
				if (Character.isLetter(name.charAt(i)))
			      counter++;  
			String username = name.toUpperCase();
		    
		    System.out.println("Original name = " +name );
		    System.out.println("Original name = "+username);
		    System.out.println("Name Length = "+counter );
		    
			
		}
		
		public static void q4(Scanner keyboard)
		{
			double pi = 3.14159;
			System.out.println("Enter the radius of the circle in inches: ");
			double rad = keyboard.nextDouble();
			double area = pi*(rad*rad);
			System.out.println("A circle of radius "+rad+" inches has an area of "+area+ " Square Inches");
		}
		public static void q5(Scanner keyboard)
		{
		System.out.println("Enter number 1:");
		double n1 = keyboard.nextDouble();
		System.out.println("Enter number 2:");
		double n2 = keyboard.nextDouble();
		System.out.println("Enter number 3:");
		double n3 = keyboard.nextDouble();
		double a1=((n1+n2+n3)/3);
		
		
		System.out.println("The average of the three numbers is:" +a1);
		
		}
		
		public static void q6 (Scanner keyboard)
		{
			System.out.println("Enter a floating point value");
			float rate = keyboard.nextFloat();
			int intrate = (int) rate;
			System.out.println("The Floating point value " +rate+ " has been casts to integer value "+intrate);         
			
			
		}
	
		
		
		
					
}	
		
		
		
		
		
	
	
	
	
	
	
	
	

