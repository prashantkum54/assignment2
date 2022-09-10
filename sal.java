import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner (System.in);
	    int year;
	    double net=0.0d,salary;
		System.out.print("Enter Your Salary : ");
		salary = sc.nextInt();
		System.out.print("Enter The Year : ");
		year = sc.nextInt();
		if(year > 5)
		{
		 double bonus = 0.05*salary;
		 System.out.println("Your Bonus is " + bonus);
		 System.out.println("Net Income is " + (bonus+salary));
		}
		else
		{
		    System.out.println("Sorry!! No Bonus For you");
		}
        
	}
}